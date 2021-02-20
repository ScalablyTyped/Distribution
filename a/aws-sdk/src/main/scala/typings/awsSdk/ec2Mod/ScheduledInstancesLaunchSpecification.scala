package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduledInstancesLaunchSpecification extends StObject {
  
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
  implicit class ScheduledInstancesLaunchSpecificationMutableBuilder[Self <: ScheduledInstancesLaunchSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockDeviceMappings(value: ScheduledInstancesBlockDeviceMappingSet): Self = StObject.set(x, "BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "BlockDeviceMappings", js.undefined)
    
    @scala.inline
    def setBlockDeviceMappingsVarargs(value: ScheduledInstancesBlockDeviceMapping*): Self = StObject.set(x, "BlockDeviceMappings", js.Array(value :_*))
    
    @scala.inline
    def setEbsOptimized(value: Boolean): Self = StObject.set(x, "EbsOptimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEbsOptimizedUndefined: Self = StObject.set(x, "EbsOptimized", js.undefined)
    
    @scala.inline
    def setIamInstanceProfile(value: ScheduledInstancesIamInstanceProfile): Self = StObject.set(x, "IamInstanceProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamInstanceProfileUndefined: Self = StObject.set(x, "IamInstanceProfile", js.undefined)
    
    @scala.inline
    def setImageId(value: ImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setKernelId(value: KernelId): Self = StObject.set(x, "KernelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelIdUndefined: Self = StObject.set(x, "KernelId", js.undefined)
    
    @scala.inline
    def setKeyName(value: KeyPairName): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNameUndefined: Self = StObject.set(x, "KeyName", js.undefined)
    
    @scala.inline
    def setMonitoring(value: ScheduledInstancesMonitoring): Self = StObject.set(x, "Monitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoringUndefined: Self = StObject.set(x, "Monitoring", js.undefined)
    
    @scala.inline
    def setNetworkInterfaces(value: ScheduledInstancesNetworkInterfaceSet): Self = StObject.set(x, "NetworkInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfacesUndefined: Self = StObject.set(x, "NetworkInterfaces", js.undefined)
    
    @scala.inline
    def setNetworkInterfacesVarargs(value: ScheduledInstancesNetworkInterface*): Self = StObject.set(x, "NetworkInterfaces", js.Array(value :_*))
    
    @scala.inline
    def setPlacement(value: ScheduledInstancesPlacement): Self = StObject.set(x, "Placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementUndefined: Self = StObject.set(x, "Placement", js.undefined)
    
    @scala.inline
    def setRamdiskId(value: RamdiskId): Self = StObject.set(x, "RamdiskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRamdiskIdUndefined: Self = StObject.set(x, "RamdiskId", js.undefined)
    
    @scala.inline
    def setSecurityGroupIds(value: ScheduledInstancesSecurityGroupIdSet): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    @scala.inline
    def setUserData(value: String): Self = StObject.set(x, "UserData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDataUndefined: Self = StObject.set(x, "UserData", js.undefined)
  }
}
