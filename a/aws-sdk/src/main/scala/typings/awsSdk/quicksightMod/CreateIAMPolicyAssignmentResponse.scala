package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateIAMPolicyAssignmentResponse extends js.Object {
  
  /**
    * The ID for the assignment.
    */
  var AssignmentId: js.UndefOr[String] = js.native
  
  /**
    * The name of the assignment. This name must be unique within the AWS account.
    */
  var AssignmentName: js.UndefOr[IAMPolicyAssignmentName] = js.native
  
  /**
    * The status of the assignment. Possible values are as follows:    ENABLED - Anything specified in this assignment is used when creating the data source.    DISABLED - This assignment isn't used when creating the data source.    DRAFT - This assignment is an unfinished draft and isn't used when creating the data source.  
    */
  var AssignmentStatus: js.UndefOr[typings.awsSdk.quicksightMod.AssignmentStatus] = js.native
  
  /**
    * The QuickSight users, groups, or both that the IAM policy is assigned to.
    */
  var Identities: js.UndefOr[IdentityMap] = js.native
  
  /**
    * The ARN for the IAM policy that is applied to the QuickSight users and groups specified in this assignment.
    */
  var PolicyArn: js.UndefOr[Arn] = js.native
  
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}
object CreateIAMPolicyAssignmentResponse {
  
  @scala.inline
  def apply(): CreateIAMPolicyAssignmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateIAMPolicyAssignmentResponse]
  }
  
  @scala.inline
  implicit class CreateIAMPolicyAssignmentResponseOps[Self <: CreateIAMPolicyAssignmentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssignmentId(value: String): Self = this.set("AssignmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignmentId: Self = this.set("AssignmentId", js.undefined)
    
    @scala.inline
    def setAssignmentName(value: IAMPolicyAssignmentName): Self = this.set("AssignmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignmentName: Self = this.set("AssignmentName", js.undefined)
    
    @scala.inline
    def setAssignmentStatus(value: AssignmentStatus): Self = this.set("AssignmentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignmentStatus: Self = this.set("AssignmentStatus", js.undefined)
    
    @scala.inline
    def setIdentities(value: IdentityMap): Self = this.set("Identities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentities: Self = this.set("Identities", js.undefined)
    
    @scala.inline
    def setPolicyArn(value: Arn): Self = this.set("PolicyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyArn: Self = this.set("PolicyArn", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusCode): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
