package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSatelliteRequest extends StObject {
  
  /**
    * UUID of a satellite.
    */
  var satelliteId: String
}
object GetSatelliteRequest {
  
  inline def apply(satelliteId: String): GetSatelliteRequest = {
    val __obj = js.Dynamic.literal(satelliteId = satelliteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSatelliteRequest]
  }
  
  extension [Self <: GetSatelliteRequest](x: Self) {
    
    inline def setSatelliteId(value: String): Self = StObject.set(x, "satelliteId", value.asInstanceOf[js.Any])
  }
}
