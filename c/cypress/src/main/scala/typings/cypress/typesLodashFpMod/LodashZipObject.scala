package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.Dictionary
import typings.cypress.typesLodashMod.List
import typings.cypress.typesLodashMod.PropertyName
import typings.cypress.typesLodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashZipObject extends js.Object {
  def apply(props: List[PropertyName]): LodashZipObject1x1 = js.native
  def apply[T](props: List[PropertyName], values: List[T]): Dictionary[T] = js.native
  def apply[T](props: __, values: List[T]): LodashZipObject1x2[T] = js.native
}

