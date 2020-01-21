package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateWorkspacesResult extends js.Object {
  /**
    * Information about the WorkSpaces that could not be created.
    */
  var FailedRequests: js.UndefOr[FailedCreateWorkspaceRequests] = js.native
  /**
    * Information about the WorkSpaces that were created. Because this operation is asynchronous, the identifier returned is not immediately available for use with other operations. For example, if you call DescribeWorkspaces before the WorkSpace is created, the information returned can be incomplete.
    */
  var PendingRequests: js.UndefOr[WorkspaceList] = js.native
}

object CreateWorkspacesResult {
  @scala.inline
  def apply(FailedRequests: FailedCreateWorkspaceRequests = null, PendingRequests: WorkspaceList = null): CreateWorkspacesResult = {
    val __obj = js.Dynamic.literal()
    if (FailedRequests != null) __obj.updateDynamic("FailedRequests")(FailedRequests.asInstanceOf[js.Any])
    if (PendingRequests != null) __obj.updateDynamic("PendingRequests")(PendingRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWorkspacesResult]
  }
}

