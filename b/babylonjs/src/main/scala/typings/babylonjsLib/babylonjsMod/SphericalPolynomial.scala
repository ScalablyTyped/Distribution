package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class representing spherical polynomial coefficients to the 3rd degree
  */
@JSImport("babylonjs", "SphericalPolynomial")
@js.native
class SphericalPolynomial ()
  extends babylonjsLib.BABYLONNs.SphericalPolynomial

/**
  * Class representing spherical polynomial coefficients to the 3rd degree
  */
@JSImport("babylonjs", "SphericalPolynomial")
@js.native
object SphericalPolynomial extends js.Object {
  /**
    * Constructs a spherical polynomial from an array.
    * @param data defines the 9x3 coefficients (x, y, z, xx, yy, zz, yz, zx, xy)
    * @returns the spherical polynomial
    */
  def FromArray(data: stdLib.ArrayLike[stdLib.ArrayLike[scala.Double]]): babylonjsLib.BABYLONNs.SphericalPolynomial = js.native
  /**
    * Gets the spherical polynomial from harmonics
    * @param harmonics the spherical harmonics
    * @returns the spherical polynomial
    */
  def FromHarmonics(harmonics: babylonjsLib.BABYLONNs.SphericalHarmonics): babylonjsLib.BABYLONNs.SphericalPolynomial = js.native
}

