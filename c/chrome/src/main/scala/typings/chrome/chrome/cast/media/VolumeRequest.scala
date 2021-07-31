package typings.chrome.chrome.cast.media

import typings.chrome.chrome.cast.Volume
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeRequest extends StObject {
  
  var customData: js.Object
  
  var volume: Volume
}
object VolumeRequest {
  
  @scala.inline
  def apply(customData: js.Object, volume: Volume): VolumeRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeRequest]
  }
  
  @scala.inline
  implicit class VolumeRequestMutableBuilder[Self <: VolumeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomData(value: js.Object): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume(value: Volume): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
