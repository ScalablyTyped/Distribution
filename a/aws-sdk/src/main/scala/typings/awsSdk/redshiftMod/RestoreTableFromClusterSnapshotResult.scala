package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreTableFromClusterSnapshotResult extends js.Object {
  
  var TableRestoreStatus: js.UndefOr[typings.awsSdk.redshiftMod.TableRestoreStatus] = js.native
}
object RestoreTableFromClusterSnapshotResult {
  
  @scala.inline
  def apply(): RestoreTableFromClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreTableFromClusterSnapshotResult]
  }
  
  @scala.inline
  implicit class RestoreTableFromClusterSnapshotResultOps[Self <: RestoreTableFromClusterSnapshotResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTableRestoreStatus(value: TableRestoreStatus): Self = this.set("TableRestoreStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableRestoreStatus: Self = this.set("TableRestoreStatus", js.undefined)
  }
}
