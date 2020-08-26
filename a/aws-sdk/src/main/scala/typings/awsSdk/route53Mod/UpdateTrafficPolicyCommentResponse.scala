package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTrafficPolicyCommentResponse extends js.Object {
  /**
    * A complex type that contains settings for the specified traffic policy.
    */
  var TrafficPolicy: typings.awsSdk.route53Mod.TrafficPolicy = js.native
}

object UpdateTrafficPolicyCommentResponse {
  @scala.inline
  def apply(TrafficPolicy: TrafficPolicy): UpdateTrafficPolicyCommentResponse = {
    val __obj = js.Dynamic.literal(TrafficPolicy = TrafficPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrafficPolicyCommentResponse]
  }
  @scala.inline
  implicit class UpdateTrafficPolicyCommentResponseOps[Self <: UpdateTrafficPolicyCommentResponse] (val x: Self) extends AnyVal {
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
    def setTrafficPolicy(value: TrafficPolicy): Self = this.set("TrafficPolicy", value.asInstanceOf[js.Any])
  }
  
}

