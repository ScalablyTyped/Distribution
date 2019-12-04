package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.Dictionary
import typings.cypress.typesLodashMod.MemoVoidIteratorCapped
import typings.cypress.typesLodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashTransform1x2[TResult] extends js.Object {
  def apply[T](iteratee: MemoVoidIteratorCapped[T, js.Array[TResult]]): LodashTransform1x3[T, TResult] = js.native
  def apply[T](iteratee: MemoVoidIteratorCapped[T, js.Array[TResult]], `object`: js.Array[T]): js.Array[TResult] = js.native
  def apply[T](iteratee: MemoVoidIteratorCapped[T, js.Array[TResult]], `object`: Dictionary[T]): js.Array[TResult] = js.native
  def apply[T](iteratee: __, `object`: js.Array[T]): LodashTransform1x6[T, TResult] = js.native
  def apply[T](iteratee: __, `object`: Dictionary[T]): LodashTransform4x6[T, TResult] = js.native
}

