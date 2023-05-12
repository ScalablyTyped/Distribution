package typings.cfcsCore

import typings.cfcsCore.anon.Destroy
import typings.cfcsCore.declarationReactiveDecoratorsReactiveSubscribeMod.ReactiveSubscribe
import typings.cfcsCore.declarationReactiveReactiveAdapterMod.ReactiveAdapterParam
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationReactiveAdaptReactiveMod {
  
  @JSImport("@cfcs/core/declaration/reactive/adaptReactive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptReactive[Instance /* <: ReactiveSubscribe[Record[String, Any]] */, State /* <: Record[String, Any] */, Methods /* <: /* keyof std.Partial<Instance> */ String */, Props, Events /* <: Record[String, Any] */](adapter: ReactiveAdapterParam[Instance, State, Methods, Props, Events]): Destroy[Events, State, Instance] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptReactive")(adapter.asInstanceOf[js.Any]).asInstanceOf[Destroy[Events, State, Instance]]
  inline def adaptReactive[Instance /* <: ReactiveSubscribe[Record[String, Any]] */, State /* <: Record[String, Any] */, Methods /* <: /* keyof std.Partial<Instance> */ String */, Props, Events /* <: Record[String, Any] */](adapter: ReactiveAdapterParam[Instance, State, Methods, Props, Events], props: js.Function0[Props]): Destroy[Events, State, Instance] = (^.asInstanceOf[js.Dynamic].applyDynamic("adaptReactive")(adapter.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Destroy[Events, State, Instance]]
}
