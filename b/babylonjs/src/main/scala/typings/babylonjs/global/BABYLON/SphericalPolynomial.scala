package typings.babylonjs.global.BABYLON

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SphericalPolynomial")
@js.native
open class SphericalPolynomial ()
  extends StObject
     with typings.babylonjs.BABYLON.SphericalPolynomial
/* static members */
object SphericalPolynomial {
  
  @JSGlobal("BABYLON.SphericalPolynomial")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Constructs a spherical polynomial from an array.
    * @param data defines the 9x3 coefficients (x, y, z, xx, yy, zz, yz, zx, xy)
    * @returns the spherical polynomial
    */
  inline def FromArray(data: ArrayLike[ArrayLike[Double]]): typings.babylonjs.BABYLON.SphericalPolynomial = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(data.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.SphericalPolynomial]
  
  /**
    * Gets the spherical polynomial from harmonics
    * @param harmonics the spherical harmonics
    * @returns the spherical polynomial
    */
  inline def FromHarmonics(harmonics: typings.babylonjs.BABYLON.SphericalHarmonics): typings.babylonjs.BABYLON.SphericalPolynomial = ^.asInstanceOf[js.Dynamic].applyDynamic("FromHarmonics")(harmonics.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.BABYLON.SphericalPolynomial]
}
