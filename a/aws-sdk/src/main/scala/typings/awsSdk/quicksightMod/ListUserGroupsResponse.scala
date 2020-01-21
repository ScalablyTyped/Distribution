package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUserGroupsResponse extends js.Object {
  /**
    * The list of groups the user is a member of.
    */
  var GroupList: js.UndefOr[typings.awsSdk.quicksightMod.GroupList] = js.native
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
}

object ListUserGroupsResponse {
  @scala.inline
  def apply(
    GroupList: GroupList = null,
    NextToken: String = null,
    RequestId: String = null,
    Status: Int | scala.Double = null
  ): ListUserGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (GroupList != null) __obj.updateDynamic("GroupList")(GroupList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUserGroupsResponse]
  }
}

