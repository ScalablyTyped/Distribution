package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrateWorkspaceRequest extends js.Object {
  /**
    * The identifier of the target bundle type to migrate the WorkSpace to.
    */
  var BundleId: typings.awsSdk.workspacesMod.BundleId = js.native
  /**
    * The identifier of the WorkSpace to migrate from.
    */
  var SourceWorkspaceId: WorkspaceId = js.native
}

object MigrateWorkspaceRequest {
  @scala.inline
  def apply(BundleId: BundleId, SourceWorkspaceId: WorkspaceId): MigrateWorkspaceRequest = {
    val __obj = js.Dynamic.literal(BundleId = BundleId.asInstanceOf[js.Any], SourceWorkspaceId = SourceWorkspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrateWorkspaceRequest]
  }
}

