package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Segment extends StObject {
  
  /**
    * The zero-based index number of the segment. For example, if the total number of segments is 4, SegmentNumber values range from 0 through 3.
    */
  var SegmentNumber: NonNegativeInteger = js.native
  
  /**
    * The total number of segments.
    */
  var TotalSegments: TotalSegmentsInteger = js.native
}
object Segment {
  
  @scala.inline
  def apply(SegmentNumber: NonNegativeInteger, TotalSegments: TotalSegmentsInteger): Segment = {
    val __obj = js.Dynamic.literal(SegmentNumber = SegmentNumber.asInstanceOf[js.Any], TotalSegments = TotalSegments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Segment]
  }
  
  @scala.inline
  implicit class SegmentMutableBuilder[Self <: Segment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSegmentNumber(value: NonNegativeInteger): Self = StObject.set(x, "SegmentNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSegments(value: TotalSegmentsInteger): Self = StObject.set(x, "TotalSegments", value.asInstanceOf[js.Any])
  }
}
