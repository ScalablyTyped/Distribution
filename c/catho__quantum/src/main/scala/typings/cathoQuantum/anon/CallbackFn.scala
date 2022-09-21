package typings.cathoQuantum.anon

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.TouchEvent
import typings.react.mod.TouchEventHandler
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbackFn extends StObject {
  
  var callbackFn: (MouseEventHandler[HTMLButtonElement | HTMLAnchorElement]) | (TouchEventHandler[HTMLButtonElement | HTMLAnchorElement])
  
  var title: String
}
object CallbackFn {
  
  inline def apply(
    callbackFn: (MouseEvent[HTMLButtonElement | HTMLAnchorElement, NativeMouseEvent]) | (TouchEvent[HTMLButtonElement | HTMLAnchorElement]) => Unit,
    title: String
  ): CallbackFn = {
    val __obj = js.Dynamic.literal(callbackFn = js.Any.fromFunction1(callbackFn), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackFn]
  }
  
  extension [Self <: CallbackFn](x: Self) {
    
    inline def setCallbackFn(
      value: (MouseEvent[HTMLButtonElement | HTMLAnchorElement, NativeMouseEvent]) | (TouchEvent[HTMLButtonElement | HTMLAnchorElement]) => Unit
    ): Self = StObject.set(x, "callbackFn", js.Any.fromFunction1(value))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
