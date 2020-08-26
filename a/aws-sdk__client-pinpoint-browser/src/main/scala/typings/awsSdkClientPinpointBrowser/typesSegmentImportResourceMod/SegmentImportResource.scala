package typings.awsSdkClientPinpointBrowser.typesSegmentImportResourceMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.CSV
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.JSON
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentImportResource extends js.Object {
  /**
    * The number of channel types in the imported segment.
    */
  var ChannelCounts: js.UndefOr[StringDictionary[Double] | (Iterable[js.Tuple2[String, Double]])] = js.native
  /**
    * (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used by Amazon Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not recommended for IAM roles assumed by Amazon Pinpoint.
    */
  var ExternalId: js.UndefOr[String] = js.native
  /**
    * The format of the endpoint files that were imported to create this segment.
    * Valid values: CSV, JSON
    */
  var Format: js.UndefOr[CSV | JSON | String] = js.native
  /**
    * The Amazon Resource Name (ARN) of an IAM role that grants Amazon Pinpoint access to the endpoints in Amazon S3.
    */
  var RoleArn: js.UndefOr[String] = js.native
  /**
    * The URL of the S3 bucket that the segment was imported from.
    */
  var S3Url: js.UndefOr[String] = js.native
  /**
    * The number of endpoints that were successfully imported to create this segment.
    */
  var Size: js.UndefOr[Double] = js.native
}

object SegmentImportResource {
  @scala.inline
  def apply(): SegmentImportResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentImportResource]
  }
  @scala.inline
  implicit class SegmentImportResourceOps[Self <: SegmentImportResource] (val x: Self) extends AnyVal {
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
    def setChannelCounts(value: StringDictionary[Double] | (Iterable[js.Tuple2[String, Double]])): Self = this.set("ChannelCounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelCounts: Self = this.set("ChannelCounts", js.undefined)
    @scala.inline
    def setExternalId(value: String): Self = this.set("ExternalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalId: Self = this.set("ExternalId", js.undefined)
    @scala.inline
    def setFormat(value: CSV | JSON | String): Self = this.set("Format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("Format", js.undefined)
    @scala.inline
    def setRoleArn(value: String): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
    @scala.inline
    def setS3Url(value: String): Self = this.set("S3Url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3Url: Self = this.set("S3Url", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("Size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("Size", js.undefined)
  }
  
}

