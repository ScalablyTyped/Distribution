package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageAriaSettings extends StObject {
  
  var paginate: js.UndefOr[LanguagePaginateSettings] = js.undefined
  
  var sortAscending: String
  
  var sortDescending: String
}
object LanguageAriaSettings {
  
  inline def apply(sortAscending: String, sortDescending: String): LanguageAriaSettings = {
    val __obj = js.Dynamic.literal(sortAscending = sortAscending.asInstanceOf[js.Any], sortDescending = sortDescending.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageAriaSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LanguageAriaSettings] (val x: Self) extends AnyVal {
    
    inline def setPaginate(value: LanguagePaginateSettings): Self = StObject.set(x, "paginate", value.asInstanceOf[js.Any])
    
    inline def setPaginateUndefined: Self = StObject.set(x, "paginate", js.undefined)
    
    inline def setSortAscending(value: String): Self = StObject.set(x, "sortAscending", value.asInstanceOf[js.Any])
    
    inline def setSortDescending(value: String): Self = StObject.set(x, "sortDescending", value.asInstanceOf[js.Any])
  }
}
