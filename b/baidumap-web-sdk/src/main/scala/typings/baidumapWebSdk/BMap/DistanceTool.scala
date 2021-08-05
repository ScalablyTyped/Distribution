package typings.baidumapWebSdk.BMap

import typings.baidumapWebSdk.anon.Distance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistanceTool extends StObject {
  
  def close(): Unit
  
  def ondrawend(event: Distance): Unit
  
  def open(): Boolean
}
object DistanceTool {
  
  inline def apply(close: () => Unit, ondrawend: Distance => Unit, open: () => Boolean): DistanceTool = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), ondrawend = js.Any.fromFunction1(ondrawend), open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[DistanceTool]
  }
  
  extension [Self <: DistanceTool](x: Self) {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setOndrawend(value: Distance => Unit): Self = StObject.set(x, "ondrawend", js.Any.fromFunction1(value))
    
    inline def setOpen(value: () => Boolean): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
  }
}
