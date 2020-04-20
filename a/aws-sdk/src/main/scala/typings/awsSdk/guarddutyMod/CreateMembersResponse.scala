package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMembersResponse extends js.Object {
  /**
    * A list of objects containing the unprocessed account and a result string explaining why it was unprocessed.
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

