package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.List
import typings.cypress.typesLodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashUnion extends js.Object {
  def apply[T](): LodashUnion1x1[T] = js.native
  def apply[T](arrays2: js.UndefOr[scala.Nothing], arrays: List[T]): js.Array[T] = js.native
  def apply[T](arrays2: Null, arrays: List[T]): js.Array[T] = js.native
  def apply[T](arrays2: List[T]): LodashUnion1x1[T] = js.native
  def apply[T](arrays2: List[T], arrays: List[T]): js.Array[T] = js.native
  def apply[T](arrays2: __): LodashUnion1x2[T] = js.native
  def apply[T](arrays2: __, arrays: List[T]): LodashUnion1x2[T] = js.native
}

