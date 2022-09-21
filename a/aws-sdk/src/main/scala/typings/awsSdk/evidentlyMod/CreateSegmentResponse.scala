package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSegmentResponse extends StObject {
  
  /**
    * A structure that contains the complete information about the segment that was just created.
    */
  var segment: Segment
}
object CreateSegmentResponse {
  
  inline def apply(segment: Segment): CreateSegmentResponse = {
    val __obj = js.Dynamic.literal(segment = segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSegmentResponse]
  }
  
  extension [Self <: CreateSegmentResponse](x: Self) {
    
    inline def setSegment(value: Segment): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
  }
}
