package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomLabel extends StObject {
  
  /**
    * The confidence that the model has in the detection of the custom label. The range is 0-100. A higher value indicates a higher confidence.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  
  /**
    * The location of the detected object on the image that corresponds to the custom label. Includes an axis aligned coarse bounding box surrounding the object and a finer grain polygon for more accurate spatial information.
    */
  var Geometry: js.UndefOr[typings.awsSdk.rekognitionMod.Geometry] = js.undefined
  
  /**
    * The name of the custom label.
    */
  var Name: js.UndefOr[String] = js.undefined
}
object CustomLabel {
  
  inline def apply(): CustomLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomLabel]
  }
  
  extension [Self <: CustomLabel](x: Self) {
    
    inline def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    inline def setGeometry(value: Geometry): Self = StObject.set(x, "Geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "Geometry", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
