package typings.awsSdk.iotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFleetRequest extends StObject {
  
  /**
    *  The ID of the fleet to retrieve information about. 
    */
  var fleetId: typings.awsSdk.iotfleetwiseMod.fleetId
}
object GetFleetRequest {
  
  inline def apply(fleetId: fleetId): GetFleetRequest = {
    val __obj = js.Dynamic.literal(fleetId = fleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFleetRequest]
  }
  
  extension [Self <: GetFleetRequest](x: Self) {
    
    inline def setFleetId(value: fleetId): Self = StObject.set(x, "fleetId", value.asInstanceOf[js.Any])
  }
}
