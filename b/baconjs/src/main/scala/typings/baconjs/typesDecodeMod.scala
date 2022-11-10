package typings.baconjs

import typings.baconjs.typesObservableMod.Observable
import typings.baconjs.typesObservableMod.Property
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecodeMod {
  
  @JSImport("baconjs/types/decode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: Record[Any, Any] */](src: Observable[/* keyof T */ String], cases: T): Property[DecodedValueOf[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], cases.asInstanceOf[js.Any])).asInstanceOf[Property[DecodedValueOf[T]]]
  
  inline def decode[T /* <: Record[Any, Any] */](src: Observable[/* keyof T */ String], cases: T): Property[DecodedValueOf[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(src.asInstanceOf[js.Any], cases.asInstanceOf[js.Any])).asInstanceOf[Property[DecodedValueOf[T]]]
  
  type DecodedValueOf[O] = FlattenedObservable[
    /* import warning: importer.ImportType#apply Failed type conversion: O[keyof O] */ js.Any
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    O extends baconjs.baconjs/types/observable.Observable<infer I> ? I : O
    }}}
    */
  type FlattenedObservable[O] = O
}
