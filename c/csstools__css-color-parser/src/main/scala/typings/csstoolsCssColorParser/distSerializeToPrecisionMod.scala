package typings.csstoolsCssColorParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSerializeToPrecisionMod {
  
  @JSImport("@csstools/css-color-parser/dist/serialize/to-precision", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toPrecision(n: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("toPrecision")(n.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def toPrecision(n: Double, precision: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toPrecision")(n.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[Double]
}
