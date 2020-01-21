package typings.chromeApps.chrome.alarms

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alarm extends js.Object {
  /** Name of this alarm. */
  var name: String
  /** If not null, the alarm is a repeating alarm and will fire again in periodInMinutes minutes.  */
  var periodInMinutes: js.UndefOr[integer] = js.undefined
  /** Time at which this alarm was scheduled to fire, in milliseconds past the epoch (e.g. Date.now() + n). For performance reasons, the alarm may have been delayed an arbitrary amount beyond this. */
  var scheduledTime: integer
}

object Alarm {
  @scala.inline
  def apply(name: String, scheduledTime: integer, periodInMinutes: Int | Double = null): Alarm = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scheduledTime = scheduledTime.asInstanceOf[js.Any])
    if (periodInMinutes != null) __obj.updateDynamic("periodInMinutes")(periodInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alarm]
  }
}

