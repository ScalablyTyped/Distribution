package typings.cfcsCore

import typings.cfcsCore.declarationReactiveDecoratorsReactiveSubscribeMod.ReactiveSubscribe
import typings.std.Parameters
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object declarationReactiveTypesMod {
  
  @js.native
  trait AnyFunction extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  type EventKey[T /* <: Record[String, Any] */] = String
  
  type NoArguments = js.UndefOr[Null | Unit]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T[K] extends @cfcs/core.@cfcs/core/declaration/reactive/types.NoArguments ? (): any : T[K] extends @cfcs/core.@cfcs/core/declaration/reactive/types.AnyFunction ? T[K] : T[K] extends @egjs/component.@egjs/component/declaration/ComponentEvent.ComponentEvent<infer PROPS, string, any> ? (event : @egjs/component.@egjs/component/declaration/ComponentEvent.ComponentEvent<PROPS, K, any>): any : (event : T[K]): any
    }}}
    */
  type ReactiveEventCallback[T /* <: Record[String, Any] */, K /* <: EventKey[T] */] = js.Function0[Any]
  
  type ReactiveEventParameters[Events /* <: Record[String, Any] */, EventName /* <: EventKey[Events] */] = UnknwonToAnyArray[Parameters[ReactiveEventCallback[Events, EventName]]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * This translation is imprecise and ignores the effect of the type mapping. 
    * TS definition: {{{
    {[ key in Names ]: Instance[key]}
    }}}
    */
  type ReactiveMethods[Instance, Names /* <: /* keyof Instance */ String */] = Instance
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    Instance extends @cfcs/core.@cfcs/core/declaration/reactive/inline.ReactiveObject<infer State> | @cfcs/core.@cfcs/core/declaration/reactive/decorators/ReactiveSubscribe.ReactiveSubscribe<infer State> ? std.Omit<State, 'subscribe' | 'unsubscribe'> : never
    }}}
    */
  @js.native
  trait ReactiveState[Instance /* <: ReactiveSubscribe[js.Object] */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    std.Array<unknown> extends Arr ? std.Array<any> : Arr
    }}}
    */
  type UnknwonToAnyArray[Arr] = Arr
}
