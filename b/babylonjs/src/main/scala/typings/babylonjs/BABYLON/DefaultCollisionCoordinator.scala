package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultCollisionCoordinator
  extends StObject
     with ICollisionCoordinator {
  
  /* private */ var _collideWithWorld: Any
  
  /* private */ var _finalPosition: Any
  
  /* private */ var _scaledPosition: Any
  
  /* private */ var _scaledVelocity: Any
  
  /* private */ var _scene: Any
}
object DefaultCollisionCoordinator {
  
  inline def apply(
    _collideWithWorld: Any,
    _finalPosition: Any,
    _scaledPosition: Any,
    _scaledVelocity: Any,
    _scene: Any,
    createCollider: () => Collider,
    getNewPosition: (Vector3, Vector3, Collider, Double, Nullable[AbstractMesh], js.Function3[
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
  
  extension [Self <: DefaultCollisionCoordinator](x: Self) {
    
    inline def set_collideWithWorld(value: Any): Self = StObject.set(x, "_collideWithWorld", value.asInstanceOf[js.Any])
    
    inline def set_finalPosition(value: Any): Self = StObject.set(x, "_finalPosition", value.asInstanceOf[js.Any])
    
    inline def set_scaledPosition(value: Any): Self = StObject.set(x, "_scaledPosition", value.asInstanceOf[js.Any])
    
    inline def set_scaledVelocity(value: Any): Self = StObject.set(x, "_scaledVelocity", value.asInstanceOf[js.Any])
    
    inline def set_scene(value: Any): Self = StObject.set(x, "_scene", value.asInstanceOf[js.Any])
  }
}
