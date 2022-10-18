package typings.cesium

import typings.cesium.mod.mergeSortComparator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreMergeSortMod {
  
  @JSImport("cesium/Source/Core/mergeSort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(array: js.Array[Any], comparator: mergeSortComparator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(array.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(array: js.Array[Any], comparator: mergeSortComparator, userDefinedObject: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(array.asInstanceOf[js.Any], comparator.asInstanceOf[js.Any], userDefinedObject.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
