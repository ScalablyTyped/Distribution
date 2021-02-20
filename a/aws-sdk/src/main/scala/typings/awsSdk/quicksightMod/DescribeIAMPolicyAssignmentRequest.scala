package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeIAMPolicyAssignmentRequest extends StObject {
  
  /**
    * The name of the assignment, also called a rule.
    */
  var AssignmentName: IAMPolicyAssignmentName = js.native
  
  /**
    * The ID of the AWS account that contains the assignment that you want to describe.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  
  /**
    * The namespace that contains the assignment.
    */
  var Namespace: typings.awsSdk.quicksightMod.Namespace = js.native
}
object DescribeIAMPolicyAssignmentRequest {
  
  @scala.inline
  def apply(AssignmentName: IAMPolicyAssignmentName, AwsAccountId: AwsAccountId, Namespace: Namespace): DescribeIAMPolicyAssignmentRequest = {
    val __obj = js.Dynamic.literal(AssignmentName = AssignmentName.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIAMPolicyAssignmentRequest]
  }
  
  @scala.inline
  implicit class DescribeIAMPolicyAssignmentRequestMutableBuilder[Self <: DescribeIAMPolicyAssignmentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignmentName(value: IAMPolicyAssignmentName): Self = StObject.set(x, "AssignmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
  }
}
