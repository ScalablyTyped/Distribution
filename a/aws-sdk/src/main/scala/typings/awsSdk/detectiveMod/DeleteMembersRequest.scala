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
  @scala.inline
  implicit class DeleteMembersRequestOps[Self <: DeleteMembersRequest] (val x: Self) extends AnyVal {
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
    def setAccountIdsVarargs(value: AccountId*): Self = this.set("AccountIds", js.Array(value :_*))
    @scala.inline
    def setAccountIds(value: AccountIdList): Self = this.set("AccountIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setGraphArn(value: GraphArn): Self = this.set("GraphArn", value.asInstanceOf[js.Any])
  }
  
}

