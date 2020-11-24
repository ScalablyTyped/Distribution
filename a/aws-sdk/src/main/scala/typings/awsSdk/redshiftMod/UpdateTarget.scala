package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTarget extends js.Object {
  
  /**
    * The cluster version for the new maintenance track.
    */
  var DatabaseVersion: js.UndefOr[String] = js.native
  
  /**
    * The name of the new maintenance track.
    */
  var MaintenanceTrackName: js.UndefOr[String] = js.native
  
  /**
    * A list of operations supported by the maintenance track.
    */
  var SupportedOperations: js.UndefOr[SupportedOperationList] = js.native
}
object UpdateTarget {
  
  @scala.inline
  def apply(): UpdateTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTarget]
  }
  
  @scala.inline
  implicit class UpdateTargetOps[Self <: UpdateTarget] (val x: Self) extends AnyVal {
    
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
    def setDatabaseVersion(value: String): Self = this.set("DatabaseVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseVersion: Self = this.set("DatabaseVersion", js.undefined)
    
    @scala.inline
    def setMaintenanceTrackName(value: String): Self = this.set("MaintenanceTrackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaintenanceTrackName: Self = this.set("MaintenanceTrackName", js.undefined)
    
    @scala.inline
    def setSupportedOperationsVarargs(value: SupportedOperation*): Self = this.set("SupportedOperations", js.Array(value :_*))
    
    @scala.inline
    def setSupportedOperations(value: SupportedOperationList): Self = this.set("SupportedOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedOperations: Self = this.set("SupportedOperations", js.undefined)
  }
}
