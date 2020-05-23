package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultCollisionCoordinator extends ICollisionCoordinator {
  var _collideWithWorld: js.Any
  var _finalPosition: js.Any
  var _scaledPosition: js.Any
  var _scaledVelocity: js.Any
  var _scene: js.Any
  def getNewPosition(
    position: Vector3,
    displacement: Vector3,
    collider: Collider,
    maximumRetry: Double,
    excludedMesh: AbstractMesh,
    onNewPosition: js.Function3[
      /* collisionIndex */ Double, 
      /* newPosition */ Vector3, 
      /* collidedMesh */ Nullable[AbstractMesh], 
      Unit
    ],
    collisionIndex: Double
  ): Unit
}

object DefaultCollisionCoordinator {
  @scala.inline
  def apply(
    _collideWithWorld: js.Any,
    _finalPosition: js.Any,
    _scaledPosition: js.Any,
    _scaledVelocity: js.Any,
    _scene: js.Any,
    createCollider: () => Collider,
    getNewPosition: (Vector3, Vector3, Collider, Double, AbstractMesh, js.Function3[
      /* collisionIndex */ Double, 
      /* newPosition */ Vector3, 
      /* collidedMesh */ Nullable[AbstractMesh], 
      Unit
    ], Double) => Unit,
    init: Scene => Unit
  ): DefaultCollisionCoordinator = {
    val __obj = js.Dynamic.literal(_collideWithWorld = _collideWithWorld.asInstanceOf[js.Any], _finalPosition = _finalPosition.asInstanceOf[js.Any], _scaledPosition = _scaledPosition.asInstanceOf[js.Any], _scaledVelocity = _scaledVelocity.asInstanceOf[js.Any], _scene = _scene.asInstanceOf[js.Any], createCollider = js.Any.fromFunction0(createCollider), getNewPosition = js.Any.fromFunction7(getNewPosition), init = js.Any.fromFunction1(init))
    __obj.asInstanceOf[DefaultCollisionCoordinator]
  }
}

