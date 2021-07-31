package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIAMPolicyAssignmentResponse extends StObject {
  
  /**
    * Information describing the IAM policy assignment.
    */
  var IAMPolicyAssignment: js.UndefOr[typings.awsSdk.quicksightMod.IAMPolicyAssignment] = js.undefined
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object DescribeIAMPolicyAssignmentResponse {
  
  @scala.inline
  def apply(): DescribeIAMPolicyAssignmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIAMPolicyAssignmentResponse]
  }
  
  @scala.inline
  implicit class DescribeIAMPolicyAssignmentResponseMutableBuilder[Self <: DescribeIAMPolicyAssignmentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIAMPolicyAssignment(value: IAMPolicyAssignment): Self = StObject.set(x, "IAMPolicyAssignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIAMPolicyAssignmentUndefined: Self = StObject.set(x, "IAMPolicyAssignment", js.undefined)
    
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
