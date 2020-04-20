package typings.chromeApps.chrome.usb

import typings.chromeApps.chromeAppsStrings.bulk_
import typings.chromeApps.chromeAppsStrings.control_
import typings.chromeApps.chromeAppsStrings.interrupt_
import typings.chromeApps.chromeAppsStrings.isochronous_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Direction, Recipient, RequestType, and TransferType all map to their namesakes within the USB specification. */
@JSGlobal("chrome.usb.TransferType")
@js.native
object TransferType extends js.Object {
  var BULK: bulk_ = js.native
  var CONTROL: control_ = js.native
  var INTERRUPT: interrupt_ = js.native
  var ISOCHRONOUS: isochronous_ = js.native
}

