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
}

