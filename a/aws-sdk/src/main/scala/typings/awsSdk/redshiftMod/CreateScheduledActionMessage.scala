package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateScheduledActionMessage extends StObject {
  
  /**
    * If true, the schedule is enabled. If false, the scheduled action does not trigger. For more information about state of the scheduled action, see ScheduledAction. 
    */
  var Enable: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The end time in UTC of the scheduled action. After this time, the scheduled action does not trigger. For more information about this parameter, see ScheduledAction. 
    */
  var EndTime: js.UndefOr[TStamp] = js.undefined
  
  /**
    * The IAM role to assume to run the target action. For more information about this parameter, see ScheduledAction. 
    */
  var IamRole: String
  
  /**
    * The schedule in at( ) or cron( ) format. For more information about this parameter, see ScheduledAction.
    */
  var Schedule: String
  
  /**
    * The description of the scheduled action. 
    */
  var ScheduledActionDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the scheduled action. The name must be unique within an account. For more information about this parameter, see ScheduledAction. 
    */
  var ScheduledActionName: String
  
  /**
    * The start time in UTC of the scheduled action. Before this time, the scheduled action does not trigger. For more information about this parameter, see ScheduledAction.
    */
  var StartTime: js.UndefOr[TStamp] = js.undefined
  
  /**
    * A JSON format string of the Amazon Redshift API operation with input parameters. For more information about this parameter, see ScheduledAction. 
    */
  var TargetAction: ScheduledActionType
}
object CreateScheduledActionMessage {
  
  inline def apply(IamRole: String, Schedule: String, ScheduledActionName: String, TargetAction: ScheduledActionType): CreateScheduledActionMessage = {
    val __obj = js.Dynamic.literal(IamRole = IamRole.asInstanceOf[js.Any], Schedule = Schedule.asInstanceOf[js.Any], ScheduledActionName = ScheduledActionName.asInstanceOf[js.Any], TargetAction = TargetAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateScheduledActionMessage]
  }
  
  extension [Self <: CreateScheduledActionMessage](x: Self) {
    
    inline def setEnable(value: BooleanOptional): Self = StObject.set(x, "Enable", value.asInstanceOf[js.Any])
    
    inline def setEnableUndefined: Self = StObject.set(x, "Enable", js.undefined)
    
    inline def setEndTime(value: TStamp): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setIamRole(value: String): Self = StObject.set(x, "IamRole", value.asInstanceOf[js.Any])
    
    inline def setSchedule(value: String): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduledActionDescription(value: String): Self = StObject.set(x, "ScheduledActionDescription", value.asInstanceOf[js.Any])
    
    inline def setScheduledActionDescriptionUndefined: Self = StObject.set(x, "ScheduledActionDescription", js.undefined)
    
    inline def setScheduledActionName(value: String): Self = StObject.set(x, "ScheduledActionName", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: TStamp): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setTargetAction(value: ScheduledActionType): Self = StObject.set(x, "TargetAction", value.asInstanceOf[js.Any])
  }
}
