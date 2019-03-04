package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollisionEvent extends IBodyEvent {
  var contact: js.Any
}

object ICollisionEvent {
  @scala.inline
  def apply(body: Body, contact: js.Any, `type`: java.lang.String): ICollisionEvent = {
    val __obj = js.Dynamic.literal(body = body, contact = contact)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ICollisionEvent]
  }
}

