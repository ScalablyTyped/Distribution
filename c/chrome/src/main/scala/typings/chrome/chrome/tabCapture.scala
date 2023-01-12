package typings.chrome.chrome

import typings.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// TabCapture
////////////////////
/**
  * Use the chrome.tabCapture API to interact with tab media streams.
  * Permissions:  "tabCapture"
  * @since Chrome 31.
  */
object tabCapture {
  
  trait CaptureInfo extends StObject {
    
    /** Whether an element in the tab being captured is in fullscreen mode. */
    var fullscreen: Boolean
    
    /**
      * The new capture status of the tab.
      * One of: "pending", "active", "stopped", or "error"
      */
    var status: String
    
    /** The id of the tab whose status changed. */
    var tabId: Double
  }
  object CaptureInfo {
    
    inline def apply(fullscreen: Boolean, status: String, tabId: Double): CaptureInfo = {
      val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CaptureInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CaptureInfo] (val x: Self) extends AnyVal {
      
      inline def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    }
  }
  
  trait CaptureOptions extends StObject {
    
    /** Optional. */
    var audio: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. */
    var audioConstraints: js.UndefOr[MediaStreamConstraint] = js.undefined
    
    /** Optional. */
    var video: js.UndefOr[Boolean] = js.undefined
    
    /** Optional. */
    var videoConstraints: js.UndefOr[MediaStreamConstraint] = js.undefined
  }
  object CaptureOptions {
    
    inline def apply(): CaptureOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptureOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CaptureOptions] (val x: Self) extends AnyVal {
      
      inline def setAudio(value: Boolean): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      inline def setAudioConstraints(value: MediaStreamConstraint): Self = StObject.set(x, "audioConstraints", value.asInstanceOf[js.Any])
      
      inline def setAudioConstraintsUndefined: Self = StObject.set(x, "audioConstraints", js.undefined)
      
      inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
      
      inline def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      inline def setVideoConstraints(value: MediaStreamConstraint): Self = StObject.set(x, "videoConstraints", value.asInstanceOf[js.Any])
      
      inline def setVideoConstraintsUndefined: Self = StObject.set(x, "videoConstraints", js.undefined)
      
      inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    }
  }
  
  type CaptureStatusChangedEvent = Event[js.Function1[/* info */ CaptureInfo, Unit]]
  
  trait GetMediaStreamOptions extends StObject {
    
    /** Optional tab id of the tab which will later invoke getUserMedia() to consume the stream. If not specified then the resulting stream can be used only by the calling extension. The stream can only be used by frames in the given tab whose security origin matches the consumber tab's origin. The tab's origin must be a secure origin, e.g. HTTPS. */
    var consumerTabId: js.UndefOr[Double] = js.undefined
    
    /** Optional tab id of the tab which will be captured. If not specified then the current active tab will be selected. Only tabs for which the extension has been granted the activeTab permission can be used as the target tab. */
    var targetTabId: js.UndefOr[Double] = js.undefined
  }
  object GetMediaStreamOptions {
    
    inline def apply(): GetMediaStreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetMediaStreamOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetMediaStreamOptions] (val x: Self) extends AnyVal {
      
      inline def setConsumerTabId(value: Double): Self = StObject.set(x, "consumerTabId", value.asInstanceOf[js.Any])
      
      inline def setConsumerTabIdUndefined: Self = StObject.set(x, "consumerTabId", js.undefined)
      
      inline def setTargetTabId(value: Double): Self = StObject.set(x, "targetTabId", value.asInstanceOf[js.Any])
      
      inline def setTargetTabIdUndefined: Self = StObject.set(x, "targetTabId", js.undefined)
    }
  }
  
  trait MediaStreamConstraint extends StObject {
    
    var mandatory: js.Object
    
    var optional: js.UndefOr[js.Object] = js.undefined
  }
  object MediaStreamConstraint {
    
    inline def apply(mandatory: js.Object): MediaStreamConstraint = {
      val __obj = js.Dynamic.literal(mandatory = mandatory.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaStreamConstraint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MediaStreamConstraint] (val x: Self) extends AnyVal {
      
      inline def setMandatory(value: js.Object): Self = StObject.set(x, "mandatory", value.asInstanceOf[js.Any])
      
      inline def setOptional(value: js.Object): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    }
  }
}
