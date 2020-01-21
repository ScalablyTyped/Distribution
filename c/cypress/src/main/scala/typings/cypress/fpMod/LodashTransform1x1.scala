package typings.cypress.fpMod

import typings.cypress.lodashMod.Dictionary
import typings.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashTransform1x1[T, TResult] extends js.Object {
  def apply(accumulator: js.Array[TResult]): LodashTransform1x3[T, TResult] = js.native
  def apply(accumulator: js.Array[TResult], `object`: js.Array[T]): js.Array[TResult] = js.native
  def apply(accumulator: js.Array[TResult], `object`: Dictionary[T]): js.Array[TResult] = js.native
  def apply(accumulator: __, `object`: js.Array[T]): LodashTransform1x5[TResult] = js.native
  def apply(accumulator: __, `object`: Dictionary[T]): LodashTransform4x5[TResult] = js.native
}

