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
  def apply(): DescribeUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUsersResponse]
  }
  @scala.inline
  implicit class DescribeUsersResponseOps[Self <: DescribeUsersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMarker(value: PageMarkerType): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
    @scala.inline
    def setTotalNumberOfUsers(value: SizeType): Self = this.set("TotalNumberOfUsers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalNumberOfUsers: Self = this.set("TotalNumberOfUsers", js.undefined)
    @scala.inline
    def setUsersVarargs(value: User*): Self = this.set("Users", js.Array(value :_*))
    @scala.inline
    def setUsers(value: OrganizationUserList): Self = this.set("Users", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsers: Self = this.set("Users", js.undefined)
  }
  
}

