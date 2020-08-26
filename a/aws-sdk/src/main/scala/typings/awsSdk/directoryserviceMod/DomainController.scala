package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainController extends js.Object {
  /**
    * The Availability Zone where the domain controller is located.
    */
  var AvailabilityZone: js.UndefOr[typings.awsSdk.directoryserviceMod.AvailabilityZone] = js.native
  /**
    * Identifier of the directory where the domain controller resides.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.directoryserviceMod.DirectoryId] = js.native
  /**
    * The IP address of the domain controller.
    */
  var DnsIpAddr: js.UndefOr[IpAddr] = js.native
  /**
    * Identifies a specific domain controller in the directory.
    */
  var DomainControllerId: js.UndefOr[typings.awsSdk.directoryserviceMod.DomainControllerId] = js.native
  /**
    * Specifies when the domain controller was created.
    */
  var LaunchTime: js.UndefOr[typings.awsSdk.directoryserviceMod.LaunchTime] = js.native
  /**
    * The status of the domain controller.
    */
  var Status: js.UndefOr[DomainControllerStatus] = js.native
  /**
    * The date and time that the status was last updated.
    */
  var StatusLastUpdatedDateTime: js.UndefOr[LastUpdatedDateTime] = js.native
  /**
    * A description of the domain controller state.
    */
  var StatusReason: js.UndefOr[DomainControllerStatusReason] = js.native
  /**
    * Identifier of the subnet in the VPC that contains the domain controller.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.directoryserviceMod.SubnetId] = js.native
  /**
    * The identifier of the VPC that contains the domain controller.
    */
  var VpcId: js.UndefOr[typings.awsSdk.directoryserviceMod.VpcId] = js.native
}

object DomainController {
  @scala.inline
  def apply(): DomainController = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainController]
  }
  @scala.inline
  implicit class DomainControllerOps[Self <: DomainController] (val x: Self) extends AnyVal {
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
    def setAvailabilityZone(value: AvailabilityZone): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectoryId: Self = this.set("DirectoryId", js.undefined)
    @scala.inline
    def setDnsIpAddr(value: IpAddr): Self = this.set("DnsIpAddr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDnsIpAddr: Self = this.set("DnsIpAddr", js.undefined)
    @scala.inline
    def setDomainControllerId(value: DomainControllerId): Self = this.set("DomainControllerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainControllerId: Self = this.set("DomainControllerId", js.undefined)
    @scala.inline
    def setLaunchTime(value: LaunchTime): Self = this.set("LaunchTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchTime: Self = this.set("LaunchTime", js.undefined)
    @scala.inline
    def setStatus(value: DomainControllerStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setStatusLastUpdatedDateTime(value: LastUpdatedDateTime): Self = this.set("StatusLastUpdatedDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusLastUpdatedDateTime: Self = this.set("StatusLastUpdatedDateTime", js.undefined)
    @scala.inline
    def setStatusReason(value: DomainControllerStatusReason): Self = this.set("StatusReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusReason: Self = this.set("StatusReason", js.undefined)
    @scala.inline
    def setSubnetId(value: SubnetId): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("SubnetId", js.undefined)
    @scala.inline
    def setVpcId(value: VpcId): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
  
}

