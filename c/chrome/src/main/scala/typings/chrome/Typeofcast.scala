package typings.chrome

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import typings.chrome.chromeNs.castNs.ApiConfig
import typings.chrome.chromeNs.castNs.AutoJoinPolicy
import typings.chrome.chromeNs.castNs.Capability
import typings.chrome.chromeNs.castNs.DefaultActionPolicy
import typings.chrome.chromeNs.castNs.Error
import typings.chrome.chromeNs.castNs.ErrorCode
import typings.chrome.chromeNs.castNs.Image
import typings.chrome.chromeNs.castNs.Receiver
import typings.chrome.chromeNs.castNs.ReceiverAction
import typings.chrome.chromeNs.castNs.ReceiverAvailability
import typings.chrome.chromeNs.castNs.SenderPlatform
import typings.chrome.chromeNs.castNs.Session
import typings.chrome.chromeNs.castNs.SessionRequest
import typings.chrome.chromeNs.castNs.Volume
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofcast extends js.Object {
  var ApiConfig: Instantiable5[
    /* sessionRequest */ SessionRequest, 
    /* sessionListener */ js.Function1[/* session */ Session, Unit], 
    /* receiverListener */ js.Function1[/* receiverAvailability */ ReceiverAvailability, Unit], 
    js.UndefOr[/* autoJoinPolicy */ AutoJoinPolicy], 
    js.UndefOr[/* defaultActionPolicy */ DefaultActionPolicy], 
    typings.chrome.chromeNs.castNs.ApiConfig
  ] = js.native
  var Error: Instantiable3[
    /* code */ ErrorCode, 
    js.UndefOr[/* description */ String], 
    js.UndefOr[/* details */ js.Object], 
    typings.chrome.chromeNs.castNs.Error
  ] = js.native
  var Image: Instantiable1[/* url */ String, typings.chrome.chromeNs.castNs.Image] = js.native
  var Receiver: Instantiable4[
    /* label */ String, 
    /* friendlyName */ String, 
    js.UndefOr[/* capabilities */ js.Array[Capability]], 
    js.UndefOr[/* volume */ Volume], 
    typings.chrome.chromeNs.castNs.Receiver
  ] = js.native
  var ReceiverDisplayStatus: Instantiable2[
    /* statusText */ String, 
    /* appImages */ js.Array[Image], 
    typings.chrome.chromeNs.castNs.ReceiverDisplayStatus
  ] = js.native
  var SenderApplication: Instantiable1[/* platform */ SenderPlatform, typings.chrome.chromeNs.castNs.SenderApplication] = js.native
  var Session: Instantiable5[
    /* sessionId */ String, 
    /* appId */ String, 
    /* displayName */ String, 
    /* appImages */ js.Array[Image], 
    /* receiver */ Receiver, 
    typings.chrome.chromeNs.castNs.Session
  ] = js.native
  var SessionRequest: Instantiable3[
    /* appId */ String, 
    js.UndefOr[/* capabilities */ js.Array[Capability]], 
    js.UndefOr[/* timeout */ Double], 
    typings.chrome.chromeNs.castNs.SessionRequest
  ] = js.native
  var VERSION: js.Array[Double] = js.native
  var Volume: Instantiable2[
    js.UndefOr[/* level */ Double], 
    js.UndefOr[/* muted */ Boolean], 
    typings.chrome.chromeNs.castNs.Volume
  ] = js.native
  var isAvailable: Boolean = js.native
  val mediaNs: Typeofmedia = js.native
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

