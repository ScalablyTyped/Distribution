package typings.cesium

import typings.cesium.mod.binarySearchComparator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binarySearchMod {
  
  @JSImport("cesium/Source/Core/binarySearch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(array: js.Array[Any], itemToFind: Any, comparator: binarySearchComparator): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(array.asInstanceOf[js.Any], itemToFind.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[Double]
}
