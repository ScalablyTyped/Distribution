package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageAriaSettings extends StObject {
  
  var paginate: js.UndefOr[LanguagePaginateSettings] = js.native
  
  var sortAscending: String = js.native
  
  var sortDescending: String = js.native
}
object LanguageAriaSettings {
  
  @scala.inline
  def apply(sortAscending: String, sortDescending: String): LanguageAriaSettings = {
    val __obj = js.Dynamic.literal(sortAscending = sortAscending.asInstanceOf[js.Any], sortDescending = sortDescending.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageAriaSettings]
  }
  
  @scala.inline
  implicit class LanguageAriaSettingsMutableBuilder[Self <: LanguageAriaSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaginate(value: LanguagePaginateSettings): Self = StObject.set(x, "paginate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaginateUndefined: Self = StObject.set(x, "paginate", js.undefined)
    
    @scala.inline
    def setSortAscending(value: String): Self = StObject.set(x, "sortAscending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortDescending(value: String): Self = StObject.set(x, "sortDescending", value.asInstanceOf[js.Any])
  }
}
