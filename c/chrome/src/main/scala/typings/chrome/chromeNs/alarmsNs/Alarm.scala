package typings.chrome.chromeNs.alarmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alarm extends js.Object {
  /** Name of this alarm. */
  var name: String
  /** Optional. If not null, the alarm is a repeating alarm and will fire again in periodInMinutes minutes.  */
  var periodInMinutes: js.UndefOr[Double] = js.undefined
  /** Time at which this alarm was scheduled to fire, in milliseconds past the epoch (e.g. Date.now() + n). For performance reasons, the alarm may have been delayed an arbitrary amount beyond this. */
  var scheduledTime: Double
}

object Alarm {
  @scala.inline
  def apply(name: String, scheduledTime: Double, periodInMinutes: Int | Double = null): Alarm = {
    val __obj = js.Dynamic.literal(name = name, scheduledTime = scheduledTime)
    if (periodInMinutes != null) __obj.updateDynamic("periodInMinutes")(periodInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alarm]
  }
}

