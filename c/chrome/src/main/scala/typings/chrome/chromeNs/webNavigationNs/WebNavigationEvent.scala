package typings.chrome.chromeNs.webNavigationNs

import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebNavigationEvent[T /* <: WebNavigationCallbackDetails */]
  extends Event[js.Function1[/* details */ T, Unit]] {
  def addListener(callback: js.Function1[/* details */ T, Unit], filters: WebNavigationEventFilter): Unit = js.native
}

