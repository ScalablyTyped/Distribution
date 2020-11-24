package typings.babylonjs.meshCollisionDataMod

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.colliderMod.Collider
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.observableMod.Observer
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Collisions/meshCollisionData", "_MeshCollisionData")
@js.native
class MeshCollisionData () extends js.Object {
  
  var _checkCollisions: Boolean = js.native
  
  var _collider: Nullable[Collider] = js.native
  
  var _collisionGroup: Double = js.native
  
  var _collisionMask: Double = js.native
  
  var _collisionResponse: Boolean = js.native
  
  var _diffPositionForCollisions: Vector3 = js.native
  
  var _oldPositionForCollisions: Vector3 = js.native
  
  var _onCollideObserver: Nullable[Observer[AbstractMesh]] = js.native
  
  var _onCollisionPositionChangeObserver: Nullable[Observer[Vector3]] = js.native
  
  var _surroundingMeshes: Nullable[js.Array[AbstractMesh]] = js.native
}
