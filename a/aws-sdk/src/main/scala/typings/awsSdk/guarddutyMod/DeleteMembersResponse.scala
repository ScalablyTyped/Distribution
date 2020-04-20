package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMembersResponse extends js.Object {
  /**
    * The accounts that could not be processed.
    */
  var UnprocessedAccounts: typings.awsSdk.guarddutyMod.UnprocessedAccounts = js.native
}

object DeleteMembersResponse {
  @scala.inline
  def apply(UnprocessedAccounts: UnprocessedAccounts): DeleteMembersResponse = {
    val __obj = js.Dynamic.literal(UnprocessedAccounts = UnprocessedAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMembersResponse]
  }
}

