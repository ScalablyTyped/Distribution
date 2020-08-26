package typings.awsSdkClientPinpointBrowser.typesSegmentGroupMod

import typings.awsSdkClientPinpointBrowser.typesSegmentDimensionsMod.UnmarshalledSegmentDimensions
import typings.awsSdkClientPinpointBrowser.typesSegmentReferenceMod.UnmarshalledSegmentReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledSegmentGroup extends SegmentGroup {
  /**
    * List of dimensions to include or exclude.
    */
  @JSName("Dimensions")
  var Dimensions_UnmarshalledSegmentGroup: js.UndefOr[js.Array[UnmarshalledSegmentDimensions]] = js.native
  /**
    * The base segment that you build your segment on. The source segment defines the starting "universe" of endpoints. When you add dimensions to the segment, it filters the source segment based on the dimensions that you specify. You can specify more than one dimensional segment. You can only specify one imported segment.
    *
    * NOTE: If you specify an imported segment for this attribute, the segment size estimate that appears in the Amazon Pinpoint console shows the size of the imported segment, without any filters applied to it.
    */
  @JSName("SourceSegments")
  var SourceSegments_UnmarshalledSegmentGroup: js.UndefOr[js.Array[UnmarshalledSegmentReference]] = js.native
}

object UnmarshalledSegmentGroup {
  @scala.inline
  def apply(): UnmarshalledSegmentGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledSegmentGroup]
  }
  @scala.inline
  implicit class UnmarshalledSegmentGroupOps[Self <: UnmarshalledSegmentGroup] (val x: Self) extends AnyVal {
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
    def setDimensionsVarargs(value: UnmarshalledSegmentDimensions*): Self = this.set("Dimensions", js.Array(value :_*))
    @scala.inline
    def setDimensions(value: js.Array[UnmarshalledSegmentDimensions]): Self = this.set("Dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("Dimensions", js.undefined)
    @scala.inline
    def setSourceSegmentsVarargs(value: UnmarshalledSegmentReference*): Self = this.set("SourceSegments", js.Array(value :_*))
    @scala.inline
    def setSourceSegments(value: js.Array[UnmarshalledSegmentReference]): Self = this.set("SourceSegments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceSegments: Self = this.set("SourceSegments", js.undefined)
  }
  
}

