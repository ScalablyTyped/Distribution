package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
trait SerializedSubMesh extends js.Object {
  var boxMaximum: js.Array[scala.Double]
  var boxMinimum: js.Array[scala.Double]
  var hasMaterial: scala.Boolean
  var indexCount: scala.Double
  var indexStart: scala.Double
  var position: scala.Double
  var sphereCenter: js.Array[scala.Double]
  var sphereRadius: scala.Double
  var verticesCount: scala.Double
  var verticesStart: scala.Double
}

object SerializedSubMesh {
  @scala.inline
  def apply(
    boxMaximum: js.Array[scala.Double],
    boxMinimum: js.Array[scala.Double],
    hasMaterial: scala.Boolean,
    indexCount: scala.Double,
    indexStart: scala.Double,
    position: scala.Double,
    sphereCenter: js.Array[scala.Double],
    sphereRadius: scala.Double,
    verticesCount: scala.Double,
    verticesStart: scala.Double
  ): SerializedSubMesh = {
    val __obj = js.Dynamic.literal(boxMaximum = boxMaximum, boxMinimum = boxMinimum, hasMaterial = hasMaterial, indexCount = indexCount, indexStart = indexStart, position = position, sphereCenter = sphereCenter, sphereRadius = sphereRadius, verticesCount = verticesCount, verticesStart = verticesStart)
  
    __obj.asInstanceOf[SerializedSubMesh]
  }
}

