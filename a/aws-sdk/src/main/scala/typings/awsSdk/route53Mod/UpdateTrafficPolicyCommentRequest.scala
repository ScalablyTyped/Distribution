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
  @scala.inline
  implicit class UpdateTrafficPolicyCommentRequestOps[Self <: UpdateTrafficPolicyCommentRequest] (val x: Self) extends AnyVal {
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
    def setComment(value: TrafficPolicyComment): Self = this.set("Comment", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: TrafficPolicyId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: TrafficPolicyVersion): Self = this.set("Version", value.asInstanceOf[js.Any])
  }
  
}

