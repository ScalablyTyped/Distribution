package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePolicyVersionRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the IAM policy from which you want to delete a version. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var PolicyArn: arnType = js.native
  /**
    * The policy version to delete. This parameter allows (through its regex pattern) a string of characters that consists of the lowercase letter 'v' followed by one or two digits, and optionally followed by a period '.' and a string of letters and digits. For more information about managed policy versions, see Versioning for Managed Policies in the IAM User Guide.
    */
  var VersionId: policyVersionIdType = js.native
}

object DeletePolicyVersionRequest {
  @scala.inline
  def apply(PolicyArn: arnType, VersionId: policyVersionIdType): DeletePolicyVersionRequest = {
    val __obj = js.Dynamic.literal(PolicyArn = PolicyArn.asInstanceOf[js.Any], VersionId = VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePolicyVersionRequest]
  }
  @scala.inline
  implicit class DeletePolicyVersionRequestOps[Self <: DeletePolicyVersionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPolicyArn(value: arnType): Self = this.set("PolicyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionId(value: policyVersionIdType): Self = this.set("VersionId", value.asInstanceOf[js.Any])
  }
  
}

