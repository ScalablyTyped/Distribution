package typings.cypress.fpMod

import typings.cypress.lodashMod.List
import typings.cypress.lodashMod.ValueIteratee
import typings.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashMinBy extends js.Object {
  def apply[T](iteratee: ValueIteratee[T]): js.UndefOr[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], collection: List[T]): js.UndefOr[T] = js.native
  def apply[T](iteratee: __): LodashMinBy1x2[T] = js.native
  def apply[T](iteratee: __, collection: List[T]): LodashMinBy1x2[T] = js.native
}

