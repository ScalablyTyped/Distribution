package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSiteResponse extends js.Object {
  /**
    * Information about the site.
    */
  var Site: js.UndefOr[typings.awsSdk.networkmanagerMod.Site] = js.native
}

object DeleteSiteResponse {
  @scala.inline
  def apply(Site: Site = null): DeleteSiteResponse = {
    val __obj = js.Dynamic.literal()
    if (Site != null) __obj.updateDynamic("Site")(Site.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSiteResponse]
  }
}

