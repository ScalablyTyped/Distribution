package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTarget extends StObject {
  
  /**
    * The cluster version for the new maintenance track.
    */
  var DatabaseVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the new maintenance track.
    */
  var MaintenanceTrackName: js.UndefOr[String] = js.undefined
  
  /**
    * A list of operations supported by the maintenance track.
    */
  var SupportedOperations: js.UndefOr[SupportedOperationList] = js.undefined
}
object UpdateTarget {
  
  inline def apply(): UpdateTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTarget]
  }
  
  extension [Self <: UpdateTarget](x: Self) {
    
    inline def setDatabaseVersion(value: String): Self = StObject.set(x, "DatabaseVersion", value.asInstanceOf[js.Any])
    
    inline def setDatabaseVersionUndefined: Self = StObject.set(x, "DatabaseVersion", js.undefined)
    
    inline def setMaintenanceTrackName(value: String): Self = StObject.set(x, "MaintenanceTrackName", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceTrackNameUndefined: Self = StObject.set(x, "MaintenanceTrackName", js.undefined)
    
    inline def setSupportedOperations(value: SupportedOperationList): Self = StObject.set(x, "SupportedOperations", value.asInstanceOf[js.Any])
    
    inline def setSupportedOperationsUndefined: Self = StObject.set(x, "SupportedOperations", js.undefined)
    
    inline def setSupportedOperationsVarargs(value: SupportedOperation*): Self = StObject.set(x, "SupportedOperations", js.Array(value*))
  }
}
