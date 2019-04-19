package typings
package chromeLib.chromeNs.serialNs.onReceiveErrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.serial.onReceiveError.OnReceiveErrorEnum")
@js.native
object OnReceiveErrorEnum extends js.Object {
  /* The device detected a break condition. */
  var break: chromeLib.chromeLibStrings.break = js.native
  /* An input buffer overflow has occurred. There is either no room in the input buffer, or a character was received after the end-of-file (EOF) character. */
  var buffer_overflow: chromeLib.chromeLibStrings.buffer_overflow = js.native
  /* The device was most likely disconnected from the host. */
  var device_lost: chromeLib.chromeLibStrings.device_lost = js.native
  /* The connection was disconnected. */
  var disconnected: chromeLib.chromeLibStrings.disconnected = js.native
  /* The device detected a framing error. */
  var frame_error: chromeLib.chromeLibStrings.frame_error = js.native
  /* A character-buffer overrun has occurred. The next character is lost. */
  var overrun: chromeLib.chromeLibStrings.overrun = js.native
  /* The device detected a parity error. */
  var parity_error: chromeLib.chromeLibStrings.parity_error = js.native
  /* A system error occurred and the connection may be unrecoverable. */
  var system_error: chromeLib.chromeLibStrings.system_error = js.native
  /* No data has been received for receiveTimeout milliseconds. */
  var timeout: chromeLib.chromeLibStrings.timeout = js.native
}

