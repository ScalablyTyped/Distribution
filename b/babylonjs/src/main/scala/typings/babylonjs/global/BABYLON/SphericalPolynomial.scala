package typings.babylonjs.global.BABYLON

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.SphericalPolynomial")
@js.native
class SphericalPolynomial ()
  extends typings.babylonjs.BABYLON.SphericalPolynomial {
  /* CompleteClass */
  override var _harmonics: js.Any = js.native
  /**
    * The x coefficients of the spherical polynomial
    */
  /* CompleteClass */
  override var x: typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * The xx coefficients of the spherical polynomial
    */
  /* CompleteClass */
  override var xx: typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * The xy coefficients of the spherical polynomial
    */
  /* CompleteClass */
  override var xy: typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * The y coefficients of the spherical polynomial
    */
  /* CompleteClass */
  override var y: typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * The yy coefficients of the spherical polynomial
    */
  /* CompleteClass */
  override var yy: typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * The yz coefficients of the spherical polynomial
    */
  /* CompleteClass */
  override var yz: typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * The z coefficients of the spherical polynomial
    */
  /* CompleteClass */
  override var z: typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * The zx coefficients of the spherical polynomial
    */
  /* CompleteClass */
  override var zx: typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * The zz coefficients of the spherical polynomial
    */
  /* CompleteClass */
  override var zz: typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * Adds an ambient color to the spherical polynomial
    * @param color the color to add
    */
  /* CompleteClass */
  override def addAmbient(color: typings.babylonjs.BABYLON.Color3): Unit = js.native
  /**
    * The spherical harmonics used to create the polynomials.
    */
  /* CompleteClass */
  override def preScaledHarmonics: typings.babylonjs.BABYLON.SphericalHarmonics = js.native
  /**
    * Scales the spherical polynomial by the given amount
    * @param scale the amount to scale
    */
  /* CompleteClass */
  override def scaleInPlace(scale: Double): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.SphericalPolynomial")
@js.native
object SphericalPolynomial extends js.Object {
  /**
    * Constructs a spherical polynomial from an array.
    * @param data defines the 9x3 coefficients (x, y, z, xx, yy, zz, yz, zx, xy)
    * @returns the spherical polynomial
    */
  def FromArray(data: ArrayLike[ArrayLike[Double]]): typings.babylonjs.BABYLON.SphericalPolynomial = js.native
  /**
    * Gets the spherical polynomial from harmonics
    * @param harmonics the spherical harmonics
    * @returns the spherical polynomial
    */
  def FromHarmonics(harmonics: typings.babylonjs.BABYLON.SphericalHarmonics): typings.babylonjs.BABYLON.SphericalPolynomial = js.native
}

