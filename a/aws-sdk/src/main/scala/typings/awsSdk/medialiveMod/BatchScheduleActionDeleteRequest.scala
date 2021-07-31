package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchScheduleActionDeleteRequest extends StObject {
  
  /**
    * A list of schedule actions to delete.
    */
  var ActionNames: listOfString
}
object BatchScheduleActionDeleteRequest {
  
  @scala.inline
  def apply(ActionNames: listOfString): BatchScheduleActionDeleteRequest = {
    val __obj = js.Dynamic.literal(ActionNames = ActionNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchScheduleActionDeleteRequest]
  }
  
  @scala.inline
  implicit class BatchScheduleActionDeleteRequestMutableBuilder[Self <: BatchScheduleActionDeleteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionNames(value: listOfString): Self = StObject.set(x, "ActionNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionNamesVarargs(value: string*): Self = StObject.set(x, "ActionNames", js.Array(value :_*))
  }
}
