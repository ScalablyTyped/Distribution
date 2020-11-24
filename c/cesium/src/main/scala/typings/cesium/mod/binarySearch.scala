package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "binarySearch")
@js.native
object binarySearch extends js.Object {
  
  def apply(array: js.Array[_], itemToFind: js.Any, comparator: Comparator): Double = js.native
  
  type Comparator = js.Function2[/* a */ js.Any, /* b */ js.Any, Double]
}
