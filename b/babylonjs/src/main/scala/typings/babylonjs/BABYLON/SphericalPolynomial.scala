package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SphericalPolynomial extends StObject {
  
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
