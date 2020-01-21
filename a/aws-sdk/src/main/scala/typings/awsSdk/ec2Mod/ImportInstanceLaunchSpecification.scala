package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportInstanceLaunchSpecification extends js.Object {
  /**
    * Reserved.
    */
  var AdditionalInfo: js.UndefOr[String] = js.native
  /**
    * The architecture of the instance.
    */
  var Architecture: js.UndefOr[ArchitectureValues] = js.native
  /**
    * The security group IDs.
    */
  var GroupIds: js.UndefOr[SecurityGroupIdStringList] = js.native
  /**
    * The security group names.
    */
  var GroupNames: js.UndefOr[SecurityGroupStringList] = js.native
  /**
    * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the operating system command for system shutdown).
    */
  var InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior] = js.native
  /**
    * The instance type. For more information about the instance types that you can import, see Instance Types in the VM Import/Export User Guide.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.ec2Mod.InstanceType] = js.native
  /**
    * Indicates whether monitoring is enabled.
    */
  var Monitoring: js.UndefOr[Boolean] = js.native
  /**
    * The placement information for the instance.
    */
  var Placement: js.UndefOr[typings.awsSdk.ec2Mod.Placement] = js.native
  /**
    * [EC2-VPC] An available IP address from the IP address range of the subnet.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
  /**
    * [EC2-VPC] The ID of the subnet in which to launch the instance.
    */
  var SubnetId: js.UndefOr[String] = js.native
  /**
    * The Base64-encoded user data to make available to the instance.
    */
  var UserData: js.UndefOr[typings.awsSdk.ec2Mod.UserData] = js.native
}

object ImportInstanceLaunchSpecification {
  @scala.inline
  def apply(
    AdditionalInfo: String = null,
    Architecture: ArchitectureValues = null,
    GroupIds: SecurityGroupIdStringList = null,
    GroupNames: SecurityGroupStringList = null,
    InstanceInitiatedShutdownBehavior: ShutdownBehavior = null,
    InstanceType: InstanceType = null,
    Monitoring: js.UndefOr[scala.Boolean] = js.undefined,
    Placement: Placement = null,
    PrivateIpAddress: String = null,
    SubnetId: String = null,
    UserData: UserData = null
  ): ImportInstanceLaunchSpecification = {
    val __obj = js.Dynamic.literal()
    if (AdditionalInfo != null) __obj.updateDynamic("AdditionalInfo")(AdditionalInfo.asInstanceOf[js.Any])
    if (Architecture != null) __obj.updateDynamic("Architecture")(Architecture.asInstanceOf[js.Any])
    if (GroupIds != null) __obj.updateDynamic("GroupIds")(GroupIds.asInstanceOf[js.Any])
    if (GroupNames != null) __obj.updateDynamic("GroupNames")(GroupNames.asInstanceOf[js.Any])
    if (InstanceInitiatedShutdownBehavior != null) __obj.updateDynamic("InstanceInitiatedShutdownBehavior")(InstanceInitiatedShutdownBehavior.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (!js.isUndefined(Monitoring)) __obj.updateDynamic("Monitoring")(Monitoring.asInstanceOf[js.Any])
    if (Placement != null) __obj.updateDynamic("Placement")(Placement.asInstanceOf[js.Any])
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    if (UserData != null) __obj.updateDynamic("UserData")(UserData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportInstanceLaunchSpecification]
  }
}

