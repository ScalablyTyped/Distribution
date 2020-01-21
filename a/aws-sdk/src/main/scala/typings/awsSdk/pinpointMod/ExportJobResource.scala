package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportJobResource extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorized Amazon Pinpoint to access the Amazon S3 location where the endpoint definitions were exported to.
    */
  var RoleArn: string = js.native
  /**
    * The URL of the location in an Amazon Simple Storage Service (Amazon S3) bucket where the endpoint definitions were exported to. This location is typically a folder that contains multiple files. The URL should be in the following format: s3://bucket-name/folder-name/.
    */
  var S3UrlPrefix: string = js.native
  /**
    * The identifier for the segment that the endpoint definitions were exported from. If this value isn't present, Amazon Pinpoint exported definitions for all the endpoints that are associated with the application.
    */
  var SegmentId: js.UndefOr[string] = js.native
  /**
    * The version of the segment that the endpoint definitions were exported from.
    */
  var SegmentVersion: js.UndefOr[integer] = js.native
}

object ExportJobResource {
  @scala.inline
  def apply(
    RoleArn: string,
    S3UrlPrefix: string,
    SegmentId: string = null,
    SegmentVersion: Int | Double = null
  ): ExportJobResource = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], S3UrlPrefix = S3UrlPrefix.asInstanceOf[js.Any])
    if (SegmentId != null) __obj.updateDynamic("SegmentId")(SegmentId.asInstanceOf[js.Any])
    if (SegmentVersion != null) __obj.updateDynamic("SegmentVersion")(SegmentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportJobResource]
  }
}

