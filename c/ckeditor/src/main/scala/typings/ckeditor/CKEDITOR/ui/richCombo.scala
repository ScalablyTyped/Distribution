package typings.ckeditor.CKEDITOR.ui

import typings.ckeditor.CKEDITOR.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait richCombo extends js.Object {
  
  def render(editor: editor, output: js.Array[String]): Unit = js.native
}
object richCombo {
  
  @scala.inline
  def apply(render: (editor, js.Array[String]) => Unit): richCombo = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction2(render))
    __obj.asInstanceOf[richCombo]
  }
  
  @scala.inline
  implicit class richComboOps[Self <: richCombo] (val x: Self) extends AnyVal {
    
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
    def setRender(value: (editor, js.Array[String]) => Unit): Self = this.set("render", js.Any.fromFunction2(value))
  }
}
