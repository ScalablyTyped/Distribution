package typings.chromecastCafSender

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.chrome.chrome.cast.ErrorCode
import typings.chrome.chrome.cast.Session
import typings.chrome.chrome.cast.media.Media
import typings.chromecastCafSender.cast.framework.ActiveInputState
import typings.chromecastCafSender.cast.framework.ActiveInputStateEventData
import typings.chromecastCafSender.cast.framework.ApplicationMetadata
import typings.chromecastCafSender.cast.framework.ApplicationMetadataEventData
import typings.chromecastCafSender.cast.framework.ApplicationStatusEventData
import typings.chromecastCafSender.cast.framework.CastSession
import typings.chromecastCafSender.cast.framework.CastState
import typings.chromecastCafSender.cast.framework.CastStateEventData
import typings.chromecastCafSender.cast.framework.EventData
import typings.chromecastCafSender.cast.framework.LoggerLevel
import typings.chromecastCafSender.cast.framework.MediaSessionEventData
import typings.chromecastCafSender.cast.framework.RemotePlayer
import typings.chromecastCafSender.cast.framework.RemotePlayerChangedEvent
import typings.chromecastCafSender.cast.framework.RemotePlayerController
import typings.chromecastCafSender.cast.framework.RemotePlayerEventType
import typings.chromecastCafSender.cast.framework.SessionState
import typings.chromecastCafSender.cast.framework.SessionStateEventData
import typings.chromecastCafSender.cast.framework.VolumeEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofframework extends js.Object {
  var ActiveInputStateEventData: Instantiable1[
    /* activeInputState */ ActiveInputState, 
    typings.chromecastCafSender.cast.framework.ActiveInputStateEventData
  ]
  var ApplicationMetadata: Instantiable1[
    /* sessionObj */ Session, 
    typings.chromecastCafSender.cast.framework.ApplicationMetadata
  ]
  var ApplicationMetadataEventData: Instantiable1[
    /* metadata */ ApplicationMetadata, 
    typings.chromecastCafSender.cast.framework.ApplicationMetadataEventData
  ]
  var ApplicationStatusEventData: Instantiable1[
    /* status */ String, 
    typings.chromecastCafSender.cast.framework.ApplicationStatusEventData
  ]
  var CastContext: TypeofCastContext
  var CastSession: Instantiable2[
    /* sessionObj */ Session, 
    /* state */ SessionState, 
    typings.chromecastCafSender.cast.framework.CastSession
  ]
  var CastStateEventData: Instantiable1[
    /* castState */ CastState, 
    typings.chromecastCafSender.cast.framework.CastStateEventData
  ]
  var EventData: Instantiable1[/* type */ String, typings.chromecastCafSender.cast.framework.EventData]
  var MediaSessionEventData: Instantiable1[
    /* mediaSession */ Media, 
    typings.chromecastCafSender.cast.framework.MediaSessionEventData
  ]
  var RemotePlayer: Instantiable0[typings.chromecastCafSender.cast.framework.RemotePlayer]
  var RemotePlayerChangedEvent: Instantiable3[
    /* type */ RemotePlayerEventType, 
    /* field */ String, 
    /* import warning: RewrittenClass.unapply cls was tparam T */ /* value */ js.Any, 
    typings.chromecastCafSender.cast.framework.RemotePlayerChangedEvent[js.Object]
  ]
  var RemotePlayerController: Instantiable1[
    /* player */ RemotePlayer, 
    typings.chromecastCafSender.cast.framework.RemotePlayerController
  ]
  var SessionStateEventData: Instantiable3[
    /* session */ CastSession, 
    /* sessionState */ SessionState, 
    /* opt_errorCode */ ErrorCode, 
    typings.chromecastCafSender.cast.framework.SessionStateEventData
  ]
  val VERSION: String
  var VolumeEventData: Instantiable2[
    /* volume */ Double, 
    /* isMute */ Boolean, 
    typings.chromecastCafSender.cast.framework.VolumeEventData
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
    CastContext: TypeofCastContext,
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

