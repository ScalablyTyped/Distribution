package typings.chromeDashApps.chrome.usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.usb.listInterfaces")
@js.native
object listInterfaces extends js.Object {
  /**
    * @description Lists all interfaces on a USB device.
    * @param handle An open connection to the device.
    * @param callback
    */
  def apply(
    handle: ConnectionHandle,
    callback: js.Function1[/* descriptors */ js.Array[InterfaceDescriptor], Unit]
  ): Unit = js.native
}

