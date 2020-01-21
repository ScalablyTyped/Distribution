package typings.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMembersRequest extends js.Object {
  /**
    * The list of AWS accounts to invite to become member accounts in the behavior graph. For each invited account, the account list contains the account identifier and the AWS account root user email address.
    */
  var Accounts: AccountList = js.native
  /**
    * The ARN of the behavior graph to invite the member accounts to contribute their data to.
    */
  var GraphArn: typings.awsSdk.detectiveMod.GraphArn = js.native
  /**
    * Customized message text to include in the invitation email message to the invited member accounts.
    */
  var Message: js.UndefOr[EmailMessage] = js.native
}

object CreateMembersRequest {
  @scala.inline
  def apply(Accounts: AccountList, GraphArn: GraphArn, Message: EmailMessage = null): CreateMembersRequest = {
    val __obj = js.Dynamic.literal(Accounts = Accounts.asInstanceOf[js.Any], GraphArn = GraphArn.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMembersRequest]
  }
}

