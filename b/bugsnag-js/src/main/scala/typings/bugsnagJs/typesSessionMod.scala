package typings.bugsnagJs

import typings.bugsnagJs.anon.Handled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSessionMod {
  
  @JSImport("bugsnag-js/types/session", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Session {
    
    /* CompleteClass */
    var events: Handled = js.native
    
    /* CompleteClass */
    var id: String = js.native
    
    /* CompleteClass */
    var startedAt: String = js.native
    
    /* CompleteClass */
    override def trackError(report: typings.bugsnagJs.typesReportMod.default): Unit = js.native
  }
  
  trait Session extends StObject {
    
    var events: Handled
    
    var id: String
    
    var startedAt: String
    
    def trackError(report: typings.bugsnagJs.typesReportMod.default): Unit
  }
  object Session {
    
    inline def apply(
      events: Handled,
      id: String,
      startedAt: String,
      trackError: typings.bugsnagJs.typesReportMod.default => Unit
    ): Session = {
      val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any], trackError = js.Any.fromFunction1(trackError))
      __obj.asInstanceOf[Session]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Session] (val x: Self) extends AnyVal {
      
      inline def setEvents(value: Handled): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setStartedAt(value: String): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
      
      inline def setTrackError(value: typings.bugsnagJs.typesReportMod.default => Unit): Self = StObject.set(x, "trackError", js.Any.fromFunction1(value))
    }
  }
}
