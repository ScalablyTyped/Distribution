package typings.chrome.chrome.webRequest

import typings.chrome.chrome.events.EventWithRequiredFilterInAddListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebResponseHeadersEvent
  extends StObject
     with EventWithRequiredFilterInAddListener[js.Function1[/* details */ WebResponseHeadersDetails, BlockingResponse | Unit]] {
  
  def addListener(
    callback: js.Function1[/* details */ WebResponseHeadersDetails, BlockingResponse | Unit],
    filter: RequestFilter,
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
}
