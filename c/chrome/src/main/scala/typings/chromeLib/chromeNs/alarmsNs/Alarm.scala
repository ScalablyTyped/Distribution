package typings
package chromeLib.chromeNs.alarmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alarm extends js.Object {
  /** Name of this alarm. */
  var name: java.lang.String
  /** Optional. If not null, the alarm is a repeating alarm and will fire again in periodInMinutes minutes.  */
  var periodInMinutes: js.UndefOr[scala.Double] = js.undefined
  /** Time at which this alarm was scheduled to fire, in milliseconds past the epoch (e.g. Date.now() + n). For performance reasons, the alarm may have been delayed an arbitrary amount beyond this. */
  var scheduledTime: scala.Double
}

object Alarm {
  @scala.inline
  def apply(
    name: java.lang.String,
    scheduledTime: scala.Double,
    periodInMinutes: scala.Int | scala.Double = null
  ): Alarm = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("scheduledTime")(scheduledTime)
    if (periodInMinutes != null) __obj.updateDynamic("periodInMinutes")(periodInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alarm]
  }
}

