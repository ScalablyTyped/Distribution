package typings.babylonjs.global.BABYLON

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.SphericalHarmonics")
@js.native
class SphericalHarmonics ()
  extends typings.babylonjs.BABYLON.SphericalHarmonics {
  /**
    * The l0,0 coefficients of the spherical harmonics
    */
  /* CompleteClass */
  override var l00: typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * The l1,0 coefficients of the spherical harmonics
    */
  /* CompleteClass */
  override var l10: typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * The l1,1 coefficients of the spherical harmonics
    */
  /* CompleteClass */
  override var l11: typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * The l1,-1 coefficients of the spherical harmonics
    */
  /* CompleteClass */
  override var l1_1: typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * The l2,0 coefficients of the spherical harmonics
    */
  /* CompleteClass */
  override var l20: typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * The l2,1 coefficients of the spherical harmonics
    */
  /* CompleteClass */
  override var l21: typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * The l2,2 coefficients of the spherical harmonics
    */
  /* CompleteClass */
  override var l22: typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * The l2,-1 coefficients of the spherical harmonics
    */
  /* CompleteClass */
  override var l2_1: typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * The l2,-2 coefficients of the spherical harmonics
    */
  /* CompleteClass */
  override var l2_2: typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * Defines whether or not the harmonics have been prescaled for rendering.
    */
  /* CompleteClass */
  override var preScaled: Boolean = js.native
  /**
    * Adds a light to the spherical harmonics
    * @param direction the direction of the light
    * @param color the color of the light
    * @param deltaSolidAngle the delta solid angle of the light
    */
  /* CompleteClass */
  override def addLight(
    direction: typings.babylonjs.BABYLON.Vector3,
    color: typings.babylonjs.BABYLON.Color3,
    deltaSolidAngle: Double
  ): Unit = js.native
  /**
    * Convert from incident radiance (Li) to irradiance (E) by applying convolution with the cosine-weighted hemisphere.
    *
    * ```
    * E_lm = A_l * L_lm
    * ```
    *
    * In spherical harmonics this convolution amounts to scaling factors for each frequency band.
    * This corresponds to equation 5 in "An Efficient Representation for Irradiance Environment Maps", where
    * the scaling factors are given in equation 9.
    */
  /* CompleteClass */
  override def convertIncidentRadianceToIrradiance(): Unit = js.native
  /**
    * Convert from irradiance to outgoing radiance for Lambertian BDRF, suitable for efficient shader evaluation.
    *
    * ```
    * L = (1/pi) * E * rho
    * ```
    *
    * This is done by an additional scale by 1/pi, so is a fairly trivial operation but important conceptually.
    */
  /* CompleteClass */
  override def convertIrradianceToLambertianRadiance(): Unit = js.native
  /**
    * Integrates the reconstruction coefficients directly in to the SH preventing further
    * required operations at run time.
    *
    * This is simply done by scaling back the SH with Ylm constants parameter.
    * The trigonometric part being applied by the shader at run time.
    */
  /* CompleteClass */
  override def preScaleForRendering(): Unit = js.native
  /**
    * Scales the spherical harmonics by the given amount
    * @param scale the amount to scale
    */
  /* CompleteClass */
  override def scaleInPlace(scale: Double): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.SphericalHarmonics")
@js.native
object SphericalHarmonics extends js.Object {
  /**
    * Constructs a spherical harmonics from an array.
    * @param data defines the 9x3 coefficients (l00, l1-1, l10, l11, l2-2, l2-1, l20, l21, l22)
    * @returns the spherical harmonics
    */
  def FromArray(data: ArrayLike[ArrayLike[Double]]): typings.babylonjs.BABYLON.SphericalHarmonics = js.native
  /**
    * Gets the spherical harmonics from polynomial
    * @param polynomial the spherical polynomial
    * @returns the spherical harmonics
    */
  def FromPolynomial(polynomial: typings.babylonjs.BABYLON.SphericalPolynomial): typings.babylonjs.BABYLON.SphericalHarmonics = js.native
}

