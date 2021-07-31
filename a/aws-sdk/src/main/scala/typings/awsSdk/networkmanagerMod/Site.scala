package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Site extends StObject {
  
  /**
    * The date and time that the site was created.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The description of the site.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[String] = js.undefined
  
  /**
    * The location of the site.
    */
  var Location: js.UndefOr[typings.awsSdk.networkmanagerMod.Location] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the site.
    */
  var SiteArn: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the site.
    */
  var SiteId: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the site.
    */
  var State: js.UndefOr[SiteState] = js.undefined
  
  /**
    * The tags for the site.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object Site {
  
  @scala.inline
  def apply(): Site = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Site]
  }
  
  @scala.inline
  implicit class SiteMutableBuilder[Self <: Site] (val x: Self) extends AnyVal {
    
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
    def setLocation(value: Location): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    @scala.inline
    def setSiteArn(value: String): Self = StObject.set(x, "SiteArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteArnUndefined: Self = StObject.set(x, "SiteArn", js.undefined)
    
    @scala.inline
    def setSiteId(value: String): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteIdUndefined: Self = StObject.set(x, "SiteId", js.undefined)
    
    @scala.inline
    def setState(value: SiteState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
