package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
trait UpdatePayload extends js.Object {
  var removedGeometries: js.Array[java.lang.String]
  var removedMeshes: js.Array[scala.Double]
  var updatedGeometries: org.scalablytyped.runtime.StringDictionary[SerializedGeometry]
  var updatedMeshes: org.scalablytyped.runtime.NumberDictionary[SerializedMesh]
}

object UpdatePayload {
  @scala.inline
  def apply(
    removedGeometries: js.Array[java.lang.String],
    removedMeshes: js.Array[scala.Double],
    updatedGeometries: org.scalablytyped.runtime.StringDictionary[SerializedGeometry],
    updatedMeshes: org.scalablytyped.runtime.NumberDictionary[SerializedMesh]
  ): UpdatePayload = {
    val __obj = js.Dynamic.literal(removedGeometries = removedGeometries, removedMeshes = removedMeshes, updatedGeometries = updatedGeometries, updatedMeshes = updatedMeshes)
  
    __obj.asInstanceOf[UpdatePayload]
  }
}

