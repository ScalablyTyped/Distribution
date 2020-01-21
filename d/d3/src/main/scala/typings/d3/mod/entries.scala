package typings.d3.mod

import org.scalablytyped.runtime.StringDictionary
import typings.d3Collection.AnonKey
import typings.d3Collection.AnonKeyValue
import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "entries")
@js.native
object entries extends js.Object {
  def apply(obj: js.Object): js.Array[AnonKeyValue] = js.native
  def apply[T](obj: StringDictionary[T]): js.Array[AnonKey[T]] = js.native
  def apply[T](obj: ArrayLike[T]): js.Array[AnonKey[T]] = js.native
}

