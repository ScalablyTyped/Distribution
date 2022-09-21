package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSegmentResponse extends StObject {
  
  /**
    * A structure that contains the complete information about the segment.
    */
  var segment: Segment
}
object GetSegmentResponse {
  
  inline def apply(segment: Segment): GetSegmentResponse = {
    val __obj = js.Dynamic.literal(segment = segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSegmentResponse]
  }
  
  extension [Self <: GetSegmentResponse](x: Self) {
    
    inline def setSegment(value: Segment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
  }
}
