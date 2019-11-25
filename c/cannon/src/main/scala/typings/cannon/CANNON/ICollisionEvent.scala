package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollisionEvent extends IBodyEvent {
  var contact: js.Any
}

object ICollisionEvent {
  @scala.inline
  def apply(body: Body, contact: js.Any, `type`: String): ICollisionEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], contact = contact.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICollisionEvent]
  }
}

