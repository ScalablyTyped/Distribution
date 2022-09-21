package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object QuarticRealPolynomial {
  
  @JSImport("cesium", "QuarticRealPolynomial")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Provides the discriminant of the quartic equation from the supplied coefficients.
    * @param a - The coefficient of the 4th order monomial.
    * @param b - The coefficient of the 3rd order monomial.
    * @param c - The coefficient of the 2nd order monomial.
    * @param d - The coefficient of the 1st order monomial.
    * @param e - The coefficient of the 0th order monomial.
    * @returns The value of the discriminant.
    */
  inline def computeDiscriminant(a: Double, b: Double, c: Double, d: Double, e: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("computeDiscriminant")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Provides the real valued roots of the quartic polynomial with the provided coefficients.
    * @param a - The coefficient of the 4th order monomial.
    * @param b - The coefficient of the 3rd order monomial.
    * @param c - The coefficient of the 2nd order monomial.
    * @param d - The coefficient of the 1st order monomial.
    * @param e - The coefficient of the 0th order monomial.
    * @returns The real valued roots.
    */
  inline def computeRealRoots(a: Double, b: Double, c: Double, d: Double, e: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("computeRealRoots")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
