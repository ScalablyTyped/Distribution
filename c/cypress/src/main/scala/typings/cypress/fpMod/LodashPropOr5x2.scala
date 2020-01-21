package typings.cypress.fpMod

import typings.cypress.lodashMod.NumericDictionary
import typings.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPropOr5x2 extends js.Object {
  def apply[TDefault](defaultValue: TDefault): LodashPropOr5x3[TDefault] = js.native
  def apply[T](defaultValue: __): LodashPropOr5x6[T] = js.native
  def apply[T](defaultValue: __, `object`: NumericDictionary[T]): LodashPropOr5x6[T] = js.native
  def apply[T, TDefault](defaultValue: TDefault, `object`: NumericDictionary[T]): T | TDefault = js.native
}

