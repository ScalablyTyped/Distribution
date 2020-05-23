package typings.box2d.Box2D.Common.Math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2Vec2 extends js.Object {
  /**
    * x value
    **/
  var x: Double = js.native
  /**
    * y value
    **/
  var y: Double = js.native
  /**
    * Sets x and y to absolute values.
    **/
  def Abs(): Unit = js.native
  /**
    * Adds the vector 2 to this vector 2.  The result is stored in this vector 2.
    * @param v Vector 2 to add.
    **/
  def Add(v: b2Vec2): Unit = js.native
  /**
    * Creates a copy of the vector 2.
    * @return Copy of this vector 2.
    **/
  def Copy(): b2Vec2 = js.native
  /**
    * Cross F V
    * @param s
    **/
  def CrossFV(s: Double): Unit = js.native
  /**
    * Cross V F
    * @param s
    **/
  def CrossVF(s: Double): Unit = js.native
  /**
    * Gets the negative of this vector 2.
    * @return Negative copy of this vector 2.
    **/
  def GetNegative(): b2Vec2 = js.native
  /**
    * True if the vector 2 is valid, otherwise false.  A valid vector has finite values.
    * @return True if the vector 2 is valid, otherwise false.
    **/
  def IsValid(): Boolean = js.native
  /**
    * Calculates the length of the vector 2.
    * @return The length of the vector 2.
    **/
  def Length(): Double = js.native
  /**
    * Calculates the length squared of the vector2.
    * @return The length squared of the vector 2.
    **/
  def LengthSquared(): Double = js.native
  /**
    * Calculates which vector has the maximum values and sets this vector to those values.
    * @param b Vector 2 to compare for maximum values.
    **/
  def MaxV(b: b2Vec2): Unit = js.native
  /**
    * Calculates which vector has the minimum values and sets this vector to those values.
    * @param b Vector 2 to compare for minimum values.
    **/
  def MinV(b: b2Vec2): Unit = js.native
  /**
    * Matrix multiplication.  Stores the result in this vector 2.
    * @param A Matrix to muliply by.
    **/
  def MulM(A: b2Mat22): Unit = js.native
  /**
    * Dot product multiplication.  Stores the result in this vector 2.
    * @param A Matrix to multiply by.
    **/
  def MulTM(A: b2Mat22): Unit = js.native
  /**
    * Vector multiplication.  Stores the result in this vector 2.
    * @param a Value to multiple the vector's values by.
    **/
  def Multiply(a: Double): Unit = js.native
  /**
    * Sets this vector 2 to its negative.
    **/
  def NegativeSelf(): Unit = js.native
  /**
    * Normalizes the vector 2 [0,1].
    * @return Length.
    **/
  def Normalize(): Double = js.native
  /**
    * Sets the vector 2.
    * @param x x value, default is 0.
    * @param y y value, default is 0.
    **/
  def Set(): Unit = js.native
  def Set(x: Double): Unit = js.native
  def Set(x: Double, y: Double): Unit = js.native
  /**
    * Sets the vector 2 from a vector 2.
    * @param v Vector 2 to copy values from.
    **/
  def SetV(v: b2Vec2): Unit = js.native
  /**
    * Sets the vector 2 to zero values.
    **/
  def SetZero(): Unit = js.native
  /**
    * Subtracts the vector 2 from this vector 2.  The result is stored in this vector 2.
    * @param v Vector 2 to subtract.
    **/
  def Subtract(v: b2Vec2): Unit = js.native
}

