package typings.babylonjs.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.babylonjs.mathsMathDotvectorMod.Matrix
import typings.babylonjs.mathsMathDotvectorMod.Vector2
import typings.babylonjs.typesMod.DeepImmutable
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofVector2
  extends StObject
     with Instantiable0[Vector2]
     with Instantiable1[/* x */ Double, Vector2]
     with Instantiable2[(/* x */ Double) | (/* x */ Unit), /* y */ Double, Vector2] {
  
  /**
    * Gets a new Vector2 located for "amount" (float) on the CatmullRom spline defined by the given four Vector2
    * Example Playground https://playground.babylonjs.com/#QYBWV4#65
    * @param value1 defines 1st point of control
    * @param value2 defines 2nd point of control
    * @param value3 defines 3rd point of control
    * @param value4 defines 4th point of control
    * @param amount defines the interpolation factor
    * @returns a new Vector2
    */
  def CatmullRom[T /* <: Vector2 */](
    value1: DeepImmutable[T],
    value2: DeepImmutable[Vector2],
    value3: DeepImmutable[Vector2],
    value4: DeepImmutable[Vector2],
    amount: Double
  ): T = js.native
  
  /**
    * Gets a new Vector2 located at the center of the vectors "value1" and "value2"
    * Example Playground https://playground.babylonjs.com/#QYBWV4#86
    * Example Playground https://playground.babylonjs.com/#QYBWV4#66
    * @param value1 defines first vector
    * @param value2 defines second vector
    * @returns a new Vector2
    */
  def Center[T /* <: Vector2 */](value1: DeepImmutable[T], value2: DeepImmutable[Vector2]): T = js.native
  
  /**
    * Gets the center of the vectors "value1" and "value2" and stores the result in the vector "ref"
    * Example Playground https://playground.babylonjs.com/#QYBWV4#66
    * @param value1 defines first vector
    * @param value2 defines second vector
    * @param ref defines third vector
    * @returns ref
    */
  def CenterToRef[T /* <: Vector2 */](value1: DeepImmutable[Vector2], value2: DeepImmutable[Vector2], ref: T): T = js.native
  
  /**
    * Returns a new Vector2 set with same the coordinates than "value" ones if the vector "value" is in the square defined by "min" and "max".
    * If a coordinate of "value" is lower than "min" coordinates, the returned Vector2 is given this "min" coordinate.
    * If a coordinate of "value" is greater than "max" coordinates, the returned Vector2 is given this "max" coordinate
    * Example Playground https://playground.babylonjs.com/#QYBWV4#76
    * @param value defines the value to clamp
    * @param min defines the lower limit
    * @param max defines the upper limit
    * @returns a new Vector2
    */
  def Clamp[T /* <: Vector2 */](value: DeepImmutable[T], min: DeepImmutable[Vector2], max: DeepImmutable[Vector2]): T = js.native
  
  /**
    * Gets the distance between the vectors "value1" and "value2"
    * Example Playground https://playground.babylonjs.com/#QYBWV4#71
    * @param value1 defines first vector
    * @param value2 defines second vector
    * @returns the distance between vectors
    */
  def Distance(value1: DeepImmutable[Vector2], value2: DeepImmutable[Vector2]): Double = js.native
  
  /**
    * Gets the shortest distance (float) between the point "p" and the segment defined by the two points "segA" and "segB".
    * Example Playground https://playground.babylonjs.com/#QYBWV4#77
    * @param p defines the middle point
    * @param segA defines one point of the segment
    * @param segB defines the other point of the segment
    * @returns the shortest distance
    */
  def DistanceOfPointFromSegment(p: DeepImmutable[Vector2], segA: DeepImmutable[Vector2], segB: DeepImmutable[Vector2]): Double = js.native
  
  /**
    * Returns the squared distance between the vectors "value1" and "value2"
    * Example Playground https://playground.babylonjs.com/#QYBWV4#72
    * @param value1 defines first vector
    * @param value2 defines second vector
    * @returns the squared distance between vectors
    */
  def DistanceSquared(value1: DeepImmutable[Vector2], value2: DeepImmutable[Vector2]): Double = js.native
  
  /**
    * Gets the dot product of the vector "left" and the vector "right"
    * Example Playground https://playground.babylonjs.com/#QYBWV4#90
    * @param left defines first vector
    * @param right defines second vector
    * @returns the dot product (float)
    */
  def Dot(left: DeepImmutable[Vector2], right: DeepImmutable[Vector2]): Double = js.native
  
  /**
    * Gets a new Vector2 set from the given index element of the given array
    * Example Playground https://playground.babylonjs.com/#QYBWV4#79
    * @param array defines the data source
    * @param offset defines the offset in the data source
    * @returns a new Vector2
    */
  def FromArray(array: DeepImmutable[ArrayLike[Double]]): Vector2 = js.native
  def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): Vector2 = js.native
  
  /**
    * Sets "result" from the given index element of the given array
    * Example Playground https://playground.babylonjs.com/#QYBWV4#80
    * @param array defines the data source
    * @param offset defines the offset in the data source
    * @param result defines the target vector
    * @returns result input
    */
  def FromArrayToRef[T /* <: Vector2 */](array: DeepImmutable[ArrayLike[Double]], offset: Double, result: T): T = js.native
  
  /**
    * Returns a new Vector2 located for "amount" (float) on the Hermite spline defined by the vectors "value1", "value2", "tangent1", "tangent2"
    * Example Playground https://playground.babylonjs.com/#QYBWV4#81
    * @param value1 defines the 1st control point
    * @param tangent1 defines the outgoing tangent
    * @param value2 defines the 2nd control point
    * @param tangent2 defines the incoming tangent
    * @param amount defines the interpolation factor
    * @returns a new Vector2
    */
  def Hermite[T /* <: Vector2 */](
    value1: DeepImmutable[T],
    tangent1: DeepImmutable[Vector2],
    value2: DeepImmutable[Vector2],
    tangent2: DeepImmutable[Vector2],
    amount: Double
  ): T = js.native
  
  /**
    * Returns a new Vector2 which is the 1st derivative of the Hermite spline defined by the vectors "value1", "value2", "tangent1", "tangent2".
    * Example Playground https://playground.babylonjs.com/#QYBWV4#82
    * @param value1 defines the first control point
    * @param tangent1 defines the first tangent
    * @param value2 defines the second control point
    * @param tangent2 defines the second tangent
    * @param time define where the derivative must be done
    * @returns 1st derivative
    */
  def Hermite1stDerivative[T /* <: Vector2 */](
    value1: DeepImmutable[T],
    tangent1: DeepImmutable[Vector2],
    value2: DeepImmutable[Vector2],
    tangent2: DeepImmutable[Vector2],
    time: Double
  ): T = js.native
  
  /**
    * Returns a new Vector2 which is the 1st derivative of the Hermite spline defined by the vectors "value1", "value2", "tangent1", "tangent2".
    * Example Playground https://playground.babylonjs.com/#QYBWV4#83
    * @param value1 defines the first control point
    * @param tangent1 defines the first tangent
    * @param value2 defines the second control point
    * @param tangent2 defines the second tangent
    * @param time define where the derivative must be done
    * @param result define where the derivative will be stored
    * @returns result input
    */
  def Hermite1stDerivativeToRef[T /* <: Vector2 */](
    value1: DeepImmutable[Vector2],
    tangent1: DeepImmutable[Vector2],
    value2: DeepImmutable[Vector2],
    tangent2: DeepImmutable[Vector2],
    time: Double,
    result: T
  ): T = js.native
  
  /**
    * Returns a new Vector2 located for "amount" (float) on the linear interpolation between the vector "start" adn the vector "end".
    * Example Playground https://playground.babylonjs.com/#QYBWV4#84
    * @param start defines the start vector
    * @param end defines the end vector
    * @param amount defines the interpolation factor
    * @returns a new Vector2
    */
  def Lerp[T /* <: Vector2 */](start: DeepImmutable[T], end: DeepImmutable[Vector2], amount: Double): Vector2 = js.native
  
  /**
    * Gets a new Vector2 set with the maximal coordinate values from the "left" and "right" vectors
    * Example Playground https://playground.babylonjs.com/#QYBWV4#86
    * @param left defines 1st vector
    * @param right defines 2nd vector
    * @returns a new Vector2
    */
  def Maximize[T /* <: Vector2 */](left: DeepImmutable[T], right: DeepImmutable[Vector2]): T = js.native
  
  /**
    * Gets a new Vector2 set with the minimal coordinate values from the "left" and "right" vectors
    * Example Playground https://playground.babylonjs.com/#QYBWV4#86
    * @param left defines 1st vector
    * @param right defines 2nd vector
    * @returns a new Vector2
    */
  def Minimize[T /* <: Vector2 */](left: DeepImmutable[T], right: DeepImmutable[Vector2]): T = js.native
  
  /**
    * Returns a new Vector2 equal to the normalized given vector
    * Example Playground https://playground.babylonjs.com/#QYBWV4#46
    * @param vector defines the vector to normalize
    * @returns a new Vector2
    */
  def Normalize[T /* <: Vector2 */](vector: DeepImmutable[T]): T = js.native
  
  /**
    * Normalize a given vector into a second one
    * Example Playground https://playground.babylonjs.com/#QYBWV4#50
    * @param vector defines the vector to normalize
    * @param result defines the vector where to store the result
    * @returns result input
    */
  def NormalizeToRef[T /* <: Vector2 */](vector: DeepImmutable[Vector2], result: T): T = js.native
  
  /**
    * Gets a new Vector2(1, 1)
    * @returns a new Vector2
    */
  def One(): Vector2 = js.native
  
  /**
    * Determines if a given vector is included in a triangle
    * Example Playground https://playground.babylonjs.com/#QYBWV4#87
    * @param p defines the vector to test
    * @param p0 defines 1st triangle point
    * @param p1 defines 2nd triangle point
    * @param p2 defines 3rd triangle point
    * @returns true if the point "p" is in the triangle defined by the vectors "p0", "p1", "p2"
    */
  def PointInTriangle(
    p: DeepImmutable[Vector2],
    p0: DeepImmutable[Vector2],
    p1: DeepImmutable[Vector2],
    p2: DeepImmutable[Vector2]
  ): Boolean = js.native
  
  /**
    * Gets a new Vector2 set with the transformed coordinates of the given vector by the given transformation matrix
    * Example Playground https://playground.babylonjs.com/#QYBWV4#17
    * @param vector defines the vector to transform
    * @param transformation defines the matrix to apply
    * @returns a new Vector2
    */
  def Transform[T /* <: Vector2 */](vector: DeepImmutable[T], transformation: DeepImmutable[Matrix]): T = js.native
  
  /**
    * Transforms the given vector coordinates by the given transformation matrix and stores the result in the vector "result" coordinates
    * Example Playground https://playground.babylonjs.com/#QYBWV4#19
    * @param vector defines the vector to transform
    * @param transformation defines the matrix to apply
    * @param result defines the target vector
    * @returns result input
    */
  def TransformToRef[T /* <: Vector2 */](vector: DeepImmutable[Vector2], transformation: DeepImmutable[Matrix], result: T): T = js.native
  
  /**
    * Gets a new Vector2(0, 0)
    * @returns a new Vector2
    */
  def Zero(): Vector2 = js.native
  
  /**
    * Gets a zero Vector2 that must not be updated
    */
  def ZeroReadOnly: DeepImmutable[Vector2] = js.native
  
  /* private */ var _ZeroReadOnly: Any = js.native
}
