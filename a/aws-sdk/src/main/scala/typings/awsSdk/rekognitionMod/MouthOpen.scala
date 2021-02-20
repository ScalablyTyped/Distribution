package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MouthOpen extends StObject {
  
  /**
    * Level of confidence in the determination.
    */
  var Confidence: js.UndefOr[Percent] = js.native
  
  /**
    * Boolean value that indicates whether the mouth on the face is open or not.
    */
  var Value: js.UndefOr[Boolean] = js.native
}
object MouthOpen {
  
  @scala.inline
  def apply(): MouthOpen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouthOpen]
  }
  
  @scala.inline
  implicit class MouthOpenMutableBuilder[Self <: MouthOpen] (val x: Self) extends AnyVal {
    
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
