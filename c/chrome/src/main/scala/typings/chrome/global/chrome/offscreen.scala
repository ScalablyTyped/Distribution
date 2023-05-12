package typings.chrome.global.chrome

import typings.chrome.chrome.offscreen.CreateParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Offscreen
////////////////////
/**
  * Use the offscreen API to create and manage offscreen documents.
  * Availability: @since Chrome 109. Manifest v3.
  * Permissions: "offscreen"
  */
object offscreen {
  
  @JSGlobal("chrome.offscreen")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.offscreen.Reason")
  @js.native
  object Reason extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.chrome.chrome.offscreen.Reason & String] = js.native
    
    /* "AUDIO_PLAYBACK" */ val AUDIO_PLAYBACK: typings.chrome.chrome.offscreen.Reason.AUDIO_PLAYBACK & String = js.native
    
    /* "BLOBS" */ val BLOBS: typings.chrome.chrome.offscreen.Reason.BLOBS & String = js.native
    
    /* "CLIPBOARD" */ val CLIPBOARD: typings.chrome.chrome.offscreen.Reason.CLIPBOARD & String = js.native
    
    /* "DISPLAY_MEDIA" */ val DISPLAY_MEDIA: typings.chrome.chrome.offscreen.Reason.DISPLAY_MEDIA & String = js.native
    
    /* "DOM_PARSER" */ val DOM_PARSER: typings.chrome.chrome.offscreen.Reason.DOM_PARSER & String = js.native
    
    /* "DOM_SCRAPING" */ val DOM_SCRAPING: typings.chrome.chrome.offscreen.Reason.DOM_SCRAPING & String = js.native
    
    /* "IFRAME_SCRIPTING" */ val IFRAME_SCRIPTING: typings.chrome.chrome.offscreen.Reason.IFRAME_SCRIPTING & String = js.native
    
    /* "TESTING" */ val TESTING: typings.chrome.chrome.offscreen.Reason.TESTING & String = js.native
    
    /* "USER_MEDIA" */ val USER_MEDIA: typings.chrome.chrome.offscreen.Reason.USER_MEDIA & String = js.native
    
    /* "WEB_RTC" */ val WEB_RTC: typings.chrome.chrome.offscreen.Reason.WEB_RTC & String = js.native
  }
  
  inline def closeDocument(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("closeDocument")().asInstanceOf[js.Promise[Unit]]
  inline def closeDocument(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeDocument")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def createDocument(parameters: CreateParameters): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDocument")(parameters.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def createDocument(parameters: CreateParameters, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("createDocument")(parameters.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def hasDocument(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasDocument")().asInstanceOf[js.Promise[Boolean]]
  inline def hasDocument(callback: js.Function1[/* result */ Boolean, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hasDocument")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
