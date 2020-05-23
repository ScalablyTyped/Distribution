package typings.cypress.fpMod

import typings.cypress.lodashMod.MemoIteratorCapped
import typings.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashReduce1x4[T] extends js.Object {
  def apply[TResult](callback: MemoIteratorCapped[T, TResult]): LodashReduce1x5[TResult] = js.native
  def apply[TResult](callback: MemoIteratorCapped[T, TResult], accumulator: TResult): TResult = js.native
  def apply[TResult](callback: __, accumulator: TResult): LodashReduce1x6[T, TResult] = js.native
}

