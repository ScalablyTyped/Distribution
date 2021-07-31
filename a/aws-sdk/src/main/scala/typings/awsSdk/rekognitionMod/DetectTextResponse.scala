package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectTextResponse extends StObject {
  
  /**
    * An array of text that was detected in the input image.
    */
  var TextDetections: js.UndefOr[TextDetectionList] = js.undefined
  
  /**
    * The model version used to detect text.
    */
  var TextModelVersion: js.UndefOr[String] = js.undefined
}
object DetectTextResponse {
  
  @scala.inline
  def apply(): DetectTextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectTextResponse]
  }
  
  @scala.inline
  implicit class DetectTextResponseMutableBuilder[Self <: DetectTextResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTextDetections(value: TextDetectionList): Self = StObject.set(x, "TextDetections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDetectionsUndefined: Self = StObject.set(x, "TextDetections", js.undefined)
    
    @scala.inline
    def setTextDetectionsVarargs(value: TextDetection*): Self = StObject.set(x, "TextDetections", js.Array(value :_*))
    
    @scala.inline
    def setTextModelVersion(value: String): Self = StObject.set(x, "TextModelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextModelVersionUndefined: Self = StObject.set(x, "TextModelVersion", js.undefined)
  }
}
