package typings.d3Collection.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-collection", "map")
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

