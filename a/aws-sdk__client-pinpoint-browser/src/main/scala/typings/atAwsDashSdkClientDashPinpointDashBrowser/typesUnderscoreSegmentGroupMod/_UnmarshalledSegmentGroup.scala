package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentGroupMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.ALL
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.ANY
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.NONE
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentDimensionsMod._UnmarshalledSegmentDimensions
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentReferenceMod._UnmarshalledSegmentReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledSegmentGroup extends _SegmentGroup {
  /**
    * List of dimensions to include or exclude.
    */
  @JSName("Dimensions")
  var Dimensions__UnmarshalledSegmentGroup: js.UndefOr[js.Array[_UnmarshalledSegmentDimensions]] = js.undefined
  /**
    * The base segment that you build your segment on. The source segment defines the starting "universe" of endpoints. When you add dimensions to the segment, it filters the source segment based on the dimensions that you specify. You can specify more than one dimensional segment. You can only specify one imported segment.
    *
    * NOTE: If you specify an imported segment for this attribute, the segment size estimate that appears in the Amazon Pinpoint console shows the size of the imported segment, without any filters applied to it.
    */
  @JSName("SourceSegments")
  var SourceSegments__UnmarshalledSegmentGroup: js.UndefOr[js.Array[_UnmarshalledSegmentReference]] = js.undefined
}

object _UnmarshalledSegmentGroup {
  @scala.inline
  def apply(
    Dimensions: js.Array[_UnmarshalledSegmentDimensions] = null,
    SourceSegments: js.Array[_UnmarshalledSegmentReference] = null,
    SourceType: ALL | ANY | NONE | String = null,
    Type: ALL | ANY | NONE | String = null
  ): _UnmarshalledSegmentGroup = {
    val __obj = js.Dynamic.literal()
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions)
    if (SourceSegments != null) __obj.updateDynamic("SourceSegments")(SourceSegments)
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledSegmentGroup]
  }
}

