package typings.azdata.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfilerProvider extends DataProvider {
  def connectSession(sessionId: String): Thenable[Boolean]
  def createSession(sessionId: String, sessionName: String, template: ProfilerSessionTemplate): Thenable[Boolean]
  def disconnectSession(sessionId: String): Thenable[Boolean]
  def getXEventSessions(sessionId: String): Thenable[js.Array[String]]
  def pauseSession(sessionId: String): Thenable[Boolean]
  def registerOnProfilerSessionCreated(handler: js.Function1[/* response */ ProfilerSessionCreatedParams, _]): Unit
  def registerOnSessionEventsAvailable(handler: js.Function1[/* response */ ProfilerSessionEvents, _]): Unit
  def registerOnSessionStopped(handler: js.Function1[/* response */ ProfilerSessionStoppedParams, _]): Unit
  def startSession(sessionId: String, sessionName: String): Thenable[Boolean]
  def stopSession(sessionId: String): Thenable[Boolean]
}

object ProfilerProvider {
  @scala.inline
  def apply(
    connectSession: String => Thenable[Boolean],
    createSession: (String, String, ProfilerSessionTemplate) => Thenable[Boolean],
    disconnectSession: String => Thenable[Boolean],
    getXEventSessions: String => Thenable[js.Array[String]],
    pauseSession: String => Thenable[Boolean],
    providerId: String,
    registerOnProfilerSessionCreated: js.Function1[/* response */ ProfilerSessionCreatedParams, _] => Unit,
    registerOnSessionEventsAvailable: js.Function1[/* response */ ProfilerSessionEvents, _] => Unit,
    registerOnSessionStopped: js.Function1[/* response */ ProfilerSessionStoppedParams, _] => Unit,
    startSession: (String, String) => Thenable[Boolean],
    stopSession: String => Thenable[Boolean],
    handle: js.UndefOr[Double] = js.undefined
  ): ProfilerProvider = {
    val __obj = js.Dynamic.literal(connectSession = js.Any.fromFunction1(connectSession), createSession = js.Any.fromFunction3(createSession), disconnectSession = js.Any.fromFunction1(disconnectSession), getXEventSessions = js.Any.fromFunction1(getXEventSessions), pauseSession = js.Any.fromFunction1(pauseSession), providerId = providerId.asInstanceOf[js.Any], registerOnProfilerSessionCreated = js.Any.fromFunction1(registerOnProfilerSessionCreated), registerOnSessionEventsAvailable = js.Any.fromFunction1(registerOnSessionEventsAvailable), registerOnSessionStopped = js.Any.fromFunction1(registerOnSessionStopped), startSession = js.Any.fromFunction2(startSession), stopSession = js.Any.fromFunction1(stopSession))
    if (!js.isUndefined(handle)) __obj.updateDynamic("handle")(handle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilerProvider]
  }
}

