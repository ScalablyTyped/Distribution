package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateLinkResponse extends js.Object {
  /**
    * Information about the link.
    */
  var Link: js.UndefOr[typings.awsSdk.networkmanagerMod.Link] = js.native
}

object UpdateLinkResponse {
  @scala.inline
  def apply(Link: Link = null): UpdateLinkResponse = {
    val __obj = js.Dynamic.literal()
    if (Link != null) __obj.updateDynamic("Link")(Link.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLinkResponse]
  }
}

