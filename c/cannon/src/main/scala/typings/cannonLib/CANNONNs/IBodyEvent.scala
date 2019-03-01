package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBodyEvent extends IEvent {
  var body: Body
}

object IBodyEvent {
  @scala.inline
  def apply(body: Body, `type`: java.lang.String): IBodyEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[IBodyEvent]
  }
}

