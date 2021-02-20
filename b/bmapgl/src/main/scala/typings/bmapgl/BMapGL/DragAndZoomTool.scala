package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragAndZoomTool extends StObject {
  
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
  implicit class DragAndZoomToolMutableBuilder[Self <: DragAndZoomTool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOndrawend(value: typings.bmapgl.anon.Bounds => Unit): Self = StObject.set(x, "ondrawend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpen(value: () => Boolean): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
  }
}
