package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Matrix3x3Helpers extends StObject {
  
  /**
    * Returns a new identity 3x3 matrix.
    */
  def identity(): js.Array[Double] = js.native
  
  def invert(m: js.Array[Double]): js.Array[Double] | Null = js.native
  /**
    * Returns the inverse of the given 3x3 matrix or null if it is not invertible.
    * @param m
    */
  def invert(m: Matrix3x3): js.Array[Double] | Null = js.native
  
  def mapPoints(m: js.Array[Double], points: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Maps the given 2d points according to the given 3x3 matrix.
    * @param m
    * @param points - the flattened points to map; the results are computed in place on this array.
    */
  def mapPoints(m: Matrix3x3, points: js.Array[Double]): js.Array[Double] = js.native
  
  /**
    * Multiplies the provided 3x3 matrices together from left to right.
    * @param matrices
    */
  def multiply(matrices: (Matrix3x3 | js.Array[Double])*): js.Array[Double] = js.native
  
  /**
    * Returns a new 3x3 matrix representing a rotation by n radians.
    * @param radians
    * @param px - the X value to rotate around, defaults to 0.
    * @param py - the Y value to rotate around, defaults to 0.
    */
  def rotated(radians: AngleInRadians): js.Array[Double] = js.native
  def rotated(radians: AngleInRadians, px: js.UndefOr[scala.Nothing], py: Double): js.Array[Double] = js.native
  def rotated(radians: AngleInRadians, px: Double): js.Array[Double] = js.native
  def rotated(radians: AngleInRadians, px: Double, py: Double): js.Array[Double] = js.native
  
  /**
    * Returns a new 3x3 matrix representing a scale in the x and y directions.
    * @param sx - the scale in the X direction.
    * @param sy - the scale in the Y direction.
    * @param px - the X value to scale from, defaults to 0.
    * @param py - the Y value to scale from, defaults to 0.
    */
  def scaled(sx: Double, sy: Double): js.Array[Double] = js.native
  def scaled(sx: Double, sy: Double, px: js.UndefOr[scala.Nothing], py: Double): js.Array[Double] = js.native
  def scaled(sx: Double, sy: Double, px: Double): js.Array[Double] = js.native
  def scaled(sx: Double, sy: Double, px: Double, py: Double): js.Array[Double] = js.native
  
  /**
    * Returns a new 3x3 matrix representing a scale in the x and y directions.
    * @param kx - the kurtosis in the X direction.
    * @param ky - the kurtosis in the Y direction.
    * @param px - the X value to skew from, defaults to 0.
    * @param py - the Y value to skew from, defaults to 0.
    */
  def skewed(kx: Double, ky: Double): js.Array[Double] = js.native
  def skewed(kx: Double, ky: Double, px: js.UndefOr[scala.Nothing], py: Double): js.Array[Double] = js.native
  def skewed(kx: Double, ky: Double, px: Double): js.Array[Double] = js.native
  def skewed(kx: Double, ky: Double, px: Double, py: Double): js.Array[Double] = js.native
  
  /**
    * Returns a new 3x3 matrix representing a translation in the x and y directions.
    * @param dx
    * @param dy
    */
  def translated(dx: Double, dy: Double): js.Array[Double] = js.native
}
