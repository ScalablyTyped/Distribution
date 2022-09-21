package typings.cfcsCore

import org.scalablytyped.runtime.TopLevel
import typings.cfcsCore.observerMod.Observer
import typings.cfcsCore.reactiveSubscribeMod.ReactiveSubscribe
import typings.egjsComponent.componentEventMod.ComponentEvent
import typings.std.Parameters
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactiveTypesMod {
  
  @js.native
  trait AnyFunction extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  type EventKey[T /* <: Record[String, Any] */] = String
  
  @js.native
  trait GetReactiveValue extends StObject {
    
    def apply[Type](observer: Observer[Type]): Type = js.native
    def apply[Inst /* <: ReactiveSubscribe[js.Object] */, Name](inst: Inst, name: Any): Name = js.native
  }
  
  type NoArguments = js.UndefOr[Null | Unit]
  
  type ReactiveEventCallback[T /* <: Record[String, Any] */, K /* <: EventKey[T] */] = (js.Function1[
    (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ /* event */ js.Any) | (/* event */ ComponentEvent[Any, K, Any]), 
    Any
  ]) | (/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any) | js.Function0[Any]
  
  type ReactiveEventParameters[Events /* <: Record[String, Any] */, EventName /* <: EventKey[Events] */] = UnknwonToAnyArray[Parameters[ReactiveEventCallback[Events, EventName]]]
  
  type ReactiveMethods[Instance, Names /* <: /* keyof Instance */ String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in Names ]: Instance[key]}
    */ typings.cfcsCore.cfcsCoreStrings.ReactiveMethods & TopLevel[Instance]
  
  type UnknwonToAnyArray[Arr] = Arr | js.Array[Any]
}
