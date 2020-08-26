package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLinkRequest extends js.Object {
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
  implicit class CreateLinkRequestOps[Self <: CreateLinkRequest] (val x: Self) extends AnyVal {
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
    def setGlobalNetworkId(value: String): Self = this.set("GlobalNetworkId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSiteId(value: String): Self = this.set("SiteId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setProvider(value: String): Self = this.set("Provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("Provider", js.undefined)
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

