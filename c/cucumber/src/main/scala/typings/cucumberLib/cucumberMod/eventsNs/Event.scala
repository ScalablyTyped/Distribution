package typings
package cucumberLib.cucumberMod.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var data: js.Any
  var name: java.lang.String
}

object Event {
  @scala.inline
  def apply(data: js.Any, name: java.lang.String): Event = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Event]
  }
}

