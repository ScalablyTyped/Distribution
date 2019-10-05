package typings.chrome.chrome.webRequest

import typings.chrome.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _WebResponseHeadersEvent[T /* <: WebResponseHeadersDetails */]
  extends Event[js.Function1[/* details */ T, Unit]] {
  def addListener(callback: js.Function1[/* details */ T, Unit], filter: RequestFilter): Unit = js.native
  def addListener(
    callback: js.Function1[/* details */ T, Unit],
    filter: RequestFilter,
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
}

