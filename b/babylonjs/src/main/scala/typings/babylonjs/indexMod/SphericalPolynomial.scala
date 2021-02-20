package typings.babylonjs.indexMod

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "SphericalPolynomial")
@js.native
class SphericalPolynomial ()
  extends typings.babylonjs.mathsIndexMod.SphericalPolynomial
/* static members */
object SphericalPolynomial {
  
  /**
    * Constructs a spherical polynomial from an array.
    * @param data defines the 9x3 coefficients (x, y, z, xx, yy, zz, yz, zx, xy)
    * @returns the spherical polynomial
    */
  @JSImport("babylonjs/index", "SphericalPolynomial.FromArray")
  @js.native
  def FromArray(data: ArrayLike[ArrayLike[Double]]): typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial = js.native
  
  /**
    * Gets the spherical polynomial from harmonics
    * @param harmonics the spherical harmonics
    * @returns the spherical polynomial
    */
  @JSImport("babylonjs/index", "SphericalPolynomial.FromHarmonics")
  @js.native
  def FromHarmonics(harmonics: typings.babylonjs.sphericalPolynomialMod.SphericalHarmonics): typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial = js.native
}
