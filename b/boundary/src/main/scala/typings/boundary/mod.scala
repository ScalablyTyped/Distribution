package typings.boundary

import typings.boundary.boundaryBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("boundary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def binarySearch(array: js.Array[Double], value: Double): `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearch")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[`false`]
  inline def binarySearch(array: js.Array[Double], value: Double, comp: CompareFunction): `false` = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearch")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], comp.asInstanceOf[js.Any])).asInstanceOf[`false`]
  
  inline def compare(v1: Double, v2: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def lowerBound(array: js.Array[Double], value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lowerBound")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def lowerBound(array: js.Array[Double], value: Double, comp: CompareFunction): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lowerBound")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], comp.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def upperBound(array: js.Array[Double], value: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("upperBound")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def upperBound(array: js.Array[Double], value: Double, comp: CompareFunction): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("upperBound")(array.asInstanceOf[js.Any], value.asInstanceOf[js.Any], comp.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  type CompareFunction = js.Function2[/* v1 */ Double, /* v2 */ Double, Boolean]
}
