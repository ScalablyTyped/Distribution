package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateScheduledActionMessage extends StObject {
  
  /**
    * If true, the schedule is enabled. If false, the scheduled action does not trigger. For more information about state of the scheduled action, see ScheduledAction. 
    */
  var Enable: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The end time in UTC of the scheduled action. After this time, the scheduled action does not trigger. For more information about this parameter, see ScheduledAction. 
    */
  var EndTime: js.UndefOr[TStamp] = js.native
  
  /**
    * The IAM role to assume to run the target action. For more information about this parameter, see ScheduledAction. 
    */
  var IamRole: String = js.native
  
  /**
    * The schedule in at( ) or cron( ) format. For more information about this parameter, see ScheduledAction.
    */
  var Schedule: String = js.native
  
  /**
    * The description of the scheduled action. 
    */
  var ScheduledActionDescription: js.UndefOr[String] = js.native
  
  /**
    * The name of the scheduled action. The name must be unique within an account. For more information about this parameter, see ScheduledAction. 
    */
  var ScheduledActionName: String = js.native
  
  /**
    * The start time in UTC of the scheduled action. Before this time, the scheduled action does not trigger. For more information about this parameter, see ScheduledAction.
    */
  var StartTime: js.UndefOr[TStamp] = js.native
  
  /**
    * A JSON format string of the Amazon Redshift API operation with input parameters. For more information about this parameter, see ScheduledAction. 
    */
  var TargetAction: ScheduledActionType = js.native
}
object CreateScheduledActionMessage {
  
  @scala.inline
  def apply(IamRole: String, Schedule: String, ScheduledActionName: String, TargetAction: ScheduledActionType): CreateScheduledActionMessage = {
    val __obj = js.Dynamic.literal(IamRole = IamRole.asInstanceOf[js.Any], Schedule = Schedule.asInstanceOf[js.Any], ScheduledActionName = ScheduledActionName.asInstanceOf[js.Any], TargetAction = TargetAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScheduledActionMessage]
  }
  
  @scala.inline
  implicit class CreateScheduledActionMessageMutableBuilder[Self <: CreateScheduledActionMessage] (val x: Self) extends AnyVal {
    
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
    def setSchedule(value: String): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
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
  }
}
