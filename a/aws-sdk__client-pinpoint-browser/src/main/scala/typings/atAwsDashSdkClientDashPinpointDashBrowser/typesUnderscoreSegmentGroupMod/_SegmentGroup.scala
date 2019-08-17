package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentGroupMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.ALL
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.ANY
import typings.atAwsDashSdkClientDashPinpointDashBrowser.atAwsDashSdkClientDashPinpointDashBrowserStrings.NONE
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentDimensionsMod._SegmentDimensions
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSegmentReferenceMod._SegmentReference
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SegmentGroup extends js.Object {
  /**
    * List of dimensions to include or exclude.
    */
  var Dimensions: js.UndefOr[js.Array[_SegmentDimensions] | Iterable[_SegmentDimensions]] = js.undefined
  /**
    * The base segment that you build your segment on. The source segment defines the starting "universe" of endpoints. When you add dimensions to the segment, it filters the source segment based on the dimensions that you specify. You can specify more than one dimensional segment. You can only specify one imported segment.
    *
    * NOTE: If you specify an imported segment for this attribute, the segment size estimate that appears in the Amazon Pinpoint console shows the size of the imported segment, without any filters applied to it.
    */
  var SourceSegments: js.UndefOr[js.Array[_SegmentReference] | Iterable[_SegmentReference]] = js.undefined
  /**
    * Specify how to handle multiple source segments. For example, if you specify three source segments, should the resulting segment be based on any or all of the segments? Acceptable values: ANY or ALL.
    */
  var SourceType: js.UndefOr[ALL | ANY | NONE | String] = js.undefined
  /**
    * Specify how to handle multiple segment dimensions. For example, if you specify three dimensions, should the resulting segment include endpoints that are matched by all, any, or none of the dimensions? Acceptable values: ALL, ANY, or NONE.
    */
  var Type: js.UndefOr[ALL | ANY | NONE | String] = js.undefined
}

object _SegmentGroup {
  @scala.inline
  def apply(
    Dimensions: js.Array[_SegmentDimensions] | Iterable[_SegmentDimensions] = null,
    SourceSegments: js.Array[_SegmentReference] | Iterable[_SegmentReference] = null,
    SourceType: ALL | ANY | NONE | String = null,
    Type: ALL | ANY | NONE | String = null
  ): _SegmentGroup = {
    val __obj = js.Dynamic.literal()
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions.asInstanceOf[js.Any])
    if (SourceSegments != null) __obj.updateDynamic("SourceSegments")(SourceSegments.asInstanceOf[js.Any])
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SegmentGroup]
  }
}

