package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a 3D path made up of multiple 3D points
  */
@JSImport("babylonjs", "Path3D")
@js.native
class Path3D protected ()
  extends babylonjsLib.BABYLONNs.Path3D {
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
  path: js.Array[babylonjsLib.BABYLONNs.Vector3]) = this()
  def this(/**
    * an array of Vector3, the curve axis of the Path3D
    */
  path: js.Array[babylonjsLib.BABYLONNs.Vector3], firstNormal: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Vector3]) = this()
  def this(/**
    * an array of Vector3, the curve axis of the Path3D
    */
  path: js.Array[babylonjsLib.BABYLONNs.Vector3], firstNormal: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Vector3], raw: scala.Boolean) = this()
}

