package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateLinkRequest extends js.Object {
  /**
    * The ID of the device.
    */
  var DeviceId: String = js.native
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String = js.native
  /**
    * The ID of the link.
    */
  var LinkId: String = js.native
}

object AssociateLinkRequest {
  @scala.inline
  def apply(DeviceId: String, GlobalNetworkId: String, LinkId: String): AssociateLinkRequest = {
    val __obj = js.Dynamic.literal(DeviceId = DeviceId.asInstanceOf[js.Any], GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any], LinkId = LinkId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AssociateLinkRequest]
  }
}

