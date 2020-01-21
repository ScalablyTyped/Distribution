package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentGroup extends js.Object {
  /**
    * An array that defines the dimensions for the segment.
    */
  var Dimensions: js.UndefOr[ListOfSegmentDimensions] = js.native
  /**
    * The base segment to build the segment on. A base segment, also referred to as a source segment, defines the initial population of endpoints for a segment. When you add dimensions to a segment, Amazon Pinpoint filters the base segment by using the dimensions that you specify. You can specify more than one dimensional segment or only one imported segment. If you specify an imported segment, the Amazon Pinpoint console displays a segment size estimate that indicates the size of the imported segment without any filters applied to it.
    */
  var SourceSegments: js.UndefOr[ListOfSegmentReference] = js.native
  /**
    * Specifies how to handle multiple base segments for the segment. For example, if you specify three base segments for the segment, whether the resulting segment is based on all, any, or none of the base segments.
    */
  var SourceType: js.UndefOr[typings.awsSdk.pinpointMod.SourceType] = js.native
  /**
    * Specifies how to handle multiple dimensions for the segment. For example, if you specify three dimensions for the segment, whether the resulting segment includes endpoints that match all, any, or none of the dimensions.
    */
  var Type: js.UndefOr[typings.awsSdk.pinpointMod.Type] = js.native
}

object SegmentGroup {
  @scala.inline
  def apply(
    Dimensions: ListOfSegmentDimensions = null,
    SourceSegments: ListOfSegmentReference = null,
    SourceType: SourceType = null,
    Type: Type = null
  ): SegmentGroup = {
    val __obj = js.Dynamic.literal()
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions.asInstanceOf[js.Any])
    if (SourceSegments != null) __obj.updateDynamic("SourceSegments")(SourceSegments.asInstanceOf[js.Any])
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentGroup]
  }
}

