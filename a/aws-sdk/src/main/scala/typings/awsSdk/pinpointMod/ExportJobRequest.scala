package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportJobRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to access the Amazon S3 location where you want to export endpoint definitions to.
    */
  var RoleArn: string = js.native
  /**
    * The URL of the location in an Amazon Simple Storage Service (Amazon S3) bucket where you want to export endpoint definitions to. This location is typically a folder that contains multiple files. The URL should be in the following format: s3://bucket-name/folder-name/.
    */
  var S3UrlPrefix: string = js.native
  /**
    * The identifier for the segment to export endpoint definitions from. If you don't specify this value, Amazon Pinpoint exports definitions for all the endpoints that are associated with the application.
    */
  var SegmentId: js.UndefOr[string] = js.native
  /**
    * The version of the segment to export endpoint definitions from, if specified.
    */
  var SegmentVersion: js.UndefOr[integer] = js.native
}

object ExportJobRequest {
  @scala.inline
  def apply(
    RoleArn: string,
    S3UrlPrefix: string,
    SegmentId: string = null,
    SegmentVersion: js.UndefOr[integer] = js.undefined
  ): ExportJobRequest = {
    val __obj = js.Dynamic.literal(RoleArn = RoleArn.asInstanceOf[js.Any], S3UrlPrefix = S3UrlPrefix.asInstanceOf[js.Any])
    if (SegmentId != null) __obj.updateDynamic("SegmentId")(SegmentId.asInstanceOf[js.Any])
    if (!js.isUndefined(SegmentVersion)) __obj.updateDynamic("SegmentVersion")(SegmentVersion.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportJobRequest]
  }
}

