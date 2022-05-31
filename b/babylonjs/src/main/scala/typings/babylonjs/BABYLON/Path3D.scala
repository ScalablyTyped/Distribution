package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Path3D extends StObject {
  
  /* private */ var _alignTangentsWithPath: js.Any = js.native
  
  /* private */ var _binormals: js.Any = js.native
  
  /* private */ var _compute: js.Any = js.native
  
  /* private */ var _curve: js.Any = js.native
  
  /* private */ var _distances: js.Any = js.native
  
  /* private */ var _getFirstNonNullVector: js.Any = js.native
  
  /* private */ var _getLastNonNullVector: js.Any = js.native
  
  /* private */ var _normalVector: js.Any = js.native
  
  /* private */ var _normals: js.Any = js.native
  
  /* private */ val _pointAtData: js.Any = js.native
  
  /* private */ var _raw: js.Any = js.native
  
  /**
    * Updates the point at data from the specified parameters
    * @param position where along the path the interpolated point is, from 0.0 to 1.0
    * @param point the interpolated point
    * @param parentIndex the index of an existing curve point that is on, or else positionally the first behind, the interpolated point
    */
  /* private */ var _setPointAtData: js.Any = js.native
  
  /* private */ var _tangents: js.Any = js.native
  
  /**
    * Updates the point at interpolation matrix for the tangents, normals and binormals
    */
  /* private */ var _updateInterpolationMatrix: js.Any = js.native
  
  /**
    * Updates the point at data for an interpolated point along this curve
    * @param position the position of the point along this curve, from 0.0 to 1.0
    * @interpolateTNB wether to compute the interpolated tangent, normal and binormal
    * @returns the (updated) point at data
    */
  /* private */ var _updatePointAtData: js.Any = js.native
  
  /**
    * Returns the binormal vector of an interpolated Path3D curve point at the specified position along this path.
    * @param position the position of the point along this path, from 0.0 to 1.0
    * @param interpolated (optional, default false) : boolean, if true returns an interpolated binormal instead of the binormal of the previous path point.
    * @returns a binormal vector corresponding to the interpolated Path3D curve point, if not interpolated, the binormal is taken from the precomputed binormals array.
    */
  def getBinormalAt(position: Double): Vector3 = js.native
  def getBinormalAt(position: Double, interpolated: Boolean): Vector3 = js.native
  
  /**
    * Returns an array populated with binormal vectors on each Path3D curve point.
    * @returns an array populated with binormal vectors on each Path3D curve point.
    */
  def getBinormals(): js.Array[Vector3] = js.native
  
  /**
    * Returns the position of the closest virtual point on this path to an arbitrary Vector3, from 0.0 to 1.0
    * @param target the vector of which to get the closest position to
    * @returns the position of the closest virtual point on this path to the target vector
    */
  def getClosestPositionTo(target: Vector3): Double = js.native
  
  /**
    * Returns the Path3D array of successive Vector3 designing its curve.
    * @returns the Path3D array of successive Vector3 designing its curve.
    */
  def getCurve(): js.Array[Vector3] = js.native
  
  /**
    * Returns the distance (float) of an interpolated Path3D curve point at the specified position along this path.
    * @param position the position of the point along this path, from 0.0 to 1.0
    * @returns the distance of the interpolated Path3D curve point at the specified position along this path.
    */
  def getDistanceAt(position: Double): Double = js.native
  
  /**
    * Returns an array populated with distances (float) of the i-th point from the first curve point.
    * @returns an array populated with distances (float) of the i-th point from the first curve point.
    */
  def getDistances(): js.Array[Double] = js.native
  
  /**
    * Returns the tangent vector of an interpolated Path3D curve point at the specified position along this path.
    * @param position the position of the point along this path, from 0.0 to 1.0
    * @param interpolated (optional, default false) : boolean, if true returns an interpolated normal instead of the normal of the previous path point.
    * @returns a normal vector corresponding to the interpolated Path3D curve point, if not interpolated, the normal is taken from the precomputed normals array.
    */
  def getNormalAt(position: Double): Vector3 = js.native
  def getNormalAt(position: Double, interpolated: Boolean): Vector3 = js.native
  
  /**
    * Returns an array populated with normal vectors on each Path3D curve point.
    * @returns an array populated with normal vectors on each Path3D curve point.
    */
  def getNormals(): js.Array[Vector3] = js.native
  
  /**
    * Returns an interpolated point along this path
    * @param position the position of the point along this path, from 0.0 to 1.0
    * @returns a new Vector3 as the point
    */
  def getPointAt(position: Double): Vector3 = js.native
  
  /**
    * Returns the Path3D array of successive Vector3 designing its curve.
    * @returns the Path3D array of successive Vector3 designing its curve.
    */
  def getPoints(): js.Array[Vector3] = js.native
  
  /**
    * Returns the array index of the previous point of an interpolated point along this path
    * @param position the position of the point to interpolate along this path, from 0.0 to 1.0
    * @returns the array index
    */
  def getPreviousPointIndexAt(position: Double): Double = js.native
  
  /**
    * Returns the position of an interpolated point relative to the two path points it lies between, from 0.0 (point A) to 1.0 (point B)
    * @param position the position of the point to interpolate along this path, from 0.0 to 1.0
    * @returns the sub position
    */
  def getSubPositionAt(position: Double): Double = js.native
  
  /**
    * Returns the tangent vector of an interpolated Path3D curve point at the specified position along this path.
    * @param position the position of the point along this path, from 0.0 to 1.0
    * @param interpolated (optional, default false) : boolean, if true returns an interpolated tangent instead of the tangent of the previous path point.
    * @returns a tangent vector corresponding to the interpolated Path3D curve point, if not interpolated, the tangent is taken from the precomputed tangents array.
    */
  def getTangentAt(position: Double): Vector3 = js.native
  def getTangentAt(position: Double, interpolated: Boolean): Vector3 = js.native
  
  /**
    * Returns an array populated with tangent vectors on each Path3D curve point.
    * @returns an array populated with tangent vectors on each Path3D curve point.
    */
  def getTangents(): js.Array[Vector3] = js.native
  
  /**
    * @returns the computed length (float) of the path.
    */
  def length(): Double = js.native
  
  /**
    * an array of Vector3, the curve axis of the Path3D
    */
  var path: js.Array[Vector3] = js.native
  
  /**
    * Returns a sub path (slice) of this path
    * @param start the position of the fist path point, from 0.0 to 1.0, or a negative value, which will get wrapped around from the end of the path to 0.0 to 1.0 values
    * @param end the position of the last path point, from 0.0 to 1.0, or a negative value, which will get wrapped around from the end of the path to 0.0 to 1.0 values
    * @returns a sub path (slice) of this path
    */
  def slice(): Path3D = js.native
  def slice(start: Double): Path3D = js.native
  def slice(start: Double, end: Double): Path3D = js.native
  def slice(start: Unit, end: Double): Path3D = js.native
  
  /**
    * Forces the Path3D tangent, normal, binormal and distance recomputation.
    * @param path path which all values are copied into the curves points
    * @param firstNormal which should be projected onto the curve
    * @param alignTangentsWithPath (optional, default false) : boolean, if true the tangents will be aligned with the path
    * @returns the same object updated.
    */
  def update(path: js.Array[Vector3]): Path3D = js.native
  def update(path: js.Array[Vector3], firstNormal: Unit, alignTangentsWithPath: Boolean): Path3D = js.native
  def update(path: js.Array[Vector3], firstNormal: Nullable[Vector3]): Path3D = js.native
  def update(path: js.Array[Vector3], firstNormal: Nullable[Vector3], alignTangentsWithPath: Boolean): Path3D = js.native
}
