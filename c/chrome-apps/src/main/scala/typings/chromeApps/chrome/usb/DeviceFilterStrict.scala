package typings.chromeApps.chrome.usb

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceFilterStrict extends js.Object {
  /** USB interface class, matches any interface on the device. */
  var interfaceClass: js.UndefOr[integer] = js.native
  /** USB interface protocol, checked only if the interface sub-class matches. */
  var interfaceProtocol: js.UndefOr[integer] = js.native
  /** USB interface sub-class, checked only if the interface class matches. */
  var interfaceSubclass: js.UndefOr[integer] = js.native
  /** Device product ID, checked only if the vendor ID matches. */
  var productId: js.UndefOr[integer] = js.native
  /** Device vendor ID. */
  var vendorId: integer = js.native
}

object DeviceFilterStrict {
  @scala.inline
  def apply(vendorId: integer): DeviceFilterStrict = {
    val __obj = js.Dynamic.literal(vendorId = vendorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceFilterStrict]
  }
  @scala.inline
  implicit class DeviceFilterStrictOps[Self <: DeviceFilterStrict] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVendorId(value: integer): Self = this.set("vendorId", value.asInstanceOf[js.Any])
    @scala.inline
    def setInterfaceClass(value: integer): Self = this.set("interfaceClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterfaceClass: Self = this.set("interfaceClass", js.undefined)
    @scala.inline
    def setInterfaceProtocol(value: integer): Self = this.set("interfaceProtocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterfaceProtocol: Self = this.set("interfaceProtocol", js.undefined)
    @scala.inline
    def setInterfaceSubclass(value: integer): Self = this.set("interfaceSubclass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterfaceSubclass: Self = this.set("interfaceSubclass", js.undefined)
    @scala.inline
    def setProductId(value: integer): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
  }
  
}

