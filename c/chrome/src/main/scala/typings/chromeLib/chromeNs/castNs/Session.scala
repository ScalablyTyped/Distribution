package typings
package chromeLib.chromeNs.castNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.cast.Session")
@js.native
class Session protected () extends js.Object {
  /**
           * @param {string} sessionId
           * @param {string} appId
           * @param {string} displayName
           * @param {!Array<chrome.cast.Image>} appImages
           * @param {!chrome.cast.Receiver} receiver
           * @constructor
           * @see https://developers.google.com/cast/docs/reference/chrome/chrome.cast.Session
           */
  def this(sessionId: java.lang.String, appId: java.lang.String, displayName: java.lang.String, appImages: js.Array[Image], receiver: Receiver) = this()
  var appId: java.lang.String = js.native
  var appImages: js.Array[Image] = js.native
  var displayName: java.lang.String = js.native
  var media: js.Array[chromeLib.chromeNs.castNs.mediaNs.Media] = js.native
  var namespaces: js.Array[chromeLib.Anon_Name] = js.native
  var receiver: Receiver = js.native
  var senderApps: js.Array[SenderApplication] = js.native
  var sessionId: java.lang.String = js.native
  var status: SessionStatus = js.native
  /**
           * @param {function(!chrome.cast.media.Media)} listener
           */
  def addMediaListener(listener: js.Function1[/* media */ chromeLib.chromeNs.castNs.mediaNs.Media, scala.Unit]): scala.Unit = js.native
  /**
           * @param {string} namespace
           * @param {function(string,string)} listener
           */
  def addMessageListener(
    namespace: java.lang.String,
    listener: js.Function2[/* namespace */ java.lang.String, /* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
           * @param {function(boolean)} listener
           */
  def addUpdateListener(listener: js.Function1[/* isAlive */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  /**
           * @param {function()} successCallback
           * @param {function(chrome.cast.Error)} errorCallback
           */
  def leave(successCallback: js.Function, errorCallback: js.Function1[/* error */ Error, scala.Unit]): scala.Unit = js.native
  /**
           * @param {!chrome.cast.media.LoadRequest} loadRequest
           * @param {function(!chrome.cast.media.Media)} successCallback
           * @param {function(!chrome.cast.Error)} errorCallback
           */
  def loadMedia(
    loadRequest: chromeLib.chromeNs.castNs.mediaNs.LoadRequest,
    successCallback: js.Function1[/* media */ chromeLib.chromeNs.castNs.mediaNs.Media, scala.Unit],
    errorCallback: js.Function1[/* error */ Error, scala.Unit]
  ): scala.Unit = js.native
  /**
           * @param {!chrome.cast.media.QueueLoadRequest} queueLoadRequest
           * @param {function(!chrome.cast.media.Media)} successCallback
           * @param {function(!chrome.cast.Error)} errorCallback
           */
  def queueLoad(
    queueLoadRequest: chromeLib.chromeNs.castNs.mediaNs.QueueLoadRequest,
    successCallback: js.Function1[/* media */ chromeLib.chromeNs.castNs.mediaNs.Media, scala.Unit],
    errorCallback: js.Function1[/* error */ Error, scala.Unit]
  ): scala.Unit = js.native
  /**
           * @param {function(!chrome.cast.media.Media)} listener
           */
  def removeMediaListener(listener: js.Function1[/* media */ chromeLib.chromeNs.castNs.mediaNs.Media, scala.Unit]): scala.Unit = js.native
  /**
           * @param {string} namespace
           * @param {function(string,string)} listener
           */
  def removeMessageListener(
    namespace: java.lang.String,
    listener: js.Function2[/* namespace */ java.lang.String, /* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
           * @param {function(boolean)} listener
           */
  def removeUpdateListener(listener: js.Function1[/* isAlive */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  /**
           * @param {string} namespace
           * @param {!Object|string} message
           * @param {!function()} successCallback
           * @param {function(!chrome.cast.Error)} errorCallback
           */
  def sendMessage(
    namespace: java.lang.String,
    message: java.lang.String,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, scala.Unit]
  ): scala.Unit = js.native
  /**
           * @param {boolean} muted
           * @param {function()} successCallback
           * @param {function(chrome.cast.Error)} errorCallback
           */
  def setReceiverMuted(
    muted: scala.Boolean,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, scala.Unit]
  ): scala.Unit = js.native
  /**
           * @param {number} newLevel
           * @param {function()} successCallback
           * @param {function(chrome.cast.Error)} errorCallback
           */
  def setReceiverVolumeLevel(
    newLevel: scala.Double,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, scala.Unit]
  ): scala.Unit = js.native
  /**
           * @param {function()} successCallback
           * @param {function(chrome.cast.Error)} errorCallback
           */
  def stop(successCallback: js.Function, errorCallback: js.Function1[/* error */ Error, scala.Unit]): scala.Unit = js.native
}

