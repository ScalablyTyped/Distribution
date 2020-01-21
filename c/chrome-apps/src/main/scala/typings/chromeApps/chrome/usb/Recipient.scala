package typings.chromeApps.chrome.usb

import typings.chromeApps.chromeAppsStrings.device_
import typings.chromeApps.chromeAppsStrings.endpoint
import typings.chromeApps.chromeAppsStrings.interface
import typings.chromeApps.chromeAppsStrings.other_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Direction, Recipient, RequestType, and TransferType all map to their namesakes within the USB specification. */
@JSGlobal("chrome.usb.Recipient")
@js.native
object Recipient extends js.Object {
  var DEVICE: device_ = js.native
  var ENDPOINT: endpoint = js.native
  var INTERFACE: interface = js.native
  var OTHER: other_ = js.native
}

