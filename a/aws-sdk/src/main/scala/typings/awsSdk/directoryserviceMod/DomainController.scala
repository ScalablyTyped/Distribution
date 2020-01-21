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
  def apply(
    AvailabilityZone: AvailabilityZone = null,
    DirectoryId: DirectoryId = null,
    DnsIpAddr: IpAddr = null,
    DomainControllerId: DomainControllerId = null,
    LaunchTime: LaunchTime = null,
    Status: DomainControllerStatus = null,
    StatusLastUpdatedDateTime: LastUpdatedDateTime = null,
    StatusReason: DomainControllerStatusReason = null,
    SubnetId: SubnetId = null,
    VpcId: VpcId = null
  ): DomainController = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId.asInstanceOf[js.Any])
    if (DnsIpAddr != null) __obj.updateDynamic("DnsIpAddr")(DnsIpAddr.asInstanceOf[js.Any])
    if (DomainControllerId != null) __obj.updateDynamic("DomainControllerId")(DomainControllerId.asInstanceOf[js.Any])
    if (LaunchTime != null) __obj.updateDynamic("LaunchTime")(LaunchTime.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusLastUpdatedDateTime != null) __obj.updateDynamic("StatusLastUpdatedDateTime")(StatusLastUpdatedDateTime.asInstanceOf[js.Any])
    if (StatusReason != null) __obj.updateDynamic("StatusReason")(StatusReason.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainController]
  }
}

