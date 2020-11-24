package typings.babylonjs.mathsIndexMod

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Maths/index", "SphericalPolynomial")
@js.native
class SphericalPolynomial ()
  extends typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial
/* static members */
@JSImport("babylonjs/Maths/index", "SphericalPolynomial")
@js.native
object SphericalPolynomial extends js.Object {
  
  /**
    * Constructs a spherical polynomial from an array.
    * @param data defines the 9x3 coefficients (x, y, z, xx, yy, zz, yz, zx, xy)
    * @returns the spherical polynomial
    */
  def FromArray(data: ArrayLike[ArrayLike[Double]]): typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial = js.native
  
  /**
    * Gets the spherical polynomial from harmonics
    * @param harmonics the spherical harmonics
    * @returns the spherical polynomial
    */
  def FromHarmonics(harmonics: typings.babylonjs.sphericalPolynomialMod.SphericalHarmonics): typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial = js.native
}
