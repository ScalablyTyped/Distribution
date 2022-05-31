package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CubicRealPolynomial {
  
  @JSGlobal("Cesium.CubicRealPolynomial")
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeDiscriminant(a: Double, b: Double, c: Double, d: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDiscriminant")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def computeRealRoots(a: Double, b: Double, c: Double, d: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeRealRoots")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
