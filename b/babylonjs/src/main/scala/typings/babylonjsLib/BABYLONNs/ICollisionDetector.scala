package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */

trait ICollisionDetector extends js.Object {
  def onCollision(payload: CollidePayload): scala.Unit
  def onInit(payload: InitPayload): scala.Unit
  def onUpdate(payload: UpdatePayload): scala.Unit
}

