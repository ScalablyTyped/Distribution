package typings.chrome.global.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object cast {
  
  @scala.inline
  def VERSION: js.Array[scala.Double] = typings.chrome.global.chrome.cast.^.asInstanceOf[js.Dynamic].selectDynamic("VERSION").asInstanceOf[js.Array[scala.Double]]
  @scala.inline
  def VERSION_=(x: js.Array[scala.Double]): scala.Unit = typings.chrome.global.chrome.cast.^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def addReceiverActionListener(
    listener: js.Function2[
      /* receiver */ typings.chrome.chrome.cast.Receiver, 
      /* receiverAction */ typings.chrome.chrome.cast.ReceiverAction, 
      scala.Unit
    ]
  ): scala.Unit = typings.chrome.global.chrome.cast.^.asInstanceOf[js.Dynamic].applyDynamic("addReceiverActionListener")(listener.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def initialize(
    apiConfig: typings.chrome.chrome.cast.ApiConfig,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ typings.chrome.chrome.cast.Error, scala.Unit]
  ): scala.Unit = (typings.chrome.global.chrome.cast.^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(apiConfig.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def isAvailable: scala.Boolean = typings.chrome.global.chrome.cast.^.asInstanceOf[js.Dynamic].selectDynamic("isAvailable").asInstanceOf[scala.Boolean]
  @scala.inline
  def isAvailable_=(x: scala.Boolean): scala.Unit = typings.chrome.global.chrome.cast.^.asInstanceOf[js.Dynamic].updateDynamic("isAvailable")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def logMessage(message: java.lang.String): scala.Unit = typings.chrome.global.chrome.cast.^.asInstanceOf[js.Dynamic].applyDynamic("logMessage")(message.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def removeReceiverActionListener(
    listener: js.Function2[
      /* receiver */ typings.chrome.chrome.cast.Receiver, 
      /* receiverAction */ typings.chrome.chrome.cast.ReceiverAction, 
      scala.Unit
    ]
  ): scala.Unit = typings.chrome.global.chrome.cast.^.asInstanceOf[js.Dynamic].applyDynamic("removeReceiverActionListener")(listener.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def requestSession(
    successCallback: js.Function1[/* session */ typings.chrome.chrome.cast.Session, scala.Unit],
    errorCallback: js.Function1[/* error */ typings.chrome.chrome.cast.Error, scala.Unit]
  ): scala.Unit = (typings.chrome.global.chrome.cast.^.asInstanceOf[js.Dynamic].applyDynamic("requestSession")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def requestSession(
    successCallback: js.Function1[/* session */ typings.chrome.chrome.cast.Session, scala.Unit],
    errorCallback: js.Function1[/* error */ typings.chrome.chrome.cast.Error, scala.Unit],
    sessionRequest: js.UndefOr[scala.Nothing],
    label: java.lang.String
  ): scala.Unit = (typings.chrome.global.chrome.cast.^.asInstanceOf[js.Dynamic].applyDynamic("requestSession")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], sessionRequest.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def requestSession(
    successCallback: js.Function1[/* session */ typings.chrome.chrome.cast.Session, scala.Unit],
    errorCallback: js.Function1[/* error */ typings.chrome.chrome.cast.Error, scala.Unit],
    sessionRequest: typings.chrome.chrome.cast.SessionRequest
  ): scala.Unit = (typings.chrome.global.chrome.cast.^.asInstanceOf[js.Dynamic].applyDynamic("requestSession")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], sessionRequest.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def requestSession(
    successCallback: js.Function1[/* session */ typings.chrome.chrome.cast.Session, scala.Unit],
    errorCallback: js.Function1[/* error */ typings.chrome.chrome.cast.Error, scala.Unit],
    sessionRequest: typings.chrome.chrome.cast.SessionRequest,
    label: java.lang.String
  ): scala.Unit = (typings.chrome.global.chrome.cast.^.asInstanceOf[js.Dynamic].applyDynamic("requestSession")(successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any], sessionRequest.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def requestSessionById(sessionId: java.lang.String): scala.Unit = typings.chrome.global.chrome.cast.^.asInstanceOf[js.Dynamic].applyDynamic("requestSessionById")(sessionId.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setCustomReceivers(
    receivers: js.Array[typings.chrome.chrome.cast.Receiver],
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ typings.chrome.chrome.cast.Error, scala.Unit]
  ): scala.Unit = (typings.chrome.global.chrome.cast.^.asInstanceOf[js.Dynamic].applyDynamic("setCustomReceivers")(receivers.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setReceiverDisplayStatus(
    receiver: typings.chrome.chrome.cast.Receiver,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ typings.chrome.chrome.cast.Error, scala.Unit]
  ): scala.Unit = (typings.chrome.global.chrome.cast.^.asInstanceOf[js.Dynamic].applyDynamic("setReceiverDisplayStatus")(receiver.asInstanceOf[js.Any], successCallback.asInstanceOf[js.Any], errorCallback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def unescape(escaped: java.lang.String): java.lang.String = typings.chrome.global.chrome.cast.^.asInstanceOf[js.Dynamic].applyDynamic("unescape")(escaped.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
}
