package typings.bmapgl.BMapGLLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistanceTool extends js.Object {
  
  def addEventListener(event: String, handler: Callback): Unit = js.native
  
  def close(): Unit = js.native
  
  def open(): Unit = js.native
  
  def removeEventListener(event: String, handler: Callback): Unit = js.native
}
object DistanceTool {
  
  @scala.inline
  def apply(
    addEventListener: (String, Callback) => Unit,
    close: () => Unit,
    open: () => Unit,
    removeEventListener: (String, Callback) => Unit
  ): DistanceTool = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), close = js.Any.fromFunction0(close), open = js.Any.fromFunction0(open), removeEventListener = js.Any.fromFunction2(removeEventListener))
    __obj.asInstanceOf[DistanceTool]
  }
  
  @scala.inline
  implicit class DistanceToolOps[Self <: DistanceTool] (val x: Self) extends AnyVal {
    
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
    def setAddEventListener(value: (String, Callback) => Unit): Self = this.set("addEventListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOpen(value: () => Unit): Self = this.set("open", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveEventListener(value: (String, Callback) => Unit): Self = this.set("removeEventListener", js.Any.fromFunction2(value))
  }
}
