package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkspacesResult extends js.Object {
  /**
    * The token to use to retrieve the next set of results, or null if no more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * Information about the WorkSpaces. Because CreateWorkspaces is an asynchronous operation, some of the returned information could be incomplete.
    */
  var Workspaces: js.UndefOr[WorkspaceList] = js.native
}

object DescribeWorkspacesResult {
  @scala.inline
  def apply(): DescribeWorkspacesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspacesResult]
  }
  @scala.inline
  implicit class DescribeWorkspacesResultOps[Self <: DescribeWorkspacesResult] (val x: Self) extends AnyVal {
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
    def setWorkspacesVarargs(value: Workspace*): Self = this.set("Workspaces", js.Array(value :_*))
    @scala.inline
    def setWorkspaces(value: WorkspaceList): Self = this.set("Workspaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkspaces: Self = this.set("Workspaces", js.undefined)
  }
  
}

