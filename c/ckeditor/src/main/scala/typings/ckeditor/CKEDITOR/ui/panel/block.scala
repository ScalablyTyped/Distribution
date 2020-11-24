package typings.ckeditor.CKEDITOR.ui.panel

import typings.ckeditor.CKEDITOR.dom.nodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait block extends js.Object {
  
  def getItems(): nodeList = js.native
  
  def markItem(index: Double): Unit = js.native
}
object block {
  
  @scala.inline
  def apply(getItems: () => nodeList, markItem: Double => Unit): block = {
    val __obj = js.Dynamic.literal(getItems = js.Any.fromFunction0(getItems), markItem = js.Any.fromFunction1(markItem))
    __obj.asInstanceOf[block]
  }
  
  @scala.inline
  implicit class blockOps[Self <: block] (val x: Self) extends AnyVal {
    
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
    def setGetItems(value: () => nodeList): Self = this.set("getItems", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMarkItem(value: Double => Unit): Self = this.set("markItem", js.Any.fromFunction1(value))
  }
}
