package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDefaultCreditSpecificationRequest extends js.Object {
  /**
    * The credit option for CPU usage of the instance family. Valid Values: standard | unlimited 
    */
  var CpuCredits: String = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The instance family.
    */
  var InstanceFamily: UnlimitedSupportedInstanceFamily = js.native
}

object ModifyDefaultCreditSpecificationRequest {
  @scala.inline
  def apply(
    CpuCredits: String,
    InstanceFamily: UnlimitedSupportedInstanceFamily,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): ModifyDefaultCreditSpecificationRequest = {
    val __obj = js.Dynamic.literal(CpuCredits = CpuCredits.asInstanceOf[js.Any], InstanceFamily = InstanceFamily.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDefaultCreditSpecificationRequest]
  }
}

