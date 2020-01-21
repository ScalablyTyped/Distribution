package typings.cucumber.mod.events

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
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Event]
  }
}

