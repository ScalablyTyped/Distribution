package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface describing the value associated with a geometry.
  * @hidden
  */
trait SerializedGeometry extends js.Object {
  /**
    * Defines the unique ID of the geometry
    */
  var id: java.lang.String
  /**
    * Defines the array containing the indices
    */
  var indices: stdLib.Uint32Array
  /**
    * Defines the array containing the normals
    */
  var normals: stdLib.Float32Array
  /**
    * Defines the array containing the positions
    */
  var positions: stdLib.Float32Array
}

object SerializedGeometry {
  @scala.inline
  def apply(
    id: java.lang.String,
    indices: stdLib.Uint32Array,
    normals: stdLib.Float32Array,
    positions: stdLib.Float32Array
  ): SerializedGeometry = {
    val __obj = js.Dynamic.literal(id = id, indices = indices, normals = normals, positions = positions)
  
    __obj.asInstanceOf[SerializedGeometry]
  }
}

