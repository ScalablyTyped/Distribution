package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAvailabilityMonitorTestInput extends js.Object {
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN = js.native
}

object DescribeAvailabilityMonitorTestInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN): DescribeAvailabilityMonitorTestInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAvailabilityMonitorTestInput]
  }
}

