package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebootWorkspacesRequest extends js.Object {
  /**
    * The WorkSpaces to reboot. You can specify up to 25 WorkSpaces.
    */
  var RebootWorkspaceRequests: typings.awsSdk.workspacesMod.RebootWorkspaceRequests = js.native
}

object RebootWorkspacesRequest {
  @scala.inline
  def apply(RebootWorkspaceRequests: RebootWorkspaceRequests): RebootWorkspacesRequest = {
    val __obj = js.Dynamic.literal(RebootWorkspaceRequests = RebootWorkspaceRequests.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RebootWorkspacesRequest]
  }
}

