package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLinkRequest extends StObject {
  
  /**
    *  The upload speed and download speed in Mbps. 
    */
  var Bandwidth: typings.awsSdk.networkmanagerMod.Bandwidth
  
  /**
    * A description of the link. Constraints: Maximum length of 256 characters.
    */
  var Description: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: typings.awsSdk.networkmanagerMod.GlobalNetworkId
  
  /**
    * The provider of the link. Constraints: Maximum length of 128 characters. Cannot include the following characters: | \ ^
    */
  var Provider: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The ID of the site.
    */
  var SiteId: typings.awsSdk.networkmanagerMod.SiteId
  
  /**
    * The tags to apply to the resource during creation.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The type of the link. Constraints: Maximum length of 128 characters. Cannot include the following characters: | \ ^
    */
  var Type: js.UndefOr[ConstrainedString] = js.undefined
}
object CreateLinkRequest {
  
  inline def apply(Bandwidth: Bandwidth, GlobalNetworkId: GlobalNetworkId, SiteId: SiteId): CreateLinkRequest = {
    val __obj = js.Dynamic.literal(Bandwidth = Bandwidth.asInstanceOf[js.Any], GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any], SiteId = SiteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLinkRequest]
  }
  
  extension [Self <: CreateLinkRequest](x: Self) {
    
    inline def setBandwidth(value: Bandwidth): Self = StObject.set(x, "Bandwidth", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ConstrainedString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: ConstrainedString): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "Provider", js.undefined)
    
    inline def setSiteId(value: SiteId): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setType(value: ConstrainedString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
