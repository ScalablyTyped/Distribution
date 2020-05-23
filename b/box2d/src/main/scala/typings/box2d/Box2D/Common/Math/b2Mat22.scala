package typings.box2d.Box2D.Common.Math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2Mat22 extends js.Object {
  /**
    * Column 1
    **/
  var col1: b2Vec2
  /**
    * Column 2
    **/
  var col2: b2Vec2
  /**
    * Sets all internal matrix values to absolute values.
    **/
  def Abs(): Unit
  /**
    * Adds the two 2x2 matricies together and stores the result in this matrix.
    * @param m 2x2 matrix to add.
    **/
  def AddM(m: b2Mat22): Unit
  /**
    * Creates a copy of the matrix.
    * @return Copy of this 2x2 matrix.
    **/
  def Copy(): b2Mat22
  /**
    * Gets the rotation matrix angle.
    * R(theta) = [ cos(theta)  -sin(theta) ]
    *            [ sin(theta)   cos(theta) ]
    * @return The rotation matrix angle (theta).
    **/
  def GetAngle(): Double
  /**
    * Compute the inverse of this matrix, such that inv(A) A = identity.
    * @param out Inverse matrix.
    * @return Inverse matrix.
    **/
  def GetInverse(out: b2Mat22): b2Mat22
  /**
    * Sets the 2x2 rotation matrix from the given angle.
    * R(theta) = [ cos(theta)  -sin(theta) ]
    *            [ sin(theta)   cos(theta) ]
    * @param angle Matrix angle (theta).
    **/
  def Set(angle: Double): Unit
  /**
    * Sets the 2x2 matrix to identity.
    **/
  def SetIdentity(): Unit
  /**
    * Sets the 2x2 matrix from a 2x2 matrix.
    * @param m 2x2 matrix values.
    **/
  def SetM(m: b2Mat22): Unit
  /**
    * Sets the 2x2 matrix from 2 column vectors.
    * @param c1 Column 1 vector.
    * @param c2 Column 2 vector.
    **/
  def SetVV(c1: b2Vec2, c2: b2Vec2): Unit
  /**
    * Sets the 2x2 matrix to all zeros.
    **/
  def SetZero(): Unit
  /**
    * TODO, has something to do with the determinant
    * @param out Solved vector
    * @param bX
    * @param bY
    * @return Solved vector
    **/
  def Solve(out: b2Vec2, bX: Double, bY: Double): b2Vec2
}

object b2Mat22 {
  @scala.inline
  def apply(
    Abs: () => Unit,
    AddM: b2Mat22 => Unit,
    Copy: () => b2Mat22,
    GetAngle: () => Double,
    GetInverse: b2Mat22 => b2Mat22,
    Set: Double => Unit,
    SetIdentity: () => Unit,
    SetM: b2Mat22 => Unit,
    SetVV: (b2Vec2, b2Vec2) => Unit,
    SetZero: () => Unit,
    Solve: (b2Vec2, Double, Double) => b2Vec2,
    col1: b2Vec2,
    col2: b2Vec2
  ): b2Mat22 = {
    val __obj = js.Dynamic.literal(Abs = js.Any.fromFunction0(Abs), AddM = js.Any.fromFunction1(AddM), Copy = js.Any.fromFunction0(Copy), GetAngle = js.Any.fromFunction0(GetAngle), GetInverse = js.Any.fromFunction1(GetInverse), Set = js.Any.fromFunction1(Set), SetIdentity = js.Any.fromFunction0(SetIdentity), SetM = js.Any.fromFunction1(SetM), SetVV = js.Any.fromFunction2(SetVV), SetZero = js.Any.fromFunction0(SetZero), Solve = js.Any.fromFunction3(Solve), col1 = col1.asInstanceOf[js.Any], col2 = col2.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2Mat22]
  }
}

