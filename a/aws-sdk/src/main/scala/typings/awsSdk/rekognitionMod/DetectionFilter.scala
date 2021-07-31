package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectionFilter extends StObject {
  
  /**
    * Sets the minimum height of the word bounding box. Words with bounding box heights lesser than this value will be excluded from the result. Value is relative to the video frame height.
    */
  var MinBoundingBoxHeight: js.UndefOr[BoundingBoxHeight] = js.undefined
  
  /**
    * Sets the minimum width of the word bounding box. Words with bounding boxes widths lesser than this value will be excluded from the result. Value is relative to the video frame width.
    */
  var MinBoundingBoxWidth: js.UndefOr[BoundingBoxWidth] = js.undefined
  
  /**
    * Sets confidence of word detection. Words with detection confidence below this will be excluded from the result. Values should be between 0.5 and 1 as Text in Video will not return any result below 0.5.
    */
  var MinConfidence: js.UndefOr[Percent] = js.undefined
}
object DetectionFilter {
  
  @scala.inline
  def apply(): DetectionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectionFilter]
  }
  
  @scala.inline
  implicit class DetectionFilterMutableBuilder[Self <: DetectionFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinBoundingBoxHeight(value: BoundingBoxHeight): Self = StObject.set(x, "MinBoundingBoxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinBoundingBoxHeightUndefined: Self = StObject.set(x, "MinBoundingBoxHeight", js.undefined)
    
    @scala.inline
    def setMinBoundingBoxWidth(value: BoundingBoxWidth): Self = StObject.set(x, "MinBoundingBoxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinBoundingBoxWidthUndefined: Self = StObject.set(x, "MinBoundingBoxWidth", js.undefined)
    
    @scala.inline
    def setMinConfidence(value: Percent): Self = StObject.set(x, "MinConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinConfidenceUndefined: Self = StObject.set(x, "MinConfidence", js.undefined)
  }
}
