package typings.d3Collection.mod

import org.scalablytyped.runtime.StringDictionary
import typings.d3Collection.AnonKey
import typings.d3Collection.AnonValue
import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-collection", "entries")
@js.native
object entries extends js.Object {
  def apply(obj: js.Object): js.Array[AnonValue] = js.native
  def apply[T](obj: StringDictionary[T]): js.Array[AnonKey[T]] = js.native
  def apply[T](obj: ArrayLike[T]): js.Array[AnonKey[T]] = js.native
}

