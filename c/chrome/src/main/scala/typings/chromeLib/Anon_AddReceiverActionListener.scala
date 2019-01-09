package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddReceiverActionListener extends js.Object {
  var ApiConfig: org.scalablytyped.runtime.Instantiable5[
    /* sessionRequest */ chromeLib.chromeNs.castNs.SessionRequest, 
    /* sessionListener */ js.Function1[/* session */ chromeLib.chromeNs.castNs.Session, scala.Unit], 
    /* receiverListener */ js.Function1[
      /* receiverAvailability */ chromeLib.chromeNs.castNs.ReceiverAvailability, 
      scala.Unit
    ], 
    /* autoJoinPolicy */ js.UndefOr[/* autoJoinPolicy */ chromeLib.chromeNs.castNs.AutoJoinPolicy], 
    /* defaultActionPolicy */ js.UndefOr[/* defaultActionPolicy */ chromeLib.chromeNs.castNs.DefaultActionPolicy], 
    chromeLib.chromeNs.castNs.ApiConfig
  ] = js.native
  var Error: org.scalablytyped.runtime.Instantiable3[
    /* code */ chromeLib.chromeNs.castNs.ErrorCode, 
    /* description */ js.UndefOr[/* description */ java.lang.String], 
    /* details */ js.UndefOr[/* details */ js.Object], 
    chromeLib.chromeNs.castNs.Error
  ] = js.native
  var Image: org.scalablytyped.runtime.Instantiable1[/* url */ java.lang.String, chromeLib.chromeNs.castNs.Image] = js.native
  var Receiver: org.scalablytyped.runtime.Instantiable4[
    /* label */ java.lang.String, 
    /* friendlyName */ java.lang.String, 
    /* capabilities */ js.UndefOr[/* capabilities */ js.Array[chromeLib.chromeNs.castNs.Capability]], 
    /* volume */ js.UndefOr[/* volume */ chromeLib.chromeNs.castNs.Volume], 
    chromeLib.chromeNs.castNs.Receiver
  ] = js.native
  var ReceiverDisplayStatus: org.scalablytyped.runtime.Instantiable2[
    /* statusText */ java.lang.String, 
    /* appImages */ js.Array[chromeLib.chromeNs.castNs.Image], 
    chromeLib.chromeNs.castNs.ReceiverDisplayStatus
  ] = js.native
  var SenderApplication: org.scalablytyped.runtime.Instantiable1[
    /* platform */ chromeLib.chromeNs.castNs.SenderPlatform, 
    chromeLib.chromeNs.castNs.SenderApplication
  ] = js.native
  var Session: org.scalablytyped.runtime.Instantiable5[
    /* sessionId */ java.lang.String, 
    /* appId */ java.lang.String, 
    /* displayName */ java.lang.String, 
    /* appImages */ js.Array[chromeLib.chromeNs.castNs.Image], 
    /* receiver */ chromeLib.chromeNs.castNs.Receiver, 
    chromeLib.chromeNs.castNs.Session
  ] = js.native
  var SessionRequest: org.scalablytyped.runtime.Instantiable3[
    /* appId */ java.lang.String, 
    /* capabilities */ js.UndefOr[/* capabilities */ js.Array[chromeLib.chromeNs.castNs.Capability]], 
    /* timeout */ js.UndefOr[/* timeout */ scala.Double], 
    chromeLib.chromeNs.castNs.SessionRequest
  ] = js.native
  var VERSION: js.Array[scala.Double] = js.native
  var Volume: org.scalablytyped.runtime.Instantiable2[
    /* level */ js.UndefOr[/* level */ scala.Double], 
    /* muted */ js.UndefOr[/* muted */ scala.Boolean], 
    chromeLib.chromeNs.castNs.Volume
  ] = js.native
  var isAvailable: scala.Boolean = js.native
  val mediaNs: Anon_ActiveTrackIds = js.native
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

