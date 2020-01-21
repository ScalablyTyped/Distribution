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
    TargetConfigurations: ReservedInstancesConfigurationList,
    ClientToken: String = null
  ): ModifyReservedInstancesRequest = {
    val __obj = js.Dynamic.literal(ReservedInstancesIds = ReservedInstancesIds.asInstanceOf[js.Any], TargetConfigurations = TargetConfigurations.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyReservedInstancesRequest]
  }
}

