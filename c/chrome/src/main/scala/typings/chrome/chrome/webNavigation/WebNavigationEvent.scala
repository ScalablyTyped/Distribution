package typings.chrome.chrome.webNavigation

import typings.chrome.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebNavigationEvent[T /* <: WebNavigationCallbackDetails */]
  extends Event[js.Function1[/* details */ T, Unit]] {
  
  def addListener(callback: js.Function1[/* details */ T, Unit], filters: WebNavigationEventFilter): Unit = js.native
}
