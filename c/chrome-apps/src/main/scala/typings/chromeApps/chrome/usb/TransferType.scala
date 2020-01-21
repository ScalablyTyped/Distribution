package typings.chromeApps.chrome.usb

import typings.chromeApps.chromeAppsStrings.bulk
import typings.chromeApps.chromeAppsStrings.control
import typings.chromeApps.chromeAppsStrings.interrupt
import typings.chromeApps.chromeAppsStrings.isochronous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Direction, Recipient, RequestType, and TransferType all map to their namesakes within the USB specification. */
@JSGlobal("chrome.usb.TransferType")
@js.native
object TransferType extends js.Object {
  var BULK: bulk = js.native
  var CONTROL: control = js.native
  var INTERRUPT: interrupt = js.native
  var ISOCHRONOUS: isochronous = js.native
}

