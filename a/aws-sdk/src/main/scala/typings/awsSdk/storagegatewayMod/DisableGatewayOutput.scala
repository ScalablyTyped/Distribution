package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableGatewayOutput extends js.Object {
  /**
    * The unique Amazon Resource Name (ARN) of the disabled gateway.
    */
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
}

object DisableGatewayOutput {
  @scala.inline
  def apply(GatewayARN: GatewayARN = null): DisableGatewayOutput = {
    val __obj = js.Dynamic.literal()
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableGatewayOutput]
  }
}

