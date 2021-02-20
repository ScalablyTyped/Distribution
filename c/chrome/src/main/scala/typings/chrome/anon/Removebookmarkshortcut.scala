package typings.chrome.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Removebookmarkshortcut extends StObject {
  
  var remove_bookmark_shortcut: js.UndefOr[Boolean] = js.native
  
  var remove_button: js.UndefOr[Boolean] = js.native
}
object Removebookmarkshortcut {
  
  @scala.inline
  def apply(): Removebookmarkshortcut = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Removebookmarkshortcut]
  }
  
  @scala.inline
  implicit class RemovebookmarkshortcutMutableBuilder[Self <: Removebookmarkshortcut] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRemove_bookmark_shortcut(value: Boolean): Self = StObject.set(x, "remove_bookmark_shortcut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove_bookmark_shortcutUndefined: Self = StObject.set(x, "remove_bookmark_shortcut", js.undefined)
    
    @scala.inline
    def setRemove_button(value: Boolean): Self = StObject.set(x, "remove_button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove_buttonUndefined: Self = StObject.set(x, "remove_button", js.undefined)
  }
}
