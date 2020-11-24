package typings.ckeditor.CKEDITOR.dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait nodeList extends js.Object {
  
  def count(): Double = js.native
  
  def getItem(index: Double): node = js.native
  
  def toArray(): js.Array[node] = js.native
}
object nodeList {
  
  @scala.inline
  def apply(count: () => Double, getItem: Double => node, toArray: () => js.Array[node]): nodeList = {
    val __obj = js.Dynamic.literal(count = js.Any.fromFunction0(count), getItem = js.Any.fromFunction1(getItem), toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[nodeList]
  }
  
  @scala.inline
  implicit class nodeListOps[Self <: nodeList] (val x: Self) extends AnyVal {
    
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
    def setCount(value: () => Double): Self = this.set("count", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetItem(value: Double => node): Self = this.set("getItem", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToArray(value: () => js.Array[node]): Self = this.set("toArray", js.Any.fromFunction0(value))
  }
}
