package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SphericalPolynomial extends js.Object {
  
  var _harmonics: js.Any = js.native
  
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
