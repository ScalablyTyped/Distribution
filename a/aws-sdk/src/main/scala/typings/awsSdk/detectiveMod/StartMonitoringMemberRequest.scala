package typings.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartMonitoringMemberRequest extends js.Object {
  /**
    * The account ID of the member account to try to enable. The account must be an invited member account with a status of ACCEPTED_BUT_DISABLED. 
    */
  var AccountId: typings.awsSdk.detectiveMod.AccountId = js.native
  /**
    * The ARN of the behavior graph.
    */
  var GraphArn: typings.awsSdk.detectiveMod.GraphArn = js.native
}

object StartMonitoringMemberRequest {
  @scala.inline
  def apply(AccountId: AccountId, GraphArn: GraphArn): StartMonitoringMemberRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], GraphArn = GraphArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartMonitoringMemberRequest]
  }
}

