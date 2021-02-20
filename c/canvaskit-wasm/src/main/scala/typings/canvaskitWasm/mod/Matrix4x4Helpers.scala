package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Matrix4x4Helpers extends StObject {
  
  /**
    * Returns a new identity 4x4 matrix.
    */
  def identity(): js.Array[Double] = js.native
  
  def invert(matrix: js.Array[Double]): js.Array[Double] | Null = js.native
  /**
    * Returns the inverse of the given 4x4 matrix or null if it is not invertible.
    * @param matrix
    */
  def invert(matrix: Matrix4x4): js.Array[Double] | Null = js.native
  
  /**
    * Return a new 4x4 matrix representing a camera at eyeVec, pointed at centerVec.
    * @param eyeVec
    * @param centerVec
    * @param upVec
    */
  def lookat(eyeVec: Vector3, centerVec: Vector3, upVec: Vector3): js.Array[Double] = js.native
  
  /**
    * Multiplies the provided 4x4 matrices together from left to right.
    * @param matrices
    */
  def multiply(matrices: (Matrix4x4 | js.Array[Double])*): js.Array[Double] = js.native
  
  def mustInvert(matrix: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Returns the inverse of the given 4x4 matrix or throws if it is not invertible.
    * @param matrix
    */
  def mustInvert(matrix: Matrix4x4): js.Array[Double] = js.native
  
  /**
    * Returns a new 4x4 matrix representing a perspective.
    * @param near
    * @param far
    * @param radians
    */
  def perspective(near: Double, far: Double, radians: AngleInRadians): js.Array[Double] = js.native
  
  def rc(matrix: js.Array[Double], row: Double, col: Double): Double = js.native
  /**
    * Returns the value at the specified row and column of the given 4x4 matrix.
    * @param matrix
    * @param row
    * @param col
    */
  def rc(matrix: Matrix4x4, row: Double, col: Double): Double = js.native
  
  /**
    * Returns a new 4x4 matrix representing a rotation around the provided vector.
    * @param axis
    * @param radians
    */
  def rotated(axis: Vector3, radians: AngleInRadians): js.Array[Double] = js.native
  
  /**
    * Returns a new 4x4 matrix representing a rotation around the provided vector.
    * Rotation is provided redundantly as both sin and cos values.
    * This rotate can be used when you already have the cosAngle and sinAngle values
    * so you don't have to atan(cos/sin) to call roatated() which expects an angle in radians.
    * This does no checking! Behavior for invalid sin or cos values or non-normalized axis vectors
    * is incorrect. Prefer rotated().
    * @param axis
    * @param sinAngle
    * @param cosAngle
    */
  def rotatedUnitSinCos(axis: Vector3, sinAngle: Double, cosAngle: Double): js.Array[Double] = js.native
  
  /**
    * Returns a new 4x4 matrix representing a scale by the provided vector.
    * @param vec
    */
  def scaled(vec: Vector3): js.Array[Double] = js.native
  
  /**
    * Returns a new 4x4 matrix that sets up a 3D perspective view from a given camera.
    * @param area - describes the viewport. (0, 0, canvas_width, canvas_height) suggested.
    * @param zScale - describes the scale of the z axis. min(width, height)/2 suggested
    * @param cam
    */
  def setupCamera(area: InputRect, zScale: Double, cam: Camera): js.Array[Double] = js.native
  
  /**
    * Returns a new 4x4 matrix representing a translation by the provided vector.
    * @param vec
    */
  def translated(vec: Vector3): js.Array[Double] = js.native
  
  def transpose(matrix: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Returns a new 4x4 matrix that is the transpose of this 4x4 matrix.
    * @param matrix
    */
  def transpose(matrix: Matrix4x4): js.Array[Double] = js.native
}
