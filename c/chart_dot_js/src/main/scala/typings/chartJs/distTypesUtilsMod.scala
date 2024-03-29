package typings.chartJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsMod {
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends any ? keyof T : never
    }}}
    */
  type AllKeys[T] = /* keyof T */ String
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.Function ? T : T extends std.Array<infer U> ? chart.js.chart.js/dist/types/utils._DeepPartialArray<U> : T extends object ? chart.js.chart.js/dist/types/utils._DeepPartialObject<T> : T | undefined
    }}}
    */
  type DeepPartial[T] = T
  
  type DeepPartialArray[T] = js.Array[DeepPartial[T]]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]:? chart.js.chart.js/dist/types/utils.DeepPartial<T[P]>}
    }}}
    */
  @js.native
  trait DeepPartialObject[T] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    [T] extends [unknown] ? std.Array<T> : never
    }}}
    */
  type DistributiveArray[T] = js.Array[T]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ k in chart.js.chart.js/dist/types/utils.AllKeys<T> ]: chart.js.chart.js/dist/types/utils.PickType<T, k>}
    }}}
    */
  @js.native
  trait Merge[T /* <: js.Object */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends {[ k in K ]:? any} ? T[K] : undefined
    }}}
    */
  type PickType[T, K /* <: AllKeys[T] */] = Unit
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    U extends unknown ? (k : U): void : never extends (k : infer I): void ? I : never
    }}}
    */
  @js.native
  trait UnionToIntersection[U] extends StObject
}
