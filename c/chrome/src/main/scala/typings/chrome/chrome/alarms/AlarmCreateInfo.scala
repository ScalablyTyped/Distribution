package typings.chrome.chrome.alarms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlarmCreateInfo extends js.Object {
  /** Optional. Length of time in minutes after which the onAlarm event should fire.  */
  var delayInMinutes: js.UndefOr[Double] = js.undefined
  /** Optional. If set, the onAlarm event should fire every periodInMinutes minutes after the initial event specified by when or delayInMinutes. If not set, the alarm will only fire once.  */
  var periodInMinutes: js.UndefOr[Double] = js.undefined
  /** Optional. Time at which the alarm should fire, in milliseconds past the epoch (e.g. Date.now() + n).  */
  var when: js.UndefOr[Double] = js.undefined
}

object AlarmCreateInfo {
  @scala.inline
  def apply(
    delayInMinutes: js.UndefOr[Double] = js.undefined,
    periodInMinutes: js.UndefOr[Double] = js.undefined,
    when: js.UndefOr[Double] = js.undefined
  ): AlarmCreateInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delayInMinutes)) __obj.updateDynamic("delayInMinutes")(delayInMinutes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(periodInMinutes)) __obj.updateDynamic("periodInMinutes")(periodInMinutes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(when)) __obj.updateDynamic("when")(when.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlarmCreateInfo]
  }
}

