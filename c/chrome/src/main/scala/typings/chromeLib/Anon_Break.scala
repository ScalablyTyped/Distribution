package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Break extends js.Object {
  /* The device detected a break condition. */
  var break: chromeLib.chromeLibStrings.break
  /* An input buffer overflow has occurred. There is either no room in the input buffer, or a character was received after the end-of-file (EOF) character. */
  var buffer_overflow: chromeLib.chromeLibStrings.buffer_overflow
  /* The device was most likely disconnected from the host. */
  var device_lost: chromeLib.chromeLibStrings.device_lost
  /* The connection was disconnected. */
  var disconnected: chromeLib.chromeLibStrings.disconnected
  /* The device detected a framing error. */
  var frame_error: chromeLib.chromeLibStrings.frame_error
  /* A character-buffer overrun has occurred. The next character is lost. */
  var overrun: chromeLib.chromeLibStrings.overrun
  /* The device detected a parity error. */
  var parity_error: chromeLib.chromeLibStrings.parity_error
  /* A system error occurred and the connection may be unrecoverable. */
  var system_error: chromeLib.chromeLibStrings.system_error
  /* No data has been received for receiveTimeout milliseconds. */
  var timeout: chromeLib.chromeLibStrings.timeout
}

object Anon_Break {
  @scala.inline
  def apply(
    break: chromeLib.chromeLibStrings.break,
    buffer_overflow: chromeLib.chromeLibStrings.buffer_overflow,
    device_lost: chromeLib.chromeLibStrings.device_lost,
    disconnected: chromeLib.chromeLibStrings.disconnected,
    frame_error: chromeLib.chromeLibStrings.frame_error,
    overrun: chromeLib.chromeLibStrings.overrun,
    parity_error: chromeLib.chromeLibStrings.parity_error,
    system_error: chromeLib.chromeLibStrings.system_error,
    timeout: chromeLib.chromeLibStrings.timeout
  ): Anon_Break = {
    val __obj = js.Dynamic.literal(break = break, buffer_overflow = buffer_overflow, device_lost = device_lost, disconnected = disconnected, frame_error = frame_error, overrun = overrun, parity_error = parity_error, system_error = system_error, timeout = timeout)
  
    __obj.asInstanceOf[Anon_Break]
  }
}

