package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Removebookmarkshortcut extends StObject {
  
  var remove_bookmark_shortcut: js.UndefOr[Boolean] = js.undefined
  
  var remove_button: js.UndefOr[Boolean] = js.undefined
}
object Removebookmarkshortcut {
  
  inline def apply(): Removebookmarkshortcut = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Removebookmarkshortcut]
  }
  
  extension [Self <: Removebookmarkshortcut](x: Self) {
    
    inline def setRemove_bookmark_shortcut(value: Boolean): Self = StObject.set(x, "remove_bookmark_shortcut", value.asInstanceOf[js.Any])
    
    inline def setRemove_bookmark_shortcutUndefined: Self = StObject.set(x, "remove_bookmark_shortcut", js.undefined)
    
    inline def setRemove_button(value: Boolean): Self = StObject.set(x, "remove_button", value.asInstanceOf[js.Any])
    
    inline def setRemove_buttonUndefined: Self = StObject.set(x, "remove_button", js.undefined)
  }
}
