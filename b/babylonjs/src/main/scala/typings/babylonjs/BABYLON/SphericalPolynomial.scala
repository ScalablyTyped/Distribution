package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SphericalPolynomial extends js.Object {
  var _harmonics: js.Any
  /**
    * The x coefficients of the spherical polynomial
    */
  var x: Vector3
  /**
    * The xx coefficients of the spherical polynomial
    */
  var xx: Vector3
  /**
    * The xy coefficients of the spherical polynomial
    */
  var xy: Vector3
  /**
    * The y coefficients of the spherical polynomial
    */
  var y: Vector3
  /**
    * The yy coefficients of the spherical polynomial
    */
  var yy: Vector3
  /**
    * The yz coefficients of the spherical polynomial
    */
  var yz: Vector3
  /**
    * The z coefficients of the spherical polynomial
    */
  var z: Vector3
  /**
    * The zx coefficients of the spherical polynomial
    */
  var zx: Vector3
  /**
    * The zz coefficients of the spherical polynomial
    */
  var zz: Vector3
  /**
    * Adds an ambient color to the spherical polynomial
    * @param color the color to add
    */
  def addAmbient(color: Color3): Unit
  /**
    * The spherical harmonics used to create the polynomials.
    */
  def preScaledHarmonics: SphericalHarmonics
  /**
    * Scales the spherical polynomial by the given amount
    * @param scale the amount to scale
    */
  def scaleInPlace(scale: Double): Unit
}

object SphericalPolynomial {
  @scala.inline
  def apply(
    _harmonics: js.Any,
    addAmbient: Color3 => Unit,
    preScaledHarmonics: () => SphericalHarmonics,
    scaleInPlace: Double => Unit,
    x: Vector3,
    xx: Vector3,
    xy: Vector3,
    y: Vector3,
    yy: Vector3,
    yz: Vector3,
    z: Vector3,
    zx: Vector3,
    zz: Vector3
  ): SphericalPolynomial = {
    val __obj = js.Dynamic.literal(_harmonics = _harmonics.asInstanceOf[js.Any], addAmbient = js.Any.fromFunction1(addAmbient), preScaledHarmonics = js.Any.fromFunction0(preScaledHarmonics), scaleInPlace = js.Any.fromFunction1(scaleInPlace), x = x.asInstanceOf[js.Any], xx = xx.asInstanceOf[js.Any], xy = xy.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yy = yy.asInstanceOf[js.Any], yz = yz.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any], zx = zx.asInstanceOf[js.Any], zz = zz.asInstanceOf[js.Any])
    __obj.asInstanceOf[SphericalPolynomial]
  }
}

