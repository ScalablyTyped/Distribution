package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object QuadraticRealPolynomial {
  
  @JSImport("@cesium/engine", "QuadraticRealPolynomial")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Provides the discriminant of the quadratic equation from the supplied coefficients.
    * @param a - The coefficient of the 2nd order monomial.
    * @param b - The coefficient of the 1st order monomial.
    * @param c - The coefficient of the 0th order monomial.
    * @returns The value of the discriminant.
    */
  inline def computeDiscriminant(a: Double, b: Double, c: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDiscriminant")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Provides the real valued roots of the quadratic polynomial with the provided coefficients.
    * @param a - The coefficient of the 2nd order monomial.
    * @param b - The coefficient of the 1st order monomial.
    * @param c - The coefficient of the 0th order monomial.
    * @returns The real valued roots.
    */
  inline def computeRealRoots(a: Double, b: Double, c: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeRealRoots")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
