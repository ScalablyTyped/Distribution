package typings.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Handle used to interact with the autocomplete dialog box.*/
@js.native
trait Handle extends js.Object {
  
  def close(): Unit = js.native
  
  var data: js.Any = js.native
  
  var length: Double = js.native
  
  def menuSize(): Double = js.native
  
  def moveFocus(n: Double, avoidWrap: Boolean): Unit = js.native
  
  def pick(): Unit = js.native
  
  def setFocus(n: Double): Unit = js.native
}
object Handle {
  
  @scala.inline
  def apply(
    close: () => Unit,
    data: js.Any,
    length: Double,
    menuSize: () => Double,
    moveFocus: (Double, Boolean) => Unit,
    pick: () => Unit,
    setFocus: Double => Unit
  ): Handle = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), data = data.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], menuSize = js.Any.fromFunction0(menuSize), moveFocus = js.Any.fromFunction2(moveFocus), pick = js.Any.fromFunction0(pick), setFocus = js.Any.fromFunction1(setFocus))
    __obj.asInstanceOf[Handle]
  }
  
  @scala.inline
  implicit class HandleOps[Self <: Handle] (val x: Self) extends AnyVal {
    
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuSize(value: () => Double): Self = this.set("menuSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoveFocus(value: (Double, Boolean) => Unit): Self = this.set("moveFocus", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPick(value: () => Unit): Self = this.set("pick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFocus(value: Double => Unit): Self = this.set("setFocus", js.Any.fromFunction1(value))
  }
}
