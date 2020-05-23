package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON._MeshCollisionData")
@js.native
class MeshCollisionData ()
  extends typings.babylonjs.BABYLON.MeshCollisionData {
  /* CompleteClass */
  override var _checkCollisions: Boolean = js.native
  /* CompleteClass */
  override var _collider: Nullable[typings.babylonjs.BABYLON.Collider] = js.native
  /* CompleteClass */
  override var _collisionGroup: Double = js.native
  /* CompleteClass */
  override var _collisionMask: Double = js.native
  /* CompleteClass */
  override var _diffPositionForCollisions: typings.babylonjs.BABYLON.Vector3 = js.native
  /* CompleteClass */
  override var _oldPositionForCollisions: typings.babylonjs.BABYLON.Vector3 = js.native
  /* CompleteClass */
  override var _onCollideObserver: Nullable[typings.babylonjs.BABYLON.Observer[typings.babylonjs.BABYLON.AbstractMesh]] = js.native
  /* CompleteClass */
  override var _onCollisionPositionChangeObserver: Nullable[typings.babylonjs.BABYLON.Observer[typings.babylonjs.BABYLON.Vector3]] = js.native
}

