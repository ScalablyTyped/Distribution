package typings.dateFns.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Numeric extends StObject {
  
  var locale: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var localeMatcher: js.UndefOr[String] = js.undefined
  
  var numeric: js.UndefOr[String] = js.undefined
  
  var style: js.UndefOr[String] = js.undefined
  
  var unit: js.UndefOr[String] = js.undefined
}
object Numeric {
  
  inline def apply(): Numeric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Numeric]
  }
  
  extension [Self <: Numeric](x: Self) {
    
    inline def setLocale(value: String | js.Array[String]): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleMatcher(value: String): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setLocaleVarargs(value: String*): Self = StObject.set(x, "locale", js.Array(value*))
    
    inline def setNumeric(value: String): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
    
    inline def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
