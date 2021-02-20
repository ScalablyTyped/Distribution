package typings.cordovaPluginMediaCapture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Encapsulates audio capture configuration options. */
@js.native
trait AudioOptions extends StObject {
  
  /** The maximum duration of a audio clip, in seconds. */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * The maximum number of audio clips the device's user can capture in a single
    * capture operation. The value must be greater than or equal to 1.
    */
  var limit: js.UndefOr[Double] = js.native
}
object AudioOptions {
  
  @scala.inline
  def apply(): AudioOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioOptions]
  }
  
  @scala.inline
  implicit class AudioOptionsMutableBuilder[Self <: AudioOptions] (val x: Self) extends AnyVal {
    
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
