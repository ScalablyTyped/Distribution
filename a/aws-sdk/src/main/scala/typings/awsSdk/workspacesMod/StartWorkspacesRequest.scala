package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartWorkspacesRequest extends js.Object {
  /**
    * The WorkSpaces to start. You can specify up to 25 WorkSpaces.
    */
  var StartWorkspaceRequests: typings.awsSdk.workspacesMod.StartWorkspaceRequests = js.native
}

object StartWorkspacesRequest {
  @scala.inline
  def apply(StartWorkspaceRequests: StartWorkspaceRequests): StartWorkspacesRequest = {
    val __obj = js.Dynamic.literal(StartWorkspaceRequests = StartWorkspaceRequests.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StartWorkspacesRequest]
  }
}

