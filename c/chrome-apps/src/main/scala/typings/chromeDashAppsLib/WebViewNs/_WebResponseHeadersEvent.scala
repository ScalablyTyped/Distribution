package typings
package chromeDashAppsLib.WebViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _WebResponseHeadersEvent[T /* <: WebResponseHeadersDetails */]
  extends chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* details */ T, scala.Unit]] {
  def addListener(callback: js.Function1[/* details */ T, scala.Unit], filter: RequestFilter): scala.Unit = js.native
  def addListener(
    callback: js.Function1[/* details */ T, scala.Unit],
    filter: RequestFilter,
    opt_extraInfoSpec: js.Array[java.lang.String]
  ): scala.Unit = js.native
}

