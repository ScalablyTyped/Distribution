package typings.chromecastDashCafDashSender

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.chrome.chrome.cast.ErrorCode
import typings.chrome.chrome.cast.Session
import typings.chrome.chrome.cast.media.Media
import typings.chromecastDashCafDashSender.cast.framework.ActiveInputState
import typings.chromecastDashCafDashSender.cast.framework.ActiveInputStateEventData
import typings.chromecastDashCafDashSender.cast.framework.ApplicationMetadata
import typings.chromecastDashCafDashSender.cast.framework.ApplicationMetadataEventData
import typings.chromecastDashCafDashSender.cast.framework.ApplicationStatusEventData
import typings.chromecastDashCafDashSender.cast.framework.CastSession
import typings.chromecastDashCafDashSender.cast.framework.CastState
import typings.chromecastDashCafDashSender.cast.framework.CastStateEventData
import typings.chromecastDashCafDashSender.cast.framework.EventData
import typings.chromecastDashCafDashSender.cast.framework.LoggerLevel
import typings.chromecastDashCafDashSender.cast.framework.MediaSessionEventData
import typings.chromecastDashCafDashSender.cast.framework.RemotePlayer
import typings.chromecastDashCafDashSender.cast.framework.RemotePlayerChangedEvent
import typings.chromecastDashCafDashSender.cast.framework.RemotePlayerController
import typings.chromecastDashCafDashSender.cast.framework.RemotePlayerEventType
import typings.chromecastDashCafDashSender.cast.framework.SessionState
import typings.chromecastDashCafDashSender.cast.framework.SessionStateEventData
import typings.chromecastDashCafDashSender.cast.framework.VolumeEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofframework extends js.Object {
  var ActiveInputStateEventData: Instantiable1[
    /* activeInputState */ ActiveInputState, 
    typings.chromecastDashCafDashSender.cast.framework.ActiveInputStateEventData
  ]
  var ApplicationMetadata: Instantiable1[
    /* sessionObj */ Session, 
    typings.chromecastDashCafDashSender.cast.framework.ApplicationMetadata
  ]
  var ApplicationMetadataEventData: Instantiable1[
    /* metadata */ ApplicationMetadata, 
    typings.chromecastDashCafDashSender.cast.framework.ApplicationMetadataEventData
  ]
  var ApplicationStatusEventData: Instantiable1[
    /* status */ String, 
    typings.chromecastDashCafDashSender.cast.framework.ApplicationStatusEventData
  ]
  var CastContext: TypeofClassCastContext
  var CastSession: Instantiable2[
    /* sessionObj */ Session, 
    /* state */ SessionState, 
    typings.chromecastDashCafDashSender.cast.framework.CastSession
  ]
  var CastStateEventData: Instantiable1[
    /* castState */ CastState, 
    typings.chromecastDashCafDashSender.cast.framework.CastStateEventData
  ]
  var EventData: Instantiable1[/* type */ String, typings.chromecastDashCafDashSender.cast.framework.EventData]
  var MediaSessionEventData: Instantiable1[
    /* mediaSession */ Media, 
    typings.chromecastDashCafDashSender.cast.framework.MediaSessionEventData
  ]
  var RemotePlayer: Instantiable0[typings.chromecastDashCafDashSender.cast.framework.RemotePlayer]
  var RemotePlayerChangedEvent: Instantiable3[
    /* type */ RemotePlayerEventType, 
    /* field */ String, 
    /* import warning: RewrittenClass.unapply cls was tparam T */ /* value */ js.Any, 
    typings.chromecastDashCafDashSender.cast.framework.RemotePlayerChangedEvent[js.Object]
  ]
  var RemotePlayerController: Instantiable1[
    /* player */ RemotePlayer, 
    typings.chromecastDashCafDashSender.cast.framework.RemotePlayerController
  ]
  var SessionStateEventData: Instantiable3[
    /* session */ CastSession, 
    /* sessionState */ SessionState, 
    /* opt_errorCode */ ErrorCode, 
    typings.chromecastDashCafDashSender.cast.framework.SessionStateEventData
  ]
  val VERSION: String
  var VolumeEventData: Instantiable2[
    /* volume */ Double, 
    /* isMute */ Boolean, 
    typings.chromecastDashCafDashSender.cast.framework.VolumeEventData
  ]
  def setLoggerLevel(level: LoggerLevel): Unit
}

object Typeofframework {
  @scala.inline
  def apply(
    ActiveInputStateEventData: Instantiable1[/* activeInputState */ ActiveInputState, ActiveInputStateEventData],
    ApplicationMetadata: Instantiable1[/* sessionObj */ Session, ApplicationMetadata],
    ApplicationMetadataEventData: Instantiable1[/* metadata */ ApplicationMetadata, ApplicationMetadataEventData],
    ApplicationStatusEventData: Instantiable1[/* status */ String, ApplicationStatusEventData],
    CastContext: TypeofClassCastContext,
    CastSession: Instantiable2[/* sessionObj */ Session, /* state */ SessionState, CastSession],
    CastStateEventData: Instantiable1[/* castState */ CastState, CastStateEventData],
    EventData: Instantiable1[/* type */ String, EventData],
    MediaSessionEventData: Instantiable1[/* mediaSession */ Media, MediaSessionEventData],
    RemotePlayer: Instantiable0[RemotePlayer],
    RemotePlayerChangedEvent: Instantiable3[
      /* type */ RemotePlayerEventType, 
      /* field */ String, 
      /* import warning: RewrittenClass.unapply cls was tparam T */ /* value */ js.Any, 
      RemotePlayerChangedEvent[js.Object]
    ],
    RemotePlayerController: Instantiable1[/* player */ RemotePlayer, RemotePlayerController],
    SessionStateEventData: Instantiable3[
      /* session */ CastSession, 
      /* sessionState */ SessionState, 
      /* opt_errorCode */ ErrorCode, 
      SessionStateEventData
    ],
    VERSION: String,
    VolumeEventData: Instantiable2[/* volume */ Double, /* isMute */ Boolean, VolumeEventData],
    setLoggerLevel: LoggerLevel => Unit
  ): Typeofframework = {
    val __obj = js.Dynamic.literal(ActiveInputStateEventData = ActiveInputStateEventData.asInstanceOf[js.Any], ApplicationMetadata = ApplicationMetadata.asInstanceOf[js.Any], ApplicationMetadataEventData = ApplicationMetadataEventData.asInstanceOf[js.Any], ApplicationStatusEventData = ApplicationStatusEventData.asInstanceOf[js.Any], CastContext = CastContext.asInstanceOf[js.Any], CastSession = CastSession.asInstanceOf[js.Any], CastStateEventData = CastStateEventData.asInstanceOf[js.Any], EventData = EventData.asInstanceOf[js.Any], MediaSessionEventData = MediaSessionEventData.asInstanceOf[js.Any], RemotePlayer = RemotePlayer.asInstanceOf[js.Any], RemotePlayerChangedEvent = RemotePlayerChangedEvent.asInstanceOf[js.Any], RemotePlayerController = RemotePlayerController.asInstanceOf[js.Any], SessionStateEventData = SessionStateEventData.asInstanceOf[js.Any], VERSION = VERSION.asInstanceOf[js.Any], VolumeEventData = VolumeEventData.asInstanceOf[js.Any], setLoggerLevel = js.Any.fromFunction1(setLoggerLevel))
  
    __obj.asInstanceOf[Typeofframework]
  }
}

