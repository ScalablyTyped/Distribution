package typings.baconjs

import typings.baconjs.typesObservableMod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCombinetemplateMod {
  
  @JSImport("baconjs/types/combinetemplate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](template: T): Property[CombinedTemplate[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(template.asInstanceOf[js.Any]).asInstanceOf[Property[CombinedTemplate[T]]]
  
  type ArrayTemplate[A] = js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: A extends baconjs.baconjs/types/observable.default<infer I> ? I : A extends std.Record<any, any> ? baconjs.baconjs/types/combinetemplate.ObjectTemplate<A> : A */ js.Any
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    O extends std.Record<any, any> ? baconjs.baconjs/types/combinetemplate.ObjectTemplate<O> : O extends std.Array<infer I> ? baconjs.baconjs/types/combinetemplate.ArrayTemplate<I> : O extends baconjs.baconjs/types/observable.default<infer I2> ? I2 : O
    }}}
    */
  @js.native
  trait CombinedTemplate[O] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof O ]: O[K] extends baconjs.baconjs/types/observable.default<infer I>? I : O[K] extends std.Record<any, any>? baconjs.baconjs/types/combinetemplate.ObjectTemplate<O[K]> : O[K] extends std.Array<infer I2>? baconjs.baconjs/types/combinetemplate.ArrayTemplate<I2> : O[K]}
    }}}
    */
  @js.native
  trait ObjectTemplate[O] extends StObject
}
