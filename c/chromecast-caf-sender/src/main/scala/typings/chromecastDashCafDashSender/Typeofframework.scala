package typings.chromecastDashCafDashSender

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.chrome.chromeNs.castNs.ErrorCode
import typings.chrome.chromeNs.castNs.Session
import typings.chrome.chromeNs.castNs.mediaNs.Media
import typings.chromecastDashCafDashSender.castNs.frameworkNs.ActiveInputState
import typings.chromecastDashCafDashSender.castNs.frameworkNs.ActiveInputStateEventData
import typings.chromecastDashCafDashSender.castNs.frameworkNs.ApplicationMetadata
import typings.chromecastDashCafDashSender.castNs.frameworkNs.ApplicationMetadataEventData
import typings.chromecastDashCafDashSender.castNs.frameworkNs.ApplicationStatusEventData
import typings.chromecastDashCafDashSender.castNs.frameworkNs.CastSession
import typings.chromecastDashCafDashSender.castNs.frameworkNs.CastState
import typings.chromecastDashCafDashSender.castNs.frameworkNs.CastStateEventData
import typings.chromecastDashCafDashSender.castNs.frameworkNs.EventData
import typings.chromecastDashCafDashSender.castNs.frameworkNs.LoggerLevel
import typings.chromecastDashCafDashSender.castNs.frameworkNs.MediaSessionEventData
import typings.chromecastDashCafDashSender.castNs.frameworkNs.RemotePlayer
import typings.chromecastDashCafDashSender.castNs.frameworkNs.RemotePlayerChangedEvent
import typings.chromecastDashCafDashSender.castNs.frameworkNs.RemotePlayerController
import typings.chromecastDashCafDashSender.castNs.frameworkNs.RemotePlayerEventType
import typings.chromecastDashCafDashSender.castNs.frameworkNs.SessionState
import typings.chromecastDashCafDashSender.castNs.frameworkNs.SessionStateEventData
import typings.chromecastDashCafDashSender.castNs.frameworkNs.VolumeEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofframework extends js.Object {
  var ActiveInputStateEventData: Instantiable1[
    /* activeInputState */ ActiveInputState, 
    typings.chromecastDashCafDashSender.castNs.frameworkNs.ActiveInputStateEventData
  ]
  var ApplicationMetadata: Instantiable1[
    /* sessionObj */ Session, 
    typings.chromecastDashCafDashSender.castNs.frameworkNs.ApplicationMetadata
  ]
  var ApplicationMetadataEventData: Instantiable1[
    /* metadata */ ApplicationMetadata, 
    typings.chromecastDashCafDashSender.castNs.frameworkNs.ApplicationMetadataEventData
  ]
  var ApplicationStatusEventData: Instantiable1[
    /* status */ String, 
    typings.chromecastDashCafDashSender.castNs.frameworkNs.ApplicationStatusEventData
  ]
  var CastContext: TypeofClassCastContext
  var CastSession: Instantiable2[
    /* sessionObj */ Session, 
    /* state */ SessionState, 
    typings.chromecastDashCafDashSender.castNs.frameworkNs.CastSession
  ]
  var CastStateEventData: Instantiable1[
    /* castState */ CastState, 
    typings.chromecastDashCafDashSender.castNs.frameworkNs.CastStateEventData
  ]
  var EventData: Instantiable1[
    /* type */ String, 
    typings.chromecastDashCafDashSender.castNs.frameworkNs.EventData
  ]
  var MediaSessionEventData: Instantiable1[
    /* mediaSession */ Media, 
    typings.chromecastDashCafDashSender.castNs.frameworkNs.MediaSessionEventData
  ]
  var RemotePlayer: Instantiable0[typings.chromecastDashCafDashSender.castNs.frameworkNs.RemotePlayer]
  var RemotePlayerChangedEvent: Instantiable3[
    /* type */ RemotePlayerEventType, 
    /* field */ String, 
    /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ /* value */ js.Any, 
    typings.chromecastDashCafDashSender.castNs.frameworkNs.RemotePlayerChangedEvent[js.Object]
  ]
  var RemotePlayerController: Instantiable1[
    /* player */ RemotePlayer, 
    typings.chromecastDashCafDashSender.castNs.frameworkNs.RemotePlayerController
  ]
  var SessionStateEventData: Instantiable3[
    /* session */ CastSession, 
    /* sessionState */ SessionState, 
    /* opt_errorCode */ ErrorCode, 
    typings.chromecastDashCafDashSender.castNs.frameworkNs.SessionStateEventData
  ]
  val VERSION: String
  var VolumeEventData: Instantiable2[
    /* volume */ Double, 
    /* isMute */ Boolean, 
    typings.chromecastDashCafDashSender.castNs.frameworkNs.VolumeEventData
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
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ /* value */ js.Any, 
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
    val __obj = js.Dynamic.literal(ActiveInputStateEventData = ActiveInputStateEventData, ApplicationMetadata = ApplicationMetadata, ApplicationMetadataEventData = ApplicationMetadataEventData, ApplicationStatusEventData = ApplicationStatusEventData, CastContext = CastContext, CastSession = CastSession, CastStateEventData = CastStateEventData, EventData = EventData, MediaSessionEventData = MediaSessionEventData, RemotePlayer = RemotePlayer, RemotePlayerChangedEvent = RemotePlayerChangedEvent, RemotePlayerController = RemotePlayerController, SessionStateEventData = SessionStateEventData, VERSION = VERSION, VolumeEventData = VolumeEventData, setLoggerLevel = js.Any.fromFunction1(setLoggerLevel))
  
    __obj.asInstanceOf[Typeofframework]
  }
}

