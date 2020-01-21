package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminateWorkspacesResult extends js.Object {
  /**
    * Information about the WorkSpaces that could not be terminated.
    */
  var FailedRequests: js.UndefOr[FailedTerminateWorkspaceRequests] = js.native
}

object TerminateWorkspacesResult {
  @scala.inline
  def apply(FailedRequests: FailedTerminateWorkspaceRequests = null): TerminateWorkspacesResult = {
    val __obj = js.Dynamic.literal()
    if (FailedRequests != null) __obj.updateDynamic("FailedRequests")(FailedRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateWorkspacesResult]
  }
}

