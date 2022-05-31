package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON._MeshCollisionData")
@js.native
class MeshCollisionData ()
  extends StObject
     with typings.babylonjs.BABYLON.MeshCollisionData {
  
  /* CompleteClass */
  var _checkCollisions: Boolean = js.native
  
  /* CompleteClass */
  var _collider: Nullable[typings.babylonjs.BABYLON.Collider] = js.native
  
  /* CompleteClass */
  var _collisionGroup: Double = js.native
  
  /* CompleteClass */
  var _collisionMask: Double = js.native
  
  /* CompleteClass */
  var _collisionResponse: Boolean = js.native
  
  /* CompleteClass */
  var _diffPositionForCollisions: typings.babylonjs.BABYLON.Vector3 = js.native
  
  /* CompleteClass */
  var _oldPositionForCollisions: typings.babylonjs.BABYLON.Vector3 = js.native
  
  /* CompleteClass */
  var _onCollideObserver: Nullable[typings.babylonjs.BABYLON.Observer[typings.babylonjs.BABYLON.AbstractMesh]] = js.native
  
  /* CompleteClass */
  var _onCollisionPositionChangeObserver: Nullable[typings.babylonjs.BABYLON.Observer[typings.babylonjs.BABYLON.Vector3]] = js.native
  
  /* CompleteClass */
  var _surroundingMeshes: Nullable[js.Array[typings.babylonjs.BABYLON.AbstractMesh]] = js.native
}
