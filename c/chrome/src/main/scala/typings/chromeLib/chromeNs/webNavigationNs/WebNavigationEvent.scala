package typings
package chromeLib.chromeNs.webNavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebNavigationEvent[T /* <: WebNavigationCallbackDetails */]
  extends chromeLib.chromeNs.eventsNs.Event[js.Function1[/* details */ T, scala.Unit]] {
  def addListener(callback: js.Function1[/* details */ T, scala.Unit], filters: WebNavigationEventFilter): scala.Unit = js.native
}

