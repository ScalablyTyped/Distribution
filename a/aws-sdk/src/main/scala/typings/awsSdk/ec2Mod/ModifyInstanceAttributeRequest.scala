package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyInstanceAttributeRequest extends js.Object {
  
  /**
    * The name of the attribute.
    */
  var Attribute: js.UndefOr[InstanceAttributeName] = js.native
  
  /**
    * Modifies the DeleteOnTermination attribute for volumes that are currently attached. The volume must be owned by the caller. If no value is specified for DeleteOnTermination, the default is true and the volume is deleted when the instance is terminated. To add instance store volumes to an Amazon EBS-backed instance, you must add them when you launch the instance. For more information, see Updating the block device mapping when launching an instance in the Amazon Elastic Compute Cloud User Guide.
    */
  var BlockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappingSpecificationList] = js.native
  
  /**
    * If the value is true, you can't terminate the instance using the Amazon EC2 console, CLI, or API; otherwise, you can. You cannot use this parameter for Spot Instances.
    */
  var DisableApiTermination: js.UndefOr[AttributeBooleanValue] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies whether the instance is optimized for Amazon EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS Optimized instance.
    */
  var EbsOptimized: js.UndefOr[AttributeBooleanValue] = js.native
  
  /**
    * Set to true to enable enhanced networking with ENA for the instance. This option is supported only for HVM instances. Specifying this option with a PV instance can make it unreachable.
    */
  var EnaSupport: js.UndefOr[AttributeBooleanValue] = js.native
  
  /**
    * [EC2-VPC] Changes the security groups of the instance. You must specify at least one security group, even if it's just the default security group for the VPC. You must specify the security group ID, not the security group name.
    */
  var Groups: js.UndefOr[GroupIdStringList] = js.native
  
  /**
    * The ID of the instance.
    */
  var InstanceId: typings.awsSdk.ec2Mod.InstanceId = js.native
  
  /**
    * Specifies whether an instance stops or terminates when you initiate shutdown from the instance (using the operating system command for system shutdown).
    */
  var InstanceInitiatedShutdownBehavior: js.UndefOr[AttributeValue] = js.native
  
  /**
    * Changes the instance type to the specified value. For more information, see Instance types. If the instance type is not valid, the error returned is InvalidInstanceAttributeValue.
    */
  var InstanceType: js.UndefOr[AttributeValue] = js.native
  
  /**
    * Changes the instance's kernel to the specified value. We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see PV-GRUB.
    */
  var Kernel: js.UndefOr[AttributeValue] = js.native
  
  /**
    * Changes the instance's RAM disk to the specified value. We recommend that you use PV-GRUB instead of kernels and RAM disks. For more information, see PV-GRUB.
    */
  var Ramdisk: js.UndefOr[AttributeValue] = js.native
  
  /**
    * Specifies whether source/destination checking is enabled. A value of true means that checking is enabled, and false means that checking is disabled. This value must be false for a NAT instance to perform NAT.
    */
  var SourceDestCheck: js.UndefOr[AttributeBooleanValue] = js.native
  
  /**
    * Set to simple to enable enhanced networking with the Intel 82599 Virtual Function interface for the instance. There is no way to disable enhanced networking with the Intel 82599 Virtual Function interface at this time. This option is supported only for HVM instances. Specifying this option with a PV instance can make it unreachable.
    */
  var SriovNetSupport: js.UndefOr[AttributeValue] = js.native
  
  /**
    * Changes the instance's user data to the specified value. If you are using an AWS SDK or command line tool, base64-encoding is performed for you, and you can load the text from a file. Otherwise, you must provide base64-encoded text.
    */
  var UserData: js.UndefOr[BlobAttributeValue] = js.native
  
  /**
    * A new value for the attribute. Use only with the kernel, ramdisk, userData, disableApiTermination, or instanceInitiatedShutdownBehavior attribute.
    */
  var Value: js.UndefOr[String] = js.native
}
object ModifyInstanceAttributeRequest {
  
  @scala.inline
  def apply(InstanceId: InstanceId): ModifyInstanceAttributeRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyInstanceAttributeRequest]
  }
  
  @scala.inline
  implicit class ModifyInstanceAttributeRequestOps[Self <: ModifyInstanceAttributeRequest] (val x: Self) extends AnyVal {
    
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
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttribute(value: InstanceAttributeName): Self = this.set("Attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttribute: Self = this.set("Attribute", js.undefined)
    
    @scala.inline
    def setBlockDeviceMappingsVarargs(value: InstanceBlockDeviceMappingSpecification*): Self = this.set("BlockDeviceMappings", js.Array(value :_*))
    
    @scala.inline
    def setBlockDeviceMappings(value: InstanceBlockDeviceMappingSpecificationList): Self = this.set("BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockDeviceMappings: Self = this.set("BlockDeviceMappings", js.undefined)
    
    @scala.inline
    def setDisableApiTermination(value: AttributeBooleanValue): Self = this.set("DisableApiTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableApiTermination: Self = this.set("DisableApiTermination", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setEbsOptimized(value: AttributeBooleanValue): Self = this.set("EbsOptimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEbsOptimized: Self = this.set("EbsOptimized", js.undefined)
    
    @scala.inline
    def setEnaSupport(value: AttributeBooleanValue): Self = this.set("EnaSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnaSupport: Self = this.set("EnaSupport", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = this.set("Groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: GroupIdStringList): Self = this.set("Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("Groups", js.undefined)
    
    @scala.inline
    def setInstanceInitiatedShutdownBehavior(value: AttributeValue): Self = this.set("InstanceInitiatedShutdownBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceInitiatedShutdownBehavior: Self = this.set("InstanceInitiatedShutdownBehavior", js.undefined)
    
    @scala.inline
    def setInstanceType(value: AttributeValue): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    
    @scala.inline
    def setKernel(value: AttributeValue): Self = this.set("Kernel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernel: Self = this.set("Kernel", js.undefined)
    
    @scala.inline
    def setRamdisk(value: AttributeValue): Self = this.set("Ramdisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRamdisk: Self = this.set("Ramdisk", js.undefined)
    
    @scala.inline
    def setSourceDestCheck(value: AttributeBooleanValue): Self = this.set("SourceDestCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceDestCheck: Self = this.set("SourceDestCheck", js.undefined)
    
    @scala.inline
    def setSriovNetSupport(value: AttributeValue): Self = this.set("SriovNetSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSriovNetSupport: Self = this.set("SriovNetSupport", js.undefined)
    
    @scala.inline
    def setUserData(value: BlobAttributeValue): Self = this.set("UserData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserData: Self = this.set("UserData", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
}
