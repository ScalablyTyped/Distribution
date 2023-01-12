package typings.dateFns.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddSuffix extends StObject {
  
  var addSuffix: js.UndefOr[Boolean] = js.undefined
  
  var includeSeconds: js.UndefOr[Boolean] = js.undefined
  
  var locale: js.UndefOr[typings.dateFns.mod.Locale] = js.undefined
}
object AddSuffix {
  
  inline def apply(): AddSuffix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddSuffix]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddSuffix] (val x: Self) extends AnyVal {
    
    inline def setAddSuffix(value: Boolean): Self = StObject.set(x, "addSuffix", value.asInstanceOf[js.Any])
    
    inline def setAddSuffixUndefined: Self = StObject.set(x, "addSuffix", js.undefined)
    
    inline def setIncludeSeconds(value: Boolean): Self = StObject.set(x, "includeSeconds", value.asInstanceOf[js.Any])
    
    inline def setIncludeSecondsUndefined: Self = StObject.set(x, "includeSeconds", js.undefined)
    
    inline def setLocale(value: typings.dateFns.mod.Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
  }
}
