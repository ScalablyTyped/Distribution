package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetPortSettingsInput extends StObject {
  
  /**
    * A unique identifier for the fleet to retrieve port settings for. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn
  
  /**
    * A remote location to check for status of port setting updates. Use the Amazon Web Services Region code format, such as us-west-2.
    */
  var Location: js.UndefOr[LocationStringModel] = js.undefined
}
object DescribeFleetPortSettingsInput {
  
  inline def apply(FleetId: FleetIdOrArn): DescribeFleetPortSettingsInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFleetPortSettingsInput]
  }
  
  extension [Self <: DescribeFleetPortSettingsInput](x: Self) {
    
    inline def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LocationStringModel): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
  }
}
