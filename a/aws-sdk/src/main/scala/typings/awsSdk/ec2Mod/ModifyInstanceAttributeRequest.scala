package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyInstanceAttributeRequest extends StObject {
  
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
  implicit class ModifyInstanceAttributeRequestMutableBuilder[Self <: ModifyInstanceAttributeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: InstanceAttributeName): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeUndefined: Self = StObject.set(x, "Attribute", js.undefined)
    
    @scala.inline
    def setBlockDeviceMappings(value: InstanceBlockDeviceMappingSpecificationList): Self = StObject.set(x, "BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "BlockDeviceMappings", js.undefined)
    
    @scala.inline
    def setBlockDeviceMappingsVarargs(value: InstanceBlockDeviceMappingSpecification*): Self = StObject.set(x, "BlockDeviceMappings", js.Array(value :_*))
    
    @scala.inline
    def setDisableApiTermination(value: AttributeBooleanValue): Self = StObject.set(x, "DisableApiTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableApiTerminationUndefined: Self = StObject.set(x, "DisableApiTermination", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setEbsOptimized(value: AttributeBooleanValue): Self = StObject.set(x, "EbsOptimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsOptimizedUndefined: Self = StObject.set(x, "EbsOptimized", js.undefined)
    
    @scala.inline
    def setEnaSupport(value: AttributeBooleanValue): Self = StObject.set(x, "EnaSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnaSupportUndefined: Self = StObject.set(x, "EnaSupport", js.undefined)
    
    @scala.inline
    def setGroups(value: GroupIdStringList): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = StObject.set(x, "Groups", js.Array(value :_*))
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceInitiatedShutdownBehavior(value: AttributeValue): Self = StObject.set(x, "InstanceInitiatedShutdownBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceInitiatedShutdownBehaviorUndefined: Self = StObject.set(x, "InstanceInitiatedShutdownBehavior", js.undefined)
    
    @scala.inline
    def setInstanceType(value: AttributeValue): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setKernel(value: AttributeValue): Self = StObject.set(x, "Kernel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelUndefined: Self = StObject.set(x, "Kernel", js.undefined)
    
    @scala.inline
    def setRamdisk(value: AttributeValue): Self = StObject.set(x, "Ramdisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRamdiskUndefined: Self = StObject.set(x, "Ramdisk", js.undefined)
    
    @scala.inline
    def setSourceDestCheck(value: AttributeBooleanValue): Self = StObject.set(x, "SourceDestCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDestCheckUndefined: Self = StObject.set(x, "SourceDestCheck", js.undefined)
    
    @scala.inline
    def setSriovNetSupport(value: AttributeValue): Self = StObject.set(x, "SriovNetSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSriovNetSupportUndefined: Self = StObject.set(x, "SriovNetSupport", js.undefined)
    
    @scala.inline
    def setUserData(value: BlobAttributeValue): Self = StObject.set(x, "UserData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDataUndefined: Self = StObject.set(x, "UserData", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
