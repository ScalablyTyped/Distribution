package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIAMPolicyAssignmentResponse extends StObject {
  
  /**
    * The name of the assignment. 
    */
  var AssignmentName: js.UndefOr[IAMPolicyAssignmentName] = js.undefined
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object DeleteIAMPolicyAssignmentResponse {
  
  @scala.inline
  def apply(): DeleteIAMPolicyAssignmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteIAMPolicyAssignmentResponse]
  }
  
  @scala.inline
  implicit class DeleteIAMPolicyAssignmentResponseMutableBuilder[Self <: DeleteIAMPolicyAssignmentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignmentName(value: IAMPolicyAssignmentName): Self = StObject.set(x, "AssignmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignmentNameUndefined: Self = StObject.set(x, "AssignmentName", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
