package typings.datatablesNetButtons.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageSettings extends StObject {
  
  var buttons: js.UndefOr[js.Object] = js.undefined
}
object LanguageSettings {
  
  @scala.inline
  def apply(): LanguageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageSettings]
  }
  
  @scala.inline
  implicit class LanguageSettingsMutableBuilder[Self <: LanguageSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: js.Object): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
  }
}
