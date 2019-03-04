package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvent extends js.Object {
  var `type`: java.lang.String
}

object IEvent {
  @scala.inline
  def apply(`type`: java.lang.String): IEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IEvent]
  }
}

