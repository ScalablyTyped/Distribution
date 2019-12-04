package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.List
import typings.cypress.typesLodashMod.ValueIteratee
import typings.cypress.typesLodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashMaxBy extends js.Object {
  def apply[T](iteratee: ValueIteratee[T]): LodashMaxBy1x1[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], collection: List[T]): js.UndefOr[T] = js.native
  def apply[T](iteratee: __): LodashMaxBy1x2[T] = js.native
  def apply[T](iteratee: __, collection: List[T]): LodashMaxBy1x2[T] = js.native
}

