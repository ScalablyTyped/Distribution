package typings.bindEventListener

import typings.bindEventListener.distTypesMod.Binding
import typings.bindEventListener.distTypesMod.UnbindFn
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBindMod {
  
  @JSImport("bind-event-listener/dist/bind", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bind[Target /* <: EventTarget */, Type /* <: String */](target: Target, param1: Binding[Target, Type]): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(target.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
}
