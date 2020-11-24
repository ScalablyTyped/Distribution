package typings.ckeditorCkeditor5Core.mod.editor.utils

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementApi extends js.Object {
  
  val sourceElement: HTMLElement = js.native
  
  def updateSourceElement(): Unit = js.native
}
object ElementApi {
  
  @scala.inline
  def apply(sourceElement: HTMLElement, updateSourceElement: () => Unit): ElementApi = {
    val __obj = js.Dynamic.literal(sourceElement = sourceElement.asInstanceOf[js.Any], updateSourceElement = js.Any.fromFunction0(updateSourceElement))
    __obj.asInstanceOf[ElementApi]
  }
  
  @scala.inline
  implicit class ElementApiOps[Self <: ElementApi] (val x: Self) extends AnyVal {
    
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
    def setSourceElement(value: HTMLElement): Self = this.set("sourceElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateSourceElement(value: () => Unit): Self = this.set("updateSourceElement", js.Any.fromFunction0(value))
  }
}
