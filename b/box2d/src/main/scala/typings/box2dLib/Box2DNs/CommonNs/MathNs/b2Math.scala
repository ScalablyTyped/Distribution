package typings
package box2dLib.Box2DNs.CommonNs.MathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Box2D.Common.Math.b2Math")
@js.native
class b2Math () extends js.Object

@JSGlobal("Box2D.Common.Math.b2Math")
@js.native
object b2Math extends js.Object {
  /**
  		* Global instance of a 2x2 identity matrix.  Use as read-only.
  		**/
  var b2Mat22_identity: box2dLib.Box2DNs.CommonNs.MathNs.b2Mat22 = js.native
  /**
  		* Global instance of an identity transform.  Use as read-only.
  		**/
  var b2Transform_identity: box2dLib.Box2DNs.CommonNs.MathNs.b2Transform = js.native
  /**
  		* Global instance of a zero'ed vector.  Use as read-only.
  		**/
  var b2Vec2_zero: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* Creates an ABS number.
  		* @param a Number to ABS.
  		* @return Absolute value of a.
  		**/
  def Abs(a: scala.Double): scala.Double = js.native
  /**
  		* Creates an ABS matrix.
  		* @param A Matrix to ABS all values.
  		* @return Matrix with all positive values.
  		**/
  def AbsM(A: box2dLib.Box2DNs.CommonNs.MathNs.b2Mat22): box2dLib.Box2DNs.CommonNs.MathNs.b2Mat22 = js.native
  /**
  		* Creates an ABS vector.
  		* @param a Vector to ABS all values.
  		* @return Vector with all positive values.
  		**/
  def AbsV(a: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		*
  		* @param A
  		* @param B
  		* @return
  		**/
  def AddMM(A: box2dLib.Box2DNs.CommonNs.MathNs.b2Mat22, B: box2dLib.Box2DNs.CommonNs.MathNs.b2Mat22): box2dLib.Box2DNs.CommonNs.MathNs.b2Mat22 = js.native
  /**
  		* Adds two vectors.
  		* @param a First vector.
  		* @param b Second vector.
  		* @return a + b.
  		**/
  def AddVV(a: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2, b: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* Clamp a number to the range of low to high.
  		* @param a Number to clamp.
  		* @param low Low range.
  		* @param high High range.
  		* @return Number a clamped to range of low to high.
  		**/
  def Clamp(a: scala.Double, low: scala.Double, high: scala.Double): scala.Double = js.native
  /**
  		* Clamps a vector to the range of low to high.
  		* @param a Vector to clamp.
  		* @param low Low range.
  		* @param high High range.
  		* @return Vector a clamped to range of low to high.
  		**/
  def ClampV(
    a: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2,
    low: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2,
    high: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2
  ): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* Cross product of s and vector 2.
  		* @param s s value.
  		* @param a Vector 2 to use in cross product.
  		* @return Cross product of s and a.
  		**/
  def CrossFV(s: scala.Double, a: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* Cross product of vector 2 and s.
  		* @param a Vector 2 to use in cross product.
  		* @param s s value.
  		* @return Cross product of a and s.
  		**/
  def CrossVF(a: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2, s: scala.Double): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* Cross product of two vector 2s.
  		* @param a Vector 2 to use in cross product.
  		* @param b Vector 2 to use in cross product.
  		* @return Cross product of a and b.
  		**/
  def CrossVV(a: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2, b: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2): scala.Double = js.native
  /**
  		* Calculates the distance between two vectors.
  		* @param a First vector.
  		* @param b Second vector.
  		* @return Distance between a and b.
  		**/
  def Distance(a: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2, b: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2): scala.Double = js.native
  /**
  		* Calculates the squared distance between two vectors.
  		* @param a First vector.
  		* @param b Second vector.
  		* @return dist^2 between a and b.
  		**/
  def DistanceSquared(a: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2, b: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2): scala.Double = js.native
  /**
  		* Dot product of two vector 2s.
  		* @param a Vector 2 to use in dot product.
  		* @param b Vector 2 to use in dot product.
  		* @return Dot product of a and b.
  		**/
  def Dot(a: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2, b: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2): scala.Double = js.native
  /**
  		* Check if a number is a power of 2.
  		* @param x Number to check if it is a power of 2.
  		* @return True if x is a power of 2, otherwise false.
  		**/
  def IsPowerOfTwo(x: scala.Double): scala.Boolean = js.native
  /**
  		* Determines if a number is valid.  A number is valid if it is finite.
  		* @param x Number to check for validity.
  		* @return True if x is valid, otherwise false.
  		**/
  def IsValid(x: scala.Double): scala.Boolean = js.native
  /**
  		* Determines the max number.
  		* @param a First number.
  		* @param b Second number.
  		* @return a or b depending on which is the maximum.
  		**/
  def Max(a: scala.Double, b: scala.Double): scala.Double = js.native
  /**
  		* Determines the max vector.
  		* @param a First vector.
  		* @param b Second vector.
  		* @return a or b depending on which is the maximum.
  		**/
  def MaxV(a: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2, b: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* Determines the minimum number.
  		* @param a First number.
  		* @param b Second number.
  		* @return a or b depending on which is the minimum.
  		**/
  def Min(a: scala.Double, b: scala.Double): scala.Double = js.native
  /**
  		* Determines the minimum vector.
  		* @param a First vector.
  		* @param b Second vector.
  		* @return a or b depending on which is the minimum.
  		**/
  def MinV(a: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2, b: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		*
  		* @param s
  		* @param a
  		* @return
  		**/
  def MulFV(s: scala.Double, a: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		*
  		* @param A
  		* @param B
  		* @return
  		**/
  def MulMM(A: box2dLib.Box2DNs.CommonNs.MathNs.b2Mat22, B: box2dLib.Box2DNs.CommonNs.MathNs.b2Mat22): box2dLib.Box2DNs.CommonNs.MathNs.b2Mat22 = js.native
  /**
  		* Multiply matrix and vector.
  		* @param A Matrix.
  		* @param v Vector.
  		* @return Result.
  		**/
  def MulMV(A: box2dLib.Box2DNs.CommonNs.MathNs.b2Mat22, v: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		*
  		* @param A
  		* @param B
  		* @return
  		**/
  def MulTMM(A: box2dLib.Box2DNs.CommonNs.MathNs.b2Mat22, B: box2dLib.Box2DNs.CommonNs.MathNs.b2Mat22): box2dLib.Box2DNs.CommonNs.MathNs.b2Mat22 = js.native
  /**
  		*
  		* @param A
  		* @param v
  		* @return
  		**/
  def MulTMV(A: box2dLib.Box2DNs.CommonNs.MathNs.b2Mat22, v: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		*
  		* @param T
  		* @param v
  		* @return
  		**/
  def MulX(T: box2dLib.Box2DNs.CommonNs.MathNs.b2Transform, v: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		*
  		* @param T
  		* @param v
  		* @return
  		**/
  def MulXT(T: box2dLib.Box2DNs.CommonNs.MathNs.b2Transform, v: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* Calculates the next power of 2 after the given number.
  		* @param x Number to start search for the next power of 2.
  		* @return The next number that is a power of 2.
  		**/
  def NextPowerOfTwo(x: scala.Double): scala.Double = js.native
  /**
  		* Generates a random number.
  		* @param return Random number.
  		**/
  def Random(): scala.Double = js.native
  /**
  		* Returns a random number between lo and hi.
  		* @param lo Lowest random number.
  		* @param hi Highest random number.
  		* @return Number between lo and hi.
  		**/
  def RandomRange(lo: scala.Double, hi: scala.Double): scala.Double = js.native
  /**
  		* Subtracts two vectors.
  		* @param a First vector.
  		* @param b Second vector.
  		* @return a - b.
  		**/
  def SubtractVV(a: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2, b: box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2): box2dLib.Box2DNs.CommonNs.MathNs.b2Vec2 = js.native
  /**
  		* Swaps a and b objects.
  		* @param a a -> b.
  		* @param b b -> a.
  		**/
  def Swap(a: js.Any, b: js.Any): scala.Unit = js.native
}

