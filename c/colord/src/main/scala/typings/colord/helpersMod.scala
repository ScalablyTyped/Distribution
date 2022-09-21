package typings.colord

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("colord/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clamp(number: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(number.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def clamp(number: Double, min: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(number.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def clamp(number: Double, min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(number.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def clamp(number: Double, min: Unit, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(number.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def clampHue(degrees: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("clampHue")(degrees.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def floor(number: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("floor")(number.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def floor(number: Double, digits: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("floor")(number.asInstanceOf[js.Any], digits.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def floor(number: Double, digits: Double, base: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("floor")(number.asInstanceOf[js.Any], digits.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def floor(number: Double, digits: Unit, base: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("floor")(number.asInstanceOf[js.Any], digits.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isPresent(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPresent")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseHue(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHue")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def parseHue(value: String, unit: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHue")(value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def round(number: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("round")(number.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def round(number: Double, digits: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("round")(number.asInstanceOf[js.Any], digits.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def round(number: Double, digits: Double, base: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("round")(number.asInstanceOf[js.Any], digits.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def round(number: Double, digits: Unit, base: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("round")(number.asInstanceOf[js.Any], digits.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[Double]
}
