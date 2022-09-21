package typings.chrome.chrome.cast

import typings.chrome.anon.Name
import typings.chrome.chrome.cast.media.LoadRequest
import typings.chrome.chrome.cast.media.Media
import typings.chrome.chrome.cast.media.QueueLoadRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session extends StObject {
  
  /**
    * @param listener
    */
  def addMediaListener(listener: js.Function1[/* media */ Media, Unit]): Unit = js.native
  
  /**
    * @param namespace
    * @param listener
    */
  def addMessageListener(namespace: String, listener: js.Function2[/* namespace */ String, /* message */ String, Unit]): Unit = js.native
  
  /**
    * @param listener
    */
  def addUpdateListener(listener: js.Function1[/* isAlive */ Boolean, Unit]): Unit = js.native
  
  var appId: String = js.native
  
  var appImages: js.Array[Image] = js.native
  
  var displayName: String = js.native
  
  /**
    * @param successCallback
    * @param errorCallback
    */
  def leave(successCallback: js.Function, errorCallback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  
  /**
    * @param loadRequest
    * @param successCallback
    * @param errorCallback
    */
  def loadMedia(
    loadRequest: LoadRequest,
    successCallback: js.Function1[/* media */ Media, Unit],
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  
  var media: js.Array[Media] = js.native
  
  var namespaces: js.Array[Name] = js.native
  
  /**
    * @param queueLoadRequest
    * @param successCallback
    * @param errorCallback
    */
  def queueLoad(
    queueLoadRequest: QueueLoadRequest,
    successCallback: js.Function1[/* media */ Media, Unit],
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  
  var receiver: Receiver = js.native
  
  /**
    * @param listener
    */
  def removeMediaListener(listener: js.Function1[/* media */ Media, Unit]): Unit = js.native
  
  /**
    * @param namespace
    * @param listener
    */
  def removeMessageListener(namespace: String, listener: js.Function2[/* namespace */ String, /* message */ String, Unit]): Unit = js.native
  
  /**
    * @param listener
    */
  def removeUpdateListener(listener: js.Function1[/* isAlive */ Boolean, Unit]): Unit = js.native
  
  /**
    * @param namespace
    * @param message
    * @param successCallback
    * @param errorCallback
    */
  def sendMessage(
    namespace: String,
    message: String,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  def sendMessage(
    namespace: String,
    message: js.Object,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  
  var senderApps: js.Array[SenderApplication] = js.native
  
  var sessionId: String = js.native
  
  /**
    * @param muted
    * @param successCallback
    * @param errorCallback
    */
  def setReceiverMuted(muted: Boolean, successCallback: js.Function, errorCallback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  
  /**
    * @param newLevel
    * @param successCallback
    * @param errorCallback
    */
  def setReceiverVolumeLevel(
    newLevel: Double,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  
  var status: SessionStatus = js.native
  
  var statusText: String | Null = js.native
  
  /**
    * @param successCallback
    * @param errorCallback
    */
  def stop(successCallback: js.Function, errorCallback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  
  var transportId: String = js.native
}
