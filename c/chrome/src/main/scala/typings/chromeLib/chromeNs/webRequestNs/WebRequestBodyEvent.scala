package typings
package chromeLib.chromeNs.webRequestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebRequestBodyEvent
  extends chromeLib.chromeNs.eventsNs.Event[js.Function1[/* details */ WebRequestBodyDetails, scala.Unit]] {
  def addListener(callback: js.Function1[/* details */ WebRequestBodyDetails, scala.Unit], filter: RequestFilter): scala.Unit = js.native
  def addListener(
    callback: js.Function1[/* details */ WebRequestBodyDetails, scala.Unit],
    filter: RequestFilter,
    opt_extraInfoSpec: js.Array[java.lang.String]
  ): scala.Unit = js.native
}

