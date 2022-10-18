package typings.blueprintjsIcons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmTypeUtilsIncludesMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    @blueprintjs/icons.@blueprintjs/icons/lib/esm/type-utils/includes.IsEqual<Value[0], Item> extends true ? true : Value extends [Value[0], ...infer rest] ? @blueprintjs/icons.@blueprintjs/icons/lib/esm/type-utils/includes.Includes<rest, Item> : false
    }}}
    */
  @js.native
  trait Includes[Value /* <: js.Array[Any] */, Item] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    <G>(): G extends T ? 1 : 2 extends <G>(): G extends U ? 1 : 2 ? true : false
    }}}
    */
  @js.native
  trait IsEqual[T, U] extends StObject
}
