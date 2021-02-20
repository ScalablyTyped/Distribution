package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeImagesRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * Scopes the images by users with explicit launch permissions. Specify an AWS account ID, self (the sender of the request), or all (public AMIs).
    */
  var ExecutableUsers: js.UndefOr[ExecutableByStringList] = js.native
  
  /**
    * The filters.    architecture - The image architecture (i386 | x86_64 | arm64).    block-device-mapping.delete-on-termination - A Boolean value that indicates whether the Amazon EBS volume is deleted on instance termination.    block-device-mapping.device-name - The device name specified in the block device mapping (for example, /dev/sdh or xvdh).    block-device-mapping.snapshot-id - The ID of the snapshot used for the EBS volume.    block-device-mapping.volume-size - The volume size of the EBS volume, in GiB.    block-device-mapping.volume-type - The volume type of the EBS volume (gp2 | io1 | io2 | st1 | sc1 | standard).    block-device-mapping.encrypted - A Boolean that indicates whether the EBS volume is encrypted.    description - The description of the image (provided during image creation).    ena-support - A Boolean that indicates whether enhanced networking with ENA is enabled.    hypervisor - The hypervisor type (ovm | xen).    image-id - The ID of the image.    image-type - The image type (machine | kernel | ramdisk).    is-public - A Boolean that indicates whether the image is public.    kernel-id - The kernel ID.    manifest-location - The location of the image manifest.    name - The name of the AMI (provided during image creation).    owner-alias - The owner alias, from an Amazon-maintained list (amazon | aws-marketplace). This is not the user-configured AWS account alias set using the IAM console. We recommend that you use the related parameter instead of this filter.    owner-id - The AWS account ID of the owner. We recommend that you use the related parameter instead of this filter.    platform - The platform. To only list Windows-based AMIs, use windows.    product-code - The product code.    product-code.type - The type of the product code (devpay | marketplace).    ramdisk-id - The RAM disk ID.    root-device-name - The device name of the root device volume (for example, /dev/sda1).    root-device-type - The type of the root device volume (ebs | instance-store).    state - The state of the image (available | pending | failed).    state-reason-code - The reason code for the state change.    state-reason-message - The message for the state change.    sriov-net-support - A value of simple indicates that enhanced networking with the Intel 82599 VF interface is enabled.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    virtualization-type - The virtualization type (paravirtual | hvm).  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The image IDs. Default: Describes all images available to you.
    */
  var ImageIds: js.UndefOr[ImageIdStringList] = js.native
  
  /**
    * Scopes the results to images with the specified owners. You can specify a combination of AWS account IDs, self, amazon, and aws-marketplace. If you omit this parameter, the results include all images for which you have launch permissions, regardless of ownership.
    */
  var Owners: js.UndefOr[OwnerStringList] = js.native
}
object DescribeImagesRequest {
  
  @scala.inline
  def apply(): DescribeImagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImagesRequest]
  }
  
  @scala.inline
  implicit class DescribeImagesRequestMutableBuilder[Self <: DescribeImagesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setExecutableUsers(value: ExecutableByStringList): Self = StObject.set(x, "ExecutableUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutableUsersUndefined: Self = StObject.set(x, "ExecutableUsers", js.undefined)
    
    @scala.inline
    def setExecutableUsersVarargs(value: String*): Self = StObject.set(x, "ExecutableUsers", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setImageIds(value: ImageIdStringList): Self = StObject.set(x, "ImageIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageIdsUndefined: Self = StObject.set(x, "ImageIds", js.undefined)
    
    @scala.inline
    def setImageIdsVarargs(value: ImageId*): Self = StObject.set(x, "ImageIds", js.Array(value :_*))
    
    @scala.inline
    def setOwners(value: OwnerStringList): Self = StObject.set(x, "Owners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnersUndefined: Self = StObject.set(x, "Owners", js.undefined)
    
    @scala.inline
    def setOwnersVarargs(value: String*): Self = StObject.set(x, "Owners", js.Array(value :_*))
  }
}
