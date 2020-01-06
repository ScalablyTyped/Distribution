package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashForEach1x1[T] extends js.Object {
  def apply(collection: js.Array[T]): js.Array[T] = js.native
  def apply(collection: List[T]): List[T] = js.native
  def apply[T1 /* <: js.Object */](): js.UndefOr[T1 | Null] = js.native
  def apply[TArray /* <: js.UndefOr[js.Array[T] | Null] */](collection: TArray with (js.UndefOr[js.Array[T] | Null])): TArray = js.native
}

