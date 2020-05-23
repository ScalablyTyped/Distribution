package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateVirtualInterfaceAttributesRequest extends js.Object {
  /**
    * The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value is 1500.
    */
  var mtu: js.UndefOr[MTU] = js.native
  /**
    * The ID of the virtual private interface.
    */
  var virtualInterfaceId: VirtualInterfaceId = js.native
}

object UpdateVirtualInterfaceAttributesRequest {
  @scala.inline
  def apply(virtualInterfaceId: VirtualInterfaceId, mtu: js.UndefOr[MTU] = js.undefined): UpdateVirtualInterfaceAttributesRequest = {
    val __obj = js.Dynamic.literal(virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
    if (!js.isUndefined(mtu)) __obj.updateDynamic("mtu")(mtu.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVirtualInterfaceAttributesRequest]
  }
}

