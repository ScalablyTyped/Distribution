package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): MigrateWorkspaceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MigrateWorkspaceResult]
  }
  
  @scala.inline
  implicit class MigrateWorkspaceResultOps[Self <: MigrateWorkspaceResult] (val x: Self) extends AnyVal {
    
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
    def setSourceWorkspaceId(value: WorkspaceId): Self = this.set("SourceWorkspaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceWorkspaceId: Self = this.set("SourceWorkspaceId", js.undefined)
    
    @scala.inline
    def setTargetWorkspaceId(value: WorkspaceId): Self = this.set("TargetWorkspaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetWorkspaceId: Self = this.set("TargetWorkspaceId", js.undefined)
  }
}
