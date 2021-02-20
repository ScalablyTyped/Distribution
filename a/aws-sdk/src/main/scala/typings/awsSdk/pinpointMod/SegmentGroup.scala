package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentGroup extends StObject {
  
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
  implicit class SegmentGroupMutableBuilder[Self <: SegmentGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensions(value: ListOfSegmentDimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    @scala.inline
    def setDimensionsVarargs(value: SegmentDimensions*): Self = StObject.set(x, "Dimensions", js.Array(value :_*))
    
    @scala.inline
    def setSourceSegments(value: ListOfSegmentReference): Self = StObject.set(x, "SourceSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceSegmentsUndefined: Self = StObject.set(x, "SourceSegments", js.undefined)
    
    @scala.inline
    def setSourceSegmentsVarargs(value: SegmentReference*): Self = StObject.set(x, "SourceSegments", js.Array(value :_*))
    
    @scala.inline
    def setSourceType(value: SourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
    
    @scala.inline
    def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
