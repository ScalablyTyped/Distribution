package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragAndZoomTool extends StObject {
  
  def close(): Unit
  
  def ondrawend(event: typings.baidumapWebSdk.anon.Bounds): Unit
  
  def open(): Boolean
}
object DragAndZoomTool {
  
  inline def apply(close: () => Unit, ondrawend: typings.baidumapWebSdk.anon.Bounds => Unit, open: () => Boolean): DragAndZoomTool = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), ondrawend = js.Any.fromFunction1(ondrawend), open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[DragAndZoomTool]
  }
  
  extension [Self <: DragAndZoomTool](x: Self) {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setOndrawend(value: typings.baidumapWebSdk.anon.Bounds => Unit): Self = StObject.set(x, "ondrawend", js.Any.fromFunction1(value))
    
    inline def setOpen(value: () => Boolean): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
  }
}
