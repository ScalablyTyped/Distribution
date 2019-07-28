package typings.cypress.typesSinonMod

import typings.cypress.Anon_Abort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonFakeUploadProgress extends js.Object {
  var eventListeners: Anon_Abort
  def addEventListener(event: String, listener: js.Function1[/* e */ Event, _]): Unit
  def dispatchEvent(event: Event): Unit
  def removeEventListener(event: String, listener: js.Function1[/* e */ Event, _]): Unit
}

object SinonFakeUploadProgress {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* e */ Event, _]) => Unit,
    dispatchEvent: Event => Unit,
    eventListeners: Anon_Abort,
    removeEventListener: (String, js.Function1[/* e */ Event, _]) => Unit
  ): SinonFakeUploadProgress = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), eventListeners = eventListeners, removeEventListener = js.Any.fromFunction2(removeEventListener))
  
    __obj.asInstanceOf[SinonFakeUploadProgress]
  }
}

