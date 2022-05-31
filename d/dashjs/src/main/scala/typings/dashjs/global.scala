package typings.dashjs

import typings.dashjs.mod.MediaPlayerErrors
import typings.dashjs.mod.MediaPlayerEvents
import typings.dashjs.mod.MediaPlayerFactory
import typings.dashjs.mod.SessionToken
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object dashjs {
    
    @JSGlobal("dashjs.BitrateInfo")
    @js.native
    class BitrateInfo ()
      extends typings.dashjs.mod.BitrateInfo
    
    @JSGlobal("dashjs.KeyError")
    @js.native
    class KeyError protected ()
      extends typings.dashjs.mod.KeyError {
      def this(sessionToken: SessionToken, errorString: String) = this()
    }
    
    @JSGlobal("dashjs.KeyMessage")
    @js.native
    class KeyMessage protected ()
      extends typings.dashjs.mod.KeyMessage {
      def this(sessionToken: SessionToken, message: ArrayBuffer, defaultURL: String) = this()
      def this(sessionToken: SessionToken, message: ArrayBuffer, defaultURL: String, messageType: String) = this()
    }
    
    @JSGlobal("dashjs.LogLevel")
    @js.native
    object LogLevel extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.dashjs.mod.LogLevel & Double] = js.native
      
      /* 5 */ val LOG_LEVEL_DEBUG: typings.dashjs.mod.LogLevel.LOG_LEVEL_DEBUG & Double = js.native
      
      /* 2 */ val LOG_LEVEL_ERROR: typings.dashjs.mod.LogLevel.LOG_LEVEL_ERROR & Double = js.native
      
      /* 1 */ val LOG_LEVEL_FATAL: typings.dashjs.mod.LogLevel.LOG_LEVEL_FATAL & Double = js.native
      
      /* 4 */ val LOG_LEVEL_INFO: typings.dashjs.mod.LogLevel.LOG_LEVEL_INFO & Double = js.native
      
      /* 0 */ val LOG_LEVEL_NONE: typings.dashjs.mod.LogLevel.LOG_LEVEL_NONE & Double = js.native
      
      /* 3 */ val LOG_LEVEL_WARNING: typings.dashjs.mod.LogLevel.LOG_LEVEL_WARNING & Double = js.native
    }
    
    @JSGlobal("dashjs.MediaInfo")
    @js.native
    class MediaInfo ()
      extends typings.dashjs.mod.MediaInfo
    
    object MediaPlayer {
      
      inline def apply(): MediaPlayerFactory = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[MediaPlayerFactory]
      
      @JSGlobal("dashjs.MediaPlayer")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("dashjs.MediaPlayer.errors")
      @js.native
      val errors: MediaPlayerErrors = js.native
      
      @JSGlobal("dashjs.MediaPlayer.events")
      @js.native
      val events: MediaPlayerEvents = js.native
    }
    
    @JSGlobal("dashjs.MetricsList")
    @js.native
    class MetricsList ()
      extends typings.dashjs.mod.MetricsList
    
    @JSGlobal("dashjs.ProtectionData")
    @js.native
    class ProtectionData ()
      extends typings.dashjs.mod.ProtectionData
    
    @JSGlobal("dashjs.ProtectionMediaInfo")
    @js.native
    class ProtectionMediaInfo ()
      extends typings.dashjs.mod.ProtectionMediaInfo
    
    @JSGlobal("dashjs.RequestsQueue")
    @js.native
    class RequestsQueue ()
      extends typings.dashjs.mod.RequestsQueue
    
    @JSGlobal("dashjs.StreamInfo")
    @js.native
    class StreamInfo ()
      extends typings.dashjs.mod.StreamInfo
    
    @JSGlobal("dashjs.TextTrackInfo")
    @js.native
    class TextTrackInfo ()
      extends typings.dashjs.mod.TextTrackInfo
  }
}
