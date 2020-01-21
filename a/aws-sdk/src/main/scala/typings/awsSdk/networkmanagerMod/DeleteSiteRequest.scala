package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSiteRequest extends js.Object {
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String = js.native
  /**
    * The ID of the site.
    */
  var SiteId: String = js.native
}

object DeleteSiteRequest {
  @scala.inline
  def apply(GlobalNetworkId: String, SiteId: String): DeleteSiteRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any], SiteId = SiteId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteSiteRequest]
  }
}

