package typings
package cypressLib.typesSinonMod.SinonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinonFakeUploadProgress extends js.Object {
  var eventListeners: cypressLib.Anon_Abort
  def addEventListener(event: java.lang.String, listener: js.Function1[/* e */ cypressLib.typesSinonMod.Event, _]): scala.Unit
  def dispatchEvent(event: cypressLib.typesSinonMod.Event): scala.Unit
  def removeEventListener(event: java.lang.String, listener: js.Function1[/* e */ cypressLib.typesSinonMod.Event, _]): scala.Unit
}

object SinonFakeUploadProgress {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* e */ cypressLib.typesSinonMod.Event, _]) => scala.Unit,
    dispatchEvent: cypressLib.typesSinonMod.Event => scala.Unit,
    eventListeners: cypressLib.Anon_Abort,
    removeEventListener: (java.lang.String, js.Function1[/* e */ cypressLib.typesSinonMod.Event, _]) => scala.Unit
  ): SinonFakeUploadProgress = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), eventListeners = eventListeners, removeEventListener = js.Any.fromFunction2(removeEventListener))
  
    __obj.asInstanceOf[SinonFakeUploadProgress]
  }
}

