package typings.awsSdk.snowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instance extends StObject {
  
  /**
    * The Amazon Machine Image (AMI) launch index, which you can use to find this instance in the launch group. 
    */
  var amiLaunchIndex: js.UndefOr[Integer] = js.undefined
  
  /**
    * Any block device mapping entries for the instance.
    */
  var blockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappingList] = js.undefined
  
  /**
    * The CPU options for the instance.
    */
  var cpuOptions: js.UndefOr[CpuOptions] = js.undefined
  
  /**
    * When the instance was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the AMI used to launch the instance.
    */
  var imageId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the instance.
    */
  var instanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The instance type.
    */
  var instanceType: js.UndefOr[String] = js.undefined
  
  /**
    * The private IPv4 address assigned to the instance.
    */
  var privateIpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The public IPv4 address assigned to the instance.
    */
  var publicIpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The device name of the root device volume (for example, /dev/sda1). 
    */
  var rootDeviceName: js.UndefOr[String] = js.undefined
  
  /**
    * The security groups for the instance.
    */
  var securityGroups: js.UndefOr[SecurityGroupIdentifierList] = js.undefined
  
  var state: js.UndefOr[InstanceState] = js.undefined
  
  /**
    * When the instance was last updated.
    */
  var updatedAt: js.UndefOr[js.Date] = js.undefined
}
object Instance {
  
  inline def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  
  extension [Self <: Instance](x: Self) {
    
    inline def setAmiLaunchIndex(value: Integer): Self = StObject.set(x, "amiLaunchIndex", value.asInstanceOf[js.Any])
    
    inline def setAmiLaunchIndexUndefined: Self = StObject.set(x, "amiLaunchIndex", js.undefined)
    
    inline def setBlockDeviceMappings(value: InstanceBlockDeviceMappingList): Self = StObject.set(x, "blockDeviceMappings", value.asInstanceOf[js.Any])
    
    inline def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "blockDeviceMappings", js.undefined)
    
    inline def setBlockDeviceMappingsVarargs(value: InstanceBlockDeviceMapping*): Self = StObject.set(x, "blockDeviceMappings", js.Array(value*))
    
    inline def setCpuOptions(value: CpuOptions): Self = StObject.set(x, "cpuOptions", value.asInstanceOf[js.Any])
    
    inline def setCpuOptionsUndefined: Self = StObject.set(x, "cpuOptions", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setImageId(value: String): Self = StObject.set(x, "imageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "imageId", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
    
    inline def setPrivateIpAddress(value: String): Self = StObject.set(x, "privateIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressUndefined: Self = StObject.set(x, "privateIpAddress", js.undefined)
    
    inline def setPublicIpAddress(value: String): Self = StObject.set(x, "publicIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPublicIpAddressUndefined: Self = StObject.set(x, "publicIpAddress", js.undefined)
    
    inline def setRootDeviceName(value: String): Self = StObject.set(x, "rootDeviceName", value.asInstanceOf[js.Any])
    
    inline def setRootDeviceNameUndefined: Self = StObject.set(x, "rootDeviceName", js.undefined)
    
    inline def setSecurityGroups(value: SecurityGroupIdentifierList): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: SecurityGroupIdentifier*): Self = StObject.set(x, "securityGroups", js.Array(value*))
    
    inline def setState(value: InstanceState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
