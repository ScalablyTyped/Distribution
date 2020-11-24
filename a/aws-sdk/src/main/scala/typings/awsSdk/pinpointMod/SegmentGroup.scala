package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def setDimensions(value: ListOfSegmentDimensions): Self = this.set("Dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("Dimensions", js.undefined)
    
    @scala.inline
    def setSourceSegmentsVarargs(value: SegmentReference*): Self = this.set("SourceSegments", js.Array(value :_*))
    
    @scala.inline
    def setSourceSegments(value: ListOfSegmentReference): Self = this.set("SourceSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceSegments: Self = this.set("SourceSegments", js.undefined)
    
    @scala.inline
    def setSourceType(value: SourceType): Self = this.set("SourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceType: Self = this.set("SourceType", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
