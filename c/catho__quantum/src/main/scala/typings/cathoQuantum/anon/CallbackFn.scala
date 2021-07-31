package typings.cathoQuantum.anon

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbackFn extends StObject {
  
  var callbackFn: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object CallbackFn {
  
  @scala.inline
  def apply(): CallbackFn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbackFn]
  }
  
  @scala.inline
  implicit class CallbackFnMutableBuilder[Self <: CallbackFn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallbackFn(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "callbackFn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCallbackFnUndefined: Self = StObject.set(x, "callbackFn", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
