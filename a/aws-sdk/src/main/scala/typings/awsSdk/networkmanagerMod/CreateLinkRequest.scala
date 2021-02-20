package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLinkRequest extends StObject {
  
  /**
    *  The upload speed and download speed in Mbps. 
    */
  var Bandwidth: typings.awsSdk.networkmanagerMod.Bandwidth = js.native
  
  /**
    * A description of the link. Length Constraints: Maximum length of 256 characters.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String = js.native
  
  /**
    * The provider of the link. Constraints: Cannot include the following characters: | \ ^ Length Constraints: Maximum length of 128 characters.
    */
  var Provider: js.UndefOr[String] = js.native
  
  /**
    * The ID of the site.
    */
  var SiteId: String = js.native
  
  /**
    * The tags to apply to the resource during creation.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The type of the link. Constraints: Cannot include the following characters: | \ ^ Length Constraints: Maximum length of 128 characters.
    */
  var Type: js.UndefOr[String] = js.native
}
object CreateLinkRequest {
  
  @scala.inline
  def apply(Bandwidth: Bandwidth, GlobalNetworkId: String, SiteId: String): CreateLinkRequest = {
    val __obj = js.Dynamic.literal(Bandwidth = Bandwidth.asInstanceOf[js.Any], GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any], SiteId = SiteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLinkRequest]
  }
  
  @scala.inline
  implicit class CreateLinkRequestMutableBuilder[Self <: CreateLinkRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandwidth(value: Bandwidth): Self = StObject.set(x, "Bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setGlobalNetworkId(value: String): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: String): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderUndefined: Self = StObject.set(x, "Provider", js.undefined)
    
    @scala.inline
    def setSiteId(value: String): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
