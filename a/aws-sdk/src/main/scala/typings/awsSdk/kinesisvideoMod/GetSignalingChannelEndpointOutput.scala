package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSignalingChannelEndpointOutput extends StObject {
  
  /**
    * A list of endpoints for the specified signaling channel.
    */
  var ResourceEndpointList: js.UndefOr[typings.awsSdk.kinesisvideoMod.ResourceEndpointList] = js.undefined
}
object GetSignalingChannelEndpointOutput {
  
  inline def apply(): GetSignalingChannelEndpointOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSignalingChannelEndpointOutput]
  }
  
  extension [Self <: GetSignalingChannelEndpointOutput](x: Self) {
    
    inline def setResourceEndpointList(value: ResourceEndpointList): Self = StObject.set(x, "ResourceEndpointList", value.asInstanceOf[js.Any])
    
    inline def setResourceEndpointListUndefined: Self = StObject.set(x, "ResourceEndpointList", js.undefined)
    
    inline def setResourceEndpointListVarargs(value: ResourceEndpointListItem*): Self = StObject.set(x, "ResourceEndpointList", js.Array(value*))
  }
}
