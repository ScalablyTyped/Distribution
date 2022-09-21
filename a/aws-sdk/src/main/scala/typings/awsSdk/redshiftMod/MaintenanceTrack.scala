package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintenanceTrack extends StObject {
  
  /**
    * The version number for the cluster release.
    */
  var DatabaseVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the maintenance track. Possible values are current and trailing.
    */
  var MaintenanceTrackName: js.UndefOr[String] = js.undefined
  
  /**
    * An array of UpdateTarget objects to update with the maintenance track. 
    */
  var UpdateTargets: js.UndefOr[EligibleTracksToUpdateList] = js.undefined
}
object MaintenanceTrack {
  
  inline def apply(): MaintenanceTrack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceTrack]
  }
  
  extension [Self <: MaintenanceTrack](x: Self) {
    
    inline def setDatabaseVersion(value: String): Self = StObject.set(x, "DatabaseVersion", value.asInstanceOf[js.Any])
    
    inline def setDatabaseVersionUndefined: Self = StObject.set(x, "DatabaseVersion", js.undefined)
    
    inline def setMaintenanceTrackName(value: String): Self = StObject.set(x, "MaintenanceTrackName", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceTrackNameUndefined: Self = StObject.set(x, "MaintenanceTrackName", js.undefined)
    
    inline def setUpdateTargets(value: EligibleTracksToUpdateList): Self = StObject.set(x, "UpdateTargets", value.asInstanceOf[js.Any])
    
    inline def setUpdateTargetsUndefined: Self = StObject.set(x, "UpdateTargets", js.undefined)
    
    inline def setUpdateTargetsVarargs(value: UpdateTarget*): Self = StObject.set(x, "UpdateTargets", js.Array(value*))
  }
}
