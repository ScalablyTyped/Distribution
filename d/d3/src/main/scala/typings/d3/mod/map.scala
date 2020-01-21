package typings.d3.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.d3Collection.mod.Map_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "map")
@js.native
object map extends js.Object {
  def apply(obj: js.Object): Map_[_] = js.native
  def apply[T](): Map_[T] = js.native
  def apply[T](array: js.Array[T]): Map_[T] = js.native
  def apply[T](
    array: js.Array[T],
    key: js.Function3[/* value */ T, /* i */ js.UndefOr[Double], /* array */ js.UndefOr[js.Array[T]], String]
  ): Map_[T] = js.native
  def apply[T](d3Map: Map_[T]): Map_[T] = js.native
  def apply[T](obj: NumberDictionary[T]): Map_[T] = js.native
  def apply[T](obj: StringDictionary[T]): Map_[T] = js.native
}

