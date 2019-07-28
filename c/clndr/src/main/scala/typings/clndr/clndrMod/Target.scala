package typings.clndr.clndrMod

import typings.moment.momentMod.Moment
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends js.Object {
  var date: Moment
  var element: Element
  var events: js.Array[_]
}

object Target {
  @scala.inline
  def apply(date: Moment, element: Element, events: js.Array[_]): Target = {
    val __obj = js.Dynamic.literal(date = date, element = element, events = events)
  
    __obj.asInstanceOf[Target]
  }
}

