package typings
package clndrLib.clndrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends js.Object {
  var date: momentLib.momentMod.Moment
  var element: stdLib.Element
  var events: js.Array[_]
}

object Target {
  @scala.inline
  def apply(date: momentLib.momentMod.Moment, element: stdLib.Element, events: js.Array[_]): Target = {
    val __obj = js.Dynamic.literal(date = date, element = element, events = events)
  
    __obj.asInstanceOf[Target]
  }
}

