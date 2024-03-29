package typings.azdata.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfilerProvider
  extends StObject
     with DataProvider {
  
  def connectSession(sessionId: String): Thenable[Boolean]
  
  def createSession(sessionId: String, sessionName: String, template: ProfilerSessionTemplate): Thenable[Boolean]
  
  def disconnectSession(sessionId: String): Thenable[Boolean]
  
  def getXEventSessions(sessionId: String): Thenable[js.Array[String]]
  
  def pauseSession(sessionId: String): Thenable[Boolean]
  
  def registerOnProfilerSessionCreated(handler: js.Function1[/* response */ ProfilerSessionCreatedParams, Any]): Unit
  
  def registerOnSessionEventsAvailable(handler: js.Function1[/* response */ ProfilerSessionEvents, Any]): Unit
  
  def registerOnSessionStopped(handler: js.Function1[/* response */ ProfilerSessionStoppedParams, Any]): Unit
  
  def startSession(sessionId: String, sessionName: String): Thenable[Boolean]
  
  def stopSession(sessionId: String): Thenable[Boolean]
}
object ProfilerProvider {
  
  inline def apply(
    connectSession: String => Thenable[Boolean],
    createSession: (String, String, ProfilerSessionTemplate) => Thenable[Boolean],
    disconnectSession: String => Thenable[Boolean],
    getXEventSessions: String => Thenable[js.Array[String]],
    pauseSession: String => Thenable[Boolean],
    providerId: String,
    registerOnProfilerSessionCreated: js.Function1[/* response */ ProfilerSessionCreatedParams, Any] => Unit,
    registerOnSessionEventsAvailable: js.Function1[/* response */ ProfilerSessionEvents, Any] => Unit,
    registerOnSessionStopped: js.Function1[/* response */ ProfilerSessionStoppedParams, Any] => Unit,
    startSession: (String, String) => Thenable[Boolean],
    stopSession: String => Thenable[Boolean]
  ): ProfilerProvider = {
    val __obj = js.Dynamic.literal(connectSession = js.Any.fromFunction1(connectSession), createSession = js.Any.fromFunction3(createSession), disconnectSession = js.Any.fromFunction1(disconnectSession), getXEventSessions = js.Any.fromFunction1(getXEventSessions), pauseSession = js.Any.fromFunction1(pauseSession), providerId = providerId.asInstanceOf[js.Any], registerOnProfilerSessionCreated = js.Any.fromFunction1(registerOnProfilerSessionCreated), registerOnSessionEventsAvailable = js.Any.fromFunction1(registerOnSessionEventsAvailable), registerOnSessionStopped = js.Any.fromFunction1(registerOnSessionStopped), startSession = js.Any.fromFunction2(startSession), stopSession = js.Any.fromFunction1(stopSession))
    __obj.asInstanceOf[ProfilerProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProfilerProvider] (val x: Self) extends AnyVal {
    
    inline def setConnectSession(value: String => Thenable[Boolean]): Self = StObject.set(x, "connectSession", js.Any.fromFunction1(value))
    
    inline def setCreateSession(value: (String, String, ProfilerSessionTemplate) => Thenable[Boolean]): Self = StObject.set(x, "createSession", js.Any.fromFunction3(value))
    
    inline def setDisconnectSession(value: String => Thenable[Boolean]): Self = StObject.set(x, "disconnectSession", js.Any.fromFunction1(value))
    
    inline def setGetXEventSessions(value: String => Thenable[js.Array[String]]): Self = StObject.set(x, "getXEventSessions", js.Any.fromFunction1(value))
    
    inline def setPauseSession(value: String => Thenable[Boolean]): Self = StObject.set(x, "pauseSession", js.Any.fromFunction1(value))
    
    inline def setRegisterOnProfilerSessionCreated(value: js.Function1[/* response */ ProfilerSessionCreatedParams, Any] => Unit): Self = StObject.set(x, "registerOnProfilerSessionCreated", js.Any.fromFunction1(value))
    
    inline def setRegisterOnSessionEventsAvailable(value: js.Function1[/* response */ ProfilerSessionEvents, Any] => Unit): Self = StObject.set(x, "registerOnSessionEventsAvailable", js.Any.fromFunction1(value))
    
    inline def setRegisterOnSessionStopped(value: js.Function1[/* response */ ProfilerSessionStoppedParams, Any] => Unit): Self = StObject.set(x, "registerOnSessionStopped", js.Any.fromFunction1(value))
    
    inline def setStartSession(value: (String, String) => Thenable[Boolean]): Self = StObject.set(x, "startSession", js.Any.fromFunction2(value))
    
    inline def setStopSession(value: String => Thenable[Boolean]): Self = StObject.set(x, "stopSession", js.Any.fromFunction1(value))
  }
}
