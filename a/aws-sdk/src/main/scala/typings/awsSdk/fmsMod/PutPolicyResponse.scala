package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutPolicyResponse extends js.Object {
  /**
    * The details of the AWS Firewall Manager policy.
    */
  var Policy: js.UndefOr[typings.awsSdk.fmsMod.Policy] = js.native
  /**
    * The Amazon Resource Name (ARN) of the policy.
    */
  var PolicyArn: js.UndefOr[ResourceArn] = js.native
}

object PutPolicyResponse {
  @scala.inline
  def apply(): PutPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutPolicyResponse]
  }
  @scala.inline
  implicit class PutPolicyResponseOps[Self <: PutPolicyResponse] (val x: Self) extends AnyVal {
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
    def setPolicy(value: Policy): Self = this.set("Policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("Policy", js.undefined)
    @scala.inline
    def setPolicyArn(value: ResourceArn): Self = this.set("PolicyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyArn: Self = this.set("PolicyArn", js.undefined)
  }
  
}

