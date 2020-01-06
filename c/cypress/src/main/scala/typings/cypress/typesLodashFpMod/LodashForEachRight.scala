package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.List
import typings.cypress.typesLodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashForEachRight extends js.Object {
  def apply[T](iteratee: js.Function1[/* value */ T, _]): LodashForEachRight1x1[T] = js.native
  def apply[T /* <: js.Object */](
    iteratee: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
      _
    ],
    collection: T
  ): js.UndefOr[T | Null] = js.native
  def apply[T](iteratee: js.Function1[/* value */ T, _], collection: js.Array[T]): js.Array[T] = js.native
  def apply[T](iteratee: js.Function1[/* value */ T, _], collection: List[T]): List[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __): LodashForEachRight6x2[T] = js.native
  def apply[T /* <: js.Object */](iteratee: __, collection: T): LodashForEachRight3x2[T] = js.native
  def apply[T](iteratee: __, collection: js.Array[T]): LodashForEachRight1x2[T] = js.native
  def apply[T](iteratee: __, collection: List[T]): LodashForEachRight2x2[T] = js.native
}

