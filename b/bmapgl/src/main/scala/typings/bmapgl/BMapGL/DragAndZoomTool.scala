package typings.bmapgl.BMapGL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragAndZoomTool extends js.Object {
  
  def close(): Unit = js.native
  
  def ondrawend(event: typings.bmapgl.anon.Bounds): Unit = js.native
  
  def open(): Boolean = js.native
}
object DragAndZoomTool {
  
  @scala.inline
  def apply(close: () => Unit, ondrawend: typings.bmapgl.anon.Bounds => Unit, open: () => Boolean): DragAndZoomTool = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), ondrawend = js.Any.fromFunction1(ondrawend), open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[DragAndZoomTool]
  }
  
  @scala.inline
  implicit class DragAndZoomToolOps[Self <: DragAndZoomTool] (val x: Self) extends AnyVal {
    
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
    def setOndrawend(value: typings.bmapgl.anon.Bounds => Unit): Self = this.set("ondrawend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpen(value: () => Boolean): Self = this.set("open", js.Any.fromFunction0(value))
  }
}
