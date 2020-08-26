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
  def apply(HostIds: RequestHostIdList): ModifyHostsRequest = {
    val __obj = js.Dynamic.literal(HostIds = HostIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyHostsRequest]
  }
  @scala.inline
  implicit class ModifyHostsRequestOps[Self <: ModifyHostsRequest] (val x: Self) extends AnyVal {
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
    def setHostIdsVarargs(value: DedicatedHostId*): Self = this.set("HostIds", js.Array(value :_*))
    @scala.inline
    def setHostIds(value: RequestHostIdList): Self = this.set("HostIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoPlacement(value: AutoPlacement): Self = this.set("AutoPlacement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPlacement: Self = this.set("AutoPlacement", js.undefined)
    @scala.inline
    def setHostRecovery(value: HostRecovery): Self = this.set("HostRecovery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostRecovery: Self = this.set("HostRecovery", js.undefined)
    @scala.inline
    def setInstanceFamily(value: String): Self = this.set("InstanceFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceFamily: Self = this.set("InstanceFamily", js.undefined)
    @scala.inline
    def setInstanceType(value: String): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
  }
  
}

