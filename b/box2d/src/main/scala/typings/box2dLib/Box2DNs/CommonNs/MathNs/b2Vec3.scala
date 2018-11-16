package typings
package box2dLib.Box2DNs.CommonNs.MathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Common.Math.b2Vec3")
@js.native
class b2Vec3 () extends js.Object {
  /**
  		* Construct using coordinates x,y,z.
  		* @param x x value, default = 0.
  		* @param y y value, default = 0.
  		* @param z z value, default = 0.
  		**/
  def this(x: scala.Double) = this()
  /**
  		* Construct using coordinates x,y,z.
  		* @param x x value, default = 0.
  		* @param y y value, default = 0.
  		* @param z z value, default = 0.
  		**/
  def this(x: scala.Double, y: scala.Double) = this()
  /**
  		* Construct using coordinates x,y,z.
  		* @param x x value, default = 0.
  		* @param y y value, default = 0.
  		* @param z z value, default = 0.
  		**/
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
  /**
  		* x value.
  		**/
  var x: scala.Double = js.native
  /**
  		* y value.
  		**/
  var y: scala.Double = js.native
  /**
  		* z value.
  		**/
  var z: scala.Double = js.native
  /**
  		* Adds the vector 3 to this vector 3.  The result is stored in this vector 3.
  		* @param v Vector 3 to add.
  		**/
  def Add(v: b2Vec3): scala.Unit = js.native
  /**
  		* Creates a copy of the vector 3.
  		* @return Copy of this vector 3.
  		**/
  def Copy(): b2Vec3 = js.native
  /**
  		* Gets the negative of this vector 3.
  		* @return Negative copy of this vector 3.
  		**/
  def GetNegative(): b2Vec3 = js.native
  /**
  		* Vector multiplication.  Stores the result in this vector 3.
  		* @param a Value to multiple the vector's values by.
  		**/
  def Multiply(a: scala.Double): scala.Unit = js.native
  /**
  		* Sets this vector 3 to its negative.
  		**/
  def NegativeSelf(): scala.Unit = js.native
  /**
  		* Sets the vector 3.
  		* @param x x value, default is 0.
  		* @param y y value, default is 0.
  		* @param z z value, default is 0.
  		**/
  def Set(): scala.Unit = js.native
  /**
  		* Sets the vector 3.
  		* @param x x value, default is 0.
  		* @param y y value, default is 0.
  		* @param z z value, default is 0.
  		**/
  def Set(x: scala.Double): scala.Unit = js.native
  /**
  		* Sets the vector 3.
  		* @param x x value, default is 0.
  		* @param y y value, default is 0.
  		* @param z z value, default is 0.
  		**/
  def Set(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
  		* Sets the vector 3.
  		* @param x x value, default is 0.
  		* @param y y value, default is 0.
  		* @param z z value, default is 0.
  		**/
  def Set(x: scala.Double, y: scala.Double, z: scala.Double): scala.Unit = js.native
  /**
  		* Sets the vector 3 from a vector 3.
  		* @param v Vector 3 to copy values from.
  		**/
  def SetV(v: b2Vec3): scala.Unit = js.native
  /**
  		* Sets the vector 3 to zero values.
  		**/
  def SetZero(): scala.Unit = js.native
  /**
  		* Subtracts the vector 3 from this vector 3.  The result is stored in this vector 3.
  		* @param v Vector 3 to subtract.
  		**/
  def Subtract(v: b2Vec3): scala.Unit = js.native
}

