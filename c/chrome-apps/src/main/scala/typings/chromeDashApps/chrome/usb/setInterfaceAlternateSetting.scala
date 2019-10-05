package typings.chromeDashApps.chrome.usb

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.usb.setInterfaceAlternateSetting")
@js.native
object setInterfaceAlternateSetting extends js.Object {
  /**
    * @description Selects an alternate setting on a previously claimed interface.
    * @param handle An open connection to the device where this interface has been claimed.
    * @param interfaceNumber The interface to configure.
    * @param alternateSetting The alternate setting to configure.
    * @param callback
    */
  def apply(
    handle: ConnectionHandle,
    interfaceNumber: integer,
    alternateSetting: integer,
    callback: js.Function0[Unit]
  ): Unit = js.native
}

