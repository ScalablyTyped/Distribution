package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTrafficPolicyRequest extends js.Object {
  /**
    * (Optional) Any comments that you want to include about the traffic policy.
    */
  var Comment: js.UndefOr[TrafficPolicyComment] = js.native
  /**
    * The definition of this traffic policy in JSON format. For more information, see Traffic Policy Document Format.
    */
  var Document: TrafficPolicyDocument = js.native
  /**
    * The name of the traffic policy.
    */
  var Name: TrafficPolicyName = js.native
}

object CreateTrafficPolicyRequest {
  @scala.inline
  def apply(Document: TrafficPolicyDocument, Name: TrafficPolicyName, Comment: TrafficPolicyComment = null): CreateTrafficPolicyRequest = {
    val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (Comment != null) __obj.updateDynamic("Comment")(Comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrafficPolicyRequest]
  }
}

