package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUsersInGroupRequest extends js.Object {
  /**
    * The name of the group.
    */
  var GroupName: GroupNameType = js.native
  /**
    * The limit of the request to list users.
    */
  var Limit: js.UndefOr[QueryLimitType] = js.native
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.native
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object ListUsersInGroupRequest {
  @scala.inline
  def apply(
    GroupName: GroupNameType,
    UserPoolId: UserPoolIdType,
    Limit: js.UndefOr[QueryLimitType] = js.undefined,
    NextToken: PaginationKey = null
  ): ListUsersInGroupRequest = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUsersInGroupRequest]
  }
}

