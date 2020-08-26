package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryVpcSettingsDescription extends js.Object {
  /**
    * The list of Availability Zones that the directory is in.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.directoryserviceMod.AvailabilityZones] = js.native
  /**
    * The domain controller security group identifier for the directory.
    */
  var SecurityGroupId: js.UndefOr[typings.awsSdk.directoryserviceMod.SecurityGroupId] = js.native
  /**
    * The identifiers of the subnets for the directory servers.
    */
  var SubnetIds: js.UndefOr[typings.awsSdk.directoryserviceMod.SubnetIds] = js.native
  /**
    * The identifier of the VPC that the directory is in.
    */
  var VpcId: js.UndefOr[typings.awsSdk.directoryserviceMod.VpcId] = js.native
}

object DirectoryVpcSettingsDescription {
  @scala.inline
  def apply(): DirectoryVpcSettingsDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryVpcSettingsDescription]
  }
  @scala.inline
  implicit class DirectoryVpcSettingsDescriptionOps[Self <: DirectoryVpcSettingsDescription] (val x: Self) extends AnyVal {
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
    def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = this.set("AvailabilityZones", js.Array(value :_*))
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZones): Self = this.set("AvailabilityZones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("AvailabilityZones", js.undefined)
    @scala.inline
    def setSecurityGroupId(value: SecurityGroupId): Self = this.set("SecurityGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupId: Self = this.set("SecurityGroupId", js.undefined)
    @scala.inline
    def setSubnetIdsVarargs(value: SubnetId*): Self = this.set("SubnetIds", js.Array(value :_*))
    @scala.inline
    def setSubnetIds(value: SubnetIds): Self = this.set("SubnetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetIds: Self = this.set("SubnetIds", js.undefined)
    @scala.inline
    def setVpcId(value: VpcId): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
  
}

