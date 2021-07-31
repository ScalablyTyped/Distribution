package typings.chrome.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import typings.chrome.chrome.cast.ApiConfig
import typings.chrome.chrome.cast.AutoJoinPolicy
import typings.chrome.chrome.cast.Capability
import typings.chrome.chrome.cast.DefaultActionPolicy
import typings.chrome.chrome.cast.Error
import typings.chrome.chrome.cast.ErrorCode
import typings.chrome.chrome.cast.Image
import typings.chrome.chrome.cast.Receiver
import typings.chrome.chrome.cast.ReceiverAction
import typings.chrome.chrome.cast.ReceiverAvailability
import typings.chrome.chrome.cast.SenderPlatform
import typings.chrome.chrome.cast.Session
import typings.chrome.chrome.cast.SessionRequest
import typings.chrome.chrome.cast.Volume
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofcast extends StObject {
  
  var ApiConfig: Instantiable5[
    /* sessionRequest */ SessionRequest, 
    /* sessionListener */ js.Function1[/* session */ Session, Unit], 
    /* receiverListener */ js.Function1[/* receiverAvailability */ ReceiverAvailability, Unit], 
    /* autoJoinPolicy */ js.UndefOr[AutoJoinPolicy], 
    /* defaultActionPolicy */ js.UndefOr[DefaultActionPolicy], 
    typings.chrome.chrome.cast.ApiConfig
  ] = js.native
  
  var Error: Instantiable3[
    /* code */ ErrorCode, 
    /* description */ js.UndefOr[String], 
    /* details */ js.UndefOr[js.Object], 
    typings.chrome.chrome.cast.Error
  ] = js.native
  
  var Image: Instantiable1[/* url */ String, typings.chrome.chrome.cast.Image] = js.native
  
  var Receiver: Instantiable4[
    /* label */ String, 
    /* friendlyName */ String, 
    /* capabilities */ js.UndefOr[js.Array[Capability]], 
    /* volume */ js.UndefOr[Volume], 
    typings.chrome.chrome.cast.Receiver
  ] = js.native
  
  var ReceiverDisplayStatus: Instantiable2[
    /* statusText */ String, 
    /* appImages */ js.Array[Image], 
    typings.chrome.chrome.cast.ReceiverDisplayStatus
  ] = js.native
  
  var SenderApplication: Instantiable1[/* platform */ SenderPlatform, typings.chrome.chrome.cast.SenderApplication] = js.native
  
  var Session: Instantiable5[
    /* sessionId */ String, 
    /* appId */ String, 
    /* displayName */ String, 
    /* appImages */ js.Array[Image], 
    /* receiver */ Receiver, 
    typings.chrome.chrome.cast.Session
  ] = js.native
  
  var SessionRequest: Instantiable3[
    /* appId */ String, 
    /* capabilities */ js.UndefOr[js.Array[Capability]], 
    /* timeout */ js.UndefOr[Double], 
    typings.chrome.chrome.cast.SessionRequest
  ] = js.native
  
  var VERSION: js.Array[Double] = js.native
  
  var Volume: Instantiable2[
    /* level */ js.UndefOr[Double], 
    /* muted */ js.UndefOr[Boolean], 
    typings.chrome.chrome.cast.Volume
  ] = js.native
  
  def addReceiverActionListener(listener: js.Function2[/* receiver */ Receiver, /* receiverAction */ ReceiverAction, Unit]): Unit = js.native
  
  def initialize(
    apiConfig: ApiConfig,
    successCallback: js.Function,
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  
  var isAvailable: Boolean = js.native
  
  def logMessage(message: String): Unit = js.native
  
  val media: Typeofmedia = js.native
  
  def removeReceiverActionListener(listener: js.Function2[/* receiver */ Receiver, /* receiverAction */ ReceiverAction, Unit]): Unit = js.native
  
  def requestSession(
    successCallback: js.Function1[/* session */ Session, Unit],
    errorCallback: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
  def requestSession(
    successCallback: js.Function1[/* session */ Session, Unit],
    errorCallback: js.Function1[/* error */ Error, Unit],
    sessionRequest: Unit,
    label: String
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
