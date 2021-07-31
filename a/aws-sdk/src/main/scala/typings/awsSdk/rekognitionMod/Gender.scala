package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gender extends StObject {
  
  /**
    * Level of confidence in the prediction.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  
  /**
    * The predicted gender of the face.
    */
  var Value: js.UndefOr[GenderType] = js.undefined
}
object Gender {
  
  @scala.inline
  def apply(): Gender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gender]
  }
  
  @scala.inline
  implicit class GenderMutableBuilder[Self <: Gender] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    @scala.inline
    def setValue(value: GenderType): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
