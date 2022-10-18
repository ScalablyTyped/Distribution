package typings.babylonjs

import typings.babylonjs.mathsMathDotcolorMod.Color3
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mathsSphericalPolynomialMod {
  
  @JSImport("babylonjs/Maths/sphericalPolynomial", "SphericalHarmonics")
  @js.native
  open class SphericalHarmonics () extends StObject {
    
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
    
    /**
      * update the spherical harmonics coefficients from the given array
      * @param data defines the 9x3 coefficients (l00, l1-1, l10, l11, l2-2, l2-1, l20, l21, l22)
      * @returns the spherical harmonics (this)
      */
    def updateFromArray(data: ArrayLike[ArrayLike[Double]]): SphericalHarmonics = js.native
    
    /**
      * update the spherical harmonics coefficients from the given floats array
      * @param data defines the 9x3 coefficients (l00, l1-1, l10, l11, l2-2, l2-1, l20, l21, l22)
      * @returns the spherical harmonics (this)
      */
    def updateFromFloatsArray(data: ArrayLike[Double]): SphericalHarmonics = js.native
  }
  /* static members */
  object SphericalHarmonics {
    
    @JSImport("babylonjs/Maths/sphericalPolynomial", "SphericalHarmonics")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constructs a spherical harmonics from an array.
      * @param data defines the 9x3 coefficients (l00, l1-1, l10, l11, l2-2, l2-1, l20, l21, l22)
      * @returns the spherical harmonics
      */
    inline def FromArray(data: ArrayLike[ArrayLike[Double]]): SphericalHarmonics = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(data.asInstanceOf[js.Any]).asInstanceOf[SphericalHarmonics]
    
    /**
      * Gets the spherical harmonics from polynomial
      * @param polynomial the spherical polynomial
      * @returns the spherical harmonics
      */
    inline def FromPolynomial(polynomial: SphericalPolynomial): SphericalHarmonics = ^.asInstanceOf[js.Dynamic].applyDynamic("FromPolynomial")(polynomial.asInstanceOf[js.Any]).asInstanceOf[SphericalHarmonics]
  }
  
  @JSImport("babylonjs/Maths/sphericalPolynomial", "SphericalPolynomial")
  @js.native
  open class SphericalPolynomial () extends StObject {
    
    /* private */ var _harmonics: Any = js.native
    
    /**
      * Adds an ambient color to the spherical polynomial
      * @param color the color to add
      */
    def addAmbient(color: Color3): Unit = js.native
    
    /**
      * The spherical harmonics used to create the polynomials.
      */
    def preScaledHarmonics: SphericalHarmonics = js.native
    
    /**
      * Scales the spherical polynomial by the given amount
      * @param scale the amount to scale
      */
    def scaleInPlace(scale: Double): Unit = js.native
    
    /**
      * Updates the spherical polynomial from harmonics
      * @param harmonics the spherical harmonics
      * @returns the spherical polynomial
      */
    def updateFromHarmonics(harmonics: SphericalHarmonics): SphericalPolynomial = js.native
    
    /**
      * The x coefficients of the spherical polynomial
      */
    var x: Vector3 = js.native
    
    /**
      * The xx coefficients of the spherical polynomial
      */
    var xx: Vector3 = js.native
    
    /**
      * The xy coefficients of the spherical polynomial
      */
    var xy: Vector3 = js.native
    
    /**
      * The y coefficients of the spherical polynomial
      */
    var y: Vector3 = js.native
    
    /**
      * The yy coefficients of the spherical polynomial
      */
    var yy: Vector3 = js.native
    
    /**
      * The yz coefficients of the spherical polynomial
      */
    var yz: Vector3 = js.native
    
    /**
      * The z coefficients of the spherical polynomial
      */
    var z: Vector3 = js.native
    
    /**
      * The zx coefficients of the spherical polynomial
      */
    var zx: Vector3 = js.native
    
    /**
      * The zz coefficients of the spherical polynomial
      */
    var zz: Vector3 = js.native
  }
  /* static members */
  object SphericalPolynomial {
    
    @JSImport("babylonjs/Maths/sphericalPolynomial", "SphericalPolynomial")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Constructs a spherical polynomial from an array.
      * @param data defines the 9x3 coefficients (x, y, z, xx, yy, zz, yz, zx, xy)
      * @returns the spherical polynomial
      */
    inline def FromArray(data: ArrayLike[ArrayLike[Double]]): SphericalPolynomial = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(data.asInstanceOf[js.Any]).asInstanceOf[SphericalPolynomial]
    
    /**
      * Gets the spherical polynomial from harmonics
      * @param harmonics the spherical harmonics
      * @returns the spherical polynomial
      */
    inline def FromHarmonics(harmonics: SphericalHarmonics): SphericalPolynomial = ^.asInstanceOf[js.Dynamic].applyDynamic("FromHarmonics")(harmonics.asInstanceOf[js.Any]).asInstanceOf[SphericalPolynomial]
  }
}
