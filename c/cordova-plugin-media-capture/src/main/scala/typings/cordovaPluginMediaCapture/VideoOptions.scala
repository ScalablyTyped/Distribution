package typings.cordovaPluginMediaCapture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Encapsulates video capture configuration options. */
trait VideoOptions extends StObject {
  
  /** The maximum duration of a video clip, in seconds. */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum number of video clips the device's user can capture in a single
    * capture operation. The value must be greater than or equal to 1.
    */
  var limit: js.UndefOr[Double] = js.undefined
}
object VideoOptions {
  
  @scala.inline
  def apply(): VideoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoOptions]
  }
  
  @scala.inline
  implicit class VideoOptionsMutableBuilder[Self <: VideoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
  }
}
