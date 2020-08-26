package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkspacesConnectionStatusResult extends js.Object {
  /**
    * The token to use to retrieve the next set of results, or null if no more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * Information about the connection status of the WorkSpace.
    */
  var WorkspacesConnectionStatus: js.UndefOr[WorkspaceConnectionStatusList] = js.native
}

object DescribeWorkspacesConnectionStatusResult {
  @scala.inline
  def apply(): DescribeWorkspacesConnectionStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspacesConnectionStatusResult]
  }
  @scala.inline
  implicit class DescribeWorkspacesConnectionStatusResultOps[Self <: DescribeWorkspacesConnectionStatusResult] (val x: Self) extends AnyVal {
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
    def setWorkspacesConnectionStatusVarargs(value: WorkspaceConnectionStatus*): Self = this.set("WorkspacesConnectionStatus", js.Array(value :_*))
    @scala.inline
    def setWorkspacesConnectionStatus(value: WorkspaceConnectionStatusList): Self = this.set("WorkspacesConnectionStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkspacesConnectionStatus: Self = this.set("WorkspacesConnectionStatus", js.undefined)
  }
  
}

