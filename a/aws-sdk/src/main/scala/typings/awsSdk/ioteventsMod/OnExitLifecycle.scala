package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnExitLifecycle extends StObject {
  
  /**
    * Specifies the actions that are performed when the state is exited and the condition is TRUE.
    */
  var events: js.UndefOr[Events] = js.undefined
}
object OnExitLifecycle {
  
  @scala.inline
  def apply(): OnExitLifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnExitLifecycle]
  }
  
  @scala.inline
  implicit class OnExitLifecycleMutableBuilder[Self <: OnExitLifecycle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: Events): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value :_*))
  }
}
