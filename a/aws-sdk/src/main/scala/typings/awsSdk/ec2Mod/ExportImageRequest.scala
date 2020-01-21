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
    * A description of the image being exported. The maximum length is 255 bytes.
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
    * The name of the role that grants VM Import/Export permission to export images to your S3 bucket. If this parameter is not specified, the default role is named 'vmimport'.
    */
  var RoleName: js.UndefOr[String] = js.native
  /**
    * Information about the destination S3 bucket. The bucket must exist and grant WRITE and READ_ACP permissions to the AWS account vm-import-export@amazon.com.
    */
  var S3ExportLocation: ExportTaskS3LocationRequest = js.native
}

object ExportImageRequest {
  @scala.inline
  def apply(
    DiskImageFormat: DiskImageFormat,
    ImageId: ImageId,
    S3ExportLocation: ExportTaskS3LocationRequest,
    ClientToken: String = null,
    Description: String = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    RoleName: String = null
  ): ExportImageRequest = {
    val __obj = js.Dynamic.literal(DiskImageFormat = DiskImageFormat.asInstanceOf[js.Any], ImageId = ImageId.asInstanceOf[js.Any], S3ExportLocation = S3ExportLocation.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (RoleName != null) __obj.updateDynamic("RoleName")(RoleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportImageRequest]
  }
}

