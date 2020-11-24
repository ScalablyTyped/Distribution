package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceAttribute extends js.Object {
  
  /**
    * The block device mapping of the instance.
    */
  var BlockDeviceMappings: js.UndefOr[InstanceBlockDeviceMappingList] = js.native
  
  /**
    * If the value is true, you can't terminate the instance through the Amazon EC2 console, CLI, or API; otherwise, you can.
    */
  var DisableApiTermination: js.UndefOr[AttributeBooleanValue] = js.native
  
  /**
    * Indicates whether the instance is optimized for Amazon EBS I/O.
    */
  var EbsOptimized: js.UndefOr[AttributeBooleanValue] = js.native
  
  /**
    * Indicates whether enhanced networking with ENA is enabled.
    */
  var EnaSupport: js.UndefOr[AttributeBooleanValue] = js.native
  
  /**
    * To enable the instance for AWS Nitro Enclaves, set this parameter to true; otherwise, set it to false.
    */
  var EnclaveOptions: js.UndefOr[typings.awsSdk.ec2Mod.EnclaveOptions] = js.native
  
  /**
    * The security groups associated with the instance.
    */
  var Groups: js.UndefOr[GroupIdentifierList] = js.native
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the operating system command for system shutdown).
    */
  var InstanceInitiatedShutdownBehavior: js.UndefOr[AttributeValue] = js.native
  
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[AttributeValue] = js.native
  
  /**
    * The kernel ID.
    */
  var KernelId: js.UndefOr[AttributeValue] = js.native
  
  /**
    * A list of product codes.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.native
  
  /**
    * The RAM disk ID.
    */
  var RamdiskId: js.UndefOr[AttributeValue] = js.native
  
  /**
    * The device name of the root device volume (for example, /dev/sda1).
    */
  var RootDeviceName: js.UndefOr[AttributeValue] = js.native
  
  /**
    * Indicates whether source/destination checking is enabled. A value of true means that checking is enabled, and false means that checking is disabled. This value must be false for a NAT instance to perform NAT.
    */
  var SourceDestCheck: js.UndefOr[AttributeBooleanValue] = js.native
  
  /**
    * Indicates whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
    */
  var SriovNetSupport: js.UndefOr[AttributeValue] = js.native
  
  /**
    * The user data.
    */
  var UserData: js.UndefOr[AttributeValue] = js.native
}
object InstanceAttribute {
  
  @scala.inline
  def apply(): InstanceAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAttribute]
  }
  
  @scala.inline
  implicit class InstanceAttributeOps[Self <: InstanceAttribute] (val x: Self) extends AnyVal {
    
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
    def setBlockDeviceMappingsVarargs(value: InstanceBlockDeviceMapping*): Self = this.set("BlockDeviceMappings", js.Array(value :_*))
    
    @scala.inline
    def setBlockDeviceMappings(value: InstanceBlockDeviceMappingList): Self = this.set("BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockDeviceMappings: Self = this.set("BlockDeviceMappings", js.undefined)
    
    @scala.inline
    def setDisableApiTermination(value: AttributeBooleanValue): Self = this.set("DisableApiTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableApiTermination: Self = this.set("DisableApiTermination", js.undefined)
    
    @scala.inline
    def setEbsOptimized(value: AttributeBooleanValue): Self = this.set("EbsOptimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEbsOptimized: Self = this.set("EbsOptimized", js.undefined)
    
    @scala.inline
    def setEnaSupport(value: AttributeBooleanValue): Self = this.set("EnaSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnaSupport: Self = this.set("EnaSupport", js.undefined)
    
    @scala.inline
    def setEnclaveOptions(value: EnclaveOptions): Self = this.set("EnclaveOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnclaveOptions: Self = this.set("EnclaveOptions", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: GroupIdentifier*): Self = this.set("Groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: GroupIdentifierList): Self = this.set("Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("Groups", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    
    @scala.inline
    def setInstanceInitiatedShutdownBehavior(value: AttributeValue): Self = this.set("InstanceInitiatedShutdownBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceInitiatedShutdownBehavior: Self = this.set("InstanceInitiatedShutdownBehavior", js.undefined)
    
    @scala.inline
    def setInstanceType(value: AttributeValue): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    
    @scala.inline
    def setKernelId(value: AttributeValue): Self = this.set("KernelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKernelId: Self = this.set("KernelId", js.undefined)
    
    @scala.inline
    def setProductCodesVarargs(value: ProductCode*): Self = this.set("ProductCodes", js.Array(value :_*))
    
    @scala.inline
    def setProductCodes(value: ProductCodeList): Self = this.set("ProductCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductCodes: Self = this.set("ProductCodes", js.undefined)
    
    @scala.inline
    def setRamdiskId(value: AttributeValue): Self = this.set("RamdiskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRamdiskId: Self = this.set("RamdiskId", js.undefined)
    
    @scala.inline
    def setRootDeviceName(value: AttributeValue): Self = this.set("RootDeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootDeviceName: Self = this.set("RootDeviceName", js.undefined)
    
    @scala.inline
    def setSourceDestCheck(value: AttributeBooleanValue): Self = this.set("SourceDestCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceDestCheck: Self = this.set("SourceDestCheck", js.undefined)
    
    @scala.inline
    def setSriovNetSupport(value: AttributeValue): Self = this.set("SriovNetSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSriovNetSupport: Self = this.set("SriovNetSupport", js.undefined)
    
    @scala.inline
    def setUserData(value: AttributeValue): Self = this.set("UserData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserData: Self = this.set("UserData", js.undefined)
  }
}
