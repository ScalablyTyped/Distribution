package typings.chromeDashApps.chrome.usb

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Since Chrome 31. */
trait ConnectionHandle extends js.Object {
  /**
    * An opaque handle representing this connection to the USB device
    * and all associated claimed interfaces and pending transfers.
    * A new handle is created each time the device is opened.
    * The connection handle is different from Device.device.
    */
  var handle: integer
  /** The product ID. */
  var productId: integer
  /** The device vendor ID. */
  var vendorId: integer
}

object ConnectionHandle {
  @scala.inline
  def apply(handle: integer, productId: integer, vendorId: integer): ConnectionHandle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], vendorId = vendorId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectionHandle]
  }
}

