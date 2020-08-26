package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyReservedInstancesRequest extends js.Object {
  /**
    * A unique, case-sensitive token you provide to ensure idempotency of your modification request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * The IDs of the Reserved Instances to modify.
    */
  var ReservedInstancesIds: ReservedInstancesIdStringList = js.native
  /**
    * The configuration settings for the Reserved Instances to modify.
    */
  var TargetConfigurations: ReservedInstancesConfigurationList = js.native
}

object ModifyReservedInstancesRequest {
  @scala.inline
  def apply(
    ReservedInstancesIds: ReservedInstancesIdStringList,
    TargetConfigurations: ReservedInstancesConfigurationList
  ): ModifyReservedInstancesRequest = {
    val __obj = js.Dynamic.literal(ReservedInstancesIds = ReservedInstancesIds.asInstanceOf[js.Any], TargetConfigurations = TargetConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyReservedInstancesRequest]
  }
  @scala.inline
  implicit class ModifyReservedInstancesRequestOps[Self <: ModifyReservedInstancesRequest] (val x: Self) extends AnyVal {
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
    def setReservedInstancesIdsVarargs(value: ReservationId*): Self = this.set("ReservedInstancesIds", js.Array(value :_*))
    @scala.inline
    def setReservedInstancesIds(value: ReservedInstancesIdStringList): Self = this.set("ReservedInstancesIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetConfigurationsVarargs(value: ReservedInstancesConfiguration*): Self = this.set("TargetConfigurations", js.Array(value :_*))
    @scala.inline
    def setTargetConfigurations(value: ReservedInstancesConfigurationList): Self = this.set("TargetConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientToken(value: String): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
  }
  
}

