package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDefaultCreditSpecificationRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The instance family.
    */
  var InstanceFamily: UnlimitedSupportedInstanceFamily = js.native
}

object GetDefaultCreditSpecificationRequest {
  @scala.inline
  def apply(InstanceFamily: UnlimitedSupportedInstanceFamily, DryRun: js.UndefOr[Boolean] = js.undefined): GetDefaultCreditSpecificationRequest = {
    val __obj = js.Dynamic.literal(InstanceFamily = InstanceFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDefaultCreditSpecificationRequest]
  }
}

