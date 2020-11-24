package typings.ccaptureJs.CCapture

import typings.ccaptureJs.ccaptureJsStrings.ffmpegserver
import typings.ccaptureJs.ccaptureJsStrings.gif
import typings.ccaptureJs.ccaptureJsStrings.jpg
import typings.ccaptureJs.ccaptureJsStrings.png
import typings.ccaptureJs.ccaptureJsStrings.webm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends js.Object {
  
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
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFormat(value: webm | gif | png | jpg | ffmpegserver): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSaveTime(value: Double): Self = this.set("autoSaveTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSaveTime: Self = this.set("autoSaveTime", js.undefined)
    
    @scala.inline
    def setDisplay(value: Boolean): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setFramerate(value: Double): Self = this.set("framerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFramerate: Self = this.set("framerate", js.undefined)
    
    @scala.inline
    def setMotionBlurFrames(value: Double): Self = this.set("motionBlurFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMotionBlurFrames: Self = this.set("motionBlurFrames", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    
    @scala.inline
    def setStartTime(value: Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setTimeLimit(value: Double): Self = this.set("timeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeLimit: Self = this.set("timeLimit", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
    
    @scala.inline
    def setWorkersPath(value: String): Self = this.set("workersPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkersPath: Self = this.set("workersPath", js.undefined)
  }
}
