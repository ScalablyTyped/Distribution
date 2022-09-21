package typings.bindEventListener

import typings.bindEventListener.typesMod.Binding
import typings.bindEventListener.typesMod.UnbindFn
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindMod {
  
  @JSImport("bind-event-listener/dist/bind", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bind[Target /* <: EventTarget */, Type /* <: String */](target: Target, hasTypeListenerOptions: Binding[Target, Type]): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(target.asInstanceOf[js.Any], hasTypeListenerOptions.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
}
