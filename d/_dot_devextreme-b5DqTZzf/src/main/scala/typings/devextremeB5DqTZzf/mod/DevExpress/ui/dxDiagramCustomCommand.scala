package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.after
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.before
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.center
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxDiagramCustomCommand extends StObject {
  
  /**
    * Specifies the custom command&apos;s icon.
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * Lists command sub items.
    */
  var items: js.UndefOr[js.Array[dxDiagramCustomCommand]] = js.undefined
  
  /**
    * Specifies a location for the command or separator on the main toolbar.
    */
  var location: js.UndefOr[after | before | center] = js.undefined
  
  /**
    * Specifies the custom command&apos;s identifier.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the custom command&apos;s text and tooltip text.
    */
  var text: js.UndefOr[String] = js.undefined
}
object dxDiagramCustomCommand {
  
  inline def apply(): dxDiagramCustomCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramCustomCommand]
  }
  
  extension [Self <: dxDiagramCustomCommand](x: Self) {
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setItems(value: js.Array[dxDiagramCustomCommand]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: dxDiagramCustomCommand*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLocation(value: after | before | center): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
