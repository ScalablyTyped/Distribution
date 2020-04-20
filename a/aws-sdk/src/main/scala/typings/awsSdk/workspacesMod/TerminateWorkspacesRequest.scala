package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminateWorkspacesRequest extends js.Object {
  /**
    * The WorkSpaces to terminate. You can specify up to 25 WorkSpaces.
    */
  var TerminateWorkspaceRequests: typings.awsSdk.workspacesMod.TerminateWorkspaceRequests = js.native
}

object TerminateWorkspacesRequest {
  @scala.inline
  def apply(TerminateWorkspaceRequests: TerminateWorkspaceRequests): TerminateWorkspacesRequest = {
    val __obj = js.Dynamic.literal(TerminateWorkspaceRequests = TerminateWorkspaceRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateWorkspacesRequest]
  }
}

