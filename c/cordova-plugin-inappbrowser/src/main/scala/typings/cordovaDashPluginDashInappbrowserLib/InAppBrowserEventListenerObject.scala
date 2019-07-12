package typings
package cordovaDashPluginDashInappbrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InAppBrowserEventListenerObject extends js.Object {
  def handleEvent(evt: InAppBrowserEvent): scala.Unit
}

object InAppBrowserEventListenerObject {
  @scala.inline
  def apply(handleEvent: InAppBrowserEvent => scala.Unit): InAppBrowserEventListenerObject = {
    val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
  
    __obj.asInstanceOf[InAppBrowserEventListenerObject]
  }
}

