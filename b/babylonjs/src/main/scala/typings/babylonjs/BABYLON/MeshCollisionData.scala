package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON._MeshCollisionData")
@js.native
class MeshCollisionData () extends js.Object {
  var _checkCollisions: Boolean = js.native
  var _collider: Nullable[Collider] = js.native
  var _collisionGroup: Double = js.native
  var _collisionMask: Double = js.native
  var _diffPositionForCollisions: Vector3 = js.native
  var _oldPositionForCollisions: Vector3 = js.native
  var _onCollideObserver: Nullable[Observer[AbstractMesh]] = js.native
  var _onCollisionPositionChangeObserver: Nullable[Observer[Vector3]] = js.native
}

