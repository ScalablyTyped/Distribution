package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageAriaLegacy extends StObject {
  
  var sSortAscending: js.UndefOr[String] = js.undefined
  
  var sSortDescending: js.UndefOr[String] = js.undefined
}
object LanguageAriaLegacy {
  
  inline def apply(): LanguageAriaLegacy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageAriaLegacy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LanguageAriaLegacy] (val x: Self) extends AnyVal {
    
    inline def setSSortAscending(value: String): Self = StObject.set(x, "sSortAscending", value.asInstanceOf[js.Any])
    
    inline def setSSortAscendingUndefined: Self = StObject.set(x, "sSortAscending", js.undefined)
    
    inline def setSSortDescending(value: String): Self = StObject.set(x, "sSortDescending", value.asInstanceOf[js.Any])
    
    inline def setSSortDescendingUndefined: Self = StObject.set(x, "sSortDescending", js.undefined)
  }
}
