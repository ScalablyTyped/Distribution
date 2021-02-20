package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchScheduleActionCreateResult extends StObject {
  
  /**
    * List of actions that have been created in the schedule.
    */
  var ScheduleActions: listOfScheduleAction = js.native
}
object BatchScheduleActionCreateResult {
  
  @scala.inline
  def apply(ScheduleActions: listOfScheduleAction): BatchScheduleActionCreateResult = {
    val __obj = js.Dynamic.literal(ScheduleActions = ScheduleActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchScheduleActionCreateResult]
  }
  
  @scala.inline
  implicit class BatchScheduleActionCreateResultMutableBuilder[Self <: BatchScheduleActionCreateResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScheduleActions(value: listOfScheduleAction): Self = StObject.set(x, "ScheduleActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleActionsVarargs(value: ScheduleAction*): Self = StObject.set(x, "ScheduleActions", js.Array(value :_*))
  }
}
