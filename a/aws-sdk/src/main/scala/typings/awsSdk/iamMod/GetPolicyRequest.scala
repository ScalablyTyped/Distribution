package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPolicyRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the managed policy that you want information about. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var PolicyArn: arnType = js.native
}

object GetPolicyRequest {
  @scala.inline
  def apply(PolicyArn: arnType): GetPolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyArn = PolicyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolicyRequest]
  }
  @scala.inline
  implicit class GetPolicyRequestOps[Self <: GetPolicyRequest] (val x: Self) extends AnyVal {
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
  }
  
}

