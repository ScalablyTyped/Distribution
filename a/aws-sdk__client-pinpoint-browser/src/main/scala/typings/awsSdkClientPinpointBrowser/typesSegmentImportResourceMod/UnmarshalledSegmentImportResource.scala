package typings.awsSdkClientPinpointBrowser.typesSegmentImportResourceMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.CSV
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.JSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledSegmentImportResource extends SegmentImportResource {
  /**
    * The number of channel types in the imported segment.
    */
  @JSName("ChannelCounts")
  var ChannelCounts_UnmarshalledSegmentImportResource: js.UndefOr[StringDictionary[Double]] = js.undefined
}

object UnmarshalledSegmentImportResource {
  @scala.inline
  def apply(
    ChannelCounts: StringDictionary[Double] = null,
    ExternalId: String = null,
    Format: CSV | JSON | String = null,
    RoleArn: String = null,
    S3Url: String = null,
    Size: Int | Double = null
  ): UnmarshalledSegmentImportResource = {
    val __obj = js.Dynamic.literal()
    if (ChannelCounts != null) __obj.updateDynamic("ChannelCounts")(ChannelCounts.asInstanceOf[js.Any])
    if (ExternalId != null) __obj.updateDynamic("ExternalId")(ExternalId.asInstanceOf[js.Any])
    if (Format != null) __obj.updateDynamic("Format")(Format.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (S3Url != null) __obj.updateDynamic("S3Url")(S3Url.asInstanceOf[js.Any])
    if (Size != null) __obj.updateDynamic("Size")(Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSegmentImportResource]
  }
}

