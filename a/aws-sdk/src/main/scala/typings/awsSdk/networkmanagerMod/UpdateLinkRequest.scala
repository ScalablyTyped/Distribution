package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLinkRequest extends StObject {
  
  /**
    * The upload and download speed in Mbps. 
    */
  var Bandwidth: js.UndefOr[typings.awsSdk.networkmanagerMod.Bandwidth] = js.undefined
  
  /**
    * A description of the link. Length Constraints: Maximum length of 256 characters.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String
  
  /**
    * The ID of the link.
    */
  var LinkId: String
  
  /**
    * The provider of the link. Length Constraints: Maximum length of 128 characters.
    */
  var Provider: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the link. Length Constraints: Maximum length of 128 characters.
    */
  var Type: js.UndefOr[String] = js.undefined
}
object UpdateLinkRequest {
  
  inline def apply(GlobalNetworkId: String, LinkId: String): UpdateLinkRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any], LinkId = LinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLinkRequest]
  }
  
  extension [Self <: UpdateLinkRequest](x: Self) {
    
    inline def setBandwidth(value: Bandwidth): Self = StObject.set(x, "Bandwidth", value.asInstanceOf[js.Any])
    
    inline def setBandwidthUndefined: Self = StObject.set(x, "Bandwidth", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGlobalNetworkId(value: String): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setLinkId(value: String): Self = StObject.set(x, "LinkId", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: String): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "Provider", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
