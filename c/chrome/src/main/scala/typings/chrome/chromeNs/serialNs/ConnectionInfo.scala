package typings.chrome.chromeNs.serialNs

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

trait ConnectionInfo extends js.Object {
  /** Optional. See ConnectionOptions.bitrate.
    * This field may be omitted or inaccurate if a non-standard bitrate is in use, or if an error occurred while querying the underlying device. */
  var bitrate: js.UndefOr[Double] = js.undefined
  /** See ConnectionOptions.bufferSize */
  var bufferSize: Double
  /** The id of the serial port connection. */
  var connectionId: js.UndefOr[Double] = js.undefined
  /** Optional. Flag indicating whether or not to enable RTS/CTS hardware flow control. Defaults to false. */
  var ctsFlowControl: js.UndefOr[Boolean] = js.undefined
  /** Optional. See ConnectionOptions.dataBits. This field may be omitted if an error occurred while querying the underlying device. */
  var dataBits: js.UndefOr[seven | eight] = js.undefined
  /** See ConnectionOptions.name */
  var name: String
  /** Optional. See ConnectionOptions.parityBit. This field may be omitted if an error occurred while querying the underlying device. */
  var parityBit: js.UndefOr[no | odd | even] = js.undefined
  /** Flag indicating whether the connection is blocked from firing onReceive events. */
  var paused: Boolean
  /** See ConnectionOptions.persistent */
  var peristent: Boolean
  /** See ConnectionOptions.receiveTimeout */
  var receiveTimeout: js.UndefOr[Double] = js.undefined
  /** See ConnectionOptions.sendTimeout */
  var sendTimeout: js.UndefOr[Double] = js.undefined
  /** Optional. See ConnectionOptions.stopBits. This field may be omitted if an error occurred while querying the underlying device. */
  var stopBits: js.UndefOr[one | two] = js.undefined
}

object ConnectionInfo {
  @scala.inline
  def apply(
    bufferSize: Double,
    name: String,
    paused: Boolean,
    peristent: Boolean,
    bitrate: Int | Double = null,
    connectionId: Int | Double = null,
    ctsFlowControl: js.UndefOr[Boolean] = js.undefined,
    dataBits: seven | eight = null,
    parityBit: no | odd | even = null,
    receiveTimeout: Int | Double = null,
    sendTimeout: Int | Double = null,
    stopBits: one | two = null
  ): ConnectionInfo = {
    val __obj = js.Dynamic.literal(bufferSize = bufferSize, name = name, paused = paused, peristent = peristent)
    if (bitrate != null) __obj.updateDynamic("bitrate")(bitrate.asInstanceOf[js.Any])
    if (connectionId != null) __obj.updateDynamic("connectionId")(connectionId.asInstanceOf[js.Any])
    if (!js.isUndefined(ctsFlowControl)) __obj.updateDynamic("ctsFlowControl")(ctsFlowControl)
    if (dataBits != null) __obj.updateDynamic("dataBits")(dataBits.asInstanceOf[js.Any])
    if (parityBit != null) __obj.updateDynamic("parityBit")(parityBit.asInstanceOf[js.Any])
    if (receiveTimeout != null) __obj.updateDynamic("receiveTimeout")(receiveTimeout.asInstanceOf[js.Any])
    if (sendTimeout != null) __obj.updateDynamic("sendTimeout")(sendTimeout.asInstanceOf[js.Any])
    if (stopBits != null) __obj.updateDynamic("stopBits")(stopBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionInfo]
  }
}

