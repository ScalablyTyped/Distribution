package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultCollisionCoordinator extends ICollisionCoordinator {
  
  var _collideWithWorld: js.Any = js.native
  
  var _finalPosition: js.Any = js.native
  
  var _scaledPosition: js.Any = js.native
  
  var _scaledVelocity: js.Any = js.native
  
  var _scene: js.Any = js.native
  
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
  ): Unit = js.native
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
  
  @scala.inline
  implicit class DefaultCollisionCoordinatorOps[Self <: DefaultCollisionCoordinator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_collideWithWorld(value: js.Any): Self = this.set("_collideWithWorld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_finalPosition(value: js.Any): Self = this.set("_finalPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_scaledPosition(value: js.Any): Self = this.set("_scaledPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_scaledVelocity(value: js.Any): Self = this.set("_scaledVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_scene(value: js.Any): Self = this.set("_scene", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetNewPosition(
      value: (Vector3, Vector3, Collider, Double, AbstractMesh, js.Function3[
          /* collisionIndex */ Double, 
          /* newPosition */ Vector3, 
          /* collidedMesh */ Nullable[AbstractMesh], 
          Unit
        ], Double) => Unit
    ): Self = this.set("getNewPosition", js.Any.fromFunction7(value))
  }
}
