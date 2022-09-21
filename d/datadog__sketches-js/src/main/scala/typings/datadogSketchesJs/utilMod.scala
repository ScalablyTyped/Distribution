package typings.datadogSketchesJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@datadog/sketches-js/dist/ddsketch/store/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sumOfRange(array: js.Array[Double], start: Double, end: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sumOfRange")(array.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Double]
}
