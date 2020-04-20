package typings.chrome

import typings.chrome.chromeStrings.break
import typings.chrome.chromeStrings.buffer_overflow
import typings.chrome.chromeStrings.device_lost
import typings.chrome.chromeStrings.disconnected
import typings.chrome.chromeStrings.frame_error
import typings.chrome.chromeStrings.overrun
import typings.chrome.chromeStrings.parity_error
import typings.chrome.chromeStrings.system_error
import typings.chrome.chromeStrings.timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBreak extends js.Object {
  /* The device detected a break condition. */
  var break: typings.chrome.chromeStrings.break
  /* An input buffer overflow has occurred. There is either no room in the input buffer, or a character was received after the end-of-file (EOF) character. */
  var buffer_overflow: typings.chrome.chromeStrings.buffer_overflow
  /* The device was most likely disconnected from the host. */
  var device_lost: typings.chrome.chromeStrings.device_lost
  /* The connection was disconnected. */
  var disconnected: typings.chrome.chromeStrings.disconnected
  /* The device detected a framing error. */
  var frame_error: typings.chrome.chromeStrings.frame_error
  /* A character-buffer overrun has occurred. The next character is lost. */
  var overrun: typings.chrome.chromeStrings.overrun
  /* The device detected a parity error. */
  var parity_error: typings.chrome.chromeStrings.parity_error
  /* A system error occurred and the connection may be unrecoverable. */
  var system_error: typings.chrome.chromeStrings.system_error
  /* No data has been received for receiveTimeout milliseconds. */
  var timeout: typings.chrome.chromeStrings.timeout
}

object AnonBreak {
  @scala.inline
  def apply(
    break: break,
    buffer_overflow: buffer_overflow,
    device_lost: device_lost,
    disconnected: disconnected,
    frame_error: frame_error,
    overrun: overrun,
    parity_error: parity_error,
    system_error: system_error,
    timeout: timeout
  ): AnonBreak = {
    val __obj = js.Dynamic.literal(break = break.asInstanceOf[js.Any], buffer_overflow = buffer_overflow.asInstanceOf[js.Any], device_lost = device_lost.asInstanceOf[js.Any], disconnected = disconnected.asInstanceOf[js.Any], frame_error = frame_error.asInstanceOf[js.Any], overrun = overrun.asInstanceOf[js.Any], parity_error = parity_error.asInstanceOf[js.Any], system_error = system_error.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBreak]
  }
}

