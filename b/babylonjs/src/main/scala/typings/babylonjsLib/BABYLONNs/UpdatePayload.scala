package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */

trait UpdatePayload extends js.Object {
  var removedGeometries: js.Array[java.lang.String]
  var removedMeshes: js.Array[scala.Double]
  var updatedGeometries: ScalablyTyped.runtime.StringDictionary[SerializedGeometry]
  var updatedMeshes: ScalablyTyped.runtime.NumberDictionary[SerializedMesh]
}

