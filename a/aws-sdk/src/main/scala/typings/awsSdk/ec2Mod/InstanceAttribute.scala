package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceAttribute extends StObject {
  
  /**
    * The block device mapping of the instance.
    */
  var BlockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappingList] = js.undefined
  
  /**
    * If the value is true, you can't terminate the instance through the Amazon EC2 console, CLI, or API; otherwise, you can.
    */
  var DisableApiTermination: js.UndefOr[AttributeBooleanValue] = js.undefined
  
  /**
    * Indicates whether the instance is optimized for Amazon EBS I/O.
    */
  var EbsOptimized: js.UndefOr[AttributeBooleanValue] = js.undefined
  
  /**
    * Indicates whether enhanced networking with ENA is enabled.
    */
  var EnaSupport: js.UndefOr[AttributeBooleanValue] = js.undefined
  
  /**
    * To enable the instance for AWS Nitro Enclaves, set this parameter to true; otherwise, set it to false.
    */
  var EnclaveOptions: js.UndefOr[typings.awsSdk.ec2Mod.EnclaveOptions] = js.undefined
  
  /**
    * The security groups associated with the instance.
    */
  var Groups: js.UndefOr[GroupIdentifierList] = js.undefined
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the operating system command for system shutdown).
    */
  var InstanceInitiatedShutdownBehavior: js.UndefOr[AttributeValue] = js.undefined
  
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[AttributeValue] = js.undefined
  
  /**
    * The kernel ID.
    */
  var KernelId: js.UndefOr[AttributeValue] = js.undefined
  
  /**
    * A list of product codes.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.undefined
  
  /**
    * The RAM disk ID.
    */
  var RamdiskId: js.UndefOr[AttributeValue] = js.undefined
  
  /**
    * The device name of the root device volume (for example, /dev/sda1).
    */
  var RootDeviceName: js.UndefOr[AttributeValue] = js.undefined
  
  /**
    * Indicates whether source/destination checking is enabled. A value of true means that checking is enabled, and false means that checking is disabled. This value must be false for a NAT instance to perform NAT.
    */
  var SourceDestCheck: js.UndefOr[AttributeBooleanValue] = js.undefined
  
  /**
    * Indicates whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
    */
  var SriovNetSupport: js.UndefOr[AttributeValue] = js.undefined
  
  /**
    * The user data.
    */
  var UserData: js.UndefOr[AttributeValue] = js.undefined
}
object InstanceAttribute {
  
  inline def apply(): InstanceAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAttribute]
  }
  
  extension [Self <: InstanceAttribute](x: Self) {
    
    inline def setBlockDeviceMappings(value: InstanceBlockDeviceMappingList): Self = StObject.set(x, "BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    inline def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "BlockDeviceMappings", js.undefined)
    
    inline def setBlockDeviceMappingsVarargs(value: InstanceBlockDeviceMapping*): Self = StObject.set(x, "BlockDeviceMappings", js.Array(value :_*))
    
    inline def setDisableApiTermination(value: AttributeBooleanValue): Self = StObject.set(x, "DisableApiTermination", value.asInstanceOf[js.Any])
    
    inline def setDisableApiTerminationUndefined: Self = StObject.set(x, "DisableApiTermination", js.undefined)
    
    inline def setEbsOptimized(value: AttributeBooleanValue): Self = StObject.set(x, "EbsOptimized", value.asInstanceOf[js.Any])
    
    inline def setEbsOptimizedUndefined: Self = StObject.set(x, "EbsOptimized", js.undefined)
    
    inline def setEnaSupport(value: AttributeBooleanValue): Self = StObject.set(x, "EnaSupport", value.asInstanceOf[js.Any])
    
    inline def setEnaSupportUndefined: Self = StObject.set(x, "EnaSupport", js.undefined)
    
    inline def setEnclaveOptions(value: EnclaveOptions): Self = StObject.set(x, "EnclaveOptions", value.asInstanceOf[js.Any])
    
    inline def setEnclaveOptionsUndefined: Self = StObject.set(x, "EnclaveOptions", js.undefined)
    
    inline def setGroups(value: GroupIdentifierList): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    inline def setGroupsVarargs(value: GroupIdentifier*): Self = StObject.set(x, "Groups", js.Array(value :_*))
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setInstanceInitiatedShutdownBehavior(value: AttributeValue): Self = StObject.set(x, "InstanceInitiatedShutdownBehavior", value.asInstanceOf[js.Any])
    
    inline def setInstanceInitiatedShutdownBehaviorUndefined: Self = StObject.set(x, "InstanceInitiatedShutdownBehavior", js.undefined)
    
    inline def setInstanceType(value: AttributeValue): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setKernelId(value: AttributeValue): Self = StObject.set(x, "KernelId", value.asInstanceOf[js.Any])
    
    inline def setKernelIdUndefined: Self = StObject.set(x, "KernelId", js.undefined)
    
    inline def setProductCodes(value: ProductCodeList): Self = StObject.set(x, "ProductCodes", value.asInstanceOf[js.Any])
    
    inline def setProductCodesUndefined: Self = StObject.set(x, "ProductCodes", js.undefined)
    
    inline def setProductCodesVarargs(value: ProductCode*): Self = StObject.set(x, "ProductCodes", js.Array(value :_*))
    
    inline def setRamdiskId(value: AttributeValue): Self = StObject.set(x, "RamdiskId", value.asInstanceOf[js.Any])
    
    inline def setRamdiskIdUndefined: Self = StObject.set(x, "RamdiskId", js.undefined)
    
    inline def setRootDeviceName(value: AttributeValue): Self = StObject.set(x, "RootDeviceName", value.asInstanceOf[js.Any])
    
    inline def setRootDeviceNameUndefined: Self = StObject.set(x, "RootDeviceName", js.undefined)
    
    inline def setSourceDestCheck(value: AttributeBooleanValue): Self = StObject.set(x, "SourceDestCheck", value.asInstanceOf[js.Any])
    
    inline def setSourceDestCheckUndefined: Self = StObject.set(x, "SourceDestCheck", js.undefined)
    
    inline def setSriovNetSupport(value: AttributeValue): Self = StObject.set(x, "SriovNetSupport", value.asInstanceOf[js.Any])
    
    inline def setSriovNetSupportUndefined: Self = StObject.set(x, "SriovNetSupport", js.undefined)
    
    inline def setUserData(value: AttributeValue): Self = StObject.set(x, "UserData", value.asInstanceOf[js.Any])
    
    inline def setUserDataUndefined: Self = StObject.set(x, "UserData", js.undefined)
  }
}
