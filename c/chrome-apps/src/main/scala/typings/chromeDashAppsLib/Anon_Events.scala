package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Events extends js.Object {
  /**
    * WebView Events are different from Chrome Events, they extend the normal DOM Events.
    */
  val EventsNs: js.Any
}

object Anon_Events {
  @scala.inline
  def apply(EventsNs: js.Any): Anon_Events = {
    val __obj = js.Dynamic.literal(EventsNs = EventsNs)
  
    __obj.asInstanceOf[Anon_Events]
  }
}

