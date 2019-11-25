package typings.chrome.chrome.serial

import typings.chrome.chromeStrings.eight
import typings.chrome.chromeStrings.even
import typings.chrome.chromeStrings.no
import typings.chrome.chromeStrings.odd
import typings.chrome.chromeStrings.one
import typings.chrome.chromeStrings.seven
import typings.chrome.chromeStrings.two
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends js.Object {
  /** Optional. The requested bitrate of the connection to be opened.
    * For compatibility with the widest range of hardware, this number should match one of commonly-available bitrates,
    * such as 110, 300, 1200, 2400, 4800, 9600, 14400, 19200, 38400, 57600, 115200.
    * There is no guarantee, of course, that the device connected to the serial port will support the requested bitrate, even if the port itself supports that bitrate.
    * 9600 will be passed by default. */
  var bitrate: js.UndefOr[Double] = js.undefined
  /** Optional. The size of the buffer used to receive data. The default value is 4096. */
  var bufferSize: js.UndefOr[Double] = js.undefined
  /** Optional. Flag indicating whether or not to enable RTS/CTS hardware flow control. Defaults to false. */
  var ctsFlowControl: js.UndefOr[Boolean] = js.undefined
  /** Optional. "eight" will be passed by default. */
  var dataBits: js.UndefOr[seven | eight] = js.undefined
  /** Optional. An application-defined string to associate with the connection. */
  var name: js.UndefOr[String] = js.undefined
  /** Optional. "no" will be passed by default. */
  var parityBit: js.UndefOr[no | odd | even] = js.undefined
  /** Optional. Flag indicating whether or not the connection should be left open when the application is suspended (see Manage App Lifecycle: https://developer.chrome.com/apps/app_lifecycle).
    *  The default value is "false." When the application is loaded, any serial connections previously opened with persistent=true can be fetched with getConnections. */
  var peristent: js.UndefOr[Boolean] = js.undefined
  /** Optional. The maximum amount of time (in milliseconds) to wait for new data before raising an onReceiveError event with a "timeout" error.
    * If zero, receive timeout errors will not be raised for the connection.
    * Defaults to 0. */
  var receiveTimeout: js.UndefOr[Double] = js.undefined
  /** Optional. The maximum amount of time (in milliseconds) to wait for a send operation to complete before calling the callback with a "timeout" error.
    * If zero, send timeout errors will not be triggered.
    * Defaults to 0. */
  var sendTimeout: js.UndefOr[Double] = js.undefined
  /** Optional. "one" will be passed by default. */
  var stopBits: js.UndefOr[one | two] = js.undefined
}

object ConnectionOptions {
  @scala.inline
  def apply(
    bitrate: Int | Double = null,
    bufferSize: Int | Double = null,
    ctsFlowControl: js.UndefOr[Boolean] = js.undefined,
    dataBits: seven | eight = null,
    name: String = null,
    parityBit: no | odd | even = null,
    peristent: js.UndefOr[Boolean] = js.undefined,
    receiveTimeout: Int | Double = null,
    sendTimeout: Int | Double = null,
    stopBits: one | two = null
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (bitrate != null) __obj.updateDynamic("bitrate")(bitrate.asInstanceOf[js.Any])
    if (bufferSize != null) __obj.updateDynamic("bufferSize")(bufferSize.asInstanceOf[js.Any])
    if (!js.isUndefined(ctsFlowControl)) __obj.updateDynamic("ctsFlowControl")(ctsFlowControl.asInstanceOf[js.Any])
    if (dataBits != null) __obj.updateDynamic("dataBits")(dataBits.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parityBit != null) __obj.updateDynamic("parityBit")(parityBit.asInstanceOf[js.Any])
    if (!js.isUndefined(peristent)) __obj.updateDynamic("peristent")(peristent.asInstanceOf[js.Any])
    if (receiveTimeout != null) __obj.updateDynamic("receiveTimeout")(receiveTimeout.asInstanceOf[js.Any])
    if (sendTimeout != null) __obj.updateDynamic("sendTimeout")(sendTimeout.asInstanceOf[js.Any])
    if (stopBits != null) __obj.updateDynamic("stopBits")(stopBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
}

