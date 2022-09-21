package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.after
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.before
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxTextEditorButton extends StObject {
  
  /**
    * Specifies whether to place the button before or after the input text field.
    */
  var location: js.UndefOr[after | before] = js.undefined
  
  /**
    * Specifies the button&apos;s name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Configures the Button UI component used as the action button.
    */
  var options: js.UndefOr[dxButtonOptions] = js.undefined
}
object dxTextEditorButton {
  
  inline def apply(): dxTextEditorButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTextEditorButton]
  }
  
  extension [Self <: dxTextEditorButton](x: Self) {
    
    inline def setLocation(value: after | before): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: dxButtonOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
