package typings.bootstrapNotify

import typings.jquery.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotifyReturn extends StObject {
  
  @JSName("$ele")
  var $ele: JQuery[HTMLElement] = js.native
  
  def close(): Unit = js.native
  
  def update(command: String, update: js.Any): Unit = js.native
}
object NotifyReturn {
  
  @scala.inline
  def apply($ele: JQuery[HTMLElement], close: () => Unit, update: (String, js.Any) => Unit): NotifyReturn = {
    val __obj = js.Dynamic.literal($ele = $ele.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[NotifyReturn]
  }
  
  @scala.inline
  implicit class NotifyReturnMutableBuilder[Self <: NotifyReturn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$ele(value: JQuery[HTMLElement]): Self = StObject.set(x, "$ele", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: (String, js.Any) => Unit): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
  }
}
