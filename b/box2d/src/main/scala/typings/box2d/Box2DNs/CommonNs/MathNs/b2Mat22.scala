package typings.box2d.Box2DNs.CommonNs.MathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Common.Math.b2Mat22")
@js.native
/**
		* Empty constructor
		**/
class b2Mat22 () extends js.Object {
  /**
  		* Column 1
  		**/
  var col1: b2Vec2 = js.native
  /**
  		* Column 2
  		**/
  var col2: b2Vec2 = js.native
  /**
  		* Sets all internal matrix values to absolute values.
  		**/
  def Abs(): Unit = js.native
  /**
  		* Adds the two 2x2 matricies together and stores the result in this matrix.
  		* @param m 2x2 matrix to add.
  		**/
  def AddM(m: b2Mat22): Unit = js.native
  /**
  		* Creates a copy of the matrix.
  		* @return Copy of this 2x2 matrix.
  		**/
  def Copy(): b2Mat22 = js.native
  /**
  		* Gets the rotation matrix angle.
  		* R(theta) = [ cos(theta)  -sin(theta) ]
  		*            [ sin(theta)   cos(theta) ]
  		* @return The rotation matrix angle (theta).
  		**/
  def GetAngle(): Double = js.native
  /**
  		* Compute the inverse of this matrix, such that inv(A) A = identity.
  		* @param out Inverse matrix.
  		* @return Inverse matrix.
  		**/
  def GetInverse(out: b2Mat22): b2Mat22 = js.native
  /**
  		* Sets the 2x2 rotation matrix from the given angle.
  		* R(theta) = [ cos(theta)  -sin(theta) ]
  		*            [ sin(theta)   cos(theta) ]
  		* @param angle Matrix angle (theta).
  		**/
  def Set(angle: Double): Unit = js.native
  /**
  		* Sets the 2x2 matrix to identity.
  		**/
  def SetIdentity(): Unit = js.native
  /**
  		* Sets the 2x2 matrix from a 2x2 matrix.
  		* @param m 2x2 matrix values.
  		**/
  def SetM(m: b2Mat22): Unit = js.native
  /**
  		* Sets the 2x2 matrix from 2 column vectors.
  		* @param c1 Column 1 vector.
  		* @param c2 Column 2 vector.
  		**/
  def SetVV(c1: b2Vec2, c2: b2Vec2): Unit = js.native
  /**
  		* Sets the 2x2 matrix to all zeros.
  		**/
  def SetZero(): Unit = js.native
  /**
  		* TODO, has something to do with the determinant
  		* @param out Solved vector
  		* @param bX
  		* @param bY
  		* @return Solved vector
  		**/
  def Solve(out: b2Vec2, bX: Double, bY: Double): b2Vec2 = js.native
}

/* static members */
@JSGlobal("Box2D.Common.Math.b2Mat22")
@js.native
object b2Mat22 extends js.Object {
  /**
  		* Creates a rotation 2x2 matrix from the given angle.
  		* R(theta) = [ cos(theta)  -sin(theta) ]
  		*            [ sin(theta)   cos(theta) ]
  		* @param angle Matrix angle (theta).
  		* @return 2x2 matrix.
  		**/
  def FromAngle(angle: Double): b2Mat22 = js.native
  /**
  		* Creates a 2x2 matrix from two columns.
  		* @param c1 Column 1 vector.
  		* @param c2 Column 2 vector.
  		* @return 2x2 matrix.
  		**/
  def FromVV(c1: b2Vec2, c2: b2Vec2): b2Mat22 = js.native
}

