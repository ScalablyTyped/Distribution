package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoversBodyPart extends StObject {
  
  /**
    * The confidence that Amazon Rekognition has in the value of Value.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  
  /**
    * True if the PPE covers the corresponding body part, otherwise false.
    */
  var Value: js.UndefOr[Boolean] = js.undefined
}
object CoversBodyPart {
  
  @scala.inline
  def apply(): CoversBodyPart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoversBodyPart]
  }
  
  @scala.inline
  implicit class CoversBodyPartMutableBuilder[Self <: CoversBodyPart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    @scala.inline
    def setValue(value: Boolean): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
