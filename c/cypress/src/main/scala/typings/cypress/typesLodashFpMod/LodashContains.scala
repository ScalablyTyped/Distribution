package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.Dictionary
import typings.cypress.typesLodashMod.List
import typings.cypress.typesLodashMod.NumericDictionary
import typings.cypress.typesLodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashContains extends js.Object {
  def apply[T](target: T): LodashContains1x1[T] = js.native
  def apply[T](target: T, collection: Dictionary[T]): Boolean = js.native
  def apply[T](target: T, collection: List[T]): Boolean = js.native
  def apply[T](target: T, collection: NumericDictionary[T]): Boolean = js.native
  def apply[T](target: __): LodashContains1x2[T] = js.native
  def apply[T](target: __, collection: Dictionary[T]): LodashContains1x2[T] = js.native
  def apply[T](target: __, collection: List[T]): LodashContains1x2[T] = js.native
  def apply[T](target: __, collection: NumericDictionary[T]): LodashContains1x2[T] = js.native
}

