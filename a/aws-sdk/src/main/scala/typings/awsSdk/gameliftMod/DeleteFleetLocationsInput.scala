package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFleetLocationsInput extends StObject {
  
  /**
    * A unique identifier for the fleet to delete locations for. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn
  
  /**
    * The list of fleet locations to delete. Specify locations in the form of an Amazon Web Services Region code, such as us-west-2.
    */
  var Locations: LocationList
}
object DeleteFleetLocationsInput {
  
  inline def apply(FleetId: FleetIdOrArn, Locations: LocationList): DeleteFleetLocationsInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any], Locations = Locations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFleetLocationsInput]
  }
  
  extension [Self <: DeleteFleetLocationsInput](x: Self) {
    
    inline def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setLocations(value: LocationList): Self = StObject.set(x, "Locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsVarargs(value: LocationStringModel*): Self = StObject.set(x, "Locations", js.Array(value*))
  }
}
