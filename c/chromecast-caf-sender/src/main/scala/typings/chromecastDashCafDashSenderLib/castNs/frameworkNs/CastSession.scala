package typings
package chromecastDashCafDashSenderLib.castNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("cast.framework.CastSession")
@js.native
class CastSession protected () extends js.Object {
  def this(sessionObj: chromeLib.chromeNs.castNs.Session, state: SessionState) = this()
  def addEventListener(
    `type`: SessionEventType,
    handler: js.Function1[
      (/* event */ ActiveInputStateEventData) | (/* event */ ApplicationMetadataEventData) | (/* event */ ApplicationStatusEventData) | (/* event */ MediaSessionEventData) | (/* event */ VolumeEventData), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def addMessageListener(
    namespace: java.lang.String,
    listener: js.Function2[/* namespace */ java.lang.String, /* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def endSession(stopCasting: scala.Boolean): scala.Unit = js.native
  def getActiveInputState(): ActiveInputState = js.native
  def getApplicationMetadata(): ApplicationMetadata = js.native
  def getApplicationStatus(): java.lang.String = js.native
  def getCastDevice(): chromeLib.chromeNs.castNs.Receiver = js.native
  def getMediaSession(): chromeLib.chromeNs.castNs.mediaNs.Media | scala.Null = js.native
  def getSessionId(): java.lang.String = js.native
  def getSessionObj(): chromeLib.chromeNs.castNs.Session = js.native
  def getSessionState(): SessionState = js.native
  def getVolume(): scala.Double = js.native
  def isMute(): scala.Boolean = js.native
  def loadMedia(request: chromeLib.chromeNs.castNs.mediaNs.LoadRequest): js.Promise[js.UndefOr[chromeLib.chromeNs.castNs.ErrorCode]] = js.native
  def removeEventListener(
    `type`: SessionEventType,
    handler: js.Function1[
      (/* event */ ActiveInputStateEventData) | (/* event */ ApplicationMetadataEventData) | (/* event */ ApplicationStatusEventData) | (/* event */ MediaSessionEventData) | (/* event */ VolumeEventData), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def removeMessageListener(
    namespace: java.lang.String,
    listener: js.Function2[/* namespace */ java.lang.String, /* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def sendMessage(namespace: java.lang.String, data: js.Any): js.Promise[js.UndefOr[chromeLib.chromeNs.castNs.ErrorCode]] = js.native
  def setMute(mute: scala.Boolean): js.Promise[js.UndefOr[chromeLib.chromeNs.castNs.ErrorCode]] = js.native
  def setVolume(volume: scala.Double): js.Promise[js.UndefOr[chromeLib.chromeNs.castNs.ErrorCode]] = js.native
}

