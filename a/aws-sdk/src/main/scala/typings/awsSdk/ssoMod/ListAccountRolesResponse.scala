package typings.awsSdk.ssoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAccountRolesResponse extends js.Object {
  /**
    * The page token client that is used to retrieve the list of accounts.
    */
  var nextToken: js.UndefOr[NextTokenType] = js.native
  /**
    * A paginated response with the list of roles and the next token if more results are available.
    */
  var roleList: js.UndefOr[RoleListType] = js.native
}

object ListAccountRolesResponse {
  @scala.inline
  def apply(nextToken: NextTokenType = null, roleList: RoleListType = null): ListAccountRolesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (roleList != null) __obj.updateDynamic("roleList")(roleList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccountRolesResponse]
  }
}

