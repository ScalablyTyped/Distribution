package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextDetection extends StObject {
  
  /**
    * The confidence that Amazon Rekognition has in the accuracy of the detected text and the accuracy of the geometry points around the detected text.
    */
  var Confidence: js.UndefOr[Percent] = js.native
  
  /**
    * The word or line of text recognized by Amazon Rekognition. 
    */
  var DetectedText: js.UndefOr[String] = js.native
  
  /**
    * The location of the detected text on the image. Includes an axis aligned coarse bounding box surrounding the text and a finer grain polygon for more accurate spatial information.
    */
  var Geometry: js.UndefOr[typings.awsSdk.rekognitionMod.Geometry] = js.native
  
  /**
    * The identifier for the detected text. The identifier is only unique for a single call to DetectText. 
    */
  var Id: js.UndefOr[UInteger] = js.native
  
  /**
    * The Parent identifier for the detected text identified by the value of ID. If the type of detected text is LINE, the value of ParentId is Null. 
    */
  var ParentId: js.UndefOr[UInteger] = js.native
  
  /**
    * The type of text that was detected.
    */
  var Type: js.UndefOr[TextTypes] = js.native
}
object TextDetection {
  
  @scala.inline
  def apply(): TextDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextDetection]
  }
  
  @scala.inline
  implicit class TextDetectionMutableBuilder[Self <: TextDetection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    @scala.inline
    def setDetectedText(value: String): Self = StObject.set(x, "DetectedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectedTextUndefined: Self = StObject.set(x, "DetectedText", js.undefined)
    
    @scala.inline
    def setGeometry(value: Geometry): Self = StObject.set(x, "Geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryUndefined: Self = StObject.set(x, "Geometry", js.undefined)
    
    @scala.inline
    def setId(value: UInteger): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setParentId(value: UInteger): Self = StObject.set(x, "ParentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentIdUndefined: Self = StObject.set(x, "ParentId", js.undefined)
    
    @scala.inline
    def setType(value: TextTypes): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
