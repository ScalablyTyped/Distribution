package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetLocationUtilizationInput extends StObject {
  
  /**
    * A unique identifier for the fleet to request location utilization for. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn
  
  /**
    * The fleet location to retrieve utilization information for. Specify a location in the form of an Amazon Web Services Region code, such as us-west-2.
    */
  var Location: LocationStringModel
}
object DescribeFleetLocationUtilizationInput {
  
  inline def apply(FleetId: FleetIdOrArn, Location: LocationStringModel): DescribeFleetLocationUtilizationInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFleetLocationUtilizationInput]
  }
  
  extension [Self <: DescribeFleetLocationUtilizationInput](x: Self) {
    
    inline def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LocationStringModel): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
  }
}
