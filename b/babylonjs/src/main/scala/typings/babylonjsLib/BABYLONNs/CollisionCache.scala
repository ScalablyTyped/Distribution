package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
@JSGlobal("BABYLON.CollisionCache")
@js.native
class CollisionCache () extends js.Object {
  var _geometries: js.Any = js.native
  var _meshes: js.Any = js.native
  def addGeometry(geometry: SerializedGeometry): scala.Unit = js.native
  def addMesh(mesh: SerializedMesh): scala.Unit = js.native
  def getGeometries(): org.scalablytyped.runtime.NumberDictionary[SerializedGeometry] = js.native
  def getGeometry(id: java.lang.String): SerializedGeometry = js.native
  def getMesh(id: js.Any): SerializedMesh = js.native
  def getMeshes(): org.scalablytyped.runtime.NumberDictionary[SerializedMesh] = js.native
  def removeGeometry(id: java.lang.String): scala.Unit = js.native
  def removeMesh(uniqueId: scala.Double): scala.Unit = js.native
}

