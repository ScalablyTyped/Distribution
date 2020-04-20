package typings.awsSdk.detectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMembersRequest extends js.Object {
  /**
    * The list of AWS account identifiers for the member accounts to delete from the behavior graph.
    */
  var AccountIds: AccountIdList = js.native
  /**
    * The ARN of the behavior graph to delete members from.
    */
  var GraphArn: typings.awsSdk.detectiveMod.GraphArn = js.native
}

object DeleteMembersRequest {
  @scala.inline
  def apply(AccountIds: AccountIdList, GraphArn: GraphArn): DeleteMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any], GraphArn = GraphArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMembersRequest]
  }
}

