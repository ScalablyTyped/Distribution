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
  def apply(
    Bandwidth: Bandwidth,
    GlobalNetworkId: String,
    SiteId: String,
    Description: String = null,
    Provider: String = null,
    Tags: TagList = null,
    Type: String = null
  ): CreateLinkRequest = {
    val __obj = js.Dynamic.literal(Bandwidth = Bandwidth.asInstanceOf[js.Any], GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any], SiteId = SiteId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Provider != null) __obj.updateDynamic("Provider")(Provider.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLinkRequest]
  }
}

