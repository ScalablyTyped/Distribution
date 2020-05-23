package typings.cypress.fpMod

import typings.cypress.lodashMod.Dictionary
import typings.cypress.lodashMod.List
import typings.cypress.lodashMod.NumericDictionary
import typings.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashIncludesFrom1x1[T] extends js.Object {
  def apply(fromIndex: Double): LodashIncludesFrom1x3[T] = js.native
  def apply(fromIndex: Double, collection: Dictionary[T]): Boolean = js.native
  def apply(fromIndex: Double, collection: List[T]): Boolean = js.native
  def apply(fromIndex: Double, collection: NumericDictionary[T]): Boolean = js.native
  def apply(fromIndex: __): LodashIncludesFrom1x5 = js.native
  def apply(fromIndex: __, collection: Dictionary[T]): LodashIncludesFrom1x5 = js.native
  def apply(fromIndex: __, collection: List[T]): LodashIncludesFrom1x5 = js.native
  def apply(fromIndex: __, collection: NumericDictionary[T]): LodashIncludesFrom1x5 = js.native
}

