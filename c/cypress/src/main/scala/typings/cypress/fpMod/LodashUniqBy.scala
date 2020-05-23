package typings.cypress.fpMod

import typings.cypress.lodashMod.List
import typings.cypress.lodashMod.ValueIteratee
import typings.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashUniqBy extends js.Object {
  def apply[T](iteratee: ValueIteratee[T]): js.Array[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], array: List[T]): js.Array[T] = js.native
  def apply[T](iteratee: __): LodashUniqBy1x2[T] = js.native
  def apply[T](iteratee: __, array: List[T]): LodashUniqBy1x2[T] = js.native
}

