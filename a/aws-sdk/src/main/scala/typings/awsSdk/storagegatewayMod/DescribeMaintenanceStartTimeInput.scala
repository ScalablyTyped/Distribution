package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMaintenanceStartTimeInput extends js.Object {
  var GatewayARN: typings.awsSdk.storagegatewayMod.GatewayARN = js.native
}

object DescribeMaintenanceStartTimeInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN): DescribeMaintenanceStartTimeInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMaintenanceStartTimeInput]
  }
}

