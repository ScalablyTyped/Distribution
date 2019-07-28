package typings.cucumber.cucumberMod.eventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var data: js.Any
  var name: String
}

object Event {
  @scala.inline
  def apply(data: js.Any, name: String): Event = {
    val __obj = js.Dynamic.literal(data = data, name = name)
  
    __obj.asInstanceOf[Event]
  }
}

