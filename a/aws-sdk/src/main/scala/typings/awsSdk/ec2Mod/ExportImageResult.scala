package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportImageResult extends js.Object {
  /**
    * A description of the image being exported.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The disk image format for the exported image.
    */
  var DiskImageFormat: js.UndefOr[typings.awsSdk.ec2Mod.DiskImageFormat] = js.native
  /**
    * The ID of the export image task.
    */
  var ExportImageTaskId: js.UndefOr[String] = js.native
  /**
    * The ID of the image.
    */
  var ImageId: js.UndefOr[String] = js.native
  /**
    * The percent complete of the export image task.
    */
  var Progress: js.UndefOr[String] = js.native
  /**
    * The name of the role that grants VM Import/Export permission to export images to your Amazon S3 bucket.
    */
  var RoleName: js.UndefOr[String] = js.native
  /**
    * Information about the destination Amazon S3 bucket.
    */
  var S3ExportLocation: js.UndefOr[ExportTaskS3Location] = js.native
  /**
    * The status of the export image task. The possible values are active, completed, deleting, and deleted.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The status message for the export image task.
    */
  var StatusMessage: js.UndefOr[String] = js.native
  /**
    * Any tags assigned to the image being exported.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object ExportImageResult {
  @scala.inline
  def apply(): ExportImageResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportImageResult]
  }
  @scala.inline
  implicit class ExportImageResultOps[Self <: ExportImageResult] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDiskImageFormat(value: DiskImageFormat): Self = this.set("DiskImageFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskImageFormat: Self = this.set("DiskImageFormat", js.undefined)
    @scala.inline
    def setExportImageTaskId(value: String): Self = this.set("ExportImageTaskId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportImageTaskId: Self = this.set("ExportImageTaskId", js.undefined)
    @scala.inline
    def setImageId(value: String): Self = this.set("ImageId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageId: Self = this.set("ImageId", js.undefined)
    @scala.inline
    def setProgress(value: String): Self = this.set("Progress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgress: Self = this.set("Progress", js.undefined)
    @scala.inline
    def setRoleName(value: String): Self = this.set("RoleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleName: Self = this.set("RoleName", js.undefined)
    @scala.inline
    def setS3ExportLocation(value: ExportTaskS3Location): Self = this.set("S3ExportLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3ExportLocation: Self = this.set("S3ExportLocation", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

