package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterWorkspaceDirectoryRequest extends js.Object {
  /**
    * The identifier of the directory. If any WorkSpaces are registered to this directory, you must remove them before you deregister the directory, or you will receive an OperationNotSupportedException error.
    */
  var DirectoryId: typings.awsSdk.workspacesMod.DirectoryId = js.native
}

object DeregisterWorkspaceDirectoryRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId): DeregisterWorkspaceDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeregisterWorkspaceDirectoryRequest]
  }
}

