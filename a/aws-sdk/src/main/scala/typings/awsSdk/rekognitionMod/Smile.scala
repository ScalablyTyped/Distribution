package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Smile extends StObject {
  
  /**
    * Level of confidence in the determination.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  
  /**
    * Boolean value that indicates whether the face is smiling or not.
    */
  var Value: js.UndefOr[Boolean] = js.undefined
}
object Smile {
  
  @scala.inline
  def apply(): Smile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Smile]
  }
  
  @scala.inline
  implicit class SmileMutableBuilder[Self <: Smile] (val x: Self) extends AnyVal {
    
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
