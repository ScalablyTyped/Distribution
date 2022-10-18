package typings.chartist

import typings.chartist.anon.X
import typings.chartist.distCoreTypesMod.Bounds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreMathMod {
  
  @JSImport("chartist/dist/core/math", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chartist/dist/core/math", "EPSILON")
  @js.native
  val EPSILON: /* 2.221e-16 */ Double = js.native
  
  inline def orderOfMagnitude(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("orderOfMagnitude")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def polarToCartesian(centerX: Double, centerY: Double, radius: Double, angleInDegrees: Double): X = (^.asInstanceOf[js.Dynamic].applyDynamic("polarToCartesian")(centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], angleInDegrees.asInstanceOf[js.Any])).asInstanceOf[X]
  
  inline def projectLength(axisLength: Double, length: Double, bounds: Bounds): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("projectLength")(axisLength.asInstanceOf[js.Any], length.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def rho(num: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rho")(num.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def roundWithPrecision(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("roundWithPrecision")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def roundWithPrecision(value: Double, digits: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("roundWithPrecision")(value.asInstanceOf[js.Any], digits.asInstanceOf[js.Any])).asInstanceOf[Double]
}
