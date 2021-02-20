package typings.ccaptureJs

import typings.ccaptureJs.ccaptureJsStrings.ffmpegserver
import typings.ccaptureJs.ccaptureJsStrings.gif
import typings.ccaptureJs.ccaptureJsStrings.jpg
import typings.ccaptureJs.ccaptureJsStrings.png
import typings.ccaptureJs.ccaptureJsStrings.webm
import typings.std.Blob
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CCapture extends StObject {
  
  def capture(canvas: HTMLElement): Unit = js.native
  
  def save(): Unit = js.native
  def save(cb: js.Function1[/* blob */ Blob, Unit]): Unit = js.native
  
  def start(): Unit = js.native
  
  def stop(): Unit = js.native
}
object CCapture {
  
  @js.native
  trait Settings extends StObject {
    
    /**
      * It will automatically download the captured data every n seconds (only available for webm/png/jpg)
      */
    var autoSaveTime: js.UndefOr[Double] = js.native
    
    /**
      * Adds a widget with capturing info
      */
    var display: js.UndefOr[Boolean] = js.native
    
    var format: webm | gif | png | jpg | ffmpegserver = js.native
    
    /**
      * Target framerate for the capture
      */
    var framerate: js.UndefOr[Double] = js.native
    
    /**
      * Super-sampling of frames to create a motion-blurred frame (0 or 1 make no effect)
      */
    var motionBlurFrames: js.UndefOr[Double] = js.native
    
    /**
      * Name of the files to be exported. if no name is provided, a GUID will be generated
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Quality for webm/jpg
      */
    var quality: js.UndefOr[Double] = js.native
    
    /**
      * Skip to that mark (seconds)
      */
    var startTime: js.UndefOr[Double] = js.native
    
    /**
      * Automatically stops and downloads when reaching that time (seconds).
      * Very convenient for long captures: set it and forget it (remember autoSaveTime!)
      */
    var timeLimit: js.UndefOr[Double] = js.native
    
    /**
      * Dumps info on the console
      */
    var verbose: js.UndefOr[Boolean] = js.native
    
    /**
      * Path to the gif worker script
      */
    var workersPath: js.UndefOr[String] = js.native
  }
  object Settings {
    
    @scala.inline
    def apply(format: webm | gif | png | jpg | ffmpegserver): Settings = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoSaveTime(value: Double): Self = StObject.set(x, "autoSaveTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSaveTimeUndefined: Self = StObject.set(x, "autoSaveTime", js.undefined)
      
      @scala.inline
      def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setFormat(value: webm | gif | png | jpg | ffmpegserver): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFramerate(value: Double): Self = StObject.set(x, "framerate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFramerateUndefined: Self = StObject.set(x, "framerate", js.undefined)
      
      @scala.inline
      def setMotionBlurFrames(value: Double): Self = StObject.set(x, "motionBlurFrames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMotionBlurFramesUndefined: Self = StObject.set(x, "motionBlurFrames", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
      
      @scala.inline
      def setTimeLimit(value: Double): Self = StObject.set(x, "timeLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeLimitUndefined: Self = StObject.set(x, "timeLimit", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      @scala.inline
      def setWorkersPath(value: String): Self = StObject.set(x, "workersPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkersPathUndefined: Self = StObject.set(x, "workersPath", js.undefined)
    }
  }
}
