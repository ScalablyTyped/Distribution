package typings
package box2dLib.Box2DNs.CommonNs.MathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Common.Math.b2Vec2")
@js.native
class b2Vec2 () extends js.Object {
  /**
  		* Creates a new vector 2.
  		* @param x x value, default = 0.
  		* @param y y value, default = 0.
  		**/
  def this(x: scala.Double) = this()
  /**
  		* Creates a new vector 2.
  		* @param x x value, default = 0.
  		* @param y y value, default = 0.
  		**/
  def this(x: scala.Double, y: scala.Double) = this()
  /**
  		* x value
  		**/
  var x: scala.Double = js.native
  /**
  		* y value
  		**/
  var y: scala.Double = js.native
  /**
  		* Sets x and y to absolute values.
  		**/
  def Abs(): scala.Unit = js.native
  /**
  		* Adds the vector 2 to this vector 2.  The result is stored in this vector 2.
  		* @param v Vector 2 to add.
  		**/
  def Add(v: b2Vec2): scala.Unit = js.native
  /**
  		* Creates a copy of the vector 2.
  		* @return Copy of this vector 2.
  		**/
  def Copy(): b2Vec2 = js.native
  /**
  		* Cross F V
  		* @param s
  		**/
  def CrossFV(s: scala.Double): scala.Unit = js.native
  /**
  		* Cross V F
  		* @param s
  		**/
  def CrossVF(s: scala.Double): scala.Unit = js.native
  /**
  		* Gets the negative of this vector 2.
  		* @return Negative copy of this vector 2.
  		**/
  def GetNegative(): b2Vec2 = js.native
  /**
  		* True if the vector 2 is valid, otherwise false.  A valid vector has finite values.
  		* @return True if the vector 2 is valid, otherwise false.
  		**/
  def IsValid(): scala.Boolean = js.native
  /**
  		* Calculates the length of the vector 2.
  		* @return The length of the vector 2.
  		**/
  def Length(): scala.Double = js.native
  /**
  		* Calculates the length squared of the vector2.
  		* @return The length squared of the vector 2.
  		**/
  def LengthSquared(): scala.Double = js.native
  /**
  		* Calculates which vector has the maximum values and sets this vector to those values.
  		* @param b Vector 2 to compare for maximum values.
  		**/
  def MaxV(b: b2Vec2): scala.Unit = js.native
  /**
  		* Calculates which vector has the minimum values and sets this vector to those values.
  		* @param b Vector 2 to compare for minimum values.
  		**/
  def MinV(b: b2Vec2): scala.Unit = js.native
  /**
  		* Matrix multiplication.  Stores the result in this vector 2.
  		* @param A Matrix to muliply by.
  		**/
  def MulM(A: b2Mat22): scala.Unit = js.native
  /**
  		* Dot product multiplication.  Stores the result in this vector 2.
  		* @param A Matrix to multiply by.
  		**/
  def MulTM(A: b2Mat22): scala.Unit = js.native
  /**
  		* Vector multiplication.  Stores the result in this vector 2.
  		* @param a Value to multiple the vector's values by.
  		**/
  def Multiply(a: scala.Double): scala.Unit = js.native
  /**
  		* Sets this vector 2 to its negative.
  		**/
  def NegativeSelf(): scala.Unit = js.native
  /**
  		* Normalizes the vector 2 [0,1].
  		* @return Length.
  		**/
  def Normalize(): scala.Double = js.native
  /**
  		* Sets the vector 2.
  		* @param x x value, default is 0.
  		* @param y y value, default is 0.
  		**/
  def Set(): scala.Unit = js.native
  /**
  		* Sets the vector 2.
  		* @param x x value, default is 0.
  		* @param y y value, default is 0.
  		**/
  def Set(x: scala.Double): scala.Unit = js.native
  /**
  		* Sets the vector 2.
  		* @param x x value, default is 0.
  		* @param y y value, default is 0.
  		**/
  def Set(x: scala.Double, y: scala.Double): scala.Unit = js.native
  /**
  		* Sets the vector 2 from a vector 2.
  		* @param v Vector 2 to copy values from.
  		**/
  def SetV(v: b2Vec2): scala.Unit = js.native
  /**
  		* Sets the vector 2 to zero values.
  		**/
  def SetZero(): scala.Unit = js.native
  /**
  		* Subtracts the vector 2 from this vector 2.  The result is stored in this vector 2.
  		* @param v Vector 2 to subtract.
  		**/
  def Subtract(v: b2Vec2): scala.Unit = js.native
}

@JSGlobal("Box2D.Common.Math.b2Vec2")
@js.native
object b2Vec2 extends js.Object {
  /**
  		* Creates a new vector 2 from the given values.
  		* @param x x value.
  		* @param y y value.
  		**/
  def Make(x: scala.Double, y: scala.Double): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
}

