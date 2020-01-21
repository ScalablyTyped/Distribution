package typings.cypress.fpMod

import typings.cypress.lodashMod.List
import typings.cypress.lodashMod.ValueIteratee
import typings.cypress.lodashMod.ValueIteratorTypeGuard
import typings.cypress.lodashMod.__
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPartition extends js.Object {
  def apply[T](callback: ValueIteratee[T]): js.Tuple2[js.Array[T], js.Array[T]] = js.native
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
  def apply[T](callback: ValueIteratee[T], collection: List[T]): js.Tuple2[js.Array[T], js.Array[T]] = js.native
  def apply[T /* <: js.Object */](callback: __): LodashPartition3x2[T] = js.native
  def apply[T /* <: js.Object */](callback: __, collection: T): LodashPartition3x2[T] = js.native
  def apply[T](callback: __, collection: List[T]): LodashPartition1x2[T] = js.native
  def apply[T, U /* <: T */](callback: ValueIteratorTypeGuard[T, U]): js.Tuple2[js.Array[U], js.Array[Exclude[T, U]]] = js.native
  def apply[T, U /* <: T */](callback: ValueIteratorTypeGuard[T, U], collection: List[T]): js.Tuple2[js.Array[U], js.Array[Exclude[T, U]]] = js.native
}

