package typings.chromecastDashCafDashSender.cast.framework

import typings.chromecastDashCafDashSender.cast.framework.SessionEventType.ACTIVE_INPUT_STATE_CHANGED
import typings.chromecastDashCafDashSender.cast.framework.SessionEventType.APPLICATION_METADATA_CHANGED
import typings.chromecastDashCafDashSender.cast.framework.SessionEventType.APPLICATION_STATUS_CHANGED
import typings.chromecastDashCafDashSender.cast.framework.SessionEventType.MEDIA_SESSION
import typings.chromecastDashCafDashSender.cast.framework.SessionEventType.VOLUME_CHANGED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("cast.framework.CastSession")
@js.native
class CastSession protected () extends js.Object {
  def this(
    sessionObj: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify chrome.cast.Session */ js.Any,
    state: SessionState
  ) = this()
  def addEventListener(
    `type`: ACTIVE_INPUT_STATE_CHANGED,
    handler: js.Function1[/* event */ ActiveInputStateEventData, Unit]
  ): Unit = js.native
  def addEventListener(
    `type`: APPLICATION_METADATA_CHANGED,
    handler: js.Function1[/* event */ ApplicationMetadataEventData, Unit]
  ): Unit = js.native
  def addEventListener(
    `type`: APPLICATION_STATUS_CHANGED,
    handler: js.Function1[/* event */ ApplicationStatusEventData, Unit]
  ): Unit = js.native
  def addEventListener(`type`: MEDIA_SESSION, handler: js.Function1[/* event */ MediaSessionEventData, Unit]): Unit = js.native
  def addEventListener(`type`: VOLUME_CHANGED, handler: js.Function1[/* event */ VolumeEventData, Unit]): Unit = js.native
  def addMessageListener(namespace: String, listener: js.Function2[/* namespace */ String, /* message */ String, Unit]): Unit = js.native
  def endSession(stopCasting: Boolean): Unit = js.native
  def getActiveInputState(): ActiveInputState = js.native
  def getApplicationMetadata(): ApplicationMetadata = js.native
  def getApplicationStatus(): String = js.native
  def getCastDevice(): js.Any = js.native
  def getMediaSession(): (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify chrome.cast.media.Media */ js.Any) | Null = js.native
  def getSessionId(): String = js.native
  def getSessionObj(): js.Any = js.native
  def getSessionState(): SessionState = js.native
  def getVolume(): Double = js.native
  def isMute(): Boolean = js.native
  def loadMedia(
    request: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify chrome.cast.media.LoadRequest */ js.Any
  ): js.Promise[
    js.UndefOr[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify chrome.cast.ErrorCode */ _
    ]
  ] = js.native
  def removeEventListener(
    `type`: ACTIVE_INPUT_STATE_CHANGED,
    handler: js.Function1[/* event */ ActiveInputStateEventData, Unit]
  ): Unit = js.native
  def removeEventListener(
    `type`: APPLICATION_METADATA_CHANGED,
    handler: js.Function1[/* event */ ApplicationMetadataEventData, Unit]
  ): Unit = js.native
  def removeEventListener(
    `type`: APPLICATION_STATUS_CHANGED,
    handler: js.Function1[/* event */ ApplicationStatusEventData, Unit]
  ): Unit = js.native
  def removeEventListener(`type`: MEDIA_SESSION, handler: js.Function1[/* event */ MediaSessionEventData, Unit]): Unit = js.native
  def removeEventListener(`type`: VOLUME_CHANGED, handler: js.Function1[/* event */ VolumeEventData, Unit]): Unit = js.native
  def removeMessageListener(namespace: String, listener: js.Function2[/* namespace */ String, /* message */ String, Unit]): Unit = js.native
  def sendMessage(namespace: String, data: js.Any): js.Promise[
    js.UndefOr[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify chrome.cast.ErrorCode */ _
    ]
  ] = js.native
  def setMute(mute: Boolean): js.Promise[
    js.UndefOr[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify chrome.cast.ErrorCode */ _
    ]
  ] = js.native
  def setVolume(volume: Double): js.Promise[
    js.UndefOr[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify chrome.cast.ErrorCode */ _
    ]
  ] = js.native
}

