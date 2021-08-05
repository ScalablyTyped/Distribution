package typings.dateFns.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddSuffixIncludeSeconds extends StObject {
  
  var addSuffix: js.UndefOr[Boolean] = js.undefined
  
  var includeSeconds: js.UndefOr[Boolean] = js.undefined
  
  var locale: js.UndefOr[typings.dateFns.Locale] = js.undefined
}
object AddSuffixIncludeSeconds {
  
  inline def apply(): AddSuffixIncludeSeconds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddSuffixIncludeSeconds]
  }
  
  extension [Self <: AddSuffixIncludeSeconds](x: Self) {
    
    inline def setAddSuffix(value: Boolean): Self = StObject.set(x, "addSuffix", value.asInstanceOf[js.Any])
    
    inline def setAddSuffixUndefined: Self = StObject.set(x, "addSuffix", js.undefined)
    
    inline def setIncludeSeconds(value: Boolean): Self = StObject.set(x, "includeSeconds", value.asInstanceOf[js.Any])
    
    inline def setIncludeSecondsUndefined: Self = StObject.set(x, "includeSeconds", js.undefined)
    
    inline def setLocale(value: typings.dateFns.Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
  }
}
