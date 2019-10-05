package typings.chromeDashApps.chrome.alarms

import typings.chromeDashApps.chrome.integer
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
    delayInMinutes: Int | Double = null,
    periodInMinutes: Int | Double = null,
    when: Int | Double = null
  ): AlarmCreateInfo = {
    val __obj = js.Dynamic.literal()
    if (delayInMinutes != null) __obj.updateDynamic("delayInMinutes")(delayInMinutes.asInstanceOf[js.Any])
    if (periodInMinutes != null) __obj.updateDynamic("periodInMinutes")(periodInMinutes.asInstanceOf[js.Any])
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlarmCreateInfo]
  }
}

