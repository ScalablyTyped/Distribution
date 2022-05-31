package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshCollisionData extends StObject {
  
  var _checkCollisions: Boolean
  
  var _collider: Nullable[Collider]
  
  var _collisionGroup: Double
  
  var _collisionMask: Double
  
  var _collisionResponse: Boolean
  
  var _diffPositionForCollisions: Vector3
  
  var _oldPositionForCollisions: Vector3
  
  var _onCollideObserver: Nullable[Observer[AbstractMesh]]
  
  var _onCollisionPositionChangeObserver: Nullable[Observer[Vector3]]
  
  var _surroundingMeshes: Nullable[js.Array[AbstractMesh]]
}
object MeshCollisionData {
  
  inline def apply(
    _checkCollisions: Boolean,
    _collisionGroup: Double,
    _collisionMask: Double,
    _collisionResponse: Boolean,
    _diffPositionForCollisions: Vector3,
    _oldPositionForCollisions: Vector3
  ): MeshCollisionData = {
    val __obj = js.Dynamic.literal(_checkCollisions = _checkCollisions.asInstanceOf[js.Any], _collisionGroup = _collisionGroup.asInstanceOf[js.Any], _collisionMask = _collisionMask.asInstanceOf[js.Any], _collisionResponse = _collisionResponse.asInstanceOf[js.Any], _diffPositionForCollisions = _diffPositionForCollisions.asInstanceOf[js.Any], _oldPositionForCollisions = _oldPositionForCollisions.asInstanceOf[js.Any], _collider = null, _onCollideObserver = null, _onCollisionPositionChangeObserver = null, _surroundingMeshes = null)
    __obj.asInstanceOf[MeshCollisionData]
  }
  
  extension [Self <: MeshCollisionData](x: Self) {
    
    inline def set_checkCollisions(value: Boolean): Self = StObject.set(x, "_checkCollisions", value.asInstanceOf[js.Any])
    
    inline def set_collider(value: Nullable[Collider]): Self = StObject.set(x, "_collider", value.asInstanceOf[js.Any])
    
    inline def set_colliderNull: Self = StObject.set(x, "_collider", null)
    
    inline def set_collisionGroup(value: Double): Self = StObject.set(x, "_collisionGroup", value.asInstanceOf[js.Any])
    
    inline def set_collisionMask(value: Double): Self = StObject.set(x, "_collisionMask", value.asInstanceOf[js.Any])
    
    inline def set_collisionResponse(value: Boolean): Self = StObject.set(x, "_collisionResponse", value.asInstanceOf[js.Any])
    
    inline def set_diffPositionForCollisions(value: Vector3): Self = StObject.set(x, "_diffPositionForCollisions", value.asInstanceOf[js.Any])
    
    inline def set_oldPositionForCollisions(value: Vector3): Self = StObject.set(x, "_oldPositionForCollisions", value.asInstanceOf[js.Any])
    
    inline def set_onCollideObserver(value: Nullable[Observer[AbstractMesh]]): Self = StObject.set(x, "_onCollideObserver", value.asInstanceOf[js.Any])
    
    inline def set_onCollideObserverNull: Self = StObject.set(x, "_onCollideObserver", null)
    
    inline def set_onCollisionPositionChangeObserver(value: Nullable[Observer[Vector3]]): Self = StObject.set(x, "_onCollisionPositionChangeObserver", value.asInstanceOf[js.Any])
    
    inline def set_onCollisionPositionChangeObserverNull: Self = StObject.set(x, "_onCollisionPositionChangeObserver", null)
    
    inline def set_surroundingMeshes(value: Nullable[js.Array[AbstractMesh]]): Self = StObject.set(x, "_surroundingMeshes", value.asInstanceOf[js.Any])
    
    inline def set_surroundingMeshesNull: Self = StObject.set(x, "_surroundingMeshes", null)
    
    inline def set_surroundingMeshesVarargs(value: AbstractMesh*): Self = StObject.set(x, "_surroundingMeshes", js.Array(value :_*))
  }
}
