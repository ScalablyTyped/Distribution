package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUsersResponse extends js.Object {
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.native
  /**
    * Information about the users.
    */
  var UserSummaryList: js.UndefOr[typings.awsSdk.connectMod.UserSummaryList] = js.native
}

object ListUsersResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, UserSummaryList: UserSummaryList = null): ListUsersResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (UserSummaryList != null) __obj.updateDynamic("UserSummaryList")(UserSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUsersResponse]
  }
}

