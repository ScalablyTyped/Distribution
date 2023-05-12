package typings.chrome.chrome

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
  
  @js.native
  sealed trait Reason extends StObject
  @JSGlobal("chrome.offscreen.Reason")
  @js.native
  object Reason extends StObject {
    
    /** The offscreen document is responsible for playing audio. */
    @js.native
    sealed trait AUDIO_PLAYBACK
      extends StObject
         with Reason
    
    /** The offscreen document needs to interact with Blob objects (including URL.createObjectURL()). */
    @js.native
    sealed trait BLOBS
      extends StObject
         with Reason
    
    /** The offscreen document needs to interact with the clipboard APIs(e.g. Navigator.clipboard). */
    @js.native
    sealed trait CLIPBOARD
      extends StObject
         with Reason
    
    /** The offscreen document needs to interact with media streams from display media (e.g. getDisplayMedia()). */
    @js.native
    sealed trait DISPLAY_MEDIA
      extends StObject
         with Reason
    
    /** The offscreen document needs to use the DOMParser API. */
    @js.native
    sealed trait DOM_PARSER
      extends StObject
         with Reason
    
    /** The offscreen document needs to embed an iframe and scrape its DOM to extract information. */
    @js.native
    sealed trait DOM_SCRAPING
      extends StObject
         with Reason
    
    /** The offscreen document needs to embed and script an iframe in order to modify the iframe's content. */
    @js.native
    sealed trait IFRAME_SCRIPTING
      extends StObject
         with Reason
    
    /** A reason used for testing purposes only. */
    @js.native
    sealed trait TESTING
      extends StObject
         with Reason
    
    /** The offscreen document needs to interact with media streams from user media (e.g. getUserMedia()). */
    @js.native
    sealed trait USER_MEDIA
      extends StObject
         with Reason
    
    /** The offscreen document needs to use WebRTC APIs. */
    @js.native
    sealed trait WEB_RTC
      extends StObject
         with Reason
  }
  
  trait CreateParameters extends StObject {
    
    /** A developer-provided string that explains, in more detail, the need for the background context. The user agent _may_ use this in display to the user. */
    var justification: String
    
    /** The reason(s) the extension is creating the offscreen document. */
    var reasons: js.Array[Reason]
    
    /** The (relative) URL to load in the document. */
    var url: String
  }
  object CreateParameters {
    
    inline def apply(justification: String, reasons: js.Array[Reason], url: String): CreateParameters = {
      val __obj = js.Dynamic.literal(justification = justification.asInstanceOf[js.Any], reasons = reasons.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateParameters] (val x: Self) extends AnyVal {
      
      inline def setJustification(value: String): Self = StObject.set(x, "justification", value.asInstanceOf[js.Any])
      
      inline def setReasons(value: js.Array[Reason]): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
      
      inline def setReasonsVarargs(value: Reason*): Self = StObject.set(x, "reasons", js.Array(value*))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
