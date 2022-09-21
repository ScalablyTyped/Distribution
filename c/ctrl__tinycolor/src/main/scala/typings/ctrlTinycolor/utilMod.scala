package typings.ctrlTinycolor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("@ctrl/tinycolor/dist/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bound01(n: Any, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bound01")(n.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def boundAlpha(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("boundAlpha")().asInstanceOf[Double]
  inline def boundAlpha(a: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("boundAlpha")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def boundAlpha(a: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("boundAlpha")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def clamp01(`val`: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("clamp01")(`val`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def convertToPercentage(n: String): Double | String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToPercentage")(n.asInstanceOf[js.Any]).asInstanceOf[Double | String]
  inline def convertToPercentage(n: Double): Double | String = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToPercentage")(n.asInstanceOf[js.Any]).asInstanceOf[Double | String]
  
  inline def isOnePointZero(n: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOnePointZero")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isOnePointZero(n: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOnePointZero")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPercentage(n: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPercentage")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isPercentage(n: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPercentage")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def pad2(c: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pad2")(c.asInstanceOf[js.Any]).asInstanceOf[String]
}
