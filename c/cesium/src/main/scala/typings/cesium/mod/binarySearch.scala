package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binarySearch {
  
  @scala.inline
  def apply(array: js.Array[js.Any], itemToFind: js.Any, comparator: Comparator): Double = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], itemToFind.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("cesium", "binarySearch")
  @js.native
  val ^ : js.Any = js.native
  
  type Comparator = js.Function2[/* a */ js.Any, /* b */ js.Any, Double]
}
