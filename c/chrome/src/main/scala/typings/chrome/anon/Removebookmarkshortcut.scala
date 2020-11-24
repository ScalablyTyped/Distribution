package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Removebookmarkshortcut extends js.Object {
  
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
  implicit class RemovebookmarkshortcutOps[Self <: Removebookmarkshortcut] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRemove_bookmark_shortcut(value: Boolean): Self = this.set("remove_bookmark_shortcut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove_bookmark_shortcut: Self = this.set("remove_bookmark_shortcut", js.undefined)
    
    @scala.inline
    def setRemove_button(value: Boolean): Self = this.set("remove_button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove_button: Self = this.set("remove_button", js.undefined)
  }
}
