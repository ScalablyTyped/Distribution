package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContextKeysForCustomPolicyRequest extends js.Object {
  /**
    * A list of policies for which you want the list of context keys referenced in those policies. Each document is specified as a string containing the complete, valid JSON text of an IAM policy. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
    */
  var PolicyInputList: SimulationPolicyListType = js.native
}

object GetContextKeysForCustomPolicyRequest {
  @scala.inline
  def apply(PolicyInputList: SimulationPolicyListType): GetContextKeysForCustomPolicyRequest = {
    val __obj = js.Dynamic.literal(PolicyInputList = PolicyInputList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContextKeysForCustomPolicyRequest]
  }
  @scala.inline
  implicit class GetContextKeysForCustomPolicyRequestOps[Self <: GetContextKeysForCustomPolicyRequest] (val x: Self) extends AnyVal {
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
    def setPolicyInputListVarargs(value: policyDocumentType*): Self = this.set("PolicyInputList", js.Array(value :_*))
    @scala.inline
    def setPolicyInputList(value: SimulationPolicyListType): Self = this.set("PolicyInputList", value.asInstanceOf[js.Any])
  }
  
}

