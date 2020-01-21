package typings.awsSdkClientPinpointBrowser.typesExportJobResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportJobResource extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the Amazon S3 location that endpoints will be exported to.
    */
  var RoleArn: js.UndefOr[String] = js.undefined
  /**
    * A URL that points to the location within an Amazon S3 bucket that will receive the export. The location is typically a folder with multiple files.
    *
    * The URL should follow this format: s3://bucket-name/folder-name/
    *
    * Amazon Pinpoint will export endpoints to this location.
    */
  var S3UrlPrefix: js.UndefOr[String] = js.undefined
  /**
    * The ID of the segment to export endpoints from. If not present, Amazon Pinpoint exports all of the endpoints that belong to the application.
    */
  var SegmentId: js.UndefOr[String] = js.undefined
  /**
    * The version of the segment to export if specified.
    */
  var SegmentVersion: js.UndefOr[Double] = js.undefined
}

object ExportJobResource {
  @scala.inline
  def apply(
    RoleArn: String = null,
    S3UrlPrefix: String = null,
    SegmentId: String = null,
    SegmentVersion: Int | Double = null
  ): ExportJobResource = {
    val __obj = js.Dynamic.literal()
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (S3UrlPrefix != null) __obj.updateDynamic("S3UrlPrefix")(S3UrlPrefix.asInstanceOf[js.Any])
    if (SegmentId != null) __obj.updateDynamic("SegmentId")(SegmentId.asInstanceOf[js.Any])
    if (SegmentVersion != null) __obj.updateDynamic("SegmentVersion")(SegmentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportJobResource]
  }
}

