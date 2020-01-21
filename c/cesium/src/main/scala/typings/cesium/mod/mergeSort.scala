package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "mergeSort")
@js.native
object mergeSort extends js.Object {
  def apply(array: js.Array[_], comparator: Comparator): js.UndefOr[scala.Nothing] = js.native
  def apply(array: js.Array[_], comparator: Comparator, userDefinedObject: js.Any): js.UndefOr[scala.Nothing] = js.native
  type Comparator = js.Function3[/* a */ js.Any, /* b */ js.Any, /* userDefinedObject */ js.UndefOr[js.Any], Double]
}

