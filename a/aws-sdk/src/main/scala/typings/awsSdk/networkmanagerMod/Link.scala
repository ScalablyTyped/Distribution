package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Link extends StObject {
  
  /**
    * The bandwidth for the link.
    */
  var Bandwidth: js.UndefOr[typings.awsSdk.networkmanagerMod.Bandwidth] = js.undefined
  
  /**
    * The date and time that the link was created.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The description of the link.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the link.
    */
  var LinkArn: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the link.
    */
  var LinkId: js.UndefOr[String] = js.undefined
  
  /**
    * The provider of the link.
    */
  var Provider: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the site.
    */
  var SiteId: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the link.
    */
  var State: js.UndefOr[LinkState] = js.undefined
  
  /**
    * The tags for the link.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The type of the link.
    */
  var Type: js.UndefOr[String] = js.undefined
}
object Link {
  
  @scala.inline
  def apply(): Link = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Link]
  }
  
  @scala.inline
  implicit class LinkMutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBandwidth(value: Bandwidth): Self = StObject.set(x, "Bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandwidthUndefined: Self = StObject.set(x, "Bandwidth", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: DateTime): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setGlobalNetworkId(value: String): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalNetworkIdUndefined: Self = StObject.set(x, "GlobalNetworkId", js.undefined)
    
    @scala.inline
    def setLinkArn(value: String): Self = StObject.set(x, "LinkArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkArnUndefined: Self = StObject.set(x, "LinkArn", js.undefined)
    
    @scala.inline
    def setLinkId(value: String): Self = StObject.set(x, "LinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkIdUndefined: Self = StObject.set(x, "LinkId", js.undefined)
    
    @scala.inline
    def setProvider(value: String): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderUndefined: Self = StObject.set(x, "Provider", js.undefined)
    
    @scala.inline
    def setSiteId(value: String): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteIdUndefined: Self = StObject.set(x, "SiteId", js.undefined)
    
    @scala.inline
    def setState(value: LinkState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
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
