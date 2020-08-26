package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIpGroupsResult extends js.Object {
  /**
    * The token to use to retrieve the next set of results, or null if no more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * Information about the IP access control groups.
    */
  var Result: js.UndefOr[WorkspacesIpGroupsList] = js.native
}

object DescribeIpGroupsResult {
  @scala.inline
  def apply(): DescribeIpGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIpGroupsResult]
  }
  @scala.inline
  implicit class DescribeIpGroupsResultOps[Self <: DescribeIpGroupsResult] (val x: Self) extends AnyVal {
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
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setResultVarargs(value: WorkspacesIpGroup*): Self = this.set("Result", js.Array(value :_*))
    @scala.inline
    def setResult(value: WorkspacesIpGroupsList): Self = this.set("Result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("Result", js.undefined)
  }
  
}

