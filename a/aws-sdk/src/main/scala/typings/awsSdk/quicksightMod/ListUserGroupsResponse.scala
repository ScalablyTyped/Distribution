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
  def apply(): ListUserGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserGroupsResponse]
  }
  @scala.inline
  implicit class ListUserGroupsResponseOps[Self <: ListUserGroupsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGroupListVarargs(value: Group*): Self = this.set("GroupList", js.Array(value :_*))
    @scala.inline
    def setGroupList(value: GroupList): Self = this.set("GroupList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupList: Self = this.set("GroupList", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setRequestId(value: String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    @scala.inline
    def setStatus(value: StatusCode): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

