package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePolicyResponse extends js.Object {
  /**
    * The policy ARN.
    */
  var policyArn: js.UndefOr[PolicyArn] = js.native
  /**
    * The JSON document that describes the policy.
    */
  var policyDocument: js.UndefOr[PolicyDocument] = js.native
  /**
    * The policy name.
    */
  var policyName: js.UndefOr[PolicyName] = js.native
  /**
    * The policy version ID.
    */
  var policyVersionId: js.UndefOr[PolicyVersionId] = js.native
}

object CreatePolicyResponse {
  @scala.inline
  def apply(): CreatePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePolicyResponse]
  }
  @scala.inline
  implicit class CreatePolicyResponseOps[Self <: CreatePolicyResponse] (val x: Self) extends AnyVal {
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
    def setPolicyArn(value: PolicyArn): Self = this.set("policyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyArn: Self = this.set("policyArn", js.undefined)
    @scala.inline
    def setPolicyDocument(value: PolicyDocument): Self = this.set("policyDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyDocument: Self = this.set("policyDocument", js.undefined)
    @scala.inline
    def setPolicyName(value: PolicyName): Self = this.set("policyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyName: Self = this.set("policyName", js.undefined)
    @scala.inline
    def setPolicyVersionId(value: PolicyVersionId): Self = this.set("policyVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyVersionId: Self = this.set("policyVersionId", js.undefined)
  }
  
}

