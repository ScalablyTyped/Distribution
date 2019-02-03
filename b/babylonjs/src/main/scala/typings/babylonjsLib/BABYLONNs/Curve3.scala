package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Curve3 object is a logical object, so not a mesh, to handle curves in the 3D geometric space.
  * A Curve3 is designed from a series of successive Vector3.
  * @see https://doc.babylonjs.com/how_to/how_to_use_curve3
  */
@JSGlobal("BABYLON.Curve3")
@js.native
class Curve3 protected () extends js.Object {
  /**
    * A Curve3 object is a logical object, so not a mesh, to handle curves in the 3D geometric space.
    * A Curve3 is designed from a series of successive Vector3.
    * Tuto : http://doc.babylonjs.com/tutorials/How_to_use_Curve3#curve3-object
    * @param points points which make up the curve
    */
  def this(points: js.Array[Vector3]) = this()
  var _computeLength: js.Any = js.native
  var _length: js.Any = js.native
  var _points: js.Any = js.native
  /**
    * Returns a new instance of Curve3 object : var curve = curveA.continue(curveB);
    * This new Curve3 is built by translating and sticking the curveB at the end of the curveA.
    * curveA and curveB keep unchanged.
    * @param curve the curve to continue from this curve
    * @returns the newly constructed curve
    */
  def continue(curve: Curve3): Curve3 = js.native
  /**
    * @returns the Curve3 stored array of successive Vector3
    */
  def getPoints(): js.Array[Vector3] = js.native
  /**
    * @returns the computed length (float) of the curve.
    */
  def length(): scala.Double = js.native
}

/* static members */
@JSGlobal("BABYLON.Curve3")
@js.native
object Curve3 extends js.Object {
  /**
    * Returns a Curve3 object along a CatmullRom Spline curve :
    * @param points (array of Vector3) the points the spline must pass through. At least, four points required
    * @param nbPoints (integer) the wanted number of points between each curve control points
    * @param closed (boolean) optional with default false, when true forms a closed loop from the points
    * @returns the created Curve3
    */
  def CreateCatmullRomSpline(points: js.Array[babylonjsLib.BABYLONNs.Vector3], nbPoints: scala.Double): babylonjsLib.BABYLONNs.Curve3 = js.native
  def CreateCatmullRomSpline(points: js.Array[babylonjsLib.BABYLONNs.Vector3], nbPoints: scala.Double, closed: scala.Boolean): babylonjsLib.BABYLONNs.Curve3 = js.native
  /**
    * Returns a Curve3 object along a Cubic Bezier curve : http://doc.babylonjs.com/tutorials/How_to_use_Curve3#cubic-bezier-curve
    * @param v0 (Vector3) the origin point of the Cubic Bezier
    * @param v1 (Vector3) the first control point
    * @param v2 (Vector3) the second control point
    * @param v3 (Vector3) the end point of the Cubic Bezier
    * @param nbPoints (integer) the wanted number of points in the curve
    * @returns the created Curve3
    */
  def CreateCubicBezier(
    v0: babylonjsLib.BABYLONNs.Vector3,
    v1: babylonjsLib.BABYLONNs.Vector3,
    v2: babylonjsLib.BABYLONNs.Vector3,
    v3: babylonjsLib.BABYLONNs.Vector3,
    nbPoints: scala.Double
  ): babylonjsLib.BABYLONNs.Curve3 = js.native
  /**
    * Returns a Curve3 object along a Hermite Spline curve : http://doc.babylonjs.com/tutorials/How_to_use_Curve3#hermite-spline
    * @param p1 (Vector3) the origin point of the Hermite Spline
    * @param t1 (Vector3) the tangent vector at the origin point
    * @param p2 (Vector3) the end point of the Hermite Spline
    * @param t2 (Vector3) the tangent vector at the end point
    * @param nbPoints (integer) the wanted number of points in the curve
    * @returns the created Curve3
    */
  def CreateHermiteSpline(
    p1: babylonjsLib.BABYLONNs.Vector3,
    t1: babylonjsLib.BABYLONNs.Vector3,
    p2: babylonjsLib.BABYLONNs.Vector3,
    t2: babylonjsLib.BABYLONNs.Vector3,
    nbPoints: scala.Double
  ): babylonjsLib.BABYLONNs.Curve3 = js.native
  /**
    * Returns a Curve3 object along a Quadratic Bezier curve : http://doc.babylonjs.com/tutorials/How_to_use_Curve3#quadratic-bezier-curve
    * @param v0 (Vector3) the origin point of the Quadratic Bezier
    * @param v1 (Vector3) the control point
    * @param v2 (Vector3) the end point of the Quadratic Bezier
    * @param nbPoints (integer) the wanted number of points in the curve
    * @returns the created Curve3
    */
  def CreateQuadraticBezier(
    v0: babylonjsLib.BABYLONNs.Vector3,
    v1: babylonjsLib.BABYLONNs.Vector3,
    v2: babylonjsLib.BABYLONNs.Vector3,
    nbPoints: scala.Double
  ): babylonjsLib.BABYLONNs.Curve3 = js.native
}

