package typings.cypress.fpMod

import typings.cypress.lodashMod.List
import typings.cypress.lodashMod.ValueIteratee
import typings.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashMeanBy extends js.Object {
  def apply[T](iteratee: ValueIteratee[T]): Double = js.native
  def apply[T](iteratee: ValueIteratee[T], collection: List[T]): Double = js.native
  def apply[T](iteratee: __): LodashMeanBy1x2[T] = js.native
  def apply[T](iteratee: __, collection: List[T]): LodashMeanBy1x2[T] = js.native
}

