package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyScheduledActionMessage extends js.Object {
  
  /**
    * A modified enable flag of the scheduled action. If true, the scheduled action is active. If false, the scheduled action is disabled. 
    */
  var Enable: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * A modified end time of the scheduled action. For more information about this parameter, see ScheduledAction. 
    */
  var EndTime: js.UndefOr[TStamp] = js.native
  
  /**
    * A different IAM role to assume to run the target action. For more information about this parameter, see ScheduledAction.
    */
  var IamRole: js.UndefOr[String] = js.native
  
  /**
    * A modified schedule in either at( ) or cron( ) format. For more information about this parameter, see ScheduledAction.
    */
  var Schedule: js.UndefOr[String] = js.native
  
  /**
    * A modified description of the scheduled action. 
    */
  var ScheduledActionDescription: js.UndefOr[String] = js.native
  
  /**
    * The name of the scheduled action to modify. 
    */
  var ScheduledActionName: String = js.native
  
  /**
    * A modified start time of the scheduled action. For more information about this parameter, see ScheduledAction. 
    */
  var StartTime: js.UndefOr[TStamp] = js.native
  
  /**
    * A modified JSON format of the scheduled action. For more information about this parameter, see ScheduledAction. 
    */
  var TargetAction: js.UndefOr[ScheduledActionType] = js.native
}
object ModifyScheduledActionMessage {
  
  @scala.inline
  def apply(ScheduledActionName: String): ModifyScheduledActionMessage = {
    val __obj = js.Dynamic.literal(ScheduledActionName = ScheduledActionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyScheduledActionMessage]
  }
  
  @scala.inline
  implicit class ModifyScheduledActionMessageOps[Self <: ModifyScheduledActionMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setScheduledActionName(value: String): Self = this.set("ScheduledActionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnable(value: BooleanOptional): Self = this.set("Enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnable: Self = this.set("Enable", js.undefined)
    
    @scala.inline
    def setEndTime(value: TStamp): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    
    @scala.inline
    def setIamRole(value: String): Self = this.set("IamRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamRole: Self = this.set("IamRole", js.undefined)
    
    @scala.inline
    def setSchedule(value: String): Self = this.set("Schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("Schedule", js.undefined)
    
    @scala.inline
    def setScheduledActionDescription(value: String): Self = this.set("ScheduledActionDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduledActionDescription: Self = this.set("ScheduledActionDescription", js.undefined)
    
    @scala.inline
    def setStartTime(value: TStamp): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    
    @scala.inline
    def setTargetAction(value: ScheduledActionType): Self = this.set("TargetAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetAction: Self = this.set("TargetAction", js.undefined)
  }
}
