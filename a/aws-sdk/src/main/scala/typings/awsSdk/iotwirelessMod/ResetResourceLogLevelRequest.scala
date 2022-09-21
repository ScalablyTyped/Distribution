package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetResourceLogLevelRequest extends StObject {
  
  var ResourceIdentifier: typings.awsSdk.iotwirelessMod.ResourceIdentifier
  
  /**
    * The type of the resource, which can be WirelessDevice or WirelessGateway.
    */
  var ResourceType: typings.awsSdk.iotwirelessMod.ResourceType
}
object ResetResourceLogLevelRequest {
  
  inline def apply(ResourceIdentifier: ResourceIdentifier, ResourceType: ResourceType): ResetResourceLogLevelRequest = {
    val __obj = js.Dynamic.literal(ResourceIdentifier = ResourceIdentifier.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetResourceLogLevelRequest]
  }
  
  extension [Self <: ResetResourceLogLevelRequest](x: Self) {
    
    inline def setResourceIdentifier(value: ResourceIdentifier): Self = StObject.set(x, "ResourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
