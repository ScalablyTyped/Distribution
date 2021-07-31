package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sunglasses extends StObject {
  
  /**
    * Level of confidence in the determination.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  
  /**
    * Boolean value that indicates whether the face is wearing sunglasses or not.
    */
  var Value: js.UndefOr[Boolean] = js.undefined
}
object Sunglasses {
  
  @scala.inline
  def apply(): Sunglasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sunglasses]
  }
  
  @scala.inline
  implicit class SunglassesMutableBuilder[Self <: Sunglasses] (val x: Self) extends AnyVal {
    
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
