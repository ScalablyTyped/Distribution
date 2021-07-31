package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyScheduledActionMessage extends StObject {
  
  /**
    * A modified enable flag of the scheduled action. If true, the scheduled action is active. If false, the scheduled action is disabled. 
    */
  var Enable: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * A modified end time of the scheduled action. For more information about this parameter, see ScheduledAction. 
    */
  var EndTime: js.UndefOr[TStamp] = js.undefined
  
  /**
    * A different IAM role to assume to run the target action. For more information about this parameter, see ScheduledAction.
    */
  var IamRole: js.UndefOr[String] = js.undefined
  
  /**
    * A modified schedule in either at( ) or cron( ) format. For more information about this parameter, see ScheduledAction.
    */
  var Schedule: js.UndefOr[String] = js.undefined
  
  /**
    * A modified description of the scheduled action. 
    */
  var ScheduledActionDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the scheduled action to modify. 
    */
  var ScheduledActionName: String
  
  /**
    * A modified start time of the scheduled action. For more information about this parameter, see ScheduledAction. 
    */
  var StartTime: js.UndefOr[TStamp] = js.undefined
  
  /**
    * A modified JSON format of the scheduled action. For more information about this parameter, see ScheduledAction. 
    */
  var TargetAction: js.UndefOr[ScheduledActionType] = js.undefined
}
object ModifyScheduledActionMessage {
  
  @scala.inline
  def apply(ScheduledActionName: String): ModifyScheduledActionMessage = {
    val __obj = js.Dynamic.literal(ScheduledActionName = ScheduledActionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyScheduledActionMessage]
  }
  
  @scala.inline
  implicit class ModifyScheduledActionMessageMutableBuilder[Self <: ModifyScheduledActionMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnable(value: BooleanOptional): Self = StObject.set(x, "Enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableUndefined: Self = StObject.set(x, "Enable", js.undefined)
    
    @scala.inline
    def setEndTime(value: TStamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setIamRole(value: String): Self = StObject.set(x, "IamRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamRoleUndefined: Self = StObject.set(x, "IamRole", js.undefined)
    
    @scala.inline
    def setSchedule(value: String): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    @scala.inline
    def setScheduledActionDescription(value: String): Self = StObject.set(x, "ScheduledActionDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledActionDescriptionUndefined: Self = StObject.set(x, "ScheduledActionDescription", js.undefined)
    
    @scala.inline
    def setScheduledActionName(value: String): Self = StObject.set(x, "ScheduledActionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: TStamp): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setTargetAction(value: ScheduledActionType): Self = StObject.set(x, "TargetAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetActionUndefined: Self = StObject.set(x, "TargetAction", js.undefined)
  }
}
