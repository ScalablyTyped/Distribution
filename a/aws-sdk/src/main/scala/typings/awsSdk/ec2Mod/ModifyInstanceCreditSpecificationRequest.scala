package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyInstanceCreditSpecificationRequest extends js.Object {
  /**
    * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * Information about the credit option for CPU usage.
    */
  var InstanceCreditSpecifications: InstanceCreditSpecificationListRequest = js.native
}

object ModifyInstanceCreditSpecificationRequest {
  @scala.inline
  def apply(
    InstanceCreditSpecifications: InstanceCreditSpecificationListRequest,
    ClientToken: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): ModifyInstanceCreditSpecificationRequest = {
    val __obj = js.Dynamic.literal(InstanceCreditSpecifications = InstanceCreditSpecifications.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstanceCreditSpecificationRequest]
  }
}

