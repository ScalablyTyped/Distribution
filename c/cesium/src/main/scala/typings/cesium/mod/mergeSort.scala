package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeSort {
  
  @scala.inline
  def apply(array: js.Array[js.Any], comparator: Comparator): Unit = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(array: js.Array[js.Any], comparator: Comparator, userDefinedObject: js.Any): Unit = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any], userDefinedObject.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("cesium", "mergeSort")
  @js.native
  val ^ : js.Any = js.native
  
  type Comparator = js.Function3[/* a */ js.Any, /* b */ js.Any, /* userDefinedObject */ js.UndefOr[js.Any], Double]
}
