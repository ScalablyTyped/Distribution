package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
trait CollidePayload extends js.Object {
  var collider: SerializedColliderToWorker
  var collisionId: scala.Double
  var excludedMeshUniqueId: Nullable[scala.Double]
  var maximumRetry: scala.Double
}

object CollidePayload {
  @scala.inline
  def apply(
    collider: SerializedColliderToWorker,
    collisionId: scala.Double,
    excludedMeshUniqueId: Nullable[scala.Double],
    maximumRetry: scala.Double
  ): CollidePayload = {
    val __obj = js.Dynamic.literal(collider = collider, collisionId = collisionId, excludedMeshUniqueId = excludedMeshUniqueId.asInstanceOf[js.Any], maximumRetry = maximumRetry)
  
    __obj.asInstanceOf[CollidePayload]
  }
}

