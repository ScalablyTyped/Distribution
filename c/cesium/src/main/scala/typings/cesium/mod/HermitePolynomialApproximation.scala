package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "HermitePolynomialApproximation")
@js.native
class HermitePolynomialApproximation () extends InterpolationAlgorithm
object HermitePolynomialApproximation {
  
  @JSImport("cesium", "HermitePolynomialApproximation")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getRequiredDataPoints(degree: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequiredDataPoints")(degree.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getRequiredDataPoints(degree: Double, inputOrder: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequiredDataPoints")(degree.asInstanceOf[js.Any], inputOrder.asInstanceOf[js.Any])).asInstanceOf[Double]
}
