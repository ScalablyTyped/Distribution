package typings.chrome.chrome.alarms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alarm extends js.Object {
  
  /** Name of this alarm. */
  var name: String = js.native
  
  /** Optional. If not null, the alarm is a repeating alarm and will fire again in periodInMinutes minutes.  */
  var periodInMinutes: js.UndefOr[Double] = js.native
  
  /** Time at which this alarm was scheduled to fire, in milliseconds past the epoch (e.g. Date.now() + n). For performance reasons, the alarm may have been delayed an arbitrary amount beyond this. */
  var scheduledTime: Double = js.native
}
object Alarm {
  
  @scala.inline
  def apply(name: String, scheduledTime: Double): Alarm = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scheduledTime = scheduledTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alarm]
  }
  
  @scala.inline
  implicit class AlarmOps[Self <: Alarm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledTime(value: Double): Self = this.set("scheduledTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodInMinutes(value: Double): Self = this.set("periodInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriodInMinutes: Self = this.set("periodInMinutes", js.undefined)
  }
}
