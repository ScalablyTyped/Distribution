package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrateWorkspaceResult extends js.Object {
  /**
    * The original identifier of the WorkSpace that is being migrated.
    */
  var SourceWorkspaceId: js.UndefOr[WorkspaceId] = js.native
  /**
    * The new identifier of the WorkSpace that is being migrated. If the migration does not succeed, the target WorkSpace ID will not be used, and the WorkSpace will still have the original WorkSpace ID.
    */
  var TargetWorkspaceId: js.UndefOr[WorkspaceId] = js.native
}

object MigrateWorkspaceResult {
  @scala.inline
  def apply(SourceWorkspaceId: WorkspaceId = null, TargetWorkspaceId: WorkspaceId = null): MigrateWorkspaceResult = {
    val __obj = js.Dynamic.literal()
    if (SourceWorkspaceId != null) __obj.updateDynamic("SourceWorkspaceId")(SourceWorkspaceId.asInstanceOf[js.Any])
    if (TargetWorkspaceId != null) __obj.updateDynamic("TargetWorkspaceId")(TargetWorkspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrateWorkspaceResult]
  }
}

