package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
trait ICollisionCoordinator extends js.Object {
  def destroy(): scala.Unit
  def getNewPosition(
    position: Vector3,
    displacement: Vector3,
    collider: Collider,
    maximumRetry: scala.Double,
    excludedMesh: Nullable[AbstractMesh],
    onNewPosition: js.Function3[
      /* collisionIndex */ scala.Double, 
      /* newPosition */ Vector3, 
      /* collidedMesh */ Nullable[AbstractMesh], 
      scala.Unit
    ],
    collisionIndex: scala.Double
  ): scala.Unit
  def init(scene: Scene): scala.Unit
  def onGeometryAdded(geometry: Geometry): scala.Unit
  def onGeometryDeleted(geometry: Geometry): scala.Unit
  def onGeometryUpdated(geometry: Geometry): scala.Unit
  def onMeshAdded(mesh: AbstractMesh): scala.Unit
  def onMeshRemoved(mesh: AbstractMesh): scala.Unit
  def onMeshUpdated(mesh: AbstractMesh): scala.Unit
}

