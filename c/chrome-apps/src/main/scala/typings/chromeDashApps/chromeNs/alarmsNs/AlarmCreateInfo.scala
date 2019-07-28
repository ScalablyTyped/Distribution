package typings.chromeDashApps.chromeNs.alarmsNs

import typings.chromeDashApps.chromeNs.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlarmCreateInfo extends js.Object {
  /** Length of time in minutes after which the onAlarm event should fire.  */
  var delayInMinutes: js.UndefOr[integer] = js.undefined
  /** If set, the onAlarm event should fire every periodInMinutes minutes after the initial event specified by when or delayInMinutes. If not set, the alarm will only fire once.  */
  var periodInMinutes: js.UndefOr[integer] = js.undefined
  /** Time at which the alarm should fire, in milliseconds past the epoch (e.g. Date.now() + n).  */
  var when: js.UndefOr[integer] = js.undefined
}

object AlarmCreateInfo {
  @scala.inline
  def apply(
    delayInMinutes: js.UndefOr[integer] = js.undefined,
    periodInMinutes: js.UndefOr[integer] = js.undefined,
    when: js.UndefOr[integer] = js.undefined
  ): AlarmCreateInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delayInMinutes)) __obj.updateDynamic("delayInMinutes")(delayInMinutes)
    if (!js.isUndefined(periodInMinutes)) __obj.updateDynamic("periodInMinutes")(periodInMinutes)
    if (!js.isUndefined(when)) __obj.updateDynamic("when")(when)
    __obj.asInstanceOf[AlarmCreateInfo]
  }
}

