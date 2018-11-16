package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
@JSGlobal("BABYLON.CollisionCoordinatorLegacy")
@js.native
class CollisionCoordinatorLegacy () extends ICollisionCoordinator {
  var _collideWithWorld: js.Any = js.native
  var _finalPosition: js.Any = js.native
  var _scaledPosition: js.Any = js.native
  var _scaledVelocity: js.Any = js.native
  var _scene: js.Any = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  def getNewPosition(
    position: Vector3,
    displacement: Vector3,
    collider: Collider,
    maximumRetry: scala.Double,
    excludedMesh: AbstractMesh,
    onNewPosition: js.Function3[
      /* collisionIndex */ scala.Double, 
      /* newPosition */ Vector3, 
      /* collidedMesh */ Nullable[AbstractMesh], 
      scala.Unit
    ],
    collisionIndex: scala.Double
  ): scala.Unit = js.native
  /* CompleteClass */
  override def getNewPosition(
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
  ): scala.Unit = js.native
  /* CompleteClass */
  override def init(scene: Scene): scala.Unit = js.native
  /* CompleteClass */
  override def onGeometryAdded(geometry: Geometry): scala.Unit = js.native
  /* CompleteClass */
  override def onGeometryDeleted(geometry: Geometry): scala.Unit = js.native
  /* CompleteClass */
  override def onGeometryUpdated(geometry: Geometry): scala.Unit = js.native
  /* CompleteClass */
  override def onMeshAdded(mesh: AbstractMesh): scala.Unit = js.native
  /* CompleteClass */
  override def onMeshRemoved(mesh: AbstractMesh): scala.Unit = js.native
  /* CompleteClass */
  override def onMeshUpdated(mesh: AbstractMesh): scala.Unit = js.native
}

