package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartShotDetectionFilter extends StObject {
  
  /**
    * Specifies the minimum confidence that Amazon Rekognition Video must have in order to return a detected segment. Confidence represents how certain Amazon Rekognition is that a segment is correctly identified. 0 is the lowest confidence. 100 is the highest confidence. Amazon Rekognition Video doesn't return any segments with a confidence level lower than this specified value. If you don't specify MinSegmentConfidence, the GetSegmentDetection returns segments with confidence values greater than or equal to 50 percent.
    */
  var MinSegmentConfidence: js.UndefOr[SegmentConfidence] = js.undefined
}
object StartShotDetectionFilter {
  
  @scala.inline
  def apply(): StartShotDetectionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartShotDetectionFilter]
  }
  
  @scala.inline
  implicit class StartShotDetectionFilterMutableBuilder[Self <: StartShotDetectionFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinSegmentConfidence(value: SegmentConfidence): Self = StObject.set(x, "MinSegmentConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSegmentConfidenceUndefined: Self = StObject.set(x, "MinSegmentConfidence", js.undefined)
  }
}
