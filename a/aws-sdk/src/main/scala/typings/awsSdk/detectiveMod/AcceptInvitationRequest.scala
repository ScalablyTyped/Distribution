package typings.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptInvitationRequest extends js.Object {
  /**
    * The ARN of the behavior graph that the member account is accepting the invitation for. The member account status in the behavior graph must be INVITED.
    */
  var GraphArn: typings.awsSdk.detectiveMod.GraphArn = js.native
}

object AcceptInvitationRequest {
  @scala.inline
  def apply(GraphArn: GraphArn): AcceptInvitationRequest = {
    val __obj = js.Dynamic.literal(GraphArn = GraphArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptInvitationRequest]
  }
  @scala.inline
  implicit class AcceptInvitationRequestOps[Self <: AcceptInvitationRequest] (val x: Self) extends AnyVal {
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
    def setGraphArn(value: GraphArn): Self = this.set("GraphArn", value.asInstanceOf[js.Any])
  }
  
}

