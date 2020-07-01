package typings.bulmaCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event[T /* <: EventType */] extends js.Object {
  var data: bulmaCalendar
  var timeStamp: Double
  var `type`: T
}

object Event {
  @scala.inline
  def apply[/* <: typings.bulmaCalendar.mod.EventType */ T](data: bulmaCalendar, timeStamp: Double, `type`: T): Event[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event[T]]
  }
}

