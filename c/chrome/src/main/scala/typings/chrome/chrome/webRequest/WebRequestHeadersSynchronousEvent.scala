package typings.chrome.chrome.webRequest

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebRequestHeadersSynchronousEvent
  extends StObject
     with Event[js.Function1[/* details */ WebRequestHeadersDetails, BlockingResponse | Unit]] {
  
  def addListener(
    callback: js.Function1[/* details */ WebRequestHeadersDetails, BlockingResponse | Unit],
    filter: Unit,
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
  def addListener(
    callback: js.Function1[/* details */ WebRequestHeadersDetails, BlockingResponse | Unit],
    filter: RequestFilter
  ): Unit = js.native
  def addListener(
    callback: js.Function1[/* details */ WebRequestHeadersDetails, BlockingResponse | Unit],
    filter: RequestFilter,
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
}
