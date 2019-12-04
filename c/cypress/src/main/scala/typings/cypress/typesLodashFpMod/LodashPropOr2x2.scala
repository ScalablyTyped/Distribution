package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.NumericDictionary
import typings.cypress.typesLodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPropOr2x2 extends js.Object {
  def apply[TDefault](defaultValue: TDefault): LodashPropOr2x3[TDefault] = js.native
  def apply[T](defaultValue: __): LodashPropOr2x6[T] = js.native
  def apply[T](defaultValue: __, `object`: NumericDictionary[T]): LodashPropOr2x6[T] = js.native
  def apply[T, TDefault](defaultValue: TDefault, `object`: NumericDictionary[T]): T | TDefault = js.native
}

