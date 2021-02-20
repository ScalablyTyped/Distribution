package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchSpecification extends StObject {
  
  /**
    * Deprecated.
    */
  var AddressingType: js.UndefOr[String] = js.native
  
  /**
    * One or more block device mapping entries.
    */
  var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingList] = js.native
  
  /**
    * Indicates whether the instance is optimized for EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS Optimized instance. Default: false 
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.native
  
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: js.UndefOr[IamInstanceProfileSpecification] = js.native
  
  /**
    * The ID of the AMI.
    */
  var ImageId: js.UndefOr[String] = js.native
  
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.ec2Mod.InstanceType] = js.native
  
  /**
    * The ID of the kernel.
    */
  var KernelId: js.UndefOr[String] = js.native
  
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[String] = js.native
  
  var Monitoring: js.UndefOr[RunInstancesMonitoringEnabled] = js.native
  
  /**
    * One or more network interfaces. If you specify a network interface, you must specify subnet IDs and security group IDs using the network interface.
    */
  var NetworkInterfaces: js.UndefOr[InstanceNetworkInterfaceSpecificationList] = js.native
  
  /**
    * The placement information for the instance.
    */
  var Placement: js.UndefOr[SpotPlacement] = js.native
  
  /**
    * The ID of the RAM disk.
    */
  var RamdiskId: js.UndefOr[String] = js.native
  
  /**
    * One or more security groups. When requesting instances in a VPC, you must specify the IDs of the security groups. When requesting instances in EC2-Classic, you can specify the names or the IDs of the security groups.
    */
  var SecurityGroups: js.UndefOr[GroupIdentifierList] = js.native
  
  /**
    * The ID of the subnet in which to launch the instance.
    */
  var SubnetId: js.UndefOr[String] = js.native
  
  /**
    * The Base64-encoded user data for the instance.
    */
  var UserData: js.UndefOr[String] = js.native
}
object LaunchSpecification {
  
  @scala.inline
  def apply(): LaunchSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchSpecification]
  }
  
  @scala.inline
  implicit class LaunchSpecificationMutableBuilder[Self <: LaunchSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressingType(value: String): Self = StObject.set(x, "AddressingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressingTypeUndefined: Self = StObject.set(x, "AddressingType", js.undefined)
    
    @scala.inline
    def setBlockDeviceMappings(value: BlockDeviceMappingList): Self = StObject.set(x, "BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "BlockDeviceMappings", js.undefined)
    
    @scala.inline
    def setBlockDeviceMappingsVarargs(value: BlockDeviceMapping*): Self = StObject.set(x, "BlockDeviceMappings", js.Array(value :_*))
    
    @scala.inline
    def setEbsOptimized(value: Boolean): Self = StObject.set(x, "EbsOptimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsOptimizedUndefined: Self = StObject.set(x, "EbsOptimized", js.undefined)
    
    @scala.inline
    def setIamInstanceProfile(value: IamInstanceProfileSpecification): Self = StObject.set(x, "IamInstanceProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamInstanceProfileUndefined: Self = StObject.set(x, "IamInstanceProfile", js.undefined)
    
    @scala.inline
    def setImageId(value: String): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setKernelId(value: String): Self = StObject.set(x, "KernelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelIdUndefined: Self = StObject.set(x, "KernelId", js.undefined)
    
    @scala.inline
    def setKeyName(value: String): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNameUndefined: Self = StObject.set(x, "KeyName", js.undefined)
    
    @scala.inline
    def setMonitoring(value: RunInstancesMonitoringEnabled): Self = StObject.set(x, "Monitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringUndefined: Self = StObject.set(x, "Monitoring", js.undefined)
    
    @scala.inline
    def setNetworkInterfaces(value: InstanceNetworkInterfaceSpecificationList): Self = StObject.set(x, "NetworkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfacesUndefined: Self = StObject.set(x, "NetworkInterfaces", js.undefined)
    
    @scala.inline
    def setNetworkInterfacesVarargs(value: InstanceNetworkInterfaceSpecification*): Self = StObject.set(x, "NetworkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setPlacement(value: SpotPlacement): Self = StObject.set(x, "Placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "Placement", js.undefined)
    
    @scala.inline
    def setRamdiskId(value: String): Self = StObject.set(x, "RamdiskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRamdiskIdUndefined: Self = StObject.set(x, "RamdiskId", js.undefined)
    
    @scala.inline
    def setSecurityGroups(value: GroupIdentifierList): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: GroupIdentifier*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSubnetId(value: String): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    @scala.inline
    def setUserData(value: String): Self = StObject.set(x, "UserData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDataUndefined: Self = StObject.set(x, "UserData", js.undefined)
  }
}
