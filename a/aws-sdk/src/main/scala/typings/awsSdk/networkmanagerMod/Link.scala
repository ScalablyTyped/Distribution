package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Link extends js.Object {
  
  /**
    * The bandwidth for the link.
    */
  var Bandwidth: js.UndefOr[typings.awsSdk.networkmanagerMod.Bandwidth] = js.native
  
  /**
    * The date and time that the link was created.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.native
  
  /**
    * The description of the link.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the link.
    */
  var LinkArn: js.UndefOr[String] = js.native
  
  /**
    * The ID of the link.
    */
  var LinkId: js.UndefOr[String] = js.native
  
  /**
    * The provider of the link.
    */
  var Provider: js.UndefOr[String] = js.native
  
  /**
    * The ID of the site.
    */
  var SiteId: js.UndefOr[String] = js.native
  
  /**
    * The state of the link.
    */
  var State: js.UndefOr[LinkState] = js.native
  
  /**
    * The tags for the link.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * The type of the link.
    */
  var Type: js.UndefOr[String] = js.native
}
object Link {
  
  @scala.inline
  def apply(): Link = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Link]
  }
  
  @scala.inline
  implicit class LinkOps[Self <: Link] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBandwidth(value: Bandwidth): Self = this.set("Bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBandwidth: Self = this.set("Bandwidth", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: DateTime): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setGlobalNetworkId(value: String): Self = this.set("GlobalNetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalNetworkId: Self = this.set("GlobalNetworkId", js.undefined)
    
    @scala.inline
    def setLinkArn(value: String): Self = this.set("LinkArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkArn: Self = this.set("LinkArn", js.undefined)
    
    @scala.inline
    def setLinkId(value: String): Self = this.set("LinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkId: Self = this.set("LinkId", js.undefined)
    
    @scala.inline
    def setProvider(value: String): Self = this.set("Provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvider: Self = this.set("Provider", js.undefined)
    
    @scala.inline
    def setSiteId(value: String): Self = this.set("SiteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteId: Self = this.set("SiteId", js.undefined)
    
    @scala.inline
    def setState(value: LinkState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
