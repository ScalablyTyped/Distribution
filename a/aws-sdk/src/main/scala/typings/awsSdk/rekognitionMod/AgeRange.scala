package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgeRange extends StObject {
  
  /**
    * The highest estimated age.
    */
  var High: js.UndefOr[UInteger] = js.undefined
  
  /**
    * The lowest estimated age.
    */
  var Low: js.UndefOr[UInteger] = js.undefined
}
object AgeRange {
  
  @scala.inline
  def apply(): AgeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgeRange]
  }
  
  @scala.inline
  implicit class AgeRangeMutableBuilder[Self <: AgeRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHigh(value: UInteger): Self = StObject.set(x, "High", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighUndefined: Self = StObject.set(x, "High", js.undefined)
    
    @scala.inline
    def setLow(value: UInteger): Self = StObject.set(x, "Low", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowUndefined: Self = StObject.set(x, "Low", js.undefined)
  }
}
