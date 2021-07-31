package typings.chromeApps.WebView

import typings.chromeApps.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebRequestHeadersEvent
  extends StObject
     with Event[js.Function1[/* details */ WebRequestHeadersDetails, Unit]] {
  
  def addListener(
    callback: js.Function1[/* details */ WebRequestHeadersDetails, Unit],
    filter: Unit,
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
  def addListener(callback: js.Function1[/* details */ WebRequestHeadersDetails, Unit], filter: RequestFilter): Unit = js.native
  def addListener(
    callback: js.Function1[/* details */ WebRequestHeadersDetails, Unit],
    filter: RequestFilter,
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
}
