package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGroupsResult extends js.Object {
  /**
    * The collection of all active groups.
    */
  var Groups: js.UndefOr[GroupSummaryList] = js.native
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object GetGroupsResult {
  @scala.inline
  def apply(): GetGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupsResult]
  }
  @scala.inline
  implicit class GetGroupsResultOps[Self <: GetGroupsResult] (val x: Self) extends AnyVal {
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
    def setGroupsVarargs(value: GroupSummary*): Self = this.set("Groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: GroupSummaryList): Self = this.set("Groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("Groups", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

