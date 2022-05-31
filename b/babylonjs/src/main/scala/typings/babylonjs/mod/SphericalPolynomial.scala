package typings.babylonjs.mod

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "SphericalPolynomial")
@js.native
class SphericalPolynomial ()
  extends typings.babylonjs.legacyMod.SphericalPolynomial
/* static members */
object SphericalPolynomial {
  
  @JSImport("babylonjs", "SphericalPolynomial")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Constructs a spherical polynomial from an array.
    * @param data defines the 9x3 coefficients (x, y, z, xx, yy, zz, yz, zx, xy)
    * @returns the spherical polynomial
    */
  inline def FromArray(data: ArrayLike[ArrayLike[Double]]): typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(data.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial]
  
  /**
    * Gets the spherical polynomial from harmonics
    * @param harmonics the spherical harmonics
    * @returns the spherical polynomial
    */
  inline def FromHarmonics(harmonics: typings.babylonjs.sphericalPolynomialMod.SphericalHarmonics): typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial = ^.asInstanceOf[js.Dynamic].applyDynamic("FromHarmonics")(harmonics.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial]
}
