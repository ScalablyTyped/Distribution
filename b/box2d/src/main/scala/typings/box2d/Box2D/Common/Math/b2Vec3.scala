package typings.box2d.Box2D.Common.Math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2Vec3 extends js.Object {
  /**
    * x value.
    **/
  var x: Double = js.native
  /**
    * y value.
    **/
  var y: Double = js.native
  /**
    * z value.
    **/
  var z: Double = js.native
  /**
    * Adds the vector 3 to this vector 3.  The result is stored in this vector 3.
    * @param v Vector 3 to add.
    **/
  def Add(v: b2Vec3): Unit = js.native
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
  def Multiply(a: Double): Unit = js.native
  /**
    * Sets this vector 3 to its negative.
    **/
  def NegativeSelf(): Unit = js.native
  /**
    * Sets the vector 3.
    * @param x x value, default is 0.
    * @param y y value, default is 0.
    * @param z z value, default is 0.
    **/
  def Set(): Unit = js.native
  def Set(x: Double): Unit = js.native
  def Set(x: Double, y: Double): Unit = js.native
  def Set(x: Double, y: Double, z: Double): Unit = js.native
  /**
    * Sets the vector 3 from a vector 3.
    * @param v Vector 3 to copy values from.
    **/
  def SetV(v: b2Vec3): Unit = js.native
  /**
    * Sets the vector 3 to zero values.
    **/
  def SetZero(): Unit = js.native
  /**
    * Subtracts the vector 3 from this vector 3.  The result is stored in this vector 3.
    * @param v Vector 3 to subtract.
    **/
  def Subtract(v: b2Vec3): Unit = js.native
}

