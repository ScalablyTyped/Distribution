package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.Dictionary
import typings.cypress.typesLodashMod.MemoVoidIteratorCapped
import typings.cypress.typesLodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashTransform3x4[T] extends js.Object {
  def apply[TResult](iteratee: MemoVoidIteratorCapped[T, js.Array[TResult]]): LodashTransform4x5[TResult] = js.native
  def apply[TResult](iteratee: MemoVoidIteratorCapped[T, js.Array[TResult]], accumulator: js.Array[TResult]): js.Array[TResult] = js.native
  def apply[TResult](iteratee: MemoVoidIteratorCapped[T, Dictionary[TResult]], accumulator: Dictionary[TResult]): Dictionary[TResult] = js.native
  def apply[TResult](iteratee: __, accumulator: js.Array[TResult]): LodashTransform4x6[T, TResult] = js.native
  def apply[TResult](iteratee: __, accumulator: Dictionary[TResult]): LodashTransform3x6[T, TResult] = js.native
}

