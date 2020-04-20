package typings.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateMembershipRequest extends js.Object {
  /**
    * The ARN of the behavior graph to remove the member account from. The member account's member status in the behavior graph must be ENABLED.
    */
  var GraphArn: typings.awsSdk.detectiveMod.GraphArn = js.native
}

object DisassociateMembershipRequest {
  @scala.inline
  def apply(GraphArn: GraphArn): DisassociateMembershipRequest = {
    val __obj = js.Dynamic.literal(GraphArn = GraphArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateMembershipRequest]
  }
}

