package typings.cypress.fpMod

import typings.cypress.lodashMod.AnyKindOfDictionary
import typings.cypress.lodashMod.Many
import typings.cypress.lodashMod.PartialObject
import typings.cypress.lodashMod.PropertyName
import typings.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashOmit extends js.Object {
  def apply(paths: Many[PropertyName]): LodashOmit1x1 = js.native
  def apply[T /* <: js.Object */](paths: Many[PropertyName], `object`: T): PartialObject[T] = js.native
  def apply[T /* <: AnyKindOfDictionary */](paths: __): LodashOmit1x2[T] = js.native
  def apply[T /* <: AnyKindOfDictionary */](paths: __, `object`: T): LodashOmit1x2[T] = js.native
}

