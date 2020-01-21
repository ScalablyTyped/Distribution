package typings.cypress.fpMod

import typings.cypress.lodashMod.ListOfRecursiveArraysOrValues
import typings.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFlatMapDepth1x4[T] extends js.Object {
  def apply(iteratee: __, depth: Double): LodashFlatMapDepth1x6[T] = js.native
  def apply[TResult](iteratee: js.Function1[/* value */ T, ListOfRecursiveArraysOrValues[TResult] | TResult]): LodashFlatMapDepth1x5[TResult] = js.native
  def apply[TResult](
    iteratee: js.Function1[/* value */ T, ListOfRecursiveArraysOrValues[TResult] | TResult],
    depth: Double
  ): js.Array[TResult] = js.native
}

