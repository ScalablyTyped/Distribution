package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyHostsRequest extends js.Object {
  /**
    * Specify whether to enable or disable auto-placement.
    */
  var AutoPlacement: js.UndefOr[typings.awsSdk.ec2Mod.AutoPlacement] = js.native
  /**
    * The IDs of the Dedicated Hosts to modify.
    */
  var HostIds: RequestHostIdList = js.native
  /**
    * Indicates whether to enable or disable host recovery for the Dedicated Host. For more information, see  Host Recovery in the Amazon Elastic Compute Cloud User Guide.
    */
  var HostRecovery: js.UndefOr[typings.awsSdk.ec2Mod.HostRecovery] = js.native
  /**
    * Specifies the instance family to be supported by the Dedicated Host. Specify this parameter to modify a Dedicated Host to support multiple instance types within its current instance family. If you want to modify a Dedicated Host to support a specific instance type only, omit this parameter and specify InstanceType instead. You cannot specify InstanceFamily and InstanceType in the same request.
    */
  var InstanceFamily: js.UndefOr[String] = js.native
  /**
    * Specifies the instance type to be supported by the Dedicated Host. Specify this parameter to modify a Dedicated Host to support only a specific instance type. If you want to modify a Dedicated Host to support multiple instance types in its current instance family, omit this parameter and specify InstanceFamily instead. You cannot specify InstanceType and InstanceFamily in the same request.
    */
  var InstanceType: js.UndefOr[String] = js.native
}

object ModifyHostsRequest {
  @scala.inline
  def apply(
    HostIds: RequestHostIdList,
    AutoPlacement: AutoPlacement = null,
    HostRecovery: HostRecovery = null,
    InstanceFamily: String = null,
    InstanceType: String = null
  ): ModifyHostsRequest = {
    val __obj = js.Dynamic.literal(HostIds = HostIds.asInstanceOf[js.Any])
    if (AutoPlacement != null) __obj.updateDynamic("AutoPlacement")(AutoPlacement.asInstanceOf[js.Any])
    if (HostRecovery != null) __obj.updateDynamic("HostRecovery")(HostRecovery.asInstanceOf[js.Any])
    if (InstanceFamily != null) __obj.updateDynamic("InstanceFamily")(InstanceFamily.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyHostsRequest]
  }
}

