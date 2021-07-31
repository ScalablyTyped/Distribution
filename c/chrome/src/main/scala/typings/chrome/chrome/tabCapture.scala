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
    
    @scala.inline
    def apply(fullscreen: Boolean, status: String, tabId: Double): CaptureInfo = {
      val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any])
      __obj.asInstanceOf[CaptureInfo]
    }
    
    @scala.inline
    implicit class CaptureInfoMutableBuilder[Self <: CaptureInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabId(value: Double): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(): CaptureOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CaptureOptions]
    }
    
    @scala.inline
    implicit class CaptureOptionsMutableBuilder[Self <: CaptureOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudio(value: Boolean): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioConstraints(value: MediaStreamConstraint): Self = StObject.set(x, "audioConstraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioConstraintsUndefined: Self = StObject.set(x, "audioConstraints", js.undefined)
      
      @scala.inline
      def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
      
      @scala.inline
      def setVideo(value: Boolean): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoConstraints(value: MediaStreamConstraint): Self = StObject.set(x, "videoConstraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoConstraintsUndefined: Self = StObject.set(x, "videoConstraints", js.undefined)
      
      @scala.inline
      def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    }
  }
  
  type CaptureStatusChangedEvent = Event[js.Function1[/* info */ CaptureInfo, Unit]]
  
  trait MediaStreamConstraint extends StObject {
    
    var mandatory: js.Object
    
    var optional: js.UndefOr[js.Object] = js.undefined
  }
  object MediaStreamConstraint {
    
    @scala.inline
    def apply(mandatory: js.Object): MediaStreamConstraint = {
      val __obj = js.Dynamic.literal(mandatory = mandatory.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaStreamConstraint]
    }
    
    @scala.inline
    implicit class MediaStreamConstraintMutableBuilder[Self <: MediaStreamConstraint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMandatory(value: js.Object): Self = StObject.set(x, "mandatory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptional(value: js.Object): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    }
  }
}
