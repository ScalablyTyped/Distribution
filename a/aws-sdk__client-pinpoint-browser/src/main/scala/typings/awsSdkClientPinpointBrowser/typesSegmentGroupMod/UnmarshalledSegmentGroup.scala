package typings.awsSdkClientPinpointBrowser.typesSegmentGroupMod

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ALL
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ANY
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.NONE
import typings.awsSdkClientPinpointBrowser.typesSegmentDimensionsMod.UnmarshalledSegmentDimensions
import typings.awsSdkClientPinpointBrowser.typesSegmentReferenceMod.UnmarshalledSegmentReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledSegmentGroup extends SegmentGroup {
  /**
    * List of dimensions to include or exclude.
    */
  @JSName("Dimensions")
  var Dimensions_UnmarshalledSegmentGroup: js.UndefOr[js.Array[UnmarshalledSegmentDimensions]] = js.undefined
  /**
    * The base segment that you build your segment on. The source segment defines the starting "universe" of endpoints. When you add dimensions to the segment, it filters the source segment based on the dimensions that you specify. You can specify more than one dimensional segment. You can only specify one imported segment.
    *
    * NOTE: If you specify an imported segment for this attribute, the segment size estimate that appears in the Amazon Pinpoint console shows the size of the imported segment, without any filters applied to it.
    */
  @JSName("SourceSegments")
  var SourceSegments_UnmarshalledSegmentGroup: js.UndefOr[js.Array[UnmarshalledSegmentReference]] = js.undefined
}

object UnmarshalledSegmentGroup {
  @scala.inline
  def apply(
    Dimensions: js.Array[UnmarshalledSegmentDimensions] = null,
    SourceSegments: js.Array[UnmarshalledSegmentReference] = null,
    SourceType: ALL | ANY | NONE | String = null,
    Type: ALL | ANY | NONE | String = null
  ): UnmarshalledSegmentGroup = {
    val __obj = js.Dynamic.literal()
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions.asInstanceOf[js.Any])
    if (SourceSegments != null) __obj.updateDynamic("SourceSegments")(SourceSegments.asInstanceOf[js.Any])
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSegmentGroup]
  }
}

