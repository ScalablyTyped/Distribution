package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryVpcSettings extends js.Object {
  /**
    * The identifiers of the subnets for the directory servers. The two subnets must be in different Availability Zones. AWS Directory Service creates a directory server and a DNS server in each of these subnets.
    */
  var SubnetIds: typings.awsSdk.directoryserviceMod.SubnetIds = js.native
  /**
    * The identifier of the VPC in which to create the directory.
    */
  var VpcId: typings.awsSdk.directoryserviceMod.VpcId = js.native
}

object DirectoryVpcSettings {
  @scala.inline
  def apply(SubnetIds: SubnetIds, VpcId: VpcId): DirectoryVpcSettings = {
    val __obj = js.Dynamic.literal(SubnetIds = SubnetIds.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryVpcSettings]
  }
  @scala.inline
  implicit class DirectoryVpcSettingsOps[Self <: DirectoryVpcSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSubnetIdsVarargs(value: SubnetId*): Self = this.set("SubnetIds", js.Array(value :_*))
    @scala.inline
    def setSubnetIds(value: SubnetIds): Self = this.set("SubnetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpcId(value: VpcId): Self = this.set("VpcId", value.asInstanceOf[js.Any])
  }
  
}

