package typings.cypress.fpMod

import typings.cypress.lodashMod.Dictionary
import typings.cypress.lodashMod.NumericDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashToPairs extends js.Object {
  def apply(`object`: js.Object): js.Array[js.Tuple2[String, _]] = js.native
  def apply[T](`object`: Dictionary[T]): js.Array[js.Tuple2[String, T]] = js.native
  def apply[T](`object`: NumericDictionary[T]): js.Array[js.Tuple2[String, T]] = js.native
}

