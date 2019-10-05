package typings.d3.d3Mod

import typings.d3DashCollection.d3DashCollectionMod.Set
import typings.d3DashCollection.d3DashCollectionMod.Stringifiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "set")
@js.native
object set extends js.Object {
  def apply(): Set = js.native
  def apply(array: js.Array[String | Stringifiable]): Set = js.native
  def apply(d3Set: Set): Set = js.native
  def apply[T](
    array: js.Array[T],
    key: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], String]
  ): Set = js.native
}

