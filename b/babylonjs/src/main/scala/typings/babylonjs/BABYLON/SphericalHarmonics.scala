package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SphericalHarmonics extends StObject {
  
  /**
    * Adds a light to the spherical harmonics
    * @param direction the direction of the light
    * @param color the color of the light
    * @param deltaSolidAngle the delta solid angle of the light
    */
  def addLight(direction: Vector3, color: Color3, deltaSolidAngle: Double): Unit = js.native
  
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
  def convertIncidentRadianceToIrradiance(): Unit = js.native
  
  /**
    * Convert from irradiance to outgoing radiance for Lambertian BDRF, suitable for efficient shader evaluation.
    *
    * ```
    * L = (1/pi) * E * rho
    * ```
    *
    * This is done by an additional scale by 1/pi, so is a fairly trivial operation but important conceptually.
    */
  def convertIrradianceToLambertianRadiance(): Unit = js.native
  
  /**
    * The l0,0 coefficients of the spherical harmonics
    */
  var l00: Vector3 = js.native
  
  /**
    * The l1,0 coefficients of the spherical harmonics
    */
  var l10: Vector3 = js.native
  
  /**
    * The l1,1 coefficients of the spherical harmonics
    */
  var l11: Vector3 = js.native
  
  /**
    * The l1,-1 coefficients of the spherical harmonics
    */
  var l1_1: Vector3 = js.native
  
  /**
    * The l2,0 coefficients of the spherical harmonics
    */
  var l20: Vector3 = js.native
  
  /**
    * The l2,1 coefficients of the spherical harmonics
    */
  var l21: Vector3 = js.native
  
  /**
    * The l2,2 coefficients of the spherical harmonics
    */
  var l22: Vector3 = js.native
  
  /**
    * The l2,-1 coefficients of the spherical harmonics
    */
  var l2_1: Vector3 = js.native
  
  /**
    * The l2,-2 coefficients of the spherical harmonics
    */
  var l2_2: Vector3 = js.native
  
  /**
    * Integrates the reconstruction coefficients directly in to the SH preventing further
    * required operations at run time.
    *
    * This is simply done by scaling back the SH with Ylm constants parameter.
    * The trigonometric part being applied by the shader at run time.
    */
  def preScaleForRendering(): Unit = js.native
  
  /**
    * Defines whether or not the harmonics have been prescaled for rendering.
    */
  var preScaled: Boolean = js.native
  
  /**
    * Scales the spherical harmonics by the given amount
    * @param scale the amount to scale
    */
  def scaleInPlace(scale: Double): Unit = js.native
}
object SphericalHarmonics {
  
  @scala.inline
  def apply(
    addLight: (Vector3, Color3, Double) => Unit,
    convertIncidentRadianceToIrradiance: () => Unit,
    convertIrradianceToLambertianRadiance: () => Unit,
    l00: Vector3,
    l10: Vector3,
    l11: Vector3,
    l1_1: Vector3,
    l20: Vector3,
    l21: Vector3,
    l22: Vector3,
    l2_1: Vector3,
    l2_2: Vector3,
    preScaleForRendering: () => Unit,
    preScaled: Boolean,
    scaleInPlace: Double => Unit
  ): SphericalHarmonics = {
    val __obj = js.Dynamic.literal(addLight = js.Any.fromFunction3(addLight), convertIncidentRadianceToIrradiance = js.Any.fromFunction0(convertIncidentRadianceToIrradiance), convertIrradianceToLambertianRadiance = js.Any.fromFunction0(convertIrradianceToLambertianRadiance), l00 = l00.asInstanceOf[js.Any], l10 = l10.asInstanceOf[js.Any], l11 = l11.asInstanceOf[js.Any], l1_1 = l1_1.asInstanceOf[js.Any], l20 = l20.asInstanceOf[js.Any], l21 = l21.asInstanceOf[js.Any], l22 = l22.asInstanceOf[js.Any], l2_1 = l2_1.asInstanceOf[js.Any], l2_2 = l2_2.asInstanceOf[js.Any], preScaleForRendering = js.Any.fromFunction0(preScaleForRendering), preScaled = preScaled.asInstanceOf[js.Any], scaleInPlace = js.Any.fromFunction1(scaleInPlace))
    __obj.asInstanceOf[SphericalHarmonics]
  }
  
  @scala.inline
  implicit class SphericalHarmonicsMutableBuilder[Self <: SphericalHarmonics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddLight(value: (Vector3, Color3, Double) => Unit): Self = StObject.set(x, "addLight", js.Any.fromFunction3(value))
    
    @scala.inline
    def setConvertIncidentRadianceToIrradiance(value: () => Unit): Self = StObject.set(x, "convertIncidentRadianceToIrradiance", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConvertIrradianceToLambertianRadiance(value: () => Unit): Self = StObject.set(x, "convertIrradianceToLambertianRadiance", js.Any.fromFunction0(value))
    
    @scala.inline
    def setL00(value: Vector3): Self = StObject.set(x, "l00", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL10(value: Vector3): Self = StObject.set(x, "l10", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL11(value: Vector3): Self = StObject.set(x, "l11", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL1_1(value: Vector3): Self = StObject.set(x, "l1_1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL20(value: Vector3): Self = StObject.set(x, "l20", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL21(value: Vector3): Self = StObject.set(x, "l21", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL22(value: Vector3): Self = StObject.set(x, "l22", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL2_1(value: Vector3): Self = StObject.set(x, "l2_1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL2_2(value: Vector3): Self = StObject.set(x, "l2_2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreScaleForRendering(value: () => Unit): Self = StObject.set(x, "preScaleForRendering", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreScaled(value: Boolean): Self = StObject.set(x, "preScaled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleInPlace(value: Double => Unit): Self = StObject.set(x, "scaleInPlace", js.Any.fromFunction1(value))
  }
}
