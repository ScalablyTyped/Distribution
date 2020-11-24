package typings.badgin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Interface extends js.Object {
  
  def clear(): Unit = js.native
  
  def set(value: Value): Unit = js.native
}
object Interface {
  
  @scala.inline
  def apply(clear: () => Unit, set: Value => Unit): Interface = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[Interface]
  }
  
  @scala.inline
  implicit class InterfaceOps[Self <: Interface] (val x: Self) extends AnyVal {
    
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
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: Value => Unit): Self = this.set("set", js.Any.fromFunction1(value))
  }
}
