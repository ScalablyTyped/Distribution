package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMembersResponse extends js.Object {
  /**
    * A list of objects that include the accountIds of the unprocessed accounts and a result string that explains why each was unprocessed.
    */
  var UnprocessedAccounts: typings.awsSdk.guarddutyMod.UnprocessedAccounts = js.native
}

object CreateMembersResponse {
  @scala.inline
  def apply(UnprocessedAccounts: UnprocessedAccounts): CreateMembersResponse = {
    val __obj = js.Dynamic.literal(UnprocessedAccounts = UnprocessedAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMembersResponse]
  }
}

