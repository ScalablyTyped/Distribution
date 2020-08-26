package typings.awsSdkClientPinpointBrowser.typesExportJobResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportJobResource extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the Amazon S3 location that endpoints will be exported to.
    */
  var RoleArn: js.UndefOr[String] = js.native
  /**
    * A URL that points to the location within an Amazon S3 bucket that will receive the export. The location is typically a folder with multiple files.
    *
    * The URL should follow this format: s3://bucket-name/folder-name/
    *
    * Amazon Pinpoint will export endpoints to this location.
    */
  var S3UrlPrefix: js.UndefOr[String] = js.native
  /**
    * The ID of the segment to export endpoints from. If not present, Amazon Pinpoint exports all of the endpoints that belong to the application.
    */
  var SegmentId: js.UndefOr[String] = js.native
  /**
    * The version of the segment to export if specified.
    */
  var SegmentVersion: js.UndefOr[Double] = js.native
}

object ExportJobResource {
  @scala.inline
  def apply(): ExportJobResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportJobResource]
  }
  @scala.inline
  implicit class ExportJobResourceOps[Self <: ExportJobResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRoleArn(value: String): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
    @scala.inline
    def setS3UrlPrefix(value: String): Self = this.set("S3UrlPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3UrlPrefix: Self = this.set("S3UrlPrefix", js.undefined)
    @scala.inline
    def setSegmentId(value: String): Self = this.set("SegmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentId: Self = this.set("SegmentId", js.undefined)
    @scala.inline
    def setSegmentVersion(value: Double): Self = this.set("SegmentVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSegmentVersion: Self = this.set("SegmentVersion", js.undefined)
  }
  
}

