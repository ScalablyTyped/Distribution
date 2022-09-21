package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGeofenceResponse extends StObject {
  
  /**
    * The timestamp for when the geofence collection was created in ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ 
    */
  var CreateTime: js.Date
  
  /**
    * The geofence identifier.
    */
  var GeofenceId: Id
  
  /**
    * Contains the geofence geometry details describing a polygon or a circle.
    */
  var Geometry: GeofenceGeometry
  
  /**
    * Identifies the state of the geofence. A geofence will hold one of the following states:    ACTIVE — The geofence has been indexed by the system.     PENDING — The geofence is being processed by the system.    FAILED — The geofence failed to be indexed by the system.    DELETED — The geofence has been deleted from the system index.    DELETING — The geofence is being deleted from the system index.  
    */
  var Status: String
  
  /**
    * The timestamp for when the geofence collection was last updated in ISO 8601 format: YYYY-MM-DDThh:mm:ss.sssZ 
    */
  var UpdateTime: js.Date
}
object GetGeofenceResponse {
  
  inline def apply(
    CreateTime: js.Date,
    GeofenceId: Id,
    Geometry: GeofenceGeometry,
    Status: String,
    UpdateTime: js.Date
  ): GetGeofenceResponse = {
    val __obj = js.Dynamic.literal(CreateTime = CreateTime.asInstanceOf[js.Any], GeofenceId = GeofenceId.asInstanceOf[js.Any], Geometry = Geometry.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UpdateTime = UpdateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGeofenceResponse]
  }
  
  extension [Self <: GetGeofenceResponse](x: Self) {
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setGeofenceId(value: Id): Self = StObject.set(x, "GeofenceId", value.asInstanceOf[js.Any])
    
    inline def setGeometry(value: GeofenceGeometry): Self = StObject.set(x, "Geometry", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
  }
}
