package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUsersResponse extends js.Object {
  /**
    * A pagination token that can be used in a subsequent request.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
  /**
    * The list of users.
    */
  var UserList: js.UndefOr[typings.awsSdk.quicksightMod.UserList] = js.native
}

object ListUsersResponse {
  @scala.inline
  def apply(
    NextToken: String = null,
    RequestId: String = null,
    Status: Int | scala.Double = null,
    UserList: UserList = null
  ): ListUsersResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (UserList != null) __obj.updateDynamic("UserList")(UserList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUsersResponse]
  }
}

