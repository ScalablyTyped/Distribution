package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShotSegment extends StObject {
  
  /**
    * The confidence that Amazon Rekognition Video has in the accuracy of the detected segment.
    */
  var Confidence: js.UndefOr[SegmentConfidence] = js.native
  
  /**
    * An Identifier for a shot detection segment detected in a video. 
    */
  var Index: js.UndefOr[ULong] = js.native
}
object ShotSegment {
  
  @scala.inline
  def apply(): ShotSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShotSegment]
  }
  
  @scala.inline
  implicit class ShotSegmentMutableBuilder[Self <: ShotSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: SegmentConfidence): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    @scala.inline
    def setIndex(value: ULong): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "Index", js.undefined)
  }
}
