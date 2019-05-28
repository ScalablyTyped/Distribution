package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofWebView extends js.Object {
  /**
    * WebView Events are different from Chrome Events, they extend the normal DOM Events.
    */
  val EventsNs: js.Any
}

object TypeofWebView {
  @scala.inline
  def apply(EventsNs: js.Any): TypeofWebView = {
    val __obj = js.Dynamic.literal(EventsNs = EventsNs)
  
    __obj.asInstanceOf[TypeofWebView]
  }
}

