package typings.cypress.fpMod

import typings.cypress.lodashMod.PartialDeep
import typings.cypress.lodashMod.PropertyPath
import typings.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPick extends js.Object {
  def apply(props: PropertyPath): LodashPick2x1 = js.native
  def apply[T](props: PropertyPath, `object`: T): PartialDeep[T] = js.native
  def apply[T](props: __): LodashPick2x2[T] = js.native
  def apply[T](props: __, `object`: T): LodashPick2x2[T] = js.native
}

