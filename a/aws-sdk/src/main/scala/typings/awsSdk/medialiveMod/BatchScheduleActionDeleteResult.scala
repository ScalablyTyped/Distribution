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
  
  @scala.inline
  def apply(ScheduleActions: listOfScheduleAction): BatchScheduleActionDeleteResult = {
    val __obj = js.Dynamic.literal(ScheduleActions = ScheduleActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchScheduleActionDeleteResult]
  }
  
  @scala.inline
  implicit class BatchScheduleActionDeleteResultMutableBuilder[Self <: BatchScheduleActionDeleteResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScheduleActions(value: listOfScheduleAction): Self = StObject.set(x, "ScheduleActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleActionsVarargs(value: ScheduleAction*): Self = StObject.set(x, "ScheduleActions", js.Array(value :_*))
  }
}
