package typings.cfcsCore

import typings.cfcsCore.anon.Destroy
import typings.cfcsCore.declarationReactiveReactiveAdapterMod.ReactiveAdapter
import typings.cfcsCore.declarationReactiveReactiveSubscribeMod.ReactiveSubscribe
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationReactiveAdaptReactiveMod {
  
  @JSImport("@cfcs/core/declaration/reactive/adaptReactive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptReactive[Instance /* <: ReactiveSubscribe[Record[String, Any]] */, State /* <: Record[String, Any] */, Methods /* <: /* keyof std.Partial<Instance> */ String */, Data, Events /* <: Record[String, Any] */](adapter: ReactiveAdapter[Instance, State, Methods, Data, Events]): Destroy[State, Instance] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptReactive")(adapter.asInstanceOf[js.Any]).asInstanceOf[Destroy[State, Instance]]
}
