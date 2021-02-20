package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteIAMPolicyAssignmentRequest extends StObject {
  
  /**
    * The name of the assignment. 
    */
  var AssignmentName: IAMPolicyAssignmentName = js.native
  
  /**
    * The AWS account ID where you want to delete the IAM policy assignment.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  
  /**
    * The namespace that contains the assignment.
    */
  var Namespace: typings.awsSdk.quicksightMod.Namespace = js.native
}
object DeleteIAMPolicyAssignmentRequest {
  
  @scala.inline
  def apply(AssignmentName: IAMPolicyAssignmentName, AwsAccountId: AwsAccountId, Namespace: Namespace): DeleteIAMPolicyAssignmentRequest = {
    val __obj = js.Dynamic.literal(AssignmentName = AssignmentName.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIAMPolicyAssignmentRequest]
  }
  
  @scala.inline
  implicit class DeleteIAMPolicyAssignmentRequestMutableBuilder[Self <: DeleteIAMPolicyAssignmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignmentName(value: IAMPolicyAssignmentName): Self = StObject.set(x, "AssignmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
  }
}
