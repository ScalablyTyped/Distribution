package typings.bindEventListener

import typings.bindEventListener.distTypesMod.Binding
import typings.bindEventListener.distTypesMod.InferEventType
import typings.bindEventListener.distTypesMod.UnbindFn
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBindMod {
  
  @JSImport("bind-event-listener/dist/bind", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bind[TTarget /* <: EventTarget */, TType /* <: InferEventType[TTarget] | String */](target: TTarget, param1: Binding[TTarget, TType]): UnbindFn = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(target.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[UnbindFn]
}
