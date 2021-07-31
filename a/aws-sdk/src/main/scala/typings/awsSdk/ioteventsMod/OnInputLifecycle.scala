package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnInputLifecycle extends StObject {
  
  /**
    * Specifies the actions performed when the condition evaluates to TRUE.
    */
  var events: js.UndefOr[Events] = js.undefined
  
  /**
    * Specifies the actions performed, and the next state entered, when a condition evaluates to TRUE.
    */
  var transitionEvents: js.UndefOr[TransitionEvents] = js.undefined
}
object OnInputLifecycle {
  
  @scala.inline
  def apply(): OnInputLifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnInputLifecycle]
  }
  
  @scala.inline
  implicit class OnInputLifecycleMutableBuilder[Self <: OnInputLifecycle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: Events): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setTransitionEvents(value: TransitionEvents): Self = StObject.set(x, "transitionEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionEventsUndefined: Self = StObject.set(x, "transitionEvents", js.undefined)
    
    @scala.inline
    def setTransitionEventsVarargs(value: TransitionEvent*): Self = StObject.set(x, "transitionEvents", js.Array(value :_*))
  }
}
