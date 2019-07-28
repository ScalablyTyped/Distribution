package typings.box2d.Box2DNs.CommonNs.MathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Common.Math.b2Mat33")
@js.native
class b2Mat33 protected () extends js.Object {
  /**
  		* Constructor
  		* @param c1 Column 1
  		* @param c2 Column 2
  		* @param c3 Column 3
  		**/
  def this(c1: b2Vec3, c2: b2Vec3, c3: b2Vec3) = this()
  /**
  		* Column 1
  		**/
  var col1: b2Vec3 = js.native
  /**
  		* Column 2
  		**/
  var col2: b2Vec3 = js.native
  /**
  		* Column 3
  		**/
  var col3: b2Vec3 = js.native
  /**
  		* Adds the two 3x3 matricies together and stores the result in this matrix.
  		* @param m 3x3 matrix to add.
  		**/
  def AddM(m: b2Mat33): Unit = js.native
  /**
  		* Creates a copy of the matrix.
  		* @return Copy of this 3x3 matrix.
  		**/
  def Copy(): b2Mat33 = js.native
  /**
  		* Sets the 3x3 matrix to identity.
  		**/
  def SetIdentity(): Unit = js.native
  /**
  		* Sets the 3x3 matrix from a 3x3 matrix.
  		* @param m 3x3 matrix values.
  		**/
  def SetM(m: b2Mat33): Unit = js.native
  /**
  		* Sets the 3x3 matrix from 3 column vectors.
  		* @param c1 Column 1 vector.
  		* @param c2 Column 2 vector.
  		* @param c3 Column 2 vector.
  		**/
  def SetVVV(c1: b2Vec3, c2: b2Vec3, c3: b2Vec3): Unit = js.native
  /**
  		* Sets the 3x3 matrix to all zeros.
  		**/
  def SetZero(): Unit = js.native
  /**
  		* TODO, has something to do with the determinant
  		* @param out Solved vector
  		* @param bX
  		* @param bY
  		* @return Solved vector
  		**/
  def Solve22(out: b2Vec2, bX: Double, bY: Double): b2Vec2 = js.native
  /**
  		* TODO, has something to do with the determinant
  		* @param out Solved vector
  		* @param bX
  		* @param bY
  		* @param bZ
  		* @return Solved vector
  		**/
  def Solve33(out: b2Vec3, bX: Double, bY: Double, bZ: Double): b2Vec3 = js.native
}

