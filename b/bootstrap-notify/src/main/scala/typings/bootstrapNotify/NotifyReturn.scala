package typings.bootstrapNotify

import typings.jquery.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifyReturn extends StObject {
  
  @JSName("$ele")
  var $ele: JQuery[HTMLElement]
  
  def close(): Unit
  
  def update(command: String, update: Any): Unit
}
object NotifyReturn {
  
  inline def apply($ele: JQuery[HTMLElement], close: () => Unit, update: (String, Any) => Unit): NotifyReturn = {
    val __obj = js.Dynamic.literal($ele = $ele.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[NotifyReturn]
  }
  
  extension [Self <: NotifyReturn](x: Self) {
    
    inline def set$ele(value: JQuery[HTMLElement]): Self = StObject.set(x, "$ele", value.asInstanceOf[js.Any])
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setUpdate(value: (String, Any) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
  }
}
