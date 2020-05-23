package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisioningHook extends js.Object {
  /**
    * The payload that was sent to the target function.  Note: Only Lambda functions are currently supported.
    */
  var payloadVersion: js.UndefOr[PayloadVersion] = js.native
  /**
    * The ARN of the target function.  Note: Only Lambda functions are currently supported.
    */
  var targetArn: TargetArn = js.native
}

object ProvisioningHook {
  @scala.inline
  def apply(targetArn: TargetArn, payloadVersion: PayloadVersion = null): ProvisioningHook = {
    val __obj = js.Dynamic.literal(targetArn = targetArn.asInstanceOf[js.Any])
    if (payloadVersion != null) __obj.updateDynamic("payloadVersion")(payloadVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisioningHook]
  }
}

