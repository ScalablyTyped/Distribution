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
  def apply(InstanceCreditSpecifications: InstanceCreditSpecificationListRequest): ModifyInstanceCreditSpecificationRequest = {
    val __obj = js.Dynamic.literal(InstanceCreditSpecifications = InstanceCreditSpecifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstanceCreditSpecificationRequest]
  }
  @scala.inline
  implicit class ModifyInstanceCreditSpecificationRequestOps[Self <: ModifyInstanceCreditSpecificationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInstanceCreditSpecificationsVarargs(value: InstanceCreditSpecificationRequest*): Self = this.set("InstanceCreditSpecifications", js.Array(value :_*))
    @scala.inline
    def setInstanceCreditSpecifications(value: InstanceCreditSpecificationListRequest): Self = this.set("InstanceCreditSpecifications", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientToken(value: String): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
  
}

