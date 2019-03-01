package typings
package chromeLib.chromeNs.alarmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlarmCreateInfo extends js.Object {
  /** Optional. Length of time in minutes after which the onAlarm event should fire.  */
  var delayInMinutes: js.UndefOr[scala.Double] = js.undefined
  /** Optional. If set, the onAlarm event should fire every periodInMinutes minutes after the initial event specified by when or delayInMinutes. If not set, the alarm will only fire once.  */
  var periodInMinutes: js.UndefOr[scala.Double] = js.undefined
  /** Optional. Time at which the alarm should fire, in milliseconds past the epoch (e.g. Date.now() + n).  */
  var when: js.UndefOr[scala.Double] = js.undefined
}

object AlarmCreateInfo {
  @scala.inline
  def apply(
    delayInMinutes: scala.Int | scala.Double = null,
    periodInMinutes: scala.Int | scala.Double = null,
    when: scala.Int | scala.Double = null
  ): AlarmCreateInfo = {
    val __obj = js.Dynamic.literal()
    if (delayInMinutes != null) __obj.updateDynamic("delayInMinutes")(delayInMinutes.asInstanceOf[js.Any])
    if (periodInMinutes != null) __obj.updateDynamic("periodInMinutes")(periodInMinutes.asInstanceOf[js.Any])
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlarmCreateInfo]
  }
}

