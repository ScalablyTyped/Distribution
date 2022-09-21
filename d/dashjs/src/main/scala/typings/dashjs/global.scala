package typings.dashjs

import typings.dashjs.mod.MediaPlayerErrors
import typings.dashjs.mod.MediaPlayerEvents
import typings.dashjs.mod.MediaPlayerFactory
import typings.dashjs.mod.SessionToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object dashjs {
    
    @JSGlobal("dashjs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("dashjs.BitrateInfo")
    @js.native
    open class BitrateInfo ()
      extends typings.dashjs.mod.BitrateInfo
    
    @JSGlobal("dashjs.KeyError")
    @js.native
    open class KeyError protected ()
      extends typings.dashjs.mod.KeyError {
      def this(sessionToken: SessionToken, errorString: String) = this()
    }
    
    @JSGlobal("dashjs.KeyMessage")
    @js.native
    open class KeyMessage protected ()
      extends typings.dashjs.mod.KeyMessage {
      def this(sessionToken: SessionToken, message: js.typedarray.ArrayBuffer, defaultURL: String) = this()
      def this(
        sessionToken: SessionToken,
        message: js.typedarray.ArrayBuffer,
        defaultURL: String,
        messageType: String
      ) = this()
    }
    
    @JSGlobal("dashjs.MediaInfo")
    @js.native
    open class MediaInfo ()
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
    
    @JSGlobal("dashjs.MediaPlayerSettingClass")
    @js.native
    open class MediaPlayerSettingClass ()
      extends typings.dashjs.mod.MediaPlayerSettingClass
    
    @JSGlobal("dashjs.MetricsList")
    @js.native
    open class MetricsList ()
      extends typings.dashjs.mod.MetricsList
    
    @JSGlobal("dashjs.ProtectionMediaInfo")
    @js.native
    open class ProtectionMediaInfo ()
      extends typings.dashjs.mod.ProtectionMediaInfo
    
    @JSGlobal("dashjs.RequestsQueue")
    @js.native
    open class RequestsQueue ()
      extends typings.dashjs.mod.RequestsQueue
    
    @JSGlobal("dashjs.StreamInfo")
    @js.native
    open class StreamInfo ()
      extends typings.dashjs.mod.StreamInfo
    
    @JSGlobal("dashjs.TextTrackInfo")
    @js.native
    open class TextTrackInfo ()
      extends typings.dashjs.mod.TextTrackInfo
    
    inline def supportsMediaSource(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsMediaSource")().asInstanceOf[Boolean]
  }
}
