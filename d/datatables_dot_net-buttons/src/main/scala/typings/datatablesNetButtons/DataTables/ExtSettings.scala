package typings.datatablesNetButtons.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtSettings extends StObject {
  
  var buttons: ExtButtonsSettings
}
object ExtSettings {
  
  inline def apply(buttons: ExtButtonsSettings): ExtSettings = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtSettings]
  }
  
  extension [Self <: ExtSettings](x: Self) {
    
    inline def setButtons(value: ExtButtonsSettings): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
  }
}
