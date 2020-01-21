package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUsersResponse extends js.Object {
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.native
  /**
    * The total number of users included in the results.
    */
  var TotalNumberOfUsers: js.UndefOr[SizeType] = js.native
  /**
    * The users.
    */
  var Users: js.UndefOr[OrganizationUserList] = js.native
}

object DescribeUsersResponse {
  @scala.inline
  def apply(
    Marker: PageMarkerType = null,
    TotalNumberOfUsers: Int | Double = null,
    Users: OrganizationUserList = null
  ): DescribeUsersResponse = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (TotalNumberOfUsers != null) __obj.updateDynamic("TotalNumberOfUsers")(TotalNumberOfUsers.asInstanceOf[js.Any])
    if (Users != null) __obj.updateDynamic("Users")(Users.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUsersResponse]
  }
}

