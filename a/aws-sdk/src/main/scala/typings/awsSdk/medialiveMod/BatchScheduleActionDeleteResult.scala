package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchScheduleActionDeleteResult extends StObject {
  
  /**
    * List of actions that have been deleted from the schedule.
    */
  var ScheduleActions: listOfScheduleAction
}
object BatchScheduleActionDeleteResult {
  
  inline def apply(ScheduleActions: listOfScheduleAction): BatchScheduleActionDeleteResult = {
    val __obj = js.Dynamic.literal(ScheduleActions = ScheduleActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchScheduleActionDeleteResult]
  }
  
  extension [Self <: BatchScheduleActionDeleteResult](x: Self) {
    
    inline def setScheduleActions(value: listOfScheduleAction): Self = StObject.set(x, "ScheduleActions", value.asInstanceOf[js.Any])
    
    inline def setScheduleActionsVarargs(value: ScheduleAction*): Self = StObject.set(x, "ScheduleActions", js.Array(value*))
  }
}
