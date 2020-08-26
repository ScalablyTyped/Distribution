package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReservedInstancesExchangeQuoteRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The IDs of the Convertible Reserved Instances to exchange.
    */
  var ReservedInstanceIds: ReservedInstanceIdSet = js.native
  /**
    * The configuration of the target Convertible Reserved Instance to exchange for your current Convertible Reserved Instances.
    */
  var TargetConfigurations: js.UndefOr[TargetConfigurationRequestSet] = js.native
}

object GetReservedInstancesExchangeQuoteRequest {
  @scala.inline
  def apply(ReservedInstanceIds: ReservedInstanceIdSet): GetReservedInstancesExchangeQuoteRequest = {
    val __obj = js.Dynamic.literal(ReservedInstanceIds = ReservedInstanceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReservedInstancesExchangeQuoteRequest]
  }
  @scala.inline
  implicit class GetReservedInstancesExchangeQuoteRequestOps[Self <: GetReservedInstancesExchangeQuoteRequest] (val x: Self) extends AnyVal {
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
    def setReservedInstanceIdsVarargs(value: ReservationId*): Self = this.set("ReservedInstanceIds", js.Array(value :_*))
    @scala.inline
    def setReservedInstanceIds(value: ReservedInstanceIdSet): Self = this.set("ReservedInstanceIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setTargetConfigurationsVarargs(value: TargetConfigurationRequest*): Self = this.set("TargetConfigurations", js.Array(value :_*))
    @scala.inline
    def setTargetConfigurations(value: TargetConfigurationRequestSet): Self = this.set("TargetConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetConfigurations: Self = this.set("TargetConfigurations", js.undefined)
  }
  
}

