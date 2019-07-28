package typings.chrome.chromeNs.castNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast")
@js.native
object ^ extends js.Object {
  var VERSION: js.Array[Double] = js.native
  var isAvailable: Boolean = js.native
  def addReceiverActionListener(listener: js.Function2[/* receiver */ Receiver, /* receiverAction */ ReceiverAction, Unit]): Unit = js.native
  def initialize(
    apiConfig: ApiConfig,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  def logMessage(message: String): Unit = js.native
  def removeReceiverActionListener(listener: js.Function2[/* receiver */ Receiver, /* receiverAction */ ReceiverAction, Unit]): Unit = js.native
  def requestSession(
    successCallback: js.Function1[/* session */ Session, Unit],
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  def requestSession(
    successCallback: js.Function1[/* session */ Session, Unit],
    errorCallback: js.Function1[/* error */ Error, Unit],
    sessionRequest: SessionRequest
  ): Unit = js.native
  def requestSession(
    successCallback: js.Function1[/* session */ Session, Unit],
    errorCallback: js.Function1[/* error */ Error, Unit],
    sessionRequest: SessionRequest,
    label: String
  ): Unit = js.native
  def requestSessionById(sessionId: String): Unit = js.native
  def setCustomReceivers(
    receivers: js.Array[Receiver],
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  def setReceiverDisplayStatus(
    receiver: Receiver,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  def unescape(escaped: String): String = js.native
}

