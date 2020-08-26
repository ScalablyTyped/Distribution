package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUserHierarchyGroupsResponse extends js.Object {
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.native
  /**
    * Information about the hierarchy groups.
    */
  var UserHierarchyGroupSummaryList: js.UndefOr[HierarchyGroupSummaryList] = js.native
}

object ListUserHierarchyGroupsResponse {
  @scala.inline
  def apply(): ListUserHierarchyGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserHierarchyGroupsResponse]
  }
  @scala.inline
  implicit class ListUserHierarchyGroupsResponseOps[Self <: ListUserHierarchyGroupsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setUserHierarchyGroupSummaryListVarargs(value: HierarchyGroupSummary*): Self = this.set("UserHierarchyGroupSummaryList", js.Array(value :_*))
    @scala.inline
    def setUserHierarchyGroupSummaryList(value: HierarchyGroupSummaryList): Self = this.set("UserHierarchyGroupSummaryList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserHierarchyGroupSummaryList: Self = this.set("UserHierarchyGroupSummaryList", js.undefined)
  }
  
}

