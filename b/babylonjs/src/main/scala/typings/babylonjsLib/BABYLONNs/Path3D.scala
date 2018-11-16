package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents a 3D path made up of multiple 3D points
     */
@JSGlobal("BABYLON.Path3D")
@js.native
class Path3D protected () extends js.Object {
  /**
          * new Path3D(path, normal, raw)
          * Creates a Path3D. A Path3D is a logical math object, so not a mesh.
          * please read the description in the tutorial :  http://doc.babylonjs.com/tutorials/How_to_use_Path3D
          * @param path an array of Vector3, the curve axis of the Path3D
          * @param normal (options) Vector3, the first wanted normal to the curve. Ex (0, 1, 0) for a vertical normal.
          * @param raw (optional, default false) : boolean, if true the returned Path3D isn't normalized. Useful to depict path acceleration or speed.
          */
  def this(/**
           * an array of Vector3, the curve axis of the Path3D
           */
  path: js.Array[Vector3]) = this()
  /**
          * new Path3D(path, normal, raw)
          * Creates a Path3D. A Path3D is a logical math object, so not a mesh.
          * please read the description in the tutorial :  http://doc.babylonjs.com/tutorials/How_to_use_Path3D
          * @param path an array of Vector3, the curve axis of the Path3D
          * @param normal (options) Vector3, the first wanted normal to the curve. Ex (0, 1, 0) for a vertical normal.
          * @param raw (optional, default false) : boolean, if true the returned Path3D isn't normalized. Useful to depict path acceleration or speed.
          */
  def this(/**
           * an array of Vector3, the curve axis of the Path3D
           */
  path: js.Array[Vector3], firstNormal: Nullable[Vector3]) = this()
  /**
          * new Path3D(path, normal, raw)
          * Creates a Path3D. A Path3D is a logical math object, so not a mesh.
          * please read the description in the tutorial :  http://doc.babylonjs.com/tutorials/How_to_use_Path3D
          * @param path an array of Vector3, the curve axis of the Path3D
          * @param normal (options) Vector3, the first wanted normal to the curve. Ex (0, 1, 0) for a vertical normal.
          * @param raw (optional, default false) : boolean, if true the returned Path3D isn't normalized. Useful to depict path acceleration or speed.
          */
  def this(/**
           * an array of Vector3, the curve axis of the Path3D
           */
  path: js.Array[Vector3], firstNormal: Nullable[Vector3], raw: scala.Boolean) = this()
  var _binormals: js.Any = js.native
  var _compute: js.Any = js.native
  var _curve: js.Any = js.native
  var _distances: js.Any = js.native
  var _getFirstNonNullVector: js.Any = js.native
  var _getLastNonNullVector: js.Any = js.native
  var _normalVector: js.Any = js.native
  var _normals: js.Any = js.native
  var _raw: js.Any = js.native
  var _tangents: js.Any = js.native
  /**
           * an array of Vector3, the curve axis of the Path3D
           */
  var path: js.Array[Vector3] = js.native
  /**
           * Returns an array populated with binormal vectors on each Path3D curve point.
           * @returns an array populated with binormal vectors on each Path3D curve point.
           */
  def getBinormals(): js.Array[Vector3] = js.native
  /**
           * Returns the Path3D array of successive Vector3 designing its curve.
           * @returns the Path3D array of successive Vector3 designing its curve.
           */
  def getCurve(): js.Array[Vector3] = js.native
  /**
           * Returns an array populated with distances (float) of the i-th point from the first curve point.
           * @returns an array populated with distances (float) of the i-th point from the first curve point.
           */
  def getDistances(): js.Array[scala.Double] = js.native
  /**
           * Returns an array populated with normal vectors on each Path3D curve point.
           * @returns an array populated with normal vectors on each Path3D curve point.
           */
  def getNormals(): js.Array[Vector3] = js.native
  /**
           * Returns an array populated with tangent vectors on each Path3D curve point.
           * @returns an array populated with tangent vectors on each Path3D curve point.
           */
  def getTangents(): js.Array[Vector3] = js.native
  /**
           * Forces the Path3D tangent, normal, binormal and distance recomputation.
           * @param path path which all values are copied into the curves points
           * @param firstNormal which should be projected onto the curve
           * @returns the same object updated.
           */
  def update(path: js.Array[Vector3]): Path3D = js.native
  /**
           * Forces the Path3D tangent, normal, binormal and distance recomputation.
           * @param path path which all values are copied into the curves points
           * @param firstNormal which should be projected onto the curve
           * @returns the same object updated.
           */
  def update(path: js.Array[Vector3], firstNormal: Nullable[Vector3]): Path3D = js.native
}

