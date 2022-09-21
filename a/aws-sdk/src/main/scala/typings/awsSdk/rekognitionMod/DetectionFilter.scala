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
    * Sets the confidence of word detection. Words with detection confidence below this will be excluded from the result. Values should be between 0 and 100. The default MinConfidence is 80.
    */
  var MinConfidence: js.UndefOr[Percent] = js.undefined
}
object DetectionFilter {
  
  inline def apply(): DetectionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectionFilter]
  }
  
  extension [Self <: DetectionFilter](x: Self) {
    
    inline def setMinBoundingBoxHeight(value: BoundingBoxHeight): Self = StObject.set(x, "MinBoundingBoxHeight", value.asInstanceOf[js.Any])
    
    inline def setMinBoundingBoxHeightUndefined: Self = StObject.set(x, "MinBoundingBoxHeight", js.undefined)
    
    inline def setMinBoundingBoxWidth(value: BoundingBoxWidth): Self = StObject.set(x, "MinBoundingBoxWidth", value.asInstanceOf[js.Any])
    
    inline def setMinBoundingBoxWidthUndefined: Self = StObject.set(x, "MinBoundingBoxWidth", js.undefined)
    
    inline def setMinConfidence(value: Percent): Self = StObject.set(x, "MinConfidence", value.asInstanceOf[js.Any])
    
    inline def setMinConfidenceUndefined: Self = StObject.set(x, "MinConfidence", js.undefined)
  }
}
