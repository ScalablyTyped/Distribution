package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMLDataSplitConfig extends StObject {
  
  /**
    * The validation fraction (optional) is a float that specifies the portion of the training dataset to be used for validation. The default value is 0.2, and values must be greater than 0 and less than 1. We recommend setting this value to be less than 0.5.
    */
  var ValidationFraction: js.UndefOr[typings.awsSdk.sagemakerMod.ValidationFraction] = js.undefined
}
object AutoMLDataSplitConfig {
  
  inline def apply(): AutoMLDataSplitConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMLDataSplitConfig]
  }
  
  extension [Self <: AutoMLDataSplitConfig](x: Self) {
    
    inline def setValidationFraction(value: ValidationFraction): Self = StObject.set(x, "ValidationFraction", value.asInstanceOf[js.Any])
    
    inline def setValidationFractionUndefined: Self = StObject.set(x, "ValidationFraction", js.undefined)
  }
}
