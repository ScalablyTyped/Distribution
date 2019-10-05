package typings.d3.d3Mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.d3DashCollection.d3DashCollectionMod.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "map")
@js.native
object map extends js.Object {
  def apply(obj: js.Object): Map[_] = js.native
  def apply[T](): Map[T] = js.native
  def apply[T](array: js.Array[T]): Map[T] = js.native
  def apply[T](
    array: js.Array[T],
    key: js.Function3[/* value */ T, /* i */ js.UndefOr[Double], /* array */ js.UndefOr[js.Array[T]], String]
  ): Map[T] = js.native
  def apply[T](d3Map: Map[T]): Map[T] = js.native
  def apply[T](obj: NumberDictionary[T]): Map[T] = js.native
  def apply[T](obj: StringDictionary[T]): Map[T] = js.native
}

