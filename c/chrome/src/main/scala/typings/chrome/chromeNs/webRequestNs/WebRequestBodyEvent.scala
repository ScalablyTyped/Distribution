package typings.chrome.chromeNs.webRequestNs

import typings.chrome.chromeNs.eventsNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebRequestBodyEvent
  extends Event[js.Function1[/* details */ WebRequestBodyDetails, Unit]] {
  def addListener(callback: js.Function1[/* details */ WebRequestBodyDetails, Unit], filter: RequestFilter): Unit = js.native
  def addListener(
    callback: js.Function1[/* details */ WebRequestBodyDetails, Unit],
    filter: RequestFilter,
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
}

