package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
trait SerializedMesh extends js.Object {
  var boxMaximum: js.Array[scala.Double]
  var boxMinimum: js.Array[scala.Double]
  var checkCollisions: scala.Boolean
  var geometryId: Nullable[java.lang.String]
  var id: java.lang.String
  var name: java.lang.String
  var sphereCenter: js.Array[scala.Double]
  var sphereRadius: scala.Double
  var subMeshes: js.Array[SerializedSubMesh]
  var uniqueId: scala.Double
  var worldMatrixFromCache: js.Any
}

object SerializedMesh {
  @scala.inline
  def apply(
    boxMaximum: js.Array[scala.Double],
    boxMinimum: js.Array[scala.Double],
    checkCollisions: scala.Boolean,
    geometryId: Nullable[java.lang.String],
    id: java.lang.String,
    name: java.lang.String,
    sphereCenter: js.Array[scala.Double],
    sphereRadius: scala.Double,
    subMeshes: js.Array[SerializedSubMesh],
    uniqueId: scala.Double,
    worldMatrixFromCache: js.Any
  ): SerializedMesh = {
    val __obj = js.Dynamic.literal(boxMaximum = boxMaximum, boxMinimum = boxMinimum, checkCollisions = checkCollisions, geometryId = geometryId.asInstanceOf[js.Any], id = id, name = name, sphereCenter = sphereCenter, sphereRadius = sphereRadius, subMeshes = subMeshes, uniqueId = uniqueId, worldMatrixFromCache = worldMatrixFromCache)
  
    __obj.asInstanceOf[SerializedMesh]
  }
}

