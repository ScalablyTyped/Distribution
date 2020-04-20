package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTrafficPolicyCommentRequest extends js.Object {
  /**
    * The new comment for the specified traffic policy and version.
    */
  var Comment: TrafficPolicyComment = js.native
  /**
    * The value of Id for the traffic policy that you want to update the comment for.
    */
  var Id: TrafficPolicyId = js.native
  /**
    * The value of Version for the traffic policy that you want to update the comment for.
    */
  var Version: TrafficPolicyVersion = js.native
}

object UpdateTrafficPolicyCommentRequest {
  @scala.inline
  def apply(Comment: TrafficPolicyComment, Id: TrafficPolicyId, Version: TrafficPolicyVersion): UpdateTrafficPolicyCommentRequest = {
    val __obj = js.Dynamic.literal(Comment = Comment.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrafficPolicyCommentRequest]
  }
}

