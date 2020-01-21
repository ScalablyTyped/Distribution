package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMailboxPermissionsResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results. The value is "null" when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.workmailMod.NextToken] = js.native
  /**
    * One page of the user, group, or resource mailbox permissions.
    */
  var Permissions: js.UndefOr[typings.awsSdk.workmailMod.Permissions] = js.native
}

object ListMailboxPermissionsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Permissions: Permissions = null): ListMailboxPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Permissions != null) __obj.updateDynamic("Permissions")(Permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMailboxPermissionsResponse]
  }
}

