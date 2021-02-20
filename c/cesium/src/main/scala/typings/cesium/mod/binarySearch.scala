package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binarySearch {
  
  @JSImport("cesium", "binarySearch")
  @js.native
  def apply(array: js.Array[_], itemToFind: js.Any, comparator: Comparator): Double = js.native
  
  type Comparator = js.Function2[/* a */ js.Any, /* b */ js.Any, Double]
}
