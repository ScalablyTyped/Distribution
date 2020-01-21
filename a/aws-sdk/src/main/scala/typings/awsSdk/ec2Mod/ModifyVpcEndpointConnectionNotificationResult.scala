package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyVpcEndpointConnectionNotificationResult extends js.Object {
  /**
    * Returns true if the request succeeds; otherwise, it returns an error.
    */
  var ReturnValue: js.UndefOr[Boolean] = js.native
}

object ModifyVpcEndpointConnectionNotificationResult {
  @scala.inline
  def apply(ReturnValue: js.UndefOr[scala.Boolean] = js.undefined): ModifyVpcEndpointConnectionNotificationResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ReturnValue)) __obj.updateDynamic("ReturnValue")(ReturnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpcEndpointConnectionNotificationResult]
  }
}

