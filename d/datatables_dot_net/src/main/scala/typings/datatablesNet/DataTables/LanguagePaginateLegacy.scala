package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguagePaginateLegacy extends StObject {
  
  var sFirst: js.UndefOr[String] = js.undefined
  
  var sLast: js.UndefOr[String] = js.undefined
  
  var sNext: js.UndefOr[String] = js.undefined
  
  var sPrevious: js.UndefOr[String] = js.undefined
}
object LanguagePaginateLegacy {
  
  inline def apply(): LanguagePaginateLegacy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguagePaginateLegacy]
  }
  
  extension [Self <: LanguagePaginateLegacy](x: Self) {
    
    inline def setSFirst(value: String): Self = StObject.set(x, "sFirst", value.asInstanceOf[js.Any])
    
    inline def setSFirstUndefined: Self = StObject.set(x, "sFirst", js.undefined)
    
    inline def setSLast(value: String): Self = StObject.set(x, "sLast", value.asInstanceOf[js.Any])
    
    inline def setSLastUndefined: Self = StObject.set(x, "sLast", js.undefined)
    
    inline def setSNext(value: String): Self = StObject.set(x, "sNext", value.asInstanceOf[js.Any])
    
    inline def setSNextUndefined: Self = StObject.set(x, "sNext", js.undefined)
    
    inline def setSPrevious(value: String): Self = StObject.set(x, "sPrevious", value.asInstanceOf[js.Any])
    
    inline def setSPreviousUndefined: Self = StObject.set(x, "sPrevious", js.undefined)
  }
}
