package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.Many
import typings.cypress.typesLodashMod.PartialObject
import typings.cypress.typesLodashMod.PropertyName
import typings.cypress.typesLodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashOmit extends js.Object {
  def apply(paths: Many[PropertyName]): LodashOmit1x1 = js.native
  def apply[T /* <: js.Object */](paths: Many[PropertyName], `object`: T): PartialObject[T] = js.native
  def apply[T /* <: js.Object */](paths: __): LodashOmit2x2[T] = js.native
  def apply[T /* <: js.Object */](paths: __, `object`: T): LodashOmit2x2[T] = js.native
}

