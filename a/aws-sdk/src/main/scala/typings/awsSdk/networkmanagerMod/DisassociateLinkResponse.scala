package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateLinkResponse extends js.Object {
  /**
    * Information about the link association.
    */
  var LinkAssociation: js.UndefOr[typings.awsSdk.networkmanagerMod.LinkAssociation] = js.native
}

object DisassociateLinkResponse {
  @scala.inline
  def apply(LinkAssociation: LinkAssociation = null): DisassociateLinkResponse = {
    val __obj = js.Dynamic.literal()
    if (LinkAssociation != null) __obj.updateDynamic("LinkAssociation")(LinkAssociation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateLinkResponse]
  }
}

