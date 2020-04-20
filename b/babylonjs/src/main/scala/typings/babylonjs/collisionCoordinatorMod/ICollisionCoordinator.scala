package typings.babylonjs.collisionCoordinatorMod

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.colliderMod.Collider
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollisionCoordinator extends js.Object {
  def createCollider(): Collider
  def getNewPosition(
    position: Vector3,
    displacement: Vector3,
    collider: Collider,
    maximumRetry: Double,
    excludedMesh: Nullable[AbstractMesh],
    onNewPosition: js.Function3[
      /* collisionIndex */ Double, 
      /* newPosition */ Vector3, 
      /* collidedMesh */ Nullable[AbstractMesh], 
      Unit
    ],
    collisionIndex: Double
  ): Unit
  def init(scene: Scene): Unit
}

object ICollisionCoordinator {
  @scala.inline
  def apply(
    createCollider: () => Collider,
    getNewPosition: (Vector3, Vector3, Collider, Double, Nullable[AbstractMesh], js.Function3[
      /* collisionIndex */ Double, 
      /* newPosition */ Vector3, 
      /* collidedMesh */ Nullable[AbstractMesh], 
      Unit
    ], Double) => Unit,
    init: Scene => Unit
  ): ICollisionCoordinator = {
    val __obj = js.Dynamic.literal(createCollider = js.Any.fromFunction0(createCollider), getNewPosition = js.Any.fromFunction7(getNewPosition), init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[ICollisionCoordinator]
  }
}

