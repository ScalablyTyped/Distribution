package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBodyEvent extends IEvent {
  var body: Body
}

object IBodyEvent {
  @scala.inline
  def apply(body: Body, `type`: String): IBodyEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBodyEvent]
  }
}

