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
  @scala.inline
  implicit class DeleteSiteRequestOps[Self <: DeleteSiteRequest] (val x: Self) extends AnyVal {
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
    def setSiteId(value: String): Self = this.set("SiteId", value.asInstanceOf[js.Any])
  }
  
}

