package typings.blueprintjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsUtilsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/common/utils/jsUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def approxEqual(a: Double, b: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("approxEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def approxEqual(a: Double, b: Double, tolerance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("approxEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], tolerance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def arrayLengthCompare(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayLengthCompare")().asInstanceOf[Double]
  inline def arrayLengthCompare(a: js.Array[js.Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayLengthCompare")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def arrayLengthCompare(a: js.Array[js.Any], b: js.Array[js.Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayLengthCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def arrayLengthCompare(a: Unit, b: js.Array[js.Any]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayLengthCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def clamp(`val`: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(`val`.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def countDecimalPlaces(num: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("countDecimalPlaces")(num.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isNodeEnv(env: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNodeEnv")(env.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
