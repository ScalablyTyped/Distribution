package typings
package chromecastDashCafDashSenderLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveInputState extends js.Object {
  var ActiveInputStateEventData: org.scalablytyped.runtime.Instantiable1[
    /* activeInputState */ chromecastDashCafDashSenderLib.castNs.frameworkNs.ActiveInputState, 
    chromecastDashCafDashSenderLib.castNs.frameworkNs.ActiveInputStateEventData
  ]
  var ApplicationMetadata: org.scalablytyped.runtime.Instantiable1[
    /* sessionObj */ chromeLib.chromeNs.castNs.Session, 
    chromecastDashCafDashSenderLib.castNs.frameworkNs.ApplicationMetadata
  ]
  var ApplicationMetadataEventData: org.scalablytyped.runtime.Instantiable1[
    /* metadata */ chromecastDashCafDashSenderLib.castNs.frameworkNs.ApplicationMetadata, 
    chromecastDashCafDashSenderLib.castNs.frameworkNs.ApplicationMetadataEventData
  ]
  var ApplicationStatusEventData: org.scalablytyped.runtime.Instantiable1[
    /* status */ java.lang.String, 
    chromecastDashCafDashSenderLib.castNs.frameworkNs.ApplicationStatusEventData
  ]
  var CastContext: Anon_GetInstance
  var CastSession: org.scalablytyped.runtime.Instantiable2[
    /* sessionObj */ chromeLib.chromeNs.castNs.Session, 
    /* state */ chromecastDashCafDashSenderLib.castNs.frameworkNs.SessionState, 
    chromecastDashCafDashSenderLib.castNs.frameworkNs.CastSession
  ]
  var CastStateEventData: org.scalablytyped.runtime.Instantiable1[
    /* castState */ chromecastDashCafDashSenderLib.castNs.frameworkNs.CastState, 
    chromecastDashCafDashSenderLib.castNs.frameworkNs.CastStateEventData
  ]
  var EventData: org.scalablytyped.runtime.Instantiable1[
    /* type */ java.lang.String, 
    chromecastDashCafDashSenderLib.castNs.frameworkNs.EventData
  ]
  var MediaSessionEventData: org.scalablytyped.runtime.Instantiable1[
    /* mediaSession */ chromeLib.chromeNs.castNs.mediaNs.Media, 
    chromecastDashCafDashSenderLib.castNs.frameworkNs.MediaSessionEventData
  ]
  var RemotePlayer: org.scalablytyped.runtime.Instantiable0[chromecastDashCafDashSenderLib.castNs.frameworkNs.RemotePlayer]
  var RemotePlayerChangedEvent: org.scalablytyped.runtime.Instantiable3[
    /* type */ chromecastDashCafDashSenderLib.castNs.frameworkNs.RemotePlayerEventType, 
    /* field */ java.lang.String, 
    /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ /* value */ js.Any, 
    chromecastDashCafDashSenderLib.castNs.frameworkNs.RemotePlayerChangedEvent[js.Object]
  ]
  var RemotePlayerController: org.scalablytyped.runtime.Instantiable1[
    /* player */ chromecastDashCafDashSenderLib.castNs.frameworkNs.RemotePlayer, 
    chromecastDashCafDashSenderLib.castNs.frameworkNs.RemotePlayerController
  ]
  var SessionStateEventData: org.scalablytyped.runtime.Instantiable3[
    /* session */ chromecastDashCafDashSenderLib.castNs.frameworkNs.CastSession, 
    /* sessionState */ chromecastDashCafDashSenderLib.castNs.frameworkNs.SessionState, 
    /* opt_errorCode */ chromeLib.chromeNs.castNs.ErrorCode, 
    chromecastDashCafDashSenderLib.castNs.frameworkNs.SessionStateEventData
  ]
  val VERSION: java.lang.String
  var VolumeEventData: org.scalablytyped.runtime.Instantiable2[
    /* volume */ scala.Double, 
    /* isMute */ scala.Boolean, 
    chromecastDashCafDashSenderLib.castNs.frameworkNs.VolumeEventData
  ]
  def setLoggerLevel(level: chromecastDashCafDashSenderLib.castNs.frameworkNs.LoggerLevel): scala.Unit
}

