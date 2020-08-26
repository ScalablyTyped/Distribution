package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubnetMapping extends js.Object {
  /**
    * [Network Load Balancers] The allocation ID of the Elastic IP address for an internet-facing load balancer.
    */
  var AllocationId: js.UndefOr[typings.awsSdk.elbv2Mod.AllocationId] = js.native
  /**
    * [Network Load Balancers] The private IPv4 address for an internal load balancer.
    */
  var PrivateIPv4Address: js.UndefOr[typings.awsSdk.elbv2Mod.PrivateIPv4Address] = js.native
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.elbv2Mod.SubnetId] = js.native
}

object SubnetMapping {
  @scala.inline
  def apply(): SubnetMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetMapping]
  }
  @scala.inline
  implicit class SubnetMappingOps[Self <: SubnetMapping] (val x: Self) extends AnyVal {
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
    def setAllocationId(value: AllocationId): Self = this.set("AllocationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocationId: Self = this.set("AllocationId", js.undefined)
    @scala.inline
    def setPrivateIPv4Address(value: PrivateIPv4Address): Self = this.set("PrivateIPv4Address", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateIPv4Address: Self = this.set("PrivateIPv4Address", js.undefined)
    @scala.inline
    def setSubnetId(value: SubnetId): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("SubnetId", js.undefined)
  }
  
}

