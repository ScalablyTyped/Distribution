package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Class representing spherical harmonics coefficients to the 3rd degree
     */
@JSImport("babylonjs", "SphericalHarmonics")
@js.native
class SphericalHarmonics ()
  extends babylonjsLib.BABYLONNs.SphericalHarmonics

/**
     * Class representing spherical harmonics coefficients to the 3rd degree
     */
@JSImport("babylonjs", "SphericalHarmonics")
@js.native
object SphericalHarmonics extends js.Object {
  /**
           * Constructs a spherical harmonics from an array.
           * @param data defines the 9x3 coefficients (l00, l1-1, l10, l11, l2-2, l2-1, l20, l21, l22)
           * @returns the spherical harmonics
           */
  def FromArray(data: stdLib.ArrayLike[stdLib.ArrayLike[scala.Double]]): babylonjsLib.BABYLONNs.SphericalHarmonics = js.native
  /**
           * Gets the spherical harmonics from polynomial
           * @param polynomial the spherical polynomial
           * @returns the spherical harmonics
           */
  def FromPolynomial(polynomial: babylonjsLib.BABYLONNs.SphericalPolynomial): babylonjsLib.BABYLONNs.SphericalHarmonics = js.native
}

