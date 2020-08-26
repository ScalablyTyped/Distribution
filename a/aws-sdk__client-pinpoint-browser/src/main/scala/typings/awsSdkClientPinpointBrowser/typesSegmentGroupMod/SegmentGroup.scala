package typings.awsSdkClientPinpointBrowser.typesSegmentGroupMod

import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ALL
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ANY
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.NONE
import typings.awsSdkClientPinpointBrowser.typesSegmentDimensionsMod.SegmentDimensions
import typings.awsSdkClientPinpointBrowser.typesSegmentReferenceMod.SegmentReference
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentGroup extends js.Object {
  /**
    * List of dimensions to include or exclude.
    */
  var Dimensions: js.UndefOr[js.Array[SegmentDimensions] | Iterable[SegmentDimensions]] = js.native
  /**
    * The base segment that you build your segment on. The source segment defines the starting "universe" of endpoints. When you add dimensions to the segment, it filters the source segment based on the dimensions that you specify. You can specify more than one dimensional segment. You can only specify one imported segment.
    *
    * NOTE: If you specify an imported segment for this attribute, the segment size estimate that appears in the Amazon Pinpoint console shows the size of the imported segment, without any filters applied to it.
    */
  var SourceSegments: js.UndefOr[js.Array[SegmentReference] | Iterable[SegmentReference]] = js.native
  /**
    * Specify how to handle multiple source segments. For example, if you specify three source segments, should the resulting segment be based on any or all of the segments? Acceptable values: ANY or ALL.
    */
  var SourceType: js.UndefOr[ALL | ANY | NONE | String] = js.native
  /**
    * Specify how to handle multiple segment dimensions. For example, if you specify three dimensions, should the resulting segment include endpoints that are matched by all, any, or none of the dimensions? Acceptable values: ALL, ANY, or NONE.
    */
  var Type: js.UndefOr[ALL | ANY | NONE | String] = js.native
}

object SegmentGroup {
  @scala.inline
  def apply(): SegmentGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentGroup]
  }
  @scala.inline
  implicit class SegmentGroupOps[Self <: SegmentGroup] (val x: Self) extends AnyVal {
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
    def setDimensionsVarargs(value: SegmentDimensions*): Self = this.set("Dimensions", js.Array(value :_*))
    @scala.inline
    def setDimensions(value: js.Array[SegmentDimensions] | Iterable[SegmentDimensions]): Self = this.set("Dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("Dimensions", js.undefined)
    @scala.inline
    def setSourceSegmentsVarargs(value: SegmentReference*): Self = this.set("SourceSegments", js.Array(value :_*))
    @scala.inline
    def setSourceSegments(value: js.Array[SegmentReference] | Iterable[SegmentReference]): Self = this.set("SourceSegments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceSegments: Self = this.set("SourceSegments", js.undefined)
    @scala.inline
    def setSourceType(value: ALL | ANY | NONE | String): Self = this.set("SourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceType: Self = this.set("SourceType", js.undefined)
    @scala.inline
    def setType(value: ALL | ANY | NONE | String): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

