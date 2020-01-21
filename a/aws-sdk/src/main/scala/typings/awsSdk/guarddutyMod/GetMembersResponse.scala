package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMembersResponse extends js.Object {
  /**
    * A list of members.
    */
  var Members: typings.awsSdk.guarddutyMod.Members = js.native
  /**
    * A list of objects containing the unprocessed account and a result string explaining why it was unprocessed.
    */
  var UnprocessedAccounts: typings.awsSdk.guarddutyMod.UnprocessedAccounts = js.native
}

object GetMembersResponse {
  @scala.inline
  def apply(Members: Members, UnprocessedAccounts: UnprocessedAccounts): GetMembersResponse = {
    val __obj = js.Dynamic.literal(Members = Members.asInstanceOf[js.Any], UnprocessedAccounts = UnprocessedAccounts.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetMembersResponse]
  }
}

