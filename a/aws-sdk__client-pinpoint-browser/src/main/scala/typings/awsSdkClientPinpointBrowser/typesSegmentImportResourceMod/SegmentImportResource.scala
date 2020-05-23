package typings.awsSdkClientPinpointBrowser.typesSegmentImportResourceMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.CSV
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.JSON
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentImportResource extends js.Object {
  /**
    * The number of channel types in the imported segment.
    */
  var ChannelCounts: js.UndefOr[StringDictionary[Double] | (Iterable[js.Tuple2[String, Double]])] = js.undefined
  /**
    * (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used by Amazon Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not recommended for IAM roles assumed by Amazon Pinpoint.
    */
  var ExternalId: js.UndefOr[String] = js.undefined
  /**
    * The format of the endpoint files that were imported to create this segment.
    * Valid values: CSV, JSON
    */
  var Format: js.UndefOr[CSV | JSON | String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the endpoints in Amazon S3.
    */
  var RoleArn: js.UndefOr[String] = js.undefined
  /**
    * The URL of the S3 bucket that the segment was imported from.
    */
  var S3Url: js.UndefOr[String] = js.undefined
  /**
    * The number of endpoints that were successfully imported to create this segment.
    */
  var Size: js.UndefOr[Double] = js.undefined
}

object SegmentImportResource {
  @scala.inline
  def apply(
    ChannelCounts: StringDictionary[Double] | (Iterable[js.Tuple2[String, Double]]) = null,
    ExternalId: String = null,
    Format: CSV | JSON | String = null,
    RoleArn: String = null,
    S3Url: String = null,
    Size: js.UndefOr[Double] = js.undefined
  ): SegmentImportResource = {
    val __obj = js.Dynamic.literal()
    if (ChannelCounts != null) __obj.updateDynamic("ChannelCounts")(ChannelCounts.asInstanceOf[js.Any])
    if (ExternalId != null) __obj.updateDynamic("ExternalId")(ExternalId.asInstanceOf[js.Any])
    if (Format != null) __obj.updateDynamic("Format")(Format.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (S3Url != null) __obj.updateDynamic("S3Url")(S3Url.asInstanceOf[js.Any])
    if (!js.isUndefined(Size)) __obj.updateDynamic("Size")(Size.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentImportResource]
  }
}

