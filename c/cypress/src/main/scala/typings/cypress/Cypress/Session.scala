package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Session extends StObject {
  
  /**
    * Clear all sessions saved on the backend, including cached global sessions.
    */
  def clearAllSavedSessions(): js.Promise[Unit]
  
  /**
    * Clear all storage and cookie data across all origins associated with the current session.
    */
  def clearCurrentSessionData(): js.Promise[Unit]
  
  /**
    * Get all storage and cookie data across all origins associated with the current session.
    */
  def getCurrentSessionData(): js.Promise[SessionData]
  
  /**
    * Get all storage and cookie data saved on the backend associated with the provided session id.
    */
  def getSession(id: String): js.Promise[ServerSessionData]
}
object Session {
  
  inline def apply(
    clearAllSavedSessions: () => js.Promise[Unit],
    clearCurrentSessionData: () => js.Promise[Unit],
    getCurrentSessionData: () => js.Promise[SessionData],
    getSession: String => js.Promise[ServerSessionData]
  ): Session = {
    val __obj = js.Dynamic.literal(clearAllSavedSessions = js.Any.fromFunction0(clearAllSavedSessions), clearCurrentSessionData = js.Any.fromFunction0(clearCurrentSessionData), getCurrentSessionData = js.Any.fromFunction0(getCurrentSessionData), getSession = js.Any.fromFunction1(getSession))
    __obj.asInstanceOf[Session]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Session] (val x: Self) extends AnyVal {
    
    inline def setClearAllSavedSessions(value: () => js.Promise[Unit]): Self = StObject.set(x, "clearAllSavedSessions", js.Any.fromFunction0(value))
    
    inline def setClearCurrentSessionData(value: () => js.Promise[Unit]): Self = StObject.set(x, "clearCurrentSessionData", js.Any.fromFunction0(value))
    
    inline def setGetCurrentSessionData(value: () => js.Promise[SessionData]): Self = StObject.set(x, "getCurrentSessionData", js.Any.fromFunction0(value))
    
    inline def setGetSession(value: String => js.Promise[ServerSessionData]): Self = StObject.set(x, "getSession", js.Any.fromFunction1(value))
  }
}
