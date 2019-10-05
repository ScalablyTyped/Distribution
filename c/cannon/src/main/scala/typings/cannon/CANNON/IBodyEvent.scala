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
    val __obj = js.Dynamic.literal(body = body)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IBodyEvent]
  }
}

