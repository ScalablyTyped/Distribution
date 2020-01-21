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
  def apply(
    NextToken: PaginationToken = null,
    WorkspacesConnectionStatus: WorkspaceConnectionStatusList = null
  ): DescribeWorkspacesConnectionStatusResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (WorkspacesConnectionStatus != null) __obj.updateDynamic("WorkspacesConnectionStatus")(WorkspacesConnectionStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkspacesConnectionStatusResult]
  }
}

