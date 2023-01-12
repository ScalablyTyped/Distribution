package typings.cypress.typesSinonMod

import typings.cypress.anon.Abort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SinonFakeUploadProgress extends StObject {
  
  def addEventListener(event: String, listener: js.Function1[/* e */ Event, Any]): Unit
  
  def dispatchEvent(event: Event): Unit
  
  var eventListeners: Abort
  
  def removeEventListener(event: String, listener: js.Function1[/* e */ Event, Any]): Unit
}
object SinonFakeUploadProgress {
  
  inline def apply(
    addEventListener: (String, js.Function1[/* e */ Event, Any]) => Unit,
    dispatchEvent: Event => Unit,
    eventListeners: Abort,
    removeEventListener: (String, js.Function1[/* e */ Event, Any]) => Unit
  ): SinonFakeUploadProgress = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), dispatchEvent = js.Any.fromFunction1(dispatchEvent), eventListeners = eventListeners.asInstanceOf[js.Any], removeEventListener = js.Any.fromFunction2(removeEventListener))
    __obj.asInstanceOf[SinonFakeUploadProgress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SinonFakeUploadProgress] (val x: Self) extends AnyVal {
    
    inline def setAddEventListener(value: (String, js.Function1[/* e */ Event, Any]) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    inline def setDispatchEvent(value: Event => Unit): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
    
    inline def setEventListeners(value: Abort): Self = StObject.set(x, "eventListeners", value.asInstanceOf[js.Any])
    
    inline def setRemoveEventListener(value: (String, js.Function1[/* e */ Event, Any]) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
  }
}
