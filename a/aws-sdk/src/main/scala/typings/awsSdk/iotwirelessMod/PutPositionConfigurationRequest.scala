package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutPositionConfigurationRequest extends StObject {
  
  /**
    * The position data destination that describes the AWS IoT rule that processes the device's position data for use by AWS IoT Core for LoRaWAN.
    */
  var Destination: js.UndefOr[DestinationName] = js.undefined
  
  /**
    * Resource identifier used to update the position configuration.
    */
  var ResourceIdentifier: PositionResourceIdentifier
  
  /**
    * Resource type of the resource for which you want to update the position configuration.
    */
  var ResourceType: PositionResourceType
  
  /**
    * The positioning solvers used to update the position configuration of the resource.
    */
  var Solvers: js.UndefOr[PositionSolverConfigurations] = js.undefined
}
object PutPositionConfigurationRequest {
  
  inline def apply(ResourceIdentifier: PositionResourceIdentifier, ResourceType: PositionResourceType): PutPositionConfigurationRequest = {
    val __obj = js.Dynamic.literal(ResourceIdentifier = ResourceIdentifier.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPositionConfigurationRequest]
  }
  
  extension [Self <: PutPositionConfigurationRequest](x: Self) {
    
    inline def setDestination(value: DestinationName): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setResourceIdentifier(value: PositionResourceIdentifier): Self = StObject.set(x, "ResourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: PositionResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setSolvers(value: PositionSolverConfigurations): Self = StObject.set(x, "Solvers", value.asInstanceOf[js.Any])
    
    inline def setSolversUndefined: Self = StObject.set(x, "Solvers", js.undefined)
  }
}
