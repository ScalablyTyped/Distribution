package typings.chrome.chrome.webRequest

import typings.chrome.chrome.events.EventWithRequiredFilterInAddListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _WebResponseHeadersEvent[T /* <: WebResponseHeadersDetails */]
  extends StObject
     with EventWithRequiredFilterInAddListener[js.Function1[/* details */ T, Unit]] {
  
  def addListener(
    callback: js.Function1[/* details */ T, Unit],
    filter: RequestFilter,
    opt_extraInfoSpec: js.Array[String]
  ): Unit = js.native
}
