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
import typings.chromecastCafSender.cast.framework.CastContext
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait TypeofCastContext extends StObject {
    
    /* static member */
    def getInstance(): CastContext
  }
  object TypeofCastContext {
    
    inline def apply(getInstance: () => CastContext): TypeofCastContext = {
      val __obj = js.Dynamic.literal(getInstance = js.Any.fromFunction0(getInstance))
      __obj.asInstanceOf[TypeofCastContext]
    }
    
    extension [Self <: TypeofCastContext](x: Self) {
      
      inline def setGetInstance(value: () => CastContext): Self = StObject.set(x, "getInstance", js.Any.fromFunction0(value))
    }
  }
  
  trait Typeofcast extends StObject {
    
    ////////////////////
    // Framework
    ////////////////////
    /**
      * Cast Application Framework
      * @see https://developers.google.com/cast/docs/reference/chrome/cast.framework
      */
    val framework: Typeofframework
  }
  object Typeofcast {
    
    inline def apply(framework: Typeofframework): Typeofcast = {
      val __obj = js.Dynamic.literal(framework = framework.asInstanceOf[js.Any])
      __obj.asInstanceOf[Typeofcast]
    }
    
    extension [Self <: Typeofcast](x: Self) {
      
      inline def setFramework(value: Typeofframework): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
    }
  }
  
  trait Typeofframework extends StObject {
    
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
    
    var CastContext: Instantiable0[typings.chromecastCafSender.cast.framework.CastContext] & TypeofCastContext
    
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
    
    inline def apply(
      ActiveInputStateEventData: Instantiable1[/* activeInputState */ ActiveInputState, ActiveInputStateEventData],
      ApplicationMetadata: Instantiable1[/* sessionObj */ Session, ApplicationMetadata],
      ApplicationMetadataEventData: Instantiable1[/* metadata */ ApplicationMetadata, ApplicationMetadataEventData],
      ApplicationStatusEventData: Instantiable1[/* status */ String, ApplicationStatusEventData],
      CastContext: Instantiable0[CastContext] & TypeofCastContext,
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
    
    extension [Self <: Typeofframework](x: Self) {
      
      inline def setActiveInputStateEventData(value: Instantiable1[/* activeInputState */ ActiveInputState, ActiveInputStateEventData]): Self = StObject.set(x, "ActiveInputStateEventData", value.asInstanceOf[js.Any])
      
      inline def setApplicationMetadata(value: Instantiable1[/* sessionObj */ Session, ApplicationMetadata]): Self = StObject.set(x, "ApplicationMetadata", value.asInstanceOf[js.Any])
      
      inline def setApplicationMetadataEventData(value: Instantiable1[/* metadata */ ApplicationMetadata, ApplicationMetadataEventData]): Self = StObject.set(x, "ApplicationMetadataEventData", value.asInstanceOf[js.Any])
      
      inline def setApplicationStatusEventData(value: Instantiable1[/* status */ String, ApplicationStatusEventData]): Self = StObject.set(x, "ApplicationStatusEventData", value.asInstanceOf[js.Any])
      
      inline def setCastContext(value: Instantiable0[CastContext] & TypeofCastContext): Self = StObject.set(x, "CastContext", value.asInstanceOf[js.Any])
      
      inline def setCastSession(value: Instantiable2[/* sessionObj */ Session, /* state */ SessionState, CastSession]): Self = StObject.set(x, "CastSession", value.asInstanceOf[js.Any])
      
      inline def setCastStateEventData(value: Instantiable1[/* castState */ CastState, CastStateEventData]): Self = StObject.set(x, "CastStateEventData", value.asInstanceOf[js.Any])
      
      inline def setEventData(value: Instantiable1[/* type */ String, EventData]): Self = StObject.set(x, "EventData", value.asInstanceOf[js.Any])
      
      inline def setMediaSessionEventData(value: Instantiable1[/* mediaSession */ Media, MediaSessionEventData]): Self = StObject.set(x, "MediaSessionEventData", value.asInstanceOf[js.Any])
      
      inline def setRemotePlayer(value: Instantiable0[RemotePlayer]): Self = StObject.set(x, "RemotePlayer", value.asInstanceOf[js.Any])
      
      inline def setRemotePlayerChangedEvent(
        value: Instantiable3[
              /* type */ RemotePlayerEventType, 
              /* field */ String, 
              /* import warning: RewrittenClass.unapply cls was tparam T */ /* value */ js.Any, 
              RemotePlayerChangedEvent[js.Object]
            ]
      ): Self = StObject.set(x, "RemotePlayerChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setRemotePlayerController(value: Instantiable1[/* player */ RemotePlayer, RemotePlayerController]): Self = StObject.set(x, "RemotePlayerController", value.asInstanceOf[js.Any])
      
      inline def setSessionStateEventData(
        value: Instantiable3[
              /* session */ CastSession, 
              /* sessionState */ SessionState, 
              /* opt_errorCode */ ErrorCode, 
              SessionStateEventData
            ]
      ): Self = StObject.set(x, "SessionStateEventData", value.asInstanceOf[js.Any])
      
      inline def setSetLoggerLevel(value: LoggerLevel => Unit): Self = StObject.set(x, "setLoggerLevel", js.Any.fromFunction1(value))
      
      inline def setVERSION(value: String): Self = StObject.set(x, "VERSION", value.asInstanceOf[js.Any])
      
      inline def setVolumeEventData(value: Instantiable2[/* volume */ Double, /* isMute */ Boolean, VolumeEventData]): Self = StObject.set(x, "VolumeEventData", value.asInstanceOf[js.Any])
    }
  }
}
