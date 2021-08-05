package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Segment extends StObject {
  
  /**
    * The zero-based index number of the segment. For example, if the total number of segments is 4, SegmentNumber values range from 0 through 3.
    */
  var SegmentNumber: NonNegativeInteger
  
  /**
    * The total number of segments.
    */
  var TotalSegments: TotalSegmentsInteger
}
object Segment {
  
  inline def apply(SegmentNumber: NonNegativeInteger, TotalSegments: TotalSegmentsInteger): Segment = {
    val __obj = js.Dynamic.literal(SegmentNumber = SegmentNumber.asInstanceOf[js.Any], TotalSegments = TotalSegments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Segment]
  }
  
  extension [Self <: Segment](x: Self) {
    
    inline def setSegmentNumber(value: NonNegativeInteger): Self = StObject.set(x, "SegmentNumber", value.asInstanceOf[js.Any])
    
    inline def setTotalSegments(value: TotalSegmentsInteger): Self = StObject.set(x, "TotalSegments", value.asInstanceOf[js.Any])
  }
}
