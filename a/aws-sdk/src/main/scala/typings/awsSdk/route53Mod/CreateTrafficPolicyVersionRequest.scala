package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTrafficPolicyVersionRequest extends js.Object {
  /**
    * The comment that you specified in the CreateTrafficPolicyVersion request, if any.
    */
  var Comment: js.UndefOr[TrafficPolicyComment] = js.native
  /**
    * The definition of this version of the traffic policy, in JSON format. You specified the JSON in the CreateTrafficPolicyVersion request. For more information about the JSON format, see CreateTrafficPolicy.
    */
  var Document: TrafficPolicyDocument = js.native
  /**
    * The ID of the traffic policy for which you want to create a new version.
    */
  var Id: TrafficPolicyId = js.native
}

object CreateTrafficPolicyVersionRequest {
  @scala.inline
  def apply(Document: TrafficPolicyDocument, Id: TrafficPolicyId, Comment: TrafficPolicyComment = null): CreateTrafficPolicyVersionRequest = {
    val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    if (Comment != null) __obj.updateDynamic("Comment")(Comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrafficPolicyVersionRequest]
  }
}

