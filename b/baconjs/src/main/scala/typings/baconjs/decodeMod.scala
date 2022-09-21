package typings.baconjs

import typings.baconjs.observableMod.Observable
import typings.baconjs.observableMod.Property
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decodeMod {
  
  @JSImport("baconjs/types/decode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: Record[Any, Any] */](src: Observable[/* keyof T */ String], cases: T): Property[DecodedValueOf[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(src.asInstanceOf[js.Any], cases.asInstanceOf[js.Any])).asInstanceOf[Property[DecodedValueOf[T]]]
  
  inline def decode[T /* <: Record[Any, Any] */](src: Observable[/* keyof T */ String], cases: T): Property[DecodedValueOf[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(src.asInstanceOf[js.Any], cases.asInstanceOf[js.Any])).asInstanceOf[Property[DecodedValueOf[T]]]
  
  type DecodedValueOf[O] = FlattenedObservable[
    /* import warning: importer.ImportType#apply Failed type conversion: O[keyof O] */ js.Any
  ]
  
  type FlattenedObservable[O] = O
}
