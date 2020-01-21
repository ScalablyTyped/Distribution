package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSiteResponse extends js.Object {
  /**
    * Information about the site.
    */
  var Site: js.UndefOr[typings.awsSdk.networkmanagerMod.Site] = js.native
}

object CreateSiteResponse {
  @scala.inline
  def apply(Site: Site = null): CreateSiteResponse = {
    val __obj = js.Dynamic.literal()
    if (Site != null) __obj.updateDynamic("Site")(Site.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSiteResponse]
  }
}

