package typings.baconjs

import typings.baconjs.observableMod.Observable
import typings.baconjs.observableMod.Property
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decodeMod {
  
  @JSImport("baconjs/types/decode", JSImport.Default)
  @js.native
  def default[T /* <: Record[_, _] */](src: Observable[/* keyof T */ String], cases: T): Property[DecodedValueOf[T]] = js.native
  
  @JSImport("baconjs/types/decode", "decode")
  @js.native
  def decode[T /* <: Record[_, _] */](src: Observable[/* keyof T */ String], cases: T): Property[DecodedValueOf[T]] = js.native
  
  type DecodedValueOf[O] = FlattenedObservable[
    /* import warning: importer.ImportType#apply Failed type conversion: O[keyof O] */ js.Any
  ]
  
  type FlattenedObservable[O] = O
}
