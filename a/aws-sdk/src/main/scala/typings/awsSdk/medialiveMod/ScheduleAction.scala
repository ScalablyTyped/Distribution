package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduleAction extends js.Object {
  
  /**
    * The name of the action, must be unique within the schedule. This name provides the main reference to an action once it is added to the schedule. A name is unique if it is no longer in the schedule. The schedule is automatically cleaned up to remove actions with a start time of more than 1 hour ago (approximately) so at that point a name can be reused.
    */
  var ActionName: string = js.native
  
  /**
    * Settings for this schedule action.
    */
  var ScheduleActionSettings: typings.awsSdk.medialiveMod.ScheduleActionSettings = js.native
  
  /**
    * The time for the action to start in the channel.
    */
  var ScheduleActionStartSettings: typings.awsSdk.medialiveMod.ScheduleActionStartSettings = js.native
}
object ScheduleAction {
  
  @scala.inline
  def apply(
    ActionName: string,
    ScheduleActionSettings: ScheduleActionSettings,
    ScheduleActionStartSettings: ScheduleActionStartSettings
  ): ScheduleAction = {
    val __obj = js.Dynamic.literal(ActionName = ActionName.asInstanceOf[js.Any], ScheduleActionSettings = ScheduleActionSettings.asInstanceOf[js.Any], ScheduleActionStartSettings = ScheduleActionStartSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleAction]
  }
  
  @scala.inline
  implicit class ScheduleActionOps[Self <: ScheduleAction] (val x: Self) extends AnyVal {
    
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
    def setActionName(value: string): Self = this.set("ActionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleActionSettings(value: ScheduleActionSettings): Self = this.set("ScheduleActionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleActionStartSettings(value: ScheduleActionStartSettings): Self = this.set("ScheduleActionStartSettings", value.asInstanceOf[js.Any])
  }
}
