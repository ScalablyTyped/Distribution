package typings.chromeApps.chrome.usb

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Since Chrome 31. */
@js.native
trait ConnectionHandle extends js.Object {
  /**
    * An opaque handle representing this connection to the USB device
    * and all associated claimed interfaces and pending transfers.
    * A new handle is created each time the device is opened.
    * The connection handle is different from Device.device.
    */
  var handle: integer = js.native
  /** The product ID. */
  var productId: integer = js.native
  /** The device vendor ID. */
  var vendorId: integer = js.native
}

object ConnectionHandle {
  @scala.inline
  def apply(handle: integer, productId: integer, vendorId: integer): ConnectionHandle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], vendorId = vendorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionHandle]
  }
  @scala.inline
  implicit class ConnectionHandleOps[Self <: ConnectionHandle] (val x: Self) extends AnyVal {
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
    def setHandle(value: integer): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductId(value: integer): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVendorId(value: integer): Self = this.set("vendorId", value.asInstanceOf[js.Any])
  }
  
}

