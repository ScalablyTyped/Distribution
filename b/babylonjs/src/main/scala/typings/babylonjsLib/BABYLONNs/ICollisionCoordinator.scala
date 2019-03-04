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

object ICollisionCoordinator {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Unit],
    getNewPosition: js.Function7[
      Vector3, 
      Vector3, 
      Collider, 
      scala.Double, 
      Nullable[AbstractMesh], 
      js.Function3[
        /* collisionIndex */ scala.Double, 
        /* newPosition */ Vector3, 
        /* collidedMesh */ Nullable[AbstractMesh], 
        scala.Unit
      ], 
      scala.Double, 
      scala.Unit
    ],
    init: js.Function1[Scene, scala.Unit],
    onGeometryAdded: js.Function1[Geometry, scala.Unit],
    onGeometryDeleted: js.Function1[Geometry, scala.Unit],
    onGeometryUpdated: js.Function1[Geometry, scala.Unit],
    onMeshAdded: js.Function1[AbstractMesh, scala.Unit],
    onMeshRemoved: js.Function1[AbstractMesh, scala.Unit],
    onMeshUpdated: js.Function1[AbstractMesh, scala.Unit]
  ): ICollisionCoordinator = {
    val __obj = js.Dynamic.literal(destroy = destroy, getNewPosition = getNewPosition, init = init, onGeometryAdded = onGeometryAdded, onGeometryDeleted = onGeometryDeleted, onGeometryUpdated = onGeometryUpdated, onMeshAdded = onMeshAdded, onMeshRemoved = onMeshRemoved, onMeshUpdated = onMeshUpdated)
  
    __obj.asInstanceOf[ICollisionCoordinator]
  }
}

