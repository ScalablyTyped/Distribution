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
    destroy: () => scala.Unit,
    getNewPosition: (Vector3, Vector3, Collider, scala.Double, Nullable[AbstractMesh], js.Function3[
      /* collisionIndex */ scala.Double, 
      /* newPosition */ Vector3, 
      /* collidedMesh */ Nullable[AbstractMesh], 
      scala.Unit
    ], scala.Double) => scala.Unit,
    init: Scene => scala.Unit,
    onGeometryAdded: Geometry => scala.Unit,
    onGeometryDeleted: Geometry => scala.Unit,
    onGeometryUpdated: Geometry => scala.Unit,
    onMeshAdded: AbstractMesh => scala.Unit,
    onMeshRemoved: AbstractMesh => scala.Unit,
    onMeshUpdated: AbstractMesh => scala.Unit
  ): ICollisionCoordinator = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getNewPosition = js.Any.fromFunction7(getNewPosition), init = js.Any.fromFunction1(init), onGeometryAdded = js.Any.fromFunction1(onGeometryAdded), onGeometryDeleted = js.Any.fromFunction1(onGeometryDeleted), onGeometryUpdated = js.Any.fromFunction1(onGeometryUpdated), onMeshAdded = js.Any.fromFunction1(onMeshAdded), onMeshRemoved = js.Any.fromFunction1(onMeshRemoved), onMeshUpdated = js.Any.fromFunction1(onMeshUpdated))
  
    __obj.asInstanceOf[ICollisionCoordinator]
  }
}

