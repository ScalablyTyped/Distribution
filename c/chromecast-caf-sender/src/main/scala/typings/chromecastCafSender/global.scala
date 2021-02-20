package typings.chromecastCafSender

import typings.chrome.chrome.cast.ErrorCode
import typings.chrome.chrome.cast.Session
import typings.chrome.chrome.cast.media.Media
import typings.chromecastCafSender.cast.framework.ActiveInputState
import typings.chromecastCafSender.cast.framework.CastState
import typings.chromecastCafSender.cast.framework.LoggerLevel
import typings.chromecastCafSender.cast.framework.RemotePlayerEventType
import typings.chromecastCafSender.cast.framework.SessionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object cast {
    
    ////////////////////
    // Framework
    ////////////////////
    /**
      * Cast Application Framework
      * @see https://developers.google.com/cast/docs/reference/chrome/cast.framework
      */
    object framework {
      
      @JSGlobal("cast.framework.ActiveInputState")
      @js.native
      object ActiveInputState extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.chromecastCafSender.cast.framework.ActiveInputState with Double] = js.native
        
        /* 0 */ val ACTIVE_INPUT_STATE_NO: typings.chromecastCafSender.cast.framework.ActiveInputState.ACTIVE_INPUT_STATE_NO with Double = js.native
        
        /* -1 */ val ACTIVE_INPUT_STATE_UNKNOWN: typings.chromecastCafSender.cast.framework.ActiveInputState.ACTIVE_INPUT_STATE_UNKNOWN with Double = js.native
        
        /* 1 */ val ACTIVE_INPUT_STATE_YES: typings.chromecastCafSender.cast.framework.ActiveInputState.ACTIVE_INPUT_STATE_YES with Double = js.native
      }
      
      @JSGlobal("cast.framework.ActiveInputStateEventData")
      @js.native
      class ActiveInputStateEventData protected ()
        extends typings.chromecastCafSender.cast.framework.ActiveInputStateEventData {
        def this(activeInputState: ActiveInputState) = this()
      }
      
      @JSGlobal("cast.framework.ApplicationMetadata")
      @js.native
      class ApplicationMetadata protected ()
        extends typings.chromecastCafSender.cast.framework.ApplicationMetadata {
        def this(sessionObj: Session) = this()
      }
      
      @JSGlobal("cast.framework.ApplicationMetadataEventData")
      @js.native
      class ApplicationMetadataEventData protected ()
        extends typings.chromecastCafSender.cast.framework.ApplicationMetadataEventData {
        def this(metadata: typings.chromecastCafSender.cast.framework.ApplicationMetadata) = this()
      }
      
      @JSGlobal("cast.framework.ApplicationStatusEventData")
      @js.native
      class ApplicationStatusEventData protected ()
        extends typings.chromecastCafSender.cast.framework.ApplicationStatusEventData {
        def this(status: String) = this()
      }
      
      @JSGlobal("cast.framework.CastContext")
      @js.native
      class CastContext ()
        extends typings.chromecastCafSender.cast.framework.CastContext
      object CastContext {
        
        /* static member */
        @JSGlobal("cast.framework.CastContext.getInstance")
        @js.native
        def getInstance(): typings.chromecastCafSender.cast.framework.CastContext = js.native
      }
      
      @JSGlobal("cast.framework.CastContextEventType")
      @js.native
      object CastContextEventType extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typings.chromecastCafSender.cast.framework.CastContextEventType with String] = js.native
        
        /* "caststatechanged" */ val CAST_STATE_CHANGED: typings.chromecastCafSender.cast.framework.CastContextEventType.CAST_STATE_CHANGED with String = js.native
        
        /* "sessionstatechanged" */ val SESSION_STATE_CHANGED: typings.chromecastCafSender.cast.framework.CastContextEventType.SESSION_STATE_CHANGED with String = js.native
      }
      
      @JSGlobal("cast.framework.CastSession")
      @js.native
      class CastSession protected ()
        extends typings.chromecastCafSender.cast.framework.CastSession {
        def this(sessionObj: Session, state: SessionState) = this()
      }
      
      @JSGlobal("cast.framework.CastState")
      @js.native
      object CastState extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typings.chromecastCafSender.cast.framework.CastState with String] = js.native
        
        /* "CONNECTED" */ val CONNECTED: typings.chromecastCafSender.cast.framework.CastState.CONNECTED with String = js.native
        
        /* "CONNECTING" */ val CONNECTING: typings.chromecastCafSender.cast.framework.CastState.CONNECTING with String = js.native
        
        /* "NOT_CONNECTED" */ val NOT_CONNECTED: typings.chromecastCafSender.cast.framework.CastState.NOT_CONNECTED with String = js.native
        
        /* "NO_DEVICES_AVAILABLE" */ val NO_DEVICES_AVAILABLE: typings.chromecastCafSender.cast.framework.CastState.NO_DEVICES_AVAILABLE with String = js.native
      }
      
      @JSGlobal("cast.framework.CastStateEventData")
      @js.native
      class CastStateEventData protected ()
        extends typings.chromecastCafSender.cast.framework.CastStateEventData {
        def this(castState: CastState) = this()
      }
      
      @JSGlobal("cast.framework.EventData")
      @js.native
      abstract class EventData protected ()
        extends typings.chromecastCafSender.cast.framework.EventData {
        def this(`type`: String) = this()
      }
      
      @JSGlobal("cast.framework.LoggerLevel")
      @js.native
      object LoggerLevel extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.chromecastCafSender.cast.framework.LoggerLevel with Double] = js.native
        
        /* 0 */ val DEBUG: typings.chromecastCafSender.cast.framework.LoggerLevel.DEBUG with Double = js.native
        
        /* 3 */ val ERROR: typings.chromecastCafSender.cast.framework.LoggerLevel.ERROR with Double = js.native
        
        /* 1 */ val INFO: typings.chromecastCafSender.cast.framework.LoggerLevel.INFO with Double = js.native
        
        /* 4 */ val NONE: typings.chromecastCafSender.cast.framework.LoggerLevel.NONE with Double = js.native
        
        /* 2 */ val WARNING: typings.chromecastCafSender.cast.framework.LoggerLevel.WARNING with Double = js.native
      }
      
      @JSGlobal("cast.framework.MediaSessionEventData")
      @js.native
      class MediaSessionEventData protected ()
        extends typings.chromecastCafSender.cast.framework.MediaSessionEventData {
        def this(mediaSession: Media) = this()
      }
      
      @JSGlobal("cast.framework.RemotePlayer")
      @js.native
      class RemotePlayer ()
        extends typings.chromecastCafSender.cast.framework.RemotePlayer
      
      @JSGlobal("cast.framework.RemotePlayerChangedEvent")
      @js.native
      class RemotePlayerChangedEvent[T] protected ()
        extends typings.chromecastCafSender.cast.framework.RemotePlayerChangedEvent[T] {
        def this(`type`: RemotePlayerEventType, field: String, value: T) = this()
      }
      
      @JSGlobal("cast.framework.RemotePlayerController")
      @js.native
      class RemotePlayerController protected ()
        extends typings.chromecastCafSender.cast.framework.RemotePlayerController {
        def this(player: typings.chromecastCafSender.cast.framework.RemotePlayer) = this()
      }
      
      @JSGlobal("cast.framework.RemotePlayerEventType")
      @js.native
      object RemotePlayerEventType extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typings.chromecastCafSender.cast.framework.RemotePlayerEventType with String] = js.native
        
        /* "anyChanged" */ val ANY_CHANGE: typings.chromecastCafSender.cast.framework.RemotePlayerEventType.ANY_CHANGE with String = js.native
        
        /* "canControlVolumeChanged" */ val CAN_CONTROL_VOLUME_CHANGED: typings.chromecastCafSender.cast.framework.RemotePlayerEventType.CAN_CONTROL_VOLUME_CHANGED with String = js.native
        
        /* "canPauseChanged" */ val CAN_PAUSE_CHANGED: typings.chromecastCafSender.cast.framework.RemotePlayerEventType.CAN_PAUSE_CHANGED with String = js.native
        
        /* "canSeekChanged" */ val CAN_SEEK_CHANGED: typings.chromecastCafSender.cast.framework.RemotePlayerEventType.CAN_SEEK_CHANGED with String = js.native
        
        /* "currentTimeChanged" */ val CURRENT_TIME_CHANGED: typings.chromecastCafSender.cast.framework.RemotePlayerEventType.CURRENT_TIME_CHANGED with String = js.native
        
        /* "displayNameChanged" */ val DISPLAY_NAME_CHANGED: typings.chromecastCafSender.cast.framework.RemotePlayerEventType.DISPLAY_NAME_CHANGED with String = js.native
        
        /* "displayStatusChanged" */ val DISPLAY_STATUS_CHANGED: typings.chromecastCafSender.cast.framework.RemotePlayerEventType.DISPLAY_STATUS_CHANGED with String = js.native
        
        /* "durationChanged" */ val DURATION_CHANGED: typings.chromecastCafSender.cast.framework.RemotePlayerEventType.DURATION_CHANGED with String = js.native
        
        /* "imageUrlChanged" */ val IMAGE_URL_CHANGED: typings.chromecastCafSender.cast.framework.RemotePlayerEventType.IMAGE_URL_CHANGED with String = js.native
        
        /* "isConnectedChanged" */ val IS_CONNECTED_CHANGED: typings.chromecastCafSender.cast.framework.RemotePlayerEventType.IS_CONNECTED_CHANGED with String = js.native
        
        /* "isMediaLoadedChanged" */ val IS_MEDIA_LOADED_CHANGED: typings.chromecastCafSender.cast.framework.RemotePlayerEventType.IS_MEDIA_LOADED_CHANGED with String = js.native
        
        /* "isMutedChanged" */ val IS_MUTED_CHANGED: typings.chromecastCafSender.cast.framework.RemotePlayerEventType.IS_MUTED_CHANGED with String = js.native
        
        /* "isPausedChanged" */ val IS_PAUSED_CHANGED: typings.chromecastCafSender.cast.framework.RemotePlayerEventType.IS_PAUSED_CHANGED with String = js.native
        
        /* "liveSeekableRange" */ val LIVE_SEEKABLE_RANGE_CHANGED: typings.chromecastCafSender.cast.framework.RemotePlayerEventType.LIVE_SEEKABLE_RANGE_CHANGED with String = js.native
        
        /* "mediaInfoChanged" */ val MEDIA_INFO_CHANGED: typings.chromecastCafSender.cast.framework.RemotePlayerEventType.MEDIA_INFO_CHANGED with String = js.native
        
        /* "playerStateChanged" */ val PLAYER_STATE_CHANGED: typings.chromecastCafSender.cast.framework.RemotePlayerEventType.PLAYER_STATE_CHANGED with String = js.native
        
        /* "statusTextChanged" */ val STATUS_TEXT_CHANGED: typings.chromecastCafSender.cast.framework.RemotePlayerEventType.STATUS_TEXT_CHANGED with String = js.native
        
        /* "titleChanged" */ val TITLE_CHANGED: typings.chromecastCafSender.cast.framework.RemotePlayerEventType.TITLE_CHANGED with String = js.native
        
        /* "volumeLevelChanged" */ val VOLUME_LEVEL_CHANGED: typings.chromecastCafSender.cast.framework.RemotePlayerEventType.VOLUME_LEVEL_CHANGED with String = js.native
      }
      
      @JSGlobal("cast.framework.SessionEventType")
      @js.native
      object SessionEventType extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typings.chromecastCafSender.cast.framework.SessionEventType with String] = js.native
        
        /* "activeinputstatechanged" */ val ACTIVE_INPUT_STATE_CHANGED: typings.chromecastCafSender.cast.framework.SessionEventType.ACTIVE_INPUT_STATE_CHANGED with String = js.native
        
        /* "applicationmetadatachanged" */ val APPLICATION_METADATA_CHANGED: typings.chromecastCafSender.cast.framework.SessionEventType.APPLICATION_METADATA_CHANGED with String = js.native
        
        /* "applicationstatuschanged" */ val APPLICATION_STATUS_CHANGED: typings.chromecastCafSender.cast.framework.SessionEventType.APPLICATION_STATUS_CHANGED with String = js.native
        
        /* "mediasession" */ val MEDIA_SESSION: typings.chromecastCafSender.cast.framework.SessionEventType.MEDIA_SESSION with String = js.native
        
        /* "volumechanged" */ val VOLUME_CHANGED: typings.chromecastCafSender.cast.framework.SessionEventType.VOLUME_CHANGED with String = js.native
      }
      
      @JSGlobal("cast.framework.SessionState")
      @js.native
      object SessionState extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typings.chromecastCafSender.cast.framework.SessionState with String] = js.native
        
        /* "NO_SESSION" */ val NO_SESSION: typings.chromecastCafSender.cast.framework.SessionState.NO_SESSION with String = js.native
        
        /* "SESSION_ENDED" */ val SESSION_ENDED: typings.chromecastCafSender.cast.framework.SessionState.SESSION_ENDED with String = js.native
        
        /* "SESSION_ENDING" */ val SESSION_ENDING: typings.chromecastCafSender.cast.framework.SessionState.SESSION_ENDING with String = js.native
        
        /* "SESSION_RESUMED" */ val SESSION_RESUMED: typings.chromecastCafSender.cast.framework.SessionState.SESSION_RESUMED with String = js.native
        
        /* "SESSION_STARTED" */ val SESSION_STARTED: typings.chromecastCafSender.cast.framework.SessionState.SESSION_STARTED with String = js.native
        
        /* "SESSION_STARTING" */ val SESSION_STARTING: typings.chromecastCafSender.cast.framework.SessionState.SESSION_STARTING with String = js.native
        
        /* "SESSION_START_FAILED" */ val SESSION_START_FAILED: typings.chromecastCafSender.cast.framework.SessionState.SESSION_START_FAILED with String = js.native
      }
      
      @JSGlobal("cast.framework.SessionStateEventData")
      @js.native
      class SessionStateEventData protected ()
        extends typings.chromecastCafSender.cast.framework.SessionStateEventData {
        def this(
          session: typings.chromecastCafSender.cast.framework.CastSession,
          sessionState: SessionState,
          opt_errorCode: ErrorCode
        ) = this()
      }
      
      @JSGlobal("cast.framework.VERSION")
      @js.native
      val VERSION: String = js.native
      
      @JSGlobal("cast.framework.VolumeEventData")
      @js.native
      class VolumeEventData protected ()
        extends typings.chromecastCafSender.cast.framework.VolumeEventData {
        def this(volume: Double, isMute: Boolean) = this()
      }
      
      @JSGlobal("cast.framework.setLoggerLevel")
      @js.native
      def setLoggerLevel(level: LoggerLevel): Unit = js.native
    }
  }
}
