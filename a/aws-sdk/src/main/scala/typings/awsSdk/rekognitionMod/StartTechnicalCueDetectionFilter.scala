package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTechnicalCueDetectionFilter extends StObject {
  
  /**
    * Specifies the minimum confidence that Amazon Rekognition Video must have in order to return a detected segment. Confidence represents how certain Amazon Rekognition is that a segment is correctly identified. 0 is the lowest confidence. 100 is the highest confidence. Amazon Rekognition Video doesn't return any segments with a confidence level lower than this specified value. If you don't specify MinSegmentConfidence, GetSegmentDetection returns segments with confidence values greater than or equal to 50 percent.
    */
  var MinSegmentConfidence: js.UndefOr[SegmentConfidence] = js.undefined
}
object StartTechnicalCueDetectionFilter {
  
  inline def apply(): StartTechnicalCueDetectionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTechnicalCueDetectionFilter]
  }
  
  extension [Self <: StartTechnicalCueDetectionFilter](x: Self) {
    
    inline def setMinSegmentConfidence(value: SegmentConfidence): Self = StObject.set(x, "MinSegmentConfidence", value.asInstanceOf[js.Any])
    
    inline def setMinSegmentConfidenceUndefined: Self = StObject.set(x, "MinSegmentConfidence", js.undefined)
  }
}
