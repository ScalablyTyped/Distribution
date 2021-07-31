package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssignmentRequest extends StObject {
  
  /**
    * The ID of the Assignment to be retrieved.
    */
  var AssignmentId: EntityId
}
object GetAssignmentRequest {
  
  @scala.inline
  def apply(AssignmentId: EntityId): GetAssignmentRequest = {
    val __obj = js.Dynamic.literal(AssignmentId = AssignmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssignmentRequest]
  }
  
  @scala.inline
  implicit class GetAssignmentRequestMutableBuilder[Self <: GetAssignmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignmentId(value: EntityId): Self = StObject.set(x, "AssignmentId", value.asInstanceOf[js.Any])
  }
}
