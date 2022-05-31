package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DefaultCollisionCoordinator")
@js.native
class DefaultCollisionCoordinator ()
  extends StObject
     with typings.babylonjs.BABYLON.DefaultCollisionCoordinator {
  
  /* private */ /* CompleteClass */
  var _collideWithWorld: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _finalPosition: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _scaledPosition: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _scaledVelocity: js.Any = js.native
  
  /* private */ /* CompleteClass */
  var _scene: js.Any = js.native
  
  /* CompleteClass */
  override def createCollider(): typings.babylonjs.BABYLON.Collider = js.native
  
  /* CompleteClass */
  override def getNewPosition(
    position: typings.babylonjs.BABYLON.Vector3,
    displacement: typings.babylonjs.BABYLON.Vector3,
    collider: typings.babylonjs.BABYLON.Collider,
    maximumRetry: Double,
    excludedMesh: Nullable[typings.babylonjs.BABYLON.AbstractMesh],
    onNewPosition: js.Function3[
      /* collisionIndex */ Double, 
      /* newPosition */ typings.babylonjs.BABYLON.Vector3, 
      /* collidedMesh */ Nullable[typings.babylonjs.BABYLON.AbstractMesh], 
      Unit
    ],
    collisionIndex: Double
  ): Unit = js.native
  
  /* CompleteClass */
  override def init(scene: typings.babylonjs.BABYLON.Scene): Unit = js.native
}
