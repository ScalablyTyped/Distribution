package typings.babylonjs.mathsIndexMod

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Maths/index", "SphericalHarmonics")
@js.native
class SphericalHarmonics ()
  extends typings.babylonjs.sphericalPolynomialMod.SphericalHarmonics
/* static members */
object SphericalHarmonics {
  
  @JSImport("babylonjs/Maths/index", "SphericalHarmonics")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Constructs a spherical harmonics from an array.
    * @param data defines the 9x3 coefficients (l00, l1-1, l10, l11, l2-2, l2-1, l20, l21, l22)
    * @returns the spherical harmonics
    */
  inline def FromArray(data: ArrayLike[ArrayLike[Double]]): typings.babylonjs.sphericalPolynomialMod.SphericalHarmonics = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(data.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.sphericalPolynomialMod.SphericalHarmonics]
  
  /**
    * Gets the spherical harmonics from polynomial
    * @param polynomial the spherical polynomial
    * @returns the spherical harmonics
    */
  inline def FromPolynomial(polynomial: typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial): typings.babylonjs.sphericalPolynomialMod.SphericalHarmonics = ^.asInstanceOf[js.Dynamic].applyDynamic("FromPolynomial")(polynomial.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.sphericalPolynomialMod.SphericalHarmonics]
}
