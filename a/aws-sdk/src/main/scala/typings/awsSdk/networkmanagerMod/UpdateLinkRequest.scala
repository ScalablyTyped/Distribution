package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateLinkRequest extends js.Object {
  /**
    * The upload and download speed in Mbps. 
    */
  var Bandwidth: js.UndefOr[typings.awsSdk.networkmanagerMod.Bandwidth] = js.native
  /**
    * A description of the link. Length Constraints: Maximum length of 256 characters.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String = js.native
  /**
    * The ID of the link.
    */
  var LinkId: String = js.native
  /**
    * The provider of the link. Length Constraints: Maximum length of 128 characters.
    */
  var Provider: js.UndefOr[String] = js.native
  /**
    * The type of the link. Length Constraints: Maximum length of 128 characters.
    */
  var Type: js.UndefOr[String] = js.native
}

object UpdateLinkRequest {
  @scala.inline
  def apply(GlobalNetworkId: String, LinkId: String): UpdateLinkRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any], LinkId = LinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLinkRequest]
  }
  @scala.inline
  implicit class UpdateLinkRequestOps[Self <: UpdateLinkRequest] (val x: Self) extends AnyVal {
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
    def setGlobalNetworkId(value: String): Self = this.set("GlobalNetworkId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkId(value: String): Self = this.set("LinkId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBandwidth(value: Bandwidth): Self = this.set("Bandwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBandwidth: Self = this.set("Bandwidth", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setProvider(value: String): Self = this.set("Provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("Provider", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

