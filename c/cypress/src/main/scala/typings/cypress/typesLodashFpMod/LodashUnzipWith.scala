package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.List
import typings.cypress.typesLodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashUnzipWith extends js.Object {
  def apply[T](iteratee: __): LodashUnzipWith1x2[T] = js.native
  def apply[T](iteratee: __, array: List[List[T]]): LodashUnzipWith1x2[T] = js.native
  def apply[T, TResult](iteratee: js.Function1[/* repeated */ T, TResult]): js.Array[TResult] = js.native
  def apply[T, TResult](iteratee: js.Function1[/* repeated */ T, TResult], array: List[List[T]]): js.Array[TResult] = js.native
}

