package typings.computeLcm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(a: js.Array[Double]): Double | Null = ^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
  inline def apply(a: Double, b: Double): Double | Null = (^.asInstanceOf[js.Dynamic].apply(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  // Function to extract number from an element from the data array
  inline def apply[T](dataArr: js.Array[T], a: Accessor[T]): Double | Null = (^.asInstanceOf[js.Dynamic].apply(dataArr.asInstanceOf[js.Any], a.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  
  @JSImport("compute-lcm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Accessor[T] = js.Function2[/* item */ T, /* idx */ Double, Double | Null]
}
