package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePolicyRequest extends js.Object {
  /**
    * The JSON document that describes the policy. policyDocument must have a minimum length of 1, with a maximum length of 2048, excluding whitespace.
    */
  var policyDocument: PolicyDocument = js.native
  /**
    * The policy name.
    */
  var policyName: PolicyName = js.native
  /**
    * Metadata which can be used to manage the policy.  For URI Request parameters use format: ...key1=value1&amp;key2=value2... For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..." For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..." 
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreatePolicyRequest {
  @scala.inline
  def apply(policyDocument: PolicyDocument, policyName: PolicyName, tags: TagList = null): CreatePolicyRequest = {
    val __obj = js.Dynamic.literal(policyDocument = policyDocument.asInstanceOf[js.Any], policyName = policyName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePolicyRequest]
  }
}

