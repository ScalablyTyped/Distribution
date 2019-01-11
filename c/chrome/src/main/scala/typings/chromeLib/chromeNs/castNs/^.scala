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
  def addReceiverActionListener(
    listener: js.Function2[
      /* receiver */ chromeLib.chromeNs.castNs.Receiver, 
      /* receiverAction */ chromeLib.chromeNs.castNs.ReceiverAction, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def initialize(
    apiConfig: chromeLib.chromeNs.castNs.ApiConfig,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ chromeLib.chromeNs.castNs.Error, scala.Unit]
  ): scala.Unit = js.native
  def logMessage(message: java.lang.String): scala.Unit = js.native
  def removeReceiverActionListener(
    listener: js.Function2[
      /* receiver */ chromeLib.chromeNs.castNs.Receiver, 
      /* receiverAction */ chromeLib.chromeNs.castNs.ReceiverAction, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def requestSession(
    successCallback: js.Function1[/* session */ chromeLib.chromeNs.castNs.Session, scala.Unit],
    errorCallback: js.Function1[/* error */ chromeLib.chromeNs.castNs.Error, scala.Unit]
  ): scala.Unit = js.native
  def requestSession(
    successCallback: js.Function1[/* session */ chromeLib.chromeNs.castNs.Session, scala.Unit],
    errorCallback: js.Function1[/* error */ chromeLib.chromeNs.castNs.Error, scala.Unit],
    sessionRequest: chromeLib.chromeNs.castNs.SessionRequest
  ): scala.Unit = js.native
  def requestSession(
    successCallback: js.Function1[/* session */ chromeLib.chromeNs.castNs.Session, scala.Unit],
    errorCallback: js.Function1[/* error */ chromeLib.chromeNs.castNs.Error, scala.Unit],
    sessionRequest: chromeLib.chromeNs.castNs.SessionRequest,
    label: java.lang.String
  ): scala.Unit = js.native
  def requestSessionById(sessionId: java.lang.String): scala.Unit = js.native
  def setCustomReceivers(
    receivers: js.Array[chromeLib.chromeNs.castNs.Receiver],
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ chromeLib.chromeNs.castNs.Error, scala.Unit]
  ): scala.Unit = js.native
  def setReceiverDisplayStatus(
    receiver: chromeLib.chromeNs.castNs.Receiver,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ chromeLib.chromeNs.castNs.Error, scala.Unit]
  ): scala.Unit = js.native
  def unescape(escaped: java.lang.String): java.lang.String = js.native
}

