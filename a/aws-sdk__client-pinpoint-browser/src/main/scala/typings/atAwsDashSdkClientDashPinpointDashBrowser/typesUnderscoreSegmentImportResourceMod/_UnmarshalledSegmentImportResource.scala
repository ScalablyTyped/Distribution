package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentImportResourceMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.CSV
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.JSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledSegmentImportResource extends _SegmentImportResource {
  /**
    * The number of channel types in the imported segment.
    */
  @JSName("ChannelCounts")
  var ChannelCounts__UnmarshalledSegmentImportResource: js.UndefOr[StringDictionary[Double]] = js.undefined
}

object _UnmarshalledSegmentImportResource {
  @scala.inline
  def apply(
    ChannelCounts: StringDictionary[Double] = null,
    ExternalId: String = null,
    Format: CSV | JSON | String = null,
    RoleArn: String = null,
    S3Url: String = null,
    Size: Int | Double = null
  ): _UnmarshalledSegmentImportResource = {
    val __obj = js.Dynamic.literal()
    if (ChannelCounts != null) __obj.updateDynamic("ChannelCounts")(ChannelCounts)
    if (ExternalId != null) __obj.updateDynamic("ExternalId")(ExternalId)
    if (Format != null) __obj.updateDynamic("Format")(Format.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    if (S3Url != null) __obj.updateDynamic("S3Url")(S3Url)
    if (Size != null) __obj.updateDynamic("Size")(Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledSegmentImportResource]
  }
}

