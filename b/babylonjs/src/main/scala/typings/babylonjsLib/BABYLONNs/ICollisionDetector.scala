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
    onCollision: CollidePayload => scala.Unit,
    onInit: InitPayload => scala.Unit,
    onUpdate: UpdatePayload => scala.Unit
  ): ICollisionDetector = {
    val __obj = js.Dynamic.literal(onCollision = js.Any.fromFunction1(onCollision), onInit = js.Any.fromFunction1(onInit), onUpdate = js.Any.fromFunction1(onUpdate))
  
    __obj.asInstanceOf[ICollisionDetector]
  }
}

