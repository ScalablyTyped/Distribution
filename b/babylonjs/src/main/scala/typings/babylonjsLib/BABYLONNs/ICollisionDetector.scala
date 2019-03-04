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

object ICollisionDetector {
  @scala.inline
  def apply(
    onCollision: js.Function1[CollidePayload, scala.Unit],
    onInit: js.Function1[InitPayload, scala.Unit],
    onUpdate: js.Function1[UpdatePayload, scala.Unit]
  ): ICollisionDetector = {
    val __obj = js.Dynamic.literal(onCollision = onCollision, onInit = onInit, onUpdate = onUpdate)
  
    __obj.asInstanceOf[ICollisionDetector]
  }
}

