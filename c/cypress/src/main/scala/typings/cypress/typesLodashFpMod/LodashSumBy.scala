package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.List
import typings.cypress.typesLodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashSumBy extends js.Object {
  def apply[T](iteratee: String): LodashSumBy1x1[T] = js.native
  def apply[T](iteratee: String, collection: List[T]): Double = js.native
  def apply[T](iteratee: js.Function1[/* value */ T, Double]): LodashSumBy1x1[T] = js.native
  def apply[T](iteratee: js.Function1[/* value */ T, Double], collection: List[T]): Double = js.native
  def apply[T](iteratee: __): LodashSumBy1x2[T] = js.native
  def apply[T](iteratee: __, collection: List[T]): LodashSumBy1x2[T] = js.native
}

