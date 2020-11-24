package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceTrack extends js.Object {
  
  /**
    * The version number for the cluster release.
    */
  var DatabaseVersion: js.UndefOr[String] = js.native
  
  /**
    * The name of the maintenance track. Possible values are current and trailing.
    */
  var MaintenanceTrackName: js.UndefOr[String] = js.native
  
  /**
    * An array of UpdateTarget objects to update with the maintenance track. 
    */
  var UpdateTargets: js.UndefOr[EligibleTracksToUpdateList] = js.native
}
object MaintenanceTrack {
  
  @scala.inline
  def apply(): MaintenanceTrack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceTrack]
  }
  
  @scala.inline
  implicit class MaintenanceTrackOps[Self <: MaintenanceTrack] (val x: Self) extends AnyVal {
    
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
    def setUpdateTargetsVarargs(value: UpdateTarget*): Self = this.set("UpdateTargets", js.Array(value :_*))
    
    @scala.inline
    def setUpdateTargets(value: EligibleTracksToUpdateList): Self = this.set("UpdateTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTargets: Self = this.set("UpdateTargets", js.undefined)
  }
}
