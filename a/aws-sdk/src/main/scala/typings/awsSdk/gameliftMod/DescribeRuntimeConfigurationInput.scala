package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRuntimeConfigurationInput extends StObject {
  
  /**
    * A unique identifier for the fleet to get the runtime configuration for. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn
}
object DescribeRuntimeConfigurationInput {
  
  inline def apply(FleetId: FleetIdOrArn): DescribeRuntimeConfigurationInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRuntimeConfigurationInput]
  }
  
  extension [Self <: DescribeRuntimeConfigurationInput](x: Self) {
    
    inline def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
  }
}
