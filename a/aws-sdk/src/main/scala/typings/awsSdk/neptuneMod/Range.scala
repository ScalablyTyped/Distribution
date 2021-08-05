package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Range extends StObject {
  
  /**
    * The minimum value in the range.
    */
  var From: js.UndefOr[Integer] = js.undefined
  
  /**
    * The step value for the range. For example, if you have a range of 5,000 to 10,000, with a step value of 1,000, the valid values start at 5,000 and step up by 1,000. Even though 7,500 is within the range, it isn't a valid value for the range. The valid values are 5,000, 6,000, 7,000, 8,000...
    */
  var Step: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The maximum value in the range.
    */
  var To: js.UndefOr[Integer] = js.undefined
}
object Range {
  
  inline def apply(): Range = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Range]
  }
  
  extension [Self <: Range](x: Self) {
    
    inline def setFrom(value: Integer): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "From", js.undefined)
    
    inline def setStep(value: IntegerOptional): Self = StObject.set(x, "Step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "Step", js.undefined)
    
    inline def setTo(value: Integer): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "To", js.undefined)
  }
}
