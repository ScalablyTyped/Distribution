package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Session extends StObject {
  
  // Clear all saved sessions and re-run the current spec file.
  def clearAllSavedSessions(): js.Promise[Unit]
}
object Session {
  
  inline def apply(clearAllSavedSessions: () => js.Promise[Unit]): Session = {
    val __obj = js.Dynamic.literal(clearAllSavedSessions = js.Any.fromFunction0(clearAllSavedSessions))
    __obj.asInstanceOf[Session]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Session] (val x: Self) extends AnyVal {
    
    inline def setClearAllSavedSessions(value: () => js.Promise[Unit]): Self = StObject.set(x, "clearAllSavedSessions", js.Any.fromFunction0(value))
  }
}
