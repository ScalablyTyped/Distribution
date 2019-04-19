package typings
package chromeLib.chromeNs.serialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionInfo extends js.Object {
  /** Optional. See ConnectionOptions.bitrate.
    * This field may be omitted or inaccurate if a non-standard bitrate is in use, or if an error occurred while querying the underlying device. */
  var bitrate: js.UndefOr[scala.Double] = js.undefined
  /** See ConnectionOptions.bufferSize */
  var bufferSize: scala.Double
  /** The id of the serial port connection. */
  var connectionId: js.UndefOr[scala.Double] = js.undefined
  /** Optional. Flag indicating whether or not to enable RTS/CTS hardware flow control. Defaults to false. */
  var ctsFlowControl: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional. See ConnectionOptions.dataBits. This field may be omitted if an error occurred while querying the underlying device. */
  var dataBits: js.UndefOr[chromeLib.chromeLibStrings.seven | chromeLib.chromeLibStrings.eight] = js.undefined
  /** See ConnectionOptions.name */
  var name: java.lang.String
  /** Optional. See ConnectionOptions.parityBit. This field may be omitted if an error occurred while querying the underlying device. */
  var parityBit: js.UndefOr[
    chromeLib.chromeLibStrings.no | chromeLib.chromeLibStrings.odd | chromeLib.chromeLibStrings.even
  ] = js.undefined
  /** Flag indicating whether the connection is blocked from firing onReceive events. */
  var paused: scala.Boolean
  /** See ConnectionOptions.persistent */
  var peristent: scala.Boolean
  /** See ConnectionOptions.receiveTimeout */
  var receiveTimeout: js.UndefOr[scala.Double] = js.undefined
  /** See ConnectionOptions.sendTimeout */
  var sendTimeout: js.UndefOr[scala.Double] = js.undefined
  /** Optional. See ConnectionOptions.stopBits. This field may be omitted if an error occurred while querying the underlying device. */
  var stopBits: js.UndefOr[chromeLib.chromeLibStrings.one | chromeLib.chromeLibStrings.two] = js.undefined
}

object ConnectionInfo {
  @scala.inline
  def apply(
    bufferSize: scala.Double,
    name: java.lang.String,
    paused: scala.Boolean,
    peristent: scala.Boolean,
    bitrate: scala.Int | scala.Double = null,
    connectionId: scala.Int | scala.Double = null,
    ctsFlowControl: js.UndefOr[scala.Boolean] = js.undefined,
    dataBits: chromeLib.chromeLibStrings.seven | chromeLib.chromeLibStrings.eight = null,
    parityBit: chromeLib.chromeLibStrings.no | chromeLib.chromeLibStrings.odd | chromeLib.chromeLibStrings.even = null,
    receiveTimeout: scala.Int | scala.Double = null,
    sendTimeout: scala.Int | scala.Double = null,
    stopBits: chromeLib.chromeLibStrings.one | chromeLib.chromeLibStrings.two = null
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

