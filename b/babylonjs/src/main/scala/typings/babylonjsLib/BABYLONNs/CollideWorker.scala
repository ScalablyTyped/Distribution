package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
@JSGlobal("BABYLON.CollideWorker")
@js.native
class CollideWorker protected () extends js.Object {
  def this(collider: Collider, _collisionCache: CollisionCache, finalPosition: Vector3) = this()
  var _collisionCache: js.Any = js.native
  var checkCollision: js.Any = js.native
  var checkSubmeshCollision: js.Any = js.native
  var collideForSubMesh: js.Any = js.native
  var collider: Collider = js.native
  var collisionTranformationMatrix: js.Any = js.native
  var collisionsScalingMatrix: js.Any = js.native
  var finalPosition: js.Any = js.native
  var processCollisionsForSubMeshes: js.Any = js.native
  def collideWithWorld(
    position: Vector3,
    velocity: Vector3,
    maximumRetry: scala.Double,
    excludedMeshUniqueId: Nullable[scala.Double]
  ): scala.Unit = js.native
}

