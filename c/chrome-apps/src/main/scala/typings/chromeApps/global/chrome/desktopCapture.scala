package typings.chromeApps.global.chrome

import typings.chromeApps.anon.AUDIO
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings.SCREEN
import typings.chromeApps.chromeAppsStrings.TAB
import typings.chromeApps.chromeAppsStrings.WINDOW
import typings.chromeApps.chromeAppsStrings.audio_
import typings.chromeApps.chromeAppsStrings.screen_
import typings.chromeApps.chromeAppsStrings.tab_
import typings.chromeApps.chromeAppsStrings.window_
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.desktopCapture
/////////////////////
// Desktop Capture //
/////////////////////
/**
  * Desktop Capture API that can be used to capture content of screen or individual windows.
  * @since Chrome 34.
  * @requires Permissions: 'desktopCapture'
  */
object desktopCapture {
  
  @JSGlobal("chrome.desktopCapture")
  @js.native
  val ^ : js.Any = js.native
  
  object DesktopCaptureSourceType {
    
    @JSGlobal("chrome.desktopCapture.DesktopCaptureSourceType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.desktopCapture.DesktopCaptureSourceType.AUDIO")
    @js.native
    def AUDIO: audio_ = js.native
    inline def AUDIO_=(x: audio_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUDIO")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.desktopCapture.DesktopCaptureSourceType.SCREEN")
    @js.native
    def SCREEN: screen_ = js.native
    inline def SCREEN_=(x: screen_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCREEN")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.desktopCapture.DesktopCaptureSourceType.TAB")
    @js.native
    def TAB: tab_ = js.native
    inline def TAB_=(x: tab_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAB")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.desktopCapture.DesktopCaptureSourceType.WINDOW")
    @js.native
    def WINDOW: window_ = js.native
    inline def WINDOW_=(x: window_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WINDOW")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Hides desktop media picker dialog shown by chooseDesktopMedia().
    * @param desktopMediaRequestId Id returned by chooseDesktopMedia()
    */
  inline def cancelChooseDesktopMedia(desktopMediaRequestId: integer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelChooseDesktopMedia")(desktopMediaRequestId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Shows desktop media picker UI with the specified set of sources.
    * @param sources Set of sources that should be shown to the user.
    * @param callback Provides an opaque string that can be passed to getUserMedia() API to generate media stream that corresponds to the source selected by the user.
    *                 If user didn't select any source (i.e. canceled the prompt) then the callback is called with an empty streamId.
    *                 The created streamId can be used only once and expires after a few seconds when it is not used.
    * @return Request ID to be used by cancelChooseDesktopMedia
    */
  inline def chooseDesktopMedia(
    sources: js.Array[
      ToStringLiteral[
        AUDIO, 
        /* keyof chrome-apps.anon.AUDIO */ SCREEN | WINDOW | TAB | typings.chromeApps.chromeAppsStrings.AUDIO, 
        Exclude[
          /* keyof chrome-apps.anon.AUDIO */ SCREEN | WINDOW | TAB | typings.chromeApps.chromeAppsStrings.AUDIO, 
          screen_ | window_ | tab_ | audio_
        ]
      ]
    ],
    callback: js.Function1[/* streamId */ String, Unit]
  ): integer = (^.asInstanceOf[js.Dynamic].applyDynamic("chooseDesktopMedia")(sources.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[integer]
}
