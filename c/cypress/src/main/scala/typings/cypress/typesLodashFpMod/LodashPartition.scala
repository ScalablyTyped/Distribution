package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.ValueIteratee
import typings.cypress.typesLodashMod.ValueIteratorTypeGuard
import typings.cypress.typesLodashMod.__
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashPartition extends StObject {
  
  def apply[T](
    callback: ValueIteratee[
      (/* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any) | T
    ]
  ): js.Tuple2[js.Array[T], js.Array[T]] = js.native
  def apply[T /* <: js.Object */](
    callback: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    collection: T
  ): js.Tuple2[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ], 
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ] = js.native
  def apply[T](callback: ValueIteratee[T], collection: typings.cypress.typesLodashMod.List[T]): js.Tuple2[js.Array[T], js.Array[T]] = js.native
  def apply[T /* <: js.Object */](callback: __): LodashPartition3x2[T] = js.native
  def apply[T /* <: js.Object */](callback: __, collection: T): LodashPartition3x2[T] = js.native
  def apply[T](callback: __, collection: typings.cypress.typesLodashMod.List[T]): LodashPartition1x2[T] = js.native
  def apply[T, U /* <: T */](callback: ValueIteratorTypeGuard[T, U]): js.Tuple2[js.Array[U], js.Array[Exclude[T, U]]] = js.native
  def apply[T, U /* <: T */](callback: ValueIteratorTypeGuard[T, U], collection: typings.cypress.typesLodashMod.List[T]): js.Tuple2[js.Array[U], js.Array[Exclude[T, U]]] = js.native
}
