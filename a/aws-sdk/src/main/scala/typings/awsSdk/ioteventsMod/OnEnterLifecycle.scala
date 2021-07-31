package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnEnterLifecycle extends StObject {
  
  /**
    * Specifies the actions that are performed when the state is entered and the condition is TRUE.
    */
  var events: js.UndefOr[Events] = js.undefined
}
object OnEnterLifecycle {
  
  @scala.inline
  def apply(): OnEnterLifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnEnterLifecycle]
  }
  
  @scala.inline
  implicit class OnEnterLifecycleMutableBuilder[Self <: OnEnterLifecycle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: Events): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value :_*))
  }
}
