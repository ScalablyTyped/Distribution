package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.HermitePolynomialApproximation")
@js.native
class HermitePolynomialApproximation ()
  extends typings.cesium.mod.HermitePolynomialApproximation
object HermitePolynomialApproximation {
  
  @JSGlobal("Cesium.HermitePolynomialApproximation")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getRequiredDataPoints(degree: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequiredDataPoints")(degree.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getRequiredDataPoints(degree: Double, inputOrder: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequiredDataPoints")(degree.asInstanceOf[js.Any], inputOrder.asInstanceOf[js.Any])).asInstanceOf[Double]
}
