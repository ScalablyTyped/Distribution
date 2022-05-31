package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultCollisionCoordinator
  extends StObject
     with ICollisionCoordinator {
  
  /* private */ var _collideWithWorld: js.Any
  
  /* private */ var _finalPosition: js.Any
  
  /* private */ var _scaledPosition: js.Any
  
  /* private */ var _scaledVelocity: js.Any
  
  /* private */ var _scene: js.Any
}
object DefaultCollisionCoordinator {
  
  inline def apply(
    _collideWithWorld: js.Any,
    _finalPosition: js.Any,
    _scaledPosition: js.Any,
    _scaledVelocity: js.Any,
    _scene: js.Any,
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
    
    inline def set_collideWithWorld(value: js.Any): Self = StObject.set(x, "_collideWithWorld", value.asInstanceOf[js.Any])
    
    inline def set_finalPosition(value: js.Any): Self = StObject.set(x, "_finalPosition", value.asInstanceOf[js.Any])
    
    inline def set_scaledPosition(value: js.Any): Self = StObject.set(x, "_scaledPosition", value.asInstanceOf[js.Any])
    
    inline def set_scaledVelocity(value: js.Any): Self = StObject.set(x, "_scaledVelocity", value.asInstanceOf[js.Any])
    
    inline def set_scene(value: js.Any): Self = StObject.set(x, "_scene", value.asInstanceOf[js.Any])
  }
}
