package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchPutGeofenceRequestEntry extends StObject {
  
  /**
    * The identifier for the geofence to be stored in a given geofence collection.
    */
  var GeofenceId: Id
  
  /**
    * Contains the details of the position of the geofence. Can be either a polygon or a circle. Including both will return a validation error.  Each  geofence polygon can have a maximum of 1,000 vertices. 
    */
  var Geometry: GeofenceGeometry
}
object BatchPutGeofenceRequestEntry {
  
  inline def apply(GeofenceId: Id, Geometry: GeofenceGeometry): BatchPutGeofenceRequestEntry = {
    val __obj = js.Dynamic.literal(GeofenceId = GeofenceId.asInstanceOf[js.Any], Geometry = Geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutGeofenceRequestEntry]
  }
  
  extension [Self <: BatchPutGeofenceRequestEntry](x: Self) {
    
    inline def setGeofenceId(value: Id): Self = StObject.set(x, "GeofenceId", value.asInstanceOf[js.Any])
    
    inline def setGeometry(value: GeofenceGeometry): Self = StObject.set(x, "Geometry", value.asInstanceOf[js.Any])
  }
}
