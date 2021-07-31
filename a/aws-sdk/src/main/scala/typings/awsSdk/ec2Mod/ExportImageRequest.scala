package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportImageRequest extends StObject {
  
  /**
    * Token to enable idempotency for export image requests.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * A description of the image being exported. The maximum length is 255 characters.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The disk image format.
    */
  var DiskImageFormat: typings.awsSdk.ec2Mod.DiskImageFormat
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the image.
    */
  var ImageId: typings.awsSdk.ec2Mod.ImageId
  
  /**
    * The name of the role that grants VM Import/Export permission to export images to your Amazon S3 bucket. If this parameter is not specified, the default role is named 'vmimport'.
    */
  var RoleName: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the destination Amazon S3 bucket. The bucket must exist and grant WRITE and READ_ACP permissions to the AWS account vm-import-export@amazon.com.
    */
  var S3ExportLocation: ExportTaskS3LocationRequest
  
  /**
    * The tags to apply to the image being exported.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}
object ExportImageRequest {
  
  @scala.inline
  def apply(DiskImageFormat: DiskImageFormat, ImageId: ImageId, S3ExportLocation: ExportTaskS3LocationRequest): ExportImageRequest = {
    val __obj = js.Dynamic.literal(DiskImageFormat = DiskImageFormat.asInstanceOf[js.Any], ImageId = ImageId.asInstanceOf[js.Any], S3ExportLocation = S3ExportLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportImageRequest]
  }
  
  @scala.inline
  implicit class ExportImageRequestMutableBuilder[Self <: ExportImageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDiskImageFormat(value: DiskImageFormat): Self = StObject.set(x, "DiskImageFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setImageId(value: ImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleName(value: String): Self = StObject.set(x, "RoleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleNameUndefined: Self = StObject.set(x, "RoleName", js.undefined)
    
    @scala.inline
    def setS3ExportLocation(value: ExportTaskS3LocationRequest): Self = StObject.set(x, "S3ExportLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value :_*))
  }
}
