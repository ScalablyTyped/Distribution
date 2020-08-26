package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledInstancesLaunchSpecification extends js.Object {
  /**
    * The block device mapping entries.
    */
  var BlockDeviceMappings: js.UndefOr[ScheduledInstancesBlockDeviceMappingSet] = js.native
  /**
    * Indicates whether the instances are optimized for EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS-optimized instance. Default: false 
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.native
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: js.UndefOr[ScheduledInstancesIamInstanceProfile] = js.native
  /**
    * The ID of the Amazon Machine Image (AMI).
    */
  var ImageId: typings.awsSdk.ec2Mod.ImageId = js.native
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[String] = js.native
  /**
    * The ID of the kernel.
    */
  var KernelId: js.UndefOr[typings.awsSdk.ec2Mod.KernelId] = js.native
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[KeyPairName] = js.native
  /**
    * Enable or disable monitoring for the instances.
    */
  var Monitoring: js.UndefOr[ScheduledInstancesMonitoring] = js.native
  /**
    * The network interfaces.
    */
  var NetworkInterfaces: js.UndefOr[ScheduledInstancesNetworkInterfaceSet] = js.native
  /**
    * The placement information.
    */
  var Placement: js.UndefOr[ScheduledInstancesPlacement] = js.native
  /**
    * The ID of the RAM disk.
    */
  var RamdiskId: js.UndefOr[typings.awsSdk.ec2Mod.RamdiskId] = js.native
  /**
    * The IDs of the security groups.
    */
  var SecurityGroupIds: js.UndefOr[ScheduledInstancesSecurityGroupIdSet] = js.native
  /**
    * The ID of the subnet in which to launch the instances.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.ec2Mod.SubnetId] = js.native
  /**
    * The base64-encoded MIME user data.
    */
  var UserData: js.UndefOr[String] = js.native
}

object ScheduledInstancesLaunchSpecification {
  @scala.inline
  def apply(ImageId: ImageId): ScheduledInstancesLaunchSpecification = {
    val __obj = js.Dynamic.literal(ImageId = ImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledInstancesLaunchSpecification]
  }
  @scala.inline
  implicit class ScheduledInstancesLaunchSpecificationOps[Self <: ScheduledInstancesLaunchSpecification] (val x: Self) extends AnyVal {
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
    def setImageId(value: ImageId): Self = this.set("ImageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlockDeviceMappingsVarargs(value: ScheduledInstancesBlockDeviceMapping*): Self = this.set("BlockDeviceMappings", js.Array(value :_*))
    @scala.inline
    def setBlockDeviceMappings(value: ScheduledInstancesBlockDeviceMappingSet): Self = this.set("BlockDeviceMappings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockDeviceMappings: Self = this.set("BlockDeviceMappings", js.undefined)
    @scala.inline
    def setEbsOptimized(value: Boolean): Self = this.set("EbsOptimized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbsOptimized: Self = this.set("EbsOptimized", js.undefined)
    @scala.inline
    def setIamInstanceProfile(value: ScheduledInstancesIamInstanceProfile): Self = this.set("IamInstanceProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamInstanceProfile: Self = this.set("IamInstanceProfile", js.undefined)
    @scala.inline
    def setInstanceType(value: String): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    @scala.inline
    def setKernelId(value: KernelId): Self = this.set("KernelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKernelId: Self = this.set("KernelId", js.undefined)
    @scala.inline
    def setKeyName(value: KeyPairName): Self = this.set("KeyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyName: Self = this.set("KeyName", js.undefined)
    @scala.inline
    def setMonitoring(value: ScheduledInstancesMonitoring): Self = this.set("Monitoring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonitoring: Self = this.set("Monitoring", js.undefined)
    @scala.inline
    def setNetworkInterfacesVarargs(value: ScheduledInstancesNetworkInterface*): Self = this.set("NetworkInterfaces", js.Array(value :_*))
    @scala.inline
    def setNetworkInterfaces(value: ScheduledInstancesNetworkInterfaceSet): Self = this.set("NetworkInterfaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaces: Self = this.set("NetworkInterfaces", js.undefined)
    @scala.inline
    def setPlacement(value: ScheduledInstancesPlacement): Self = this.set("Placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("Placement", js.undefined)
    @scala.inline
    def setRamdiskId(value: RamdiskId): Self = this.set("RamdiskId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRamdiskId: Self = this.set("RamdiskId", js.undefined)
    @scala.inline
    def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = this.set("SecurityGroupIds", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupIds(value: ScheduledInstancesSecurityGroupIdSet): Self = this.set("SecurityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("SecurityGroupIds", js.undefined)
    @scala.inline
    def setSubnetId(value: SubnetId): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("SubnetId", js.undefined)
    @scala.inline
    def setUserData(value: String): Self = this.set("UserData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserData: Self = this.set("UserData", js.undefined)
  }
  
}

