package typings.chromeDashApps.chrome.usb

import typings.chromeDashApps.Anon_InterfaceId
import typings.chromeDashApps.Anon_ProductId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.usb.findDevices")
@js.native
object findDevices extends js.Object {
  /**
    * Finds USB devices specified by the vendor, product and (optionally) interface IDs and if permissions allow opens them for use.
    * If the access request is rejected or the device fails to be opened a connection handle will not be created or returned.
    * Calling this method is equivalent to calling *getDevices* followed by *openDevice* for each device.
    * @param options The properties to search for on target devices.
    *                  - vendorId: The device vendor ID.
    *                  - productId: The product ID.
    *                  - The interface ID to request access to. Only available on Chrome OS. It has no effect on other platforms.
    * @requires(CrOS) Chrome OS if you specify *interfaceId*
    * @param callback
    */
  def apply(options: Anon_InterfaceId, callback: js.Function1[/* handles */ js.Array[ConnectionHandle], Unit]): Unit = js.native
  /**
    * Finds USB devices specified by the vendor, product and (optionally) interface IDs and if permissions allow opens them for use.
    * If the access request is rejected or the device fails to be opened a connection handle will not be created or returned.
    * Calling this method is equivalent to calling *getDevices* followed by *openDevice* for each device.
    * @param options The properties to search for on target devices.
    *                  - vendorId: The device vendor ID.
    *                  - productId: The product ID.
    * @param callback
    */
  def apply(options: Anon_ProductId, callback: js.Function1[/* handles */ js.Array[ConnectionHandle], Unit]): Unit = js.native
}

