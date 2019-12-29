package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.List
import typings.cypress.typesLodashMod.Many
import typings.cypress.typesLodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFlatMap extends js.Object {
  def apply(iteratee: String): js.Array[_] = js.native
  def apply(iteratee: String, collection: js.Object): js.Array[_] = js.native
  def apply(iteratee: js.Object): js.Array[Boolean] = js.native
  def apply(iteratee: js.Object, collection: js.Object): js.Array[Boolean] = js.native
  def apply(iteratee: __): LodashFlatMap3x2 = js.native
  def apply(iteratee: __, collection: js.Object): LodashFlatMap3x2 = js.native
  def apply[T /* <: js.Object */](iteratee: __, collection: T): LodashFlatMap2x2[T] = js.native
  def apply[T](iteratee: __, collection: List[T]): LodashFlatMap1x2[T] = js.native
  def apply[T, TResult](iteratee: js.Function1[/* value */ T, Many[TResult]]): LodashFlatMap1x1[T, TResult] = js.native
  def apply[T /* <: js.Object */, TResult](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      Many[TResult]
    ],
    collection: T
  ): js.Array[TResult] = js.native
  def apply[T, TResult](iteratee: js.Function1[/* value */ T, Many[TResult]], collection: List[T]): js.Array[TResult] = js.native
}

