package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateEvent extends js.Object {
  var date: stdLib.Date
  var event: stdLib.Event
}

object Anon_DateEvent {
  @scala.inline
  def apply(date: stdLib.Date, event: stdLib.Event): Anon_DateEvent = {
    val __obj = js.Dynamic.literal(date = date, event = event)
  
    __obj.asInstanceOf[Anon_DateEvent]
  }
}

