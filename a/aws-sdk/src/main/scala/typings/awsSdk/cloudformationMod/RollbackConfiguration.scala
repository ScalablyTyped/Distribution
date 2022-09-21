package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollbackConfiguration extends StObject {
  
  /**
    * The amount of time, in minutes, during which CloudFormation should monitor all the rollback triggers after the stack creation or update operation deploys all necessary resources. The default is 0 minutes. If you specify a monitoring period but don't specify any rollback triggers, CloudFormation still waits the specified period of time before cleaning up old resources after update operations. You can use this monitoring period to perform any manual stack validation desired, and manually cancel the stack creation or update (using CancelUpdateStack, for example) as necessary. If you specify 0 for this parameter, CloudFormation still monitors the specified rollback triggers during stack creation and update operations. Then, for update operations, it begins disposing of old resources immediately once the operation completes.
    */
  var MonitoringTimeInMinutes: js.UndefOr[typings.awsSdk.cloudformationMod.MonitoringTimeInMinutes] = js.undefined
  
  /**
    * The triggers to monitor during stack creation or update actions. By default, CloudFormation saves the rollback triggers specified for a stack and applies them to any subsequent update operations for the stack, unless you specify otherwise. If you do specify rollback triggers for this parameter, those triggers replace any list of triggers previously specified for the stack. This means:   To use the rollback triggers previously specified for this stack, if any, don't specify this parameter.   To specify new or updated rollback triggers, you must specify all the triggers that you want used for this stack, even triggers you've specified before (for example, when creating the stack or during a previous stack update). Any triggers that you don't include in the updated list of triggers are no longer applied to the stack.   To remove all currently specified triggers, specify an empty list for this parameter.   If a specified trigger is missing, the entire stack operation fails and is rolled back.
    */
  var RollbackTriggers: js.UndefOr[typings.awsSdk.cloudformationMod.RollbackTriggers] = js.undefined
}
object RollbackConfiguration {
  
  inline def apply(): RollbackConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollbackConfiguration]
  }
  
  extension [Self <: RollbackConfiguration](x: Self) {
    
    inline def setMonitoringTimeInMinutes(value: MonitoringTimeInMinutes): Self = StObject.set(x, "MonitoringTimeInMinutes", value.asInstanceOf[js.Any])
    
    inline def setMonitoringTimeInMinutesUndefined: Self = StObject.set(x, "MonitoringTimeInMinutes", js.undefined)
    
    inline def setRollbackTriggers(value: RollbackTriggers): Self = StObject.set(x, "RollbackTriggers", value.asInstanceOf[js.Any])
    
    inline def setRollbackTriggersUndefined: Self = StObject.set(x, "RollbackTriggers", js.undefined)
    
    inline def setRollbackTriggersVarargs(value: RollbackTrigger*): Self = StObject.set(x, "RollbackTriggers", js.Array(value*))
  }
}
