package typings.cypress.fpMod

import typings.cypress.lodashMod.List
import typings.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashUnion extends js.Object {
  def apply[T](): js.Array[T] = js.native
  def apply[T](arrays2: Null, arrays: List[T]): js.Array[T] = js.native
  def apply[T](arrays2: List[T]): js.Array[T] = js.native
  def apply[T](arrays2: List[T], arrays: List[T]): js.Array[T] = js.native
  def apply[T](arrays2: __): LodashUnion1x2[T] = js.native
  def apply[T](arrays2: __, arrays: List[T]): LodashUnion1x2[T] = js.native
}

