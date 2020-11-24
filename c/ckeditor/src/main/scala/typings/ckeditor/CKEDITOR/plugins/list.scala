package typings.ckeditor.CKEDITOR.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait list extends js.Object {
  
  def arrayToList(listArray: js.Any, database: js.Any, paragraphMode: js.Any, dir: js.Any): Unit = js.native
  
  def listToArray(
    listNode: js.Any,
    database: js.Any,
    baseArray: js.Any,
    baseIndentLevel: js.Any,
    grandparentNode: js.Any
  ): Unit = js.native
}
object list {
  
  @scala.inline
  def apply(
    arrayToList: (js.Any, js.Any, js.Any, js.Any) => Unit,
    listToArray: (js.Any, js.Any, js.Any, js.Any, js.Any) => Unit
  ): list = {
    val __obj = js.Dynamic.literal(arrayToList = js.Any.fromFunction4(arrayToList), listToArray = js.Any.fromFunction5(listToArray))
    __obj.asInstanceOf[list]
  }
  
  @scala.inline
  implicit class listOps[Self <: list] (val x: Self) extends AnyVal {
    
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
    def setArrayToList(value: (js.Any, js.Any, js.Any, js.Any) => Unit): Self = this.set("arrayToList", js.Any.fromFunction4(value))
    
    @scala.inline
    def setListToArray(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => Unit): Self = this.set("listToArray", js.Any.fromFunction5(value))
  }
}
