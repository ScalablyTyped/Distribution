package typings.d3.mod

import org.scalablytyped.runtime.StringDictionary
import typings.d3Collection.anon.Key
import typings.d3Collection.anon.Value
import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "entries")
@js.native
object entries extends js.Object {
  def apply(obj: js.Object): js.Array[Value] = js.native
  def apply[T](obj: StringDictionary[T]): js.Array[Key[T]] = js.native
  def apply[T](obj: ArrayLike[T]): js.Array[Key[T]] = js.native
}

