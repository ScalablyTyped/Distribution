package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterImageRequest extends js.Object {
  /**
    * The architecture of the AMI. Default: For Amazon EBS-backed AMIs, i386. For instance store-backed AMIs, the architecture specified in the manifest file.
    */
  var Architecture: js.UndefOr[ArchitectureValues] = js.native
  /**
    * The billing product codes. Your account must be authorized to specify billing product codes. Otherwise, you can use the AWS Marketplace to bill for the use of an AMI.
    */
  var BillingProducts: js.UndefOr[BillingProductList] = js.native
  /**
    * The block device mapping entries.
    */
  var BlockDeviceMappings: js.UndefOr[BlockDeviceMappingRequestList] = js.native
  /**
    * A description for your AMI.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * Set to true to enable enhanced networking with ENA for the AMI and any instances that you launch from the AMI. This option is supported only for HVM AMIs. Specifying this option with a PV AMI can make instances launched from the AMI unreachable.
    */
  var EnaSupport: js.UndefOr[Boolean] = js.native
  /**
    * The full path to your AMI manifest in Amazon S3 storage. The specified bucket must have the aws-exec-read canned access control list (ACL) to ensure that it can be accessed by Amazon EC2. For more information, see Canned ACLs in the Amazon S3 Service Developer Guide.
    */
  var ImageLocation: js.UndefOr[String] = js.native
  /**
    * The ID of the kernel.
    */
  var KernelId: js.UndefOr[typings.awsSdk.ec2Mod.KernelId] = js.native
  /**
    * A name for your AMI. Constraints: 3-128 alphanumeric characters, parentheses (()), square brackets ([]), spaces ( ), periods (.), slashes (/), dashes (-), single quotes ('), at-signs (@), or underscores(_)
    */
  var Name: String = js.native
  /**
    * The ID of the RAM disk.
    */
  var RamdiskId: js.UndefOr[typings.awsSdk.ec2Mod.RamdiskId] = js.native
  /**
    * The device name of the root device volume (for example, /dev/sda1).
    */
  var RootDeviceName: js.UndefOr[String] = js.native
  /**
    * Set to simple to enable enhanced networking with the Intel 82599 Virtual Function interface for the AMI and any instances that you launch from the AMI. There is no way to disable sriovNetSupport at this time. This option is supported only for HVM AMIs. Specifying this option with a PV AMI can make instances launched from the AMI unreachable.
    */
  var SriovNetSupport: js.UndefOr[String] = js.native
  /**
    * The type of virtualization (hvm | paravirtual). Default: paravirtual 
    */
  var VirtualizationType: js.UndefOr[String] = js.native
}

object RegisterImageRequest {
  @scala.inline
  def apply(Name: String): RegisterImageRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterImageRequest]
  }
  @scala.inline
  implicit class RegisterImageRequestOps[Self <: RegisterImageRequest] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setArchitecture(value: ArchitectureValues): Self = this.set("Architecture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchitecture: Self = this.set("Architecture", js.undefined)
    @scala.inline
    def setBillingProductsVarargs(value: String*): Self = this.set("BillingProducts", js.Array(value :_*))
    @scala.inline
    def setBillingProducts(value: BillingProductList): Self = this.set("BillingProducts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBillingProducts: Self = this.set("BillingProducts", js.undefined)
    @scala.inline
    def setBlockDeviceMappingsVarargs(value: BlockDeviceMapping*): Self = this.set("BlockDeviceMappings", js.Array(value :_*))
    @scala.inline
    def setBlockDeviceMappings(value: BlockDeviceMappingRequestList): Self = this.set("BlockDeviceMappings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockDeviceMappings: Self = this.set("BlockDeviceMappings", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setEnaSupport(value: Boolean): Self = this.set("EnaSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnaSupport: Self = this.set("EnaSupport", js.undefined)
    @scala.inline
    def setImageLocation(value: String): Self = this.set("ImageLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageLocation: Self = this.set("ImageLocation", js.undefined)
    @scala.inline
    def setKernelId(value: KernelId): Self = this.set("KernelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKernelId: Self = this.set("KernelId", js.undefined)
    @scala.inline
    def setRamdiskId(value: RamdiskId): Self = this.set("RamdiskId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRamdiskId: Self = this.set("RamdiskId", js.undefined)
    @scala.inline
    def setRootDeviceName(value: String): Self = this.set("RootDeviceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootDeviceName: Self = this.set("RootDeviceName", js.undefined)
    @scala.inline
    def setSriovNetSupport(value: String): Self = this.set("SriovNetSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSriovNetSupport: Self = this.set("SriovNetSupport", js.undefined)
    @scala.inline
    def setVirtualizationType(value: String): Self = this.set("VirtualizationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVirtualizationType: Self = this.set("VirtualizationType", js.undefined)
  }
  
}

