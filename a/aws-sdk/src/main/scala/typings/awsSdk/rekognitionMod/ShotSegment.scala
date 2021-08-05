package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShotSegment extends StObject {
  
  /**
    * The confidence that Amazon Rekognition Video has in the accuracy of the detected segment.
    */
  var Confidence: js.UndefOr[SegmentConfidence] = js.undefined
  
  /**
    * An Identifier for a shot detection segment detected in a video. 
    */
  var Index: js.UndefOr[ULong] = js.undefined
}
object ShotSegment {
  
  inline def apply(): ShotSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShotSegment]
  }
  
  extension [Self <: ShotSegment](x: Self) {
    
    inline def setConfidence(value: SegmentConfidence): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    inline def setIndex(value: ULong): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "Index", js.undefined)
  }
}
