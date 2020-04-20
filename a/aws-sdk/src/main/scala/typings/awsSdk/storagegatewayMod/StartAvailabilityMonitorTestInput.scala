package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartAvailabilityMonitorTestInput extends js.Object {
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN = js.native
}

object StartAvailabilityMonitorTestInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN): StartAvailabilityMonitorTestInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartAvailabilityMonitorTestInput]
  }
}

