package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGlobalNetworkRequest extends js.Object {
  /**
    * A description of the global network. Length Constraints: Maximum length of 256 characters.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The ID of your global network.
    */
  var GlobalNetworkId: String = js.native
}

object UpdateGlobalNetworkRequest {
  @scala.inline
  def apply(GlobalNetworkId: String, Description: String = null): UpdateGlobalNetworkRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGlobalNetworkRequest]
  }
}

