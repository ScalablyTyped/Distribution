package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultipleValuesSetting extends StObject {
  
  /**
    * Indicates whether a slot can return multiple values. When true, the slot may return more than one value in a response. When false, the slot returns only a single value. Multi-value slots are only available in the en-US locale. If you set this value to true in any other locale, Amazon Lex throws a ValidationException. If the allowMutlipleValues is not set, the default value is false.
    */
  var allowMultipleValues: js.UndefOr[Boolean] = js.undefined
}
object MultipleValuesSetting {
  
  inline def apply(): MultipleValuesSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultipleValuesSetting]
  }
  
  extension [Self <: MultipleValuesSetting](x: Self) {
    
    inline def setAllowMultipleValues(value: Boolean): Self = StObject.set(x, "allowMultipleValues", value.asInstanceOf[js.Any])
    
    inline def setAllowMultipleValuesUndefined: Self = StObject.set(x, "allowMultipleValues", js.undefined)
  }
}
