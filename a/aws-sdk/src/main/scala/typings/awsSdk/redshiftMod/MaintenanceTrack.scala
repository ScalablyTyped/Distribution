package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceTrack extends StObject {
  
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
  implicit class MaintenanceTrackMutableBuilder[Self <: MaintenanceTrack] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatabaseVersion(value: String): Self = StObject.set(x, "DatabaseVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseVersionUndefined: Self = StObject.set(x, "DatabaseVersion", js.undefined)
    
    @scala.inline
    def setMaintenanceTrackName(value: String): Self = StObject.set(x, "MaintenanceTrackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintenanceTrackNameUndefined: Self = StObject.set(x, "MaintenanceTrackName", js.undefined)
    
    @scala.inline
    def setUpdateTargets(value: EligibleTracksToUpdateList): Self = StObject.set(x, "UpdateTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTargetsUndefined: Self = StObject.set(x, "UpdateTargets", js.undefined)
    
    @scala.inline
    def setUpdateTargetsVarargs(value: UpdateTarget*): Self = StObject.set(x, "UpdateTargets", js.Array(value :_*))
  }
}
