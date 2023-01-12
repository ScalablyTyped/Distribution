package typings.dateFns.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delimiter extends StObject {
  
  var delimiter: js.UndefOr[String] = js.undefined
  
  var format: js.UndefOr[js.Array[String]] = js.undefined
  
  var locale: js.UndefOr[typings.dateFns.mod.Locale] = js.undefined
  
  var zero: js.UndefOr[Boolean] = js.undefined
}
object Delimiter {
  
  inline def apply(): Delimiter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delimiter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Delimiter] (val x: Self) extends AnyVal {
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    inline def setFormat(value: js.Array[String]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFormatVarargs(value: String*): Self = StObject.set(x, "format", js.Array(value*))
    
    inline def setLocale(value: typings.dateFns.mod.Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setZero(value: Boolean): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
    
    inline def setZeroUndefined: Self = StObject.set(x, "zero", js.undefined)
  }
}
