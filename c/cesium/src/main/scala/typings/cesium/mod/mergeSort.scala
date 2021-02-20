package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeSort {
  
  @JSImport("cesium", "mergeSort")
  @js.native
  def apply(array: js.Array[_], comparator: Comparator): js.UndefOr[scala.Nothing] = js.native
  @JSImport("cesium", "mergeSort")
  @js.native
  def apply(array: js.Array[_], comparator: Comparator, userDefinedObject: js.Any): js.UndefOr[scala.Nothing] = js.native
  
  type Comparator = js.Function3[/* a */ js.Any, /* b */ js.Any, /* userDefinedObject */ js.UndefOr[js.Any], Double]
}
