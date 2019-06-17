package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventItemAny extends js.Object {
  var event: stdLib.Event | stdLib.KeyboardEvent
  var item: js.Any
}

object Anon_EventItemAny {
  @scala.inline
  def apply(event: stdLib.Event | stdLib.KeyboardEvent, item: js.Any): Anon_EventItemAny = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], item = item)
  
    __obj.asInstanceOf[Anon_EventItemAny]
  }
}

