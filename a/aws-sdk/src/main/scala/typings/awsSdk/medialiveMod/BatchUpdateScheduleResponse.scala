package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateScheduleResponse extends StObject {
  
  /**
    * Schedule actions created in the schedule.
    */
  var Creates: js.UndefOr[BatchScheduleActionCreateResult] = js.undefined
  
  /**
    * Schedule actions deleted from the schedule.
    */
  var Deletes: js.UndefOr[BatchScheduleActionDeleteResult] = js.undefined
}
object BatchUpdateScheduleResponse {
  
  @scala.inline
  def apply(): BatchUpdateScheduleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateScheduleResponse]
  }
  
  @scala.inline
  implicit class BatchUpdateScheduleResponseMutableBuilder[Self <: BatchUpdateScheduleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreates(value: BatchScheduleActionCreateResult): Self = StObject.set(x, "Creates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatesUndefined: Self = StObject.set(x, "Creates", js.undefined)
    
    @scala.inline
    def setDeletes(value: BatchScheduleActionDeleteResult): Self = StObject.set(x, "Deletes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletesUndefined: Self = StObject.set(x, "Deletes", js.undefined)
  }
}
