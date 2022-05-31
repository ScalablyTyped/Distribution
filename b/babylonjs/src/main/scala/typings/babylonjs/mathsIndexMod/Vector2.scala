package typings.babylonjs.mathsIndexMod

import typings.babylonjs.typesMod.DeepImmutable
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Maths/index", "Vector2")
@js.native
/**
  * Creates a new Vector2 from the given x and y coordinates
  * @param x defines the first coordinate
  * @param y defines the second coordinate
  */
class Vector2 ()
  extends typings.babylonjs.mathMod.Vector2 {
  def this(/** defines the first coordinate */
  x: Double) = this()
  def this(/** defines the first coordinate */
  x: Double, /** defines the second coordinate */
  y: Double) = this()
  def this(/** defines the first coordinate */
  x: Unit, /** defines the second coordinate */
  y: Double) = this()
}
/* static members */
object Vector2 {
  
  @JSImport("babylonjs/Maths/index", "Vector2")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets a new Vector2 located for "amount" (float) on the CatmullRom spline defined by the given four Vector2
    * @param value1 defines 1st point of control
    * @param value2 defines 2nd point of control
    * @param value3 defines 3rd point of control
    * @param value4 defines 4th point of control
    * @param amount defines the interpolation factor
    * @returns a new Vector2
    */
  inline def CatmullRom(
    value1: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2],
    value2: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2],
    value3: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2],
    value4: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2],
    amount: Double
  ): typings.babylonjs.mathVectorMod.Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("CatmullRom")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], value3.asInstanceOf[js.Any], value4.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Vector2]
  
  /**
    * Gets a new Vector2 located at the center of the vectors "value1" and "value2"
    * @param value1 defines first vector
    * @param value2 defines second vector
    * @returns a new Vector2
    */
  inline def Center(
    value1: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2],
    value2: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2]
  ): typings.babylonjs.mathVectorMod.Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("Center")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Vector2]
  
  /**
    * Returns a new Vector2 set with same the coordinates than "value" ones if the vector "value" is in the square defined by "min" and "max".
    * If a coordinate of "value" is lower than "min" coordinates, the returned Vector2 is given this "min" coordinate.
    * If a coordinate of "value" is greater than "max" coordinates, the returned Vector2 is given this "max" coordinate
    * @param value defines the value to clamp
    * @param min defines the lower limit
    * @param max defines the upper limit
    * @returns a new Vector2
    */
  inline def Clamp(
    value: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2],
    min: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2],
    max: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2]
  ): typings.babylonjs.mathVectorMod.Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("Clamp")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Vector2]
  
  /**
    * Gets the distance between the vectors "value1" and "value2"
    * @param value1 defines first vector
    * @param value2 defines second vector
    * @returns the distance between vectors
    */
  inline def Distance(
    value1: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2],
    value2: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Distance")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Gets the shortest distance (float) between the point "p" and the segment defined by the two points "segA" and "segB".
    * @param p defines the middle point
    * @param segA defines one point of the segment
    * @param segB defines the other point of the segment
    * @returns the shortest distance
    */
  inline def DistanceOfPointFromSegment(
    p: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2],
    segA: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2],
    segB: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("DistanceOfPointFromSegment")(p.asInstanceOf[js.Any], segA.asInstanceOf[js.Any], segB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Returns the squared distance between the vectors "value1" and "value2"
    * @param value1 defines first vector
    * @param value2 defines second vector
    * @returns the squared distance between vectors
    */
  inline def DistanceSquared(
    value1: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2],
    value2: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("DistanceSquared")(value1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Gets the dot product of the vector "left" and the vector "right"
    * @param left defines first vector
    * @param right defines second vector
    * @returns the dot product (float)
    */
  inline def Dot(
    left: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2],
    right: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("Dot")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Gets a new Vector2 set from the given index element of the given array
    * @param array defines the data source
    * @param offset defines the offset in the data source
    * @returns a new Vector2
    */
  inline def FromArray(array: DeepImmutable[ArrayLike[Double]]): typings.babylonjs.mathVectorMod.Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathVectorMod.Vector2]
  inline def FromArray(array: DeepImmutable[ArrayLike[Double]], offset: Double): typings.babylonjs.mathVectorMod.Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArray")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Vector2]
  
  /**
    * Sets "result" from the given index element of the given array
    * @param array defines the data source
    * @param offset defines the offset in the data source
    * @param result defines the target vector
    */
  inline def FromArrayToRef(
    array: DeepImmutable[ArrayLike[Double]],
    offset: Double,
    result: typings.babylonjs.mathVectorMod.Vector2
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("FromArrayToRef")(array.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns a new Vector2 located for "amount" (float) on the Hermite spline defined by the vectors "value1", "value3", "tangent1", "tangent2"
    * @param value1 defines the 1st control point
    * @param tangent1 defines the outgoing tangent
    * @param value2 defines the 2nd control point
    * @param tangent2 defines the incoming tangent
    * @param amount defines the interpolation factor
    * @returns a new Vector2
    */
  inline def Hermite(
    value1: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2],
    tangent1: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2],
    value2: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2],
    tangent2: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2],
    amount: Double
  ): typings.babylonjs.mathVectorMod.Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("Hermite")(value1.asInstanceOf[js.Any], tangent1.asInstanceOf[js.Any], value2.asInstanceOf[js.Any], tangent2.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Vector2]
  
  /**
    * Returns a new Vector2 located for "amount" (float) on the linear interpolation between the vector "start" adn the vector "end".
    * @param start defines the start vector
    * @param end defines the end vector
    * @param amount defines the interpolation factor
    * @returns a new Vector2
    */
  inline def Lerp(
    start: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2],
    end: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2],
    amount: Double
  ): typings.babylonjs.mathVectorMod.Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("Lerp")(start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Vector2]
  
  /**
    * Gets a new Vecto2 set with the maximal coordinate values from the "left" and "right" vectors
    * @param left defines 1st vector
    * @param right defines 2nd vector
    * @returns a new Vector2
    */
  inline def Maximize(
    left: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2],
    right: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2]
  ): typings.babylonjs.mathVectorMod.Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("Maximize")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Vector2]
  
  /**
    * Gets a new Vector2 set with the minimal coordinate values from the "left" and "right" vectors
    * @param left defines 1st vector
    * @param right defines 2nd vector
    * @returns a new Vector2
    */
  inline def Minimize(
    left: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2],
    right: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2]
  ): typings.babylonjs.mathVectorMod.Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("Minimize")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Vector2]
  
  /**
    * Returns a new Vector2 equal to the normalized given vector
    * @param vector defines the vector to normalize
    * @returns a new Vector2
    */
  inline def Normalize(vector: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2]): typings.babylonjs.mathVectorMod.Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("Normalize")(vector.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.mathVectorMod.Vector2]
  
  /**
    * Gets a new Vector2(1, 1)
    * @returns a new Vector2
    */
  inline def One(): typings.babylonjs.mathVectorMod.Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("One")().asInstanceOf[typings.babylonjs.mathVectorMod.Vector2]
  
  /**
    * Determines if a given vector is included in a triangle
    * @param p defines the vector to test
    * @param p0 defines 1st triangle point
    * @param p1 defines 2nd triangle point
    * @param p2 defines 3rd triangle point
    * @returns true if the point "p" is in the triangle defined by the vertors "p0", "p1", "p2"
    */
  inline def PointInTriangle(
    p: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2],
    p0: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2],
    p1: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2],
    p2: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("PointInTriangle")(p.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Gets a new Vector2 set with the transformed coordinates of the given vector by the given transformation matrix
    * @param vector defines the vector to transform
    * @param transformation defines the matrix to apply
    * @returns a new Vector2
    */
  inline def Transform(
    vector: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2],
    transformation: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix]
  ): typings.babylonjs.mathVectorMod.Vector2 = (^.asInstanceOf[js.Dynamic].applyDynamic("Transform")(vector.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.mathVectorMod.Vector2]
  
  /**
    * Transforms the given vector coordinates by the given transformation matrix and stores the result in the vector "result" coordinates
    * @param vector defines the vector to transform
    * @param transformation defines the matrix to apply
    * @param result defines the target vector
    */
  inline def TransformToRef(
    vector: DeepImmutable[typings.babylonjs.mathVectorMod.Vector2],
    transformation: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix],
    result: typings.babylonjs.mathVectorMod.Vector2
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("TransformToRef")(vector.asInstanceOf[js.Any], transformation.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Gets a new Vector2(0, 0)
    * @returns a new Vector2
    */
  inline def Zero(): typings.babylonjs.mathVectorMod.Vector2 = ^.asInstanceOf[js.Dynamic].applyDynamic("Zero")().asInstanceOf[typings.babylonjs.mathVectorMod.Vector2]
}
