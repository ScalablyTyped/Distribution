package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshCollisionData extends js.Object {
  var _checkCollisions: Boolean
  var _collider: Nullable[Collider]
  var _collisionGroup: Double
  var _collisionMask: Double
  var _diffPositionForCollisions: Vector3
  var _oldPositionForCollisions: Vector3
  var _onCollideObserver: Nullable[Observer[AbstractMesh]]
  var _onCollisionPositionChangeObserver: Nullable[Observer[Vector3]]
}

object MeshCollisionData {
  @scala.inline
  def apply(
    _checkCollisions: Boolean,
    _collisionGroup: Double,
    _collisionMask: Double,
    _diffPositionForCollisions: Vector3,
    _oldPositionForCollisions: Vector3,
    _collider: Nullable[Collider] = null,
    _onCollideObserver: Nullable[Observer[AbstractMesh]] = null,
    _onCollisionPositionChangeObserver: Nullable[Observer[Vector3]] = null
  ): MeshCollisionData = {
    val __obj = js.Dynamic.literal(_checkCollisions = _checkCollisions.asInstanceOf[js.Any], _collisionGroup = _collisionGroup.asInstanceOf[js.Any], _collisionMask = _collisionMask.asInstanceOf[js.Any], _diffPositionForCollisions = _diffPositionForCollisions.asInstanceOf[js.Any], _oldPositionForCollisions = _oldPositionForCollisions.asInstanceOf[js.Any], _collider = _collider.asInstanceOf[js.Any], _onCollideObserver = _onCollideObserver.asInstanceOf[js.Any], _onCollisionPositionChangeObserver = _onCollisionPositionChangeObserver.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshCollisionData]
  }
}

