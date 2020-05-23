package typings.awsSdkClientPinpointBrowser.typesImportJobRequestMod

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.CSV
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.JSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportJobRequest extends js.Object {
  /**
    * Sets whether the endpoints create a segment when they are imported.
    */
  var DefineSegment: js.UndefOr[Boolean] = js.undefined
  /**
    * (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used by Amazon Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not recommended for IAM roles assumed by Amazon Pinpoint.
    */
  var ExternalId: js.UndefOr[String] = js.undefined
  /**
    * The format of the files that contain the endpoint definitions.
    * Valid values: CSV, JSON
    */
  var Format: js.UndefOr[CSV | JSON | String] = js.undefined
  /**
    * Sets whether the endpoints are registered with Amazon Pinpoint when they are imported.
    */
  var RegisterEndpoints: js.UndefOr[Boolean] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the Amazon S3 location that contains the endpoints to import.
    */
  var RoleArn: js.UndefOr[String] = js.undefined
  /**
    * The URL of the S3 bucket that contains the segment information to import. The location can be a folder or a single file. The URL should use the following format: s3://bucket-name/folder-name/file-name
    *
    * Amazon Pinpoint imports endpoints from this location and any subfolders it contains.
    */
  var S3Url: js.UndefOr[String] = js.undefined
  /**
    * The ID of the segment to update if the import job is meant to update an existing segment.
    */
  var SegmentId: js.UndefOr[String] = js.undefined
  /**
    * A custom name for the segment created by the import job. Use if DefineSegment is true.
    */
  var SegmentName: js.UndefOr[String] = js.undefined
}

object ImportJobRequest {
  @scala.inline
  def apply(
    DefineSegment: js.UndefOr[Boolean] = js.undefined,
    ExternalId: String = null,
    Format: CSV | JSON | String = null,
    RegisterEndpoints: js.UndefOr[Boolean] = js.undefined,
    RoleArn: String = null,
    S3Url: String = null,
    SegmentId: String = null,
    SegmentName: String = null
  ): ImportJobRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DefineSegment)) __obj.updateDynamic("DefineSegment")(DefineSegment.get.asInstanceOf[js.Any])
    if (ExternalId != null) __obj.updateDynamic("ExternalId")(ExternalId.asInstanceOf[js.Any])
    if (Format != null) __obj.updateDynamic("Format")(Format.asInstanceOf[js.Any])
    if (!js.isUndefined(RegisterEndpoints)) __obj.updateDynamic("RegisterEndpoints")(RegisterEndpoints.get.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (S3Url != null) __obj.updateDynamic("S3Url")(S3Url.asInstanceOf[js.Any])
    if (SegmentId != null) __obj.updateDynamic("SegmentId")(SegmentId.asInstanceOf[js.Any])
    if (SegmentName != null) __obj.updateDynamic("SegmentName")(SegmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportJobRequest]
  }
}

