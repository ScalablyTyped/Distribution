package typings.cypress.fpMod

import typings.cypress.lodashMod.List
import typings.cypress.lodashMod.ValueIteratee
import typings.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashUnionBy extends js.Object {
  def apply[T](iteratee: ValueIteratee[T]): js.Array[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], arrays1: Null, arrays2: List[T]): js.Array[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], arrays1: List[T]): js.Array[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], arrays1: List[T], arrays2: List[T]): js.Array[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], arrays1: __): LodashUnionBy1x5[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], arrays1: __, arrays2: List[T]): LodashUnionBy1x5[T] = js.native
  def apply[T](iteratee: __): LodashUnionBy1x2[T] = js.native
  def apply[T](iteratee: __, arrays1: Null, arrays2: List[T]): LodashUnionBy1x6[T] = js.native
  def apply[T](iteratee: __, arrays1: List[T]): LodashUnionBy1x2[T] = js.native
  def apply[T](iteratee: __, arrays1: List[T], arrays2: List[T]): LodashUnionBy1x6[T] = js.native
  def apply[T](iteratee: __, arrays1: __): LodashUnionBy1x4[T] = js.native
  def apply[T](iteratee: __, arrays1: __, arrays2: List[T]): LodashUnionBy1x4[T] = js.native
}

