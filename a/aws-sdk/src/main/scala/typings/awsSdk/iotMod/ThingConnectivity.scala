package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingConnectivity extends js.Object {
  /**
    * True if the thing is connected to the AWS IoT service; false if it is not connected.
    */
  var connected: js.UndefOr[Boolean] = js.native
  /**
    * The epoch time (in milliseconds) when the thing last connected or disconnected. If the thing has been disconnected for more than a few weeks, the time value might be missing.
    */
  var timestamp: js.UndefOr[ConnectivityTimestamp] = js.native
}

object ThingConnectivity {
  @scala.inline
  def apply(
    connected: js.UndefOr[Boolean] = js.undefined,
    timestamp: js.UndefOr[ConnectivityTimestamp] = js.undefined
  ): ThingConnectivity = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(connected)) __obj.updateDynamic("connected")(connected.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingConnectivity]
  }
}

