package typings
package chromeLib.chromeNs.castNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast")
@js.native
object ^ extends js.Object {
  var VERSION: js.Array[scala.Double] = js.native
  var isAvailable: scala.Boolean = js.native
  def addReceiverActionListener(listener: js.Function2[/* receiver */ Receiver, /* receiverAction */ ReceiverAction, scala.Unit]): scala.Unit = js.native
  def initialize(
    apiConfig: ApiConfig,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, scala.Unit]
  ): scala.Unit = js.native
  def logMessage(message: java.lang.String): scala.Unit = js.native
  def removeReceiverActionListener(listener: js.Function2[/* receiver */ Receiver, /* receiverAction */ ReceiverAction, scala.Unit]): scala.Unit = js.native
  def requestSession(
    successCallback: js.Function1[/* session */ Session, scala.Unit],
    errorCallback: js.Function1[/* error */ Error, scala.Unit]
  ): scala.Unit = js.native
  def requestSession(
    successCallback: js.Function1[/* session */ Session, scala.Unit],
    errorCallback: js.Function1[/* error */ Error, scala.Unit],
    sessionRequest: SessionRequest
  ): scala.Unit = js.native
  def requestSession(
    successCallback: js.Function1[/* session */ Session, scala.Unit],
    errorCallback: js.Function1[/* error */ Error, scala.Unit],
    sessionRequest: SessionRequest,
    label: java.lang.String
  ): scala.Unit = js.native
  def requestSessionById(sessionId: java.lang.String): scala.Unit = js.native
  def setCustomReceivers(
    receivers: js.Array[Receiver],
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, scala.Unit]
  ): scala.Unit = js.native
  def setReceiverDisplayStatus(
    receiver: Receiver,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, scala.Unit]
  ): scala.Unit = js.native
  def unescape(escaped: java.lang.String): java.lang.String = js.native
}

