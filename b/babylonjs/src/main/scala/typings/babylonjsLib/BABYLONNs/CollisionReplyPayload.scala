package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
trait CollisionReplyPayload extends js.Object {
  var collidedMeshUniqueId: scala.Double
  var collisionId: scala.Double
  var newPosition: js.Array[scala.Double]
}

object CollisionReplyPayload {
  @scala.inline
  def apply(collidedMeshUniqueId: scala.Double, collisionId: scala.Double, newPosition: js.Array[scala.Double]): CollisionReplyPayload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collidedMeshUniqueId")(collidedMeshUniqueId)
    __obj.updateDynamic("collisionId")(collisionId)
    __obj.updateDynamic("newPosition")(newPosition)
    __obj.asInstanceOf[CollisionReplyPayload]
  }
}