object Anon_ActiveInputState {
  @scala.inline
  def apply(
    ActiveInputStateEventData: org.scalablytyped.runtime.Instantiable1[
      /* activeInputState */ chromecastDashCafDashSenderLib.castNs.frameworkNs.ActiveInputState, 
      chromecastDashCafDashSenderLib.castNs.frameworkNs.ActiveInputStateEventData
    ],
    ApplicationMetadata: org.scalablytyped.runtime.Instantiable1[
      /* sessionObj */ chromeLib.chromeNs.castNs.Session, 
      chromecastDashCafDashSenderLib.castNs.frameworkNs.ApplicationMetadata
    ],
    ApplicationMetadataEventData: org.scalablytyped.runtime.Instantiable1[
      /* metadata */ chromecastDashCafDashSenderLib.castNs.frameworkNs.ApplicationMetadata, 
      chromecastDashCafDashSenderLib.castNs.frameworkNs.ApplicationMetadataEventData
    ],
    ApplicationStatusEventData: org.scalablytyped.runtime.Instantiable1[
      /* status */ java.lang.String, 
      chromecastDashCafDashSenderLib.castNs.frameworkNs.ApplicationStatusEventData
    ],
    CastContext: Anon_GetInstance,
    CastSession: org.scalablytyped.runtime.Instantiable2[
      /* sessionObj */ chromeLib.chromeNs.castNs.Session, 
      /* state */ chromecastDashCafDashSenderLib.castNs.frameworkNs.SessionState, 
      chromecastDashCafDashSenderLib.castNs.frameworkNs.CastSession
    ],
    CastStateEventData: org.scalablytyped.runtime.Instantiable1[
      /* castState */ chromecastDashCafDashSenderLib.castNs.frameworkNs.CastState, 
      chromecastDashCafDashSenderLib.castNs.frameworkNs.CastStateEventData
    ],
    EventData: org.scalablytyped.runtime.Instantiable1[
      /* type */ java.lang.String, 
      chromecastDashCafDashSenderLib.castNs.frameworkNs.EventData
    ],
    MediaSessionEventData: org.scalablytyped.runtime.Instantiable1[
      /* mediaSession */ chromeLib.chromeNs.castNs.mediaNs.Media, 
      chromecastDashCafDashSenderLib.castNs.frameworkNs.MediaSessionEventData
    ],
    RemotePlayer: org.scalablytyped.runtime.Instantiable0[chromecastDashCafDashSenderLib.castNs.frameworkNs.RemotePlayer],
    RemotePlayerChangedEvent: org.scalablytyped.runtime.Instantiable3[
      /* type */ chromecastDashCafDashSenderLib.castNs.frameworkNs.RemotePlayerEventType, 
      /* field */ java.lang.String, 
      /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ /* value */ js.Any, 
      chromecastDashCafDashSenderLib.castNs.frameworkNs.RemotePlayerChangedEvent[js.Object]
    ],
    RemotePlayerController: org.scalablytyped.runtime.Instantiable1[
      /* player */ chromecastDashCafDashSenderLib.castNs.frameworkNs.RemotePlayer, 
      chromecastDashCafDashSenderLib.castNs.frameworkNs.RemotePlayerController
    ],
    SessionStateEventData: org.scalablytyped.runtime.Instantiable3[
      /* session */ chromecastDashCafDashSenderLib.castNs.frameworkNs.CastSession, 
      /* sessionState */ chromecastDashCafDashSenderLib.castNs.frameworkNs.SessionState, 
      /* opt_errorCode */ chromeLib.chromeNs.castNs.ErrorCode, 
      chromecastDashCafDashSenderLib.castNs.frameworkNs.SessionStateEventData
    ],
    VERSION: java.lang.String,
    VolumeEventData: org.scalablytyped.runtime.Instantiable2[
      /* volume */ scala.Double, 
      /* isMute */ scala.Boolean, 
      chromecastDashCafDashSenderLib.castNs.frameworkNs.VolumeEventData
    ],
    setLoggerLevel: js.Function1[chromecastDashCafDashSenderLib.castNs.frameworkNs.LoggerLevel, scala.Unit]
  ): Anon_ActiveInputState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ActiveInputStateEventData")(ActiveInputStateEventData)
    __obj.updateDynamic("ApplicationMetadata")(ApplicationMetadata)
    __obj.updateDynamic("ApplicationMetadataEventData")(ApplicationMetadataEventData)
    __obj.updateDynamic("ApplicationStatusEventData")(ApplicationStatusEventData)
    __obj.updateDynamic("CastContext")(CastContext)
    __obj.updateDynamic("CastSession")(CastSession)
    __obj.updateDynamic("CastStateEventData")(CastStateEventData)
    __obj.updateDynamic("EventData")(EventData)
    __obj.updateDynamic("MediaSessionEventData")(MediaSessionEventData)
    __obj.updateDynamic("RemotePlayer")(RemotePlayer)
    __obj.updateDynamic("RemotePlayerChangedEvent")(RemotePlayerChangedEvent)
    __obj.updateDynamic("RemotePlayerController")(RemotePlayerController)
    __obj.updateDynamic("SessionStateEventData")(SessionStateEventData)
    __obj.updateDynamic("VERSION")(VERSION)
    __obj.updateDynamic("VolumeEventData")(VolumeEventData)
    __obj.updateDynamic("setLoggerLevel")(setLoggerLevel)
    __obj.asInstanceOf[Anon_ActiveInputState]
  }
}

