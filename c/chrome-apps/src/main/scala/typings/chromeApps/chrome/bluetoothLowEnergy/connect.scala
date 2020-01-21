package typings.chromeApps.chrome.bluetoothLowEnergy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.bluetoothLowEnergy.connect")
@js.native
object connect extends js.Object {
  /**
    * Establishes a connection between the application and the device with the given address. A device may be already connected and its GATT services available without calling connect, however, an app that wants to access GATT services of a device should call this function to make sure that a connection to the device is maintained. If the device is not connected, all GATT services of the device will be discovered after a successful call to connect.
    * @param deviceAddress The Bluetooth address of the remote device to which a GATT connection should be opened.
    * @param callback Called when the connect request has completed.
    */
  def apply(deviceAddress: String, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Establishes a connection between the application and the device with the given address. A device may be already connected and its GATT services available without calling connect, however, an app that wants to access GATT services of a device should call this function to make sure that a connection to the device is maintained. If the device is not connected, all GATT services of the device will be discovered after a successful call to connect.
    * @param deviceAddress The Bluetooth address of the remote device to which a GATT connection should be opened.
    * @param properties Connection properties (optional).
    * @param callback Called when the connect request has completed.
    */
  def apply(deviceAddress: String, properties: IProperties, callback: js.Function0[Unit]): Unit = js.native
}

