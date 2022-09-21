package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledInstancesLaunchSpecification extends StObject {
  
  /**
    * The block device mapping entries.
    */
  var BlockDeviceMappings: js.UndefOr[ScheduledInstancesBlockDeviceMappingSet] = js.undefined
  
  /**
    * Indicates whether the instances are optimized for EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS-optimized instance. Default: false 
    */
  var EbsOptimized: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IAM instance profile.
    */
  var IamInstanceProfile: js.UndefOr[ScheduledInstancesIamInstanceProfile] = js.undefined
  
  /**
    * The ID of the Amazon Machine Image (AMI).
    */
  var ImageId: typings.awsSdk.ec2Mod.ImageId
  
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the kernel.
    */
  var KernelId: js.UndefOr[typings.awsSdk.ec2Mod.KernelId] = js.undefined
  
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[KeyPairName] = js.undefined
  
  /**
    * Enable or disable monitoring for the instances.
    */
  var Monitoring: js.UndefOr[ScheduledInstancesMonitoring] = js.undefined
  
  /**
    * The network interfaces.
    */
  var NetworkInterfaces: js.UndefOr[ScheduledInstancesNetworkInterfaceSet] = js.undefined
  
  /**
    * The placement information.
    */
  var Placement: js.UndefOr[ScheduledInstancesPlacement] = js.undefined
  
  /**
    * The ID of the RAM disk.
    */
  var RamdiskId: js.UndefOr[typings.awsSdk.ec2Mod.RamdiskId] = js.undefined
  
  /**
    * The IDs of the security groups.
    */
  var SecurityGroupIds: js.UndefOr[ScheduledInstancesSecurityGroupIdSet] = js.undefined
  
  /**
    * The ID of the subnet in which to launch the instances.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.ec2Mod.SubnetId] = js.undefined
  
  /**
    * The base64-encoded MIME user data.
    */
  var UserData: js.UndefOr[String] = js.undefined
}
object ScheduledInstancesLaunchSpecification {
  
  inline def apply(ImageId: ImageId): ScheduledInstancesLaunchSpecification = {
    val __obj = js.Dynamic.literal(ImageId = ImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledInstancesLaunchSpecification]
  }
  
  extension [Self <: ScheduledInstancesLaunchSpecification](x: Self) {
    
    inline def setBlockDeviceMappings(value: ScheduledInstancesBlockDeviceMappingSet): Self = StObject.set(x, "BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    inline def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "BlockDeviceMappings", js.undefined)
    
    inline def setBlockDeviceMappingsVarargs(value: ScheduledInstancesBlockDeviceMapping*): Self = StObject.set(x, "BlockDeviceMappings", js.Array(value*))
    
    inline def setEbsOptimized(value: Boolean): Self = StObject.set(x, "EbsOptimized", value.asInstanceOf[js.Any])
    
    inline def setEbsOptimizedUndefined: Self = StObject.set(x, "EbsOptimized", js.undefined)
    
    inline def setIamInstanceProfile(value: ScheduledInstancesIamInstanceProfile): Self = StObject.set(x, "IamInstanceProfile", value.asInstanceOf[js.Any])
    
    inline def setIamInstanceProfileUndefined: Self = StObject.set(x, "IamInstanceProfile", js.undefined)
    
    inline def setImageId(value: ImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setKernelId(value: KernelId): Self = StObject.set(x, "KernelId", value.asInstanceOf[js.Any])
    
    inline def setKernelIdUndefined: Self = StObject.set(x, "KernelId", js.undefined)
    
    inline def setKeyName(value: KeyPairName): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    inline def setKeyNameUndefined: Self = StObject.set(x, "KeyName", js.undefined)
    
    inline def setMonitoring(value: ScheduledInstancesMonitoring): Self = StObject.set(x, "Monitoring", value.asInstanceOf[js.Any])
    
    inline def setMonitoringUndefined: Self = StObject.set(x, "Monitoring", js.undefined)
    
    inline def setNetworkInterfaces(value: ScheduledInstancesNetworkInterfaceSet): Self = StObject.set(x, "NetworkInterfaces", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacesUndefined: Self = StObject.set(x, "NetworkInterfaces", js.undefined)
    
    inline def setNetworkInterfacesVarargs(value: ScheduledInstancesNetworkInterface*): Self = StObject.set(x, "NetworkInterfaces", js.Array(value*))
    
    inline def setPlacement(value: ScheduledInstancesPlacement): Self = StObject.set(x, "Placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "Placement", js.undefined)
    
    inline def setRamdiskId(value: RamdiskId): Self = StObject.set(x, "RamdiskId", value.asInstanceOf[js.Any])
    
    inline def setRamdiskIdUndefined: Self = StObject.set(x, "RamdiskId", js.undefined)
    
    inline def setSecurityGroupIds(value: ScheduledInstancesSecurityGroupIdSet): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    inline def setUserData(value: String): Self = StObject.set(x, "UserData", value.asInstanceOf[js.Any])
    
    inline def setUserDataUndefined: Self = StObject.set(x, "UserData", js.undefined)
  }
}
