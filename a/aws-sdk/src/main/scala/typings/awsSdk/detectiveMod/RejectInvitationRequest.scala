package typings.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RejectInvitationRequest extends js.Object {
  /**
    * The ARN of the behavior graph to reject the invitation to. The member account's current member status in the behavior graph must be INVITED.
    */
  var GraphArn: typings.awsSdk.detectiveMod.GraphArn = js.native
}

object RejectInvitationRequest {
  @scala.inline
  def apply(GraphArn: GraphArn): RejectInvitationRequest = {
    val __obj = js.Dynamic.literal(GraphArn = GraphArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RejectInvitationRequest]
  }
}

