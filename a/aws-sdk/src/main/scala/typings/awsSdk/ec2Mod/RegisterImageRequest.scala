package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterImageRequest extends StObject {
  
  /**
    * The architecture of the AMI. Default: For Amazon EBS-backed AMIs, i386. For instance store-backed AMIs, the architecture specified in the manifest file.
    */
  var Architecture: js.UndefOr[ArchitectureValues] = js.undefined
  
  /**
    * The billing product codes. Your account must be authorized to specify billing product codes. Otherwise, you can use the Amazon Web Services Marketplace to bill for the use of an AMI.
    */
  var BillingProducts: js.UndefOr[BillingProductList] = js.undefined
  
  /**
    * The block device mapping entries. If you specify an Amazon EBS volume using the ID of an Amazon EBS snapshot, you can't specify the encryption state of the volume. If you create an AMI on an Outpost, then all backing snapshots must be on the same Outpost or in the Region of that Outpost. AMIs on an Outpost that include local snapshots can be used to launch instances on the same Outpost only. For more information,  Amazon EBS local snapshots on Outposts in the Amazon Elastic Compute Cloud User Guide.
    */
  var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingRequestList] = js.undefined
  
  /**
    * The boot mode of the AMI. For more information, see Boot modes in the Amazon Elastic Compute Cloud User Guide.
    */
  var BootMode: js.UndefOr[BootModeValues] = js.undefined
  
  /**
    * A description for your AMI.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set to true to enable enhanced networking with ENA for the AMI and any instances that you launch from the AMI. This option is supported only for HVM AMIs. Specifying this option with a PV AMI can make instances launched from the AMI unreachable.
    */
  var EnaSupport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The full path to your AMI manifest in Amazon S3 storage. The specified bucket must have the aws-exec-read canned access control list (ACL) to ensure that it can be accessed by Amazon EC2. For more information, see Canned ACLs in the Amazon S3 Service Developer Guide.
    */
  var ImageLocation: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the kernel.
    */
  var KernelId: js.UndefOr[typings.awsSdk.ec2Mod.KernelId] = js.undefined
  
  /**
    * A name for your AMI. Constraints: 3-128 alphanumeric characters, parentheses (()), square brackets ([]), spaces ( ), periods (.), slashes (/), dashes (-), single quotes ('), at-signs (@), or underscores(_)
    */
  var Name: String
  
  /**
    * The ID of the RAM disk.
    */
  var RamdiskId: js.UndefOr[typings.awsSdk.ec2Mod.RamdiskId] = js.undefined
  
  /**
    * The device name of the root device volume (for example, /dev/sda1).
    */
  var RootDeviceName: js.UndefOr[String] = js.undefined
  
  /**
    * Set to simple to enable enhanced networking with the Intel 82599 Virtual Function interface for the AMI and any instances that you launch from the AMI. There is no way to disable sriovNetSupport at this time. This option is supported only for HVM AMIs. Specifying this option with a PV AMI can make instances launched from the AMI unreachable.
    */
  var SriovNetSupport: js.UndefOr[String] = js.undefined
  
  /**
    * Set to v2.0 to enable Trusted Platform Module (TPM) support. For more information, see NitroTPM in the Amazon Elastic Compute Cloud User Guide.
    */
  var TpmSupport: js.UndefOr[TpmSupportValues] = js.undefined
  
  /**
    * Base64 representation of the non-volatile UEFI variable store. To retrieve the UEFI data, use the GetInstanceUefiData command. You can inspect and modify the UEFI data by using the python-uefivars tool on GitHub. For more information, see UEFI Secure Boot in the Amazon Elastic Compute Cloud User Guide.
    */
  var UefiData: js.UndefOr[StringType] = js.undefined
  
  /**
    * The type of virtualization (hvm | paravirtual). Default: paravirtual 
    */
  var VirtualizationType: js.UndefOr[String] = js.undefined
}
object RegisterImageRequest {
  
  inline def apply(Name: String): RegisterImageRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterImageRequest]
  }
  
  extension [Self <: RegisterImageRequest](x: Self) {
    
    inline def setArchitecture(value: ArchitectureValues): Self = StObject.set(x, "Architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "Architecture", js.undefined)
    
    inline def setBillingProducts(value: BillingProductList): Self = StObject.set(x, "BillingProducts", value.asInstanceOf[js.Any])
    
    inline def setBillingProductsUndefined: Self = StObject.set(x, "BillingProducts", js.undefined)
    
    inline def setBillingProductsVarargs(value: String*): Self = StObject.set(x, "BillingProducts", js.Array(value*))
    
    inline def setBlockDeviceMappings(value: BlockDeviceMappingRequestList): Self = StObject.set(x, "BlockDeviceMappings", value.asInstanceOf[js.Any])
    
    inline def setBlockDeviceMappingsUndefined: Self = StObject.set(x, "BlockDeviceMappings", js.undefined)
    
    inline def setBlockDeviceMappingsVarargs(value: BlockDeviceMapping*): Self = StObject.set(x, "BlockDeviceMappings", js.Array(value*))
    
    inline def setBootMode(value: BootModeValues): Self = StObject.set(x, "BootMode", value.asInstanceOf[js.Any])
    
    inline def setBootModeUndefined: Self = StObject.set(x, "BootMode", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setEnaSupport(value: Boolean): Self = StObject.set(x, "EnaSupport", value.asInstanceOf[js.Any])
    
    inline def setEnaSupportUndefined: Self = StObject.set(x, "EnaSupport", js.undefined)
    
    inline def setImageLocation(value: String): Self = StObject.set(x, "ImageLocation", value.asInstanceOf[js.Any])
    
    inline def setImageLocationUndefined: Self = StObject.set(x, "ImageLocation", js.undefined)
    
    inline def setKernelId(value: KernelId): Self = StObject.set(x, "KernelId", value.asInstanceOf[js.Any])
    
    inline def setKernelIdUndefined: Self = StObject.set(x, "KernelId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRamdiskId(value: RamdiskId): Self = StObject.set(x, "RamdiskId", value.asInstanceOf[js.Any])
    
    inline def setRamdiskIdUndefined: Self = StObject.set(x, "RamdiskId", js.undefined)
    
    inline def setRootDeviceName(value: String): Self = StObject.set(x, "RootDeviceName", value.asInstanceOf[js.Any])
    
    inline def setRootDeviceNameUndefined: Self = StObject.set(x, "RootDeviceName", js.undefined)
    
    inline def setSriovNetSupport(value: String): Self = StObject.set(x, "SriovNetSupport", value.asInstanceOf[js.Any])
    
    inline def setSriovNetSupportUndefined: Self = StObject.set(x, "SriovNetSupport", js.undefined)
    
    inline def setTpmSupport(value: TpmSupportValues): Self = StObject.set(x, "TpmSupport", value.asInstanceOf[js.Any])
    
    inline def setTpmSupportUndefined: Self = StObject.set(x, "TpmSupport", js.undefined)
    
    inline def setUefiData(value: StringType): Self = StObject.set(x, "UefiData", value.asInstanceOf[js.Any])
    
    inline def setUefiDataUndefined: Self = StObject.set(x, "UefiData", js.undefined)
    
    inline def setVirtualizationType(value: String): Self = StObject.set(x, "VirtualizationType", value.asInstanceOf[js.Any])
    
    inline def setVirtualizationTypeUndefined: Self = StObject.set(x, "VirtualizationType", js.undefined)
  }
}
