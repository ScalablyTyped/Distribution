package typings.box2d.Box2D.Common.Math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2Mat33 extends js.Object {
  /**
    * Column 1
    **/
  var col1: b2Vec3
  /**
    * Column 2
    **/
  var col2: b2Vec3
  /**
    * Column 3
    **/
  var col3: b2Vec3
  /**
    * Adds the two 3x3 matricies together and stores the result in this matrix.
    * @param m 3x3 matrix to add.
    **/
  def AddM(m: b2Mat33): Unit
  /**
    * Creates a copy of the matrix.
    * @return Copy of this 3x3 matrix.
    **/
  def Copy(): b2Mat33
  /**
    * Sets the 3x3 matrix to identity.
    **/
  def SetIdentity(): Unit
  /**
    * Sets the 3x3 matrix from a 3x3 matrix.
    * @param m 3x3 matrix values.
    **/
  def SetM(m: b2Mat33): Unit
  /**
    * Sets the 3x3 matrix from 3 column vectors.
    * @param c1 Column 1 vector.
    * @param c2 Column 2 vector.
    * @param c3 Column 2 vector.
    **/
  def SetVVV(c1: b2Vec3, c2: b2Vec3, c3: b2Vec3): Unit
  /**
    * Sets the 3x3 matrix to all zeros.
    **/
  def SetZero(): Unit
  /**
    * TODO, has something to do with the determinant
    * @param out Solved vector
    * @param bX
    * @param bY
    * @return Solved vector
    **/
  def Solve22(out: b2Vec2, bX: Double, bY: Double): b2Vec2
  /**
    * TODO, has something to do with the determinant
    * @param out Solved vector
    * @param bX
    * @param bY
    * @param bZ
    * @return Solved vector
    **/
  def Solve33(out: b2Vec3, bX: Double, bY: Double, bZ: Double): b2Vec3
}

object b2Mat33 {
  @scala.inline
  def apply(
    AddM: b2Mat33 => Unit,
    Copy: () => b2Mat33,
    SetIdentity: () => Unit,
    SetM: b2Mat33 => Unit,
    SetVVV: (b2Vec3, b2Vec3, b2Vec3) => Unit,
    SetZero: () => Unit,
    Solve22: (b2Vec2, Double, Double) => b2Vec2,
    Solve33: (b2Vec3, Double, Double, Double) => b2Vec3,
    col1: b2Vec3,
    col2: b2Vec3,
    col3: b2Vec3
  ): b2Mat33 = {
    val __obj = js.Dynamic.literal(AddM = js.Any.fromFunction1(AddM), Copy = js.Any.fromFunction0(Copy), SetIdentity = js.Any.fromFunction0(SetIdentity), SetM = js.Any.fromFunction1(SetM), SetVVV = js.Any.fromFunction3(SetVVV), SetZero = js.Any.fromFunction0(SetZero), Solve22 = js.Any.fromFunction3(Solve22), Solve33 = js.Any.fromFunction4(Solve33), col1 = col1.asInstanceOf[js.Any], col2 = col2.asInstanceOf[js.Any], col3 = col3.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2Mat33]
  }
}

