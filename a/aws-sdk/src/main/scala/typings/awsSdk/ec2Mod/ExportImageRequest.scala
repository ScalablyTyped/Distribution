package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportImageRequest extends js.Object {
  /**
    * Token to enable idempotency for export image requests.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * A description of the image being exported. The maximum length is 255 characters.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The disk image format.
    */
  var DiskImageFormat: typings.awsSdk.ec2Mod.DiskImageFormat = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the image.
    */
  var ImageId: typings.awsSdk.ec2Mod.ImageId = js.native
  /**
    * The name of the role that grants VM Import/Export permission to export images to your Amazon S3 bucket. If this parameter is not specified, the default role is named 'vmimport'.
    */
  var RoleName: js.UndefOr[String] = js.native
  /**
    * Information about the destination Amazon S3 bucket. The bucket must exist and grant WRITE and READ_ACP permissions to the AWS account vm-import-export@amazon.com.
    */
  var S3ExportLocation: ExportTaskS3LocationRequest = js.native
  /**
    * The tags to apply to the image being exported.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
}

object ExportImageRequest {
  @scala.inline
  def apply(DiskImageFormat: DiskImageFormat, ImageId: ImageId, S3ExportLocation: ExportTaskS3LocationRequest): ExportImageRequest = {
    val __obj = js.Dynamic.literal(DiskImageFormat = DiskImageFormat.asInstanceOf[js.Any], ImageId = ImageId.asInstanceOf[js.Any], S3ExportLocation = S3ExportLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportImageRequest]
  }
  @scala.inline
  implicit class ExportImageRequestOps[Self <: ExportImageRequest] (val x: Self) extends AnyVal {
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
    def setDiskImageFormat(value: DiskImageFormat): Self = this.set("DiskImageFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageId(value: ImageId): Self = this.set("ImageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setS3ExportLocation(value: ExportTaskS3LocationRequest): Self = this.set("S3ExportLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientToken(value: String): Self = this.set("ClientToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientToken: Self = this.set("ClientToken", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setRoleName(value: String): Self = this.set("RoleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleName: Self = this.set("RoleName", js.undefined)
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = this.set("TagSpecifications", js.Array(value :_*))
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = this.set("TagSpecifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagSpecifications: Self = this.set("TagSpecifications", js.undefined)
  }
  
}

