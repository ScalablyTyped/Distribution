package typings.chromecastCafSender.cast.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeEventData
  extends StObject
     with EventData {
  
  var isMute: Boolean
  
  var volume: Double
}
object VolumeEventData {
  
  @scala.inline
  def apply(isMute: Boolean, `type`: String, volume: Double): VolumeEventData = {
    val __obj = js.Dynamic.literal(isMute = isMute.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeEventData]
  }
  
  @scala.inline
  implicit class VolumeEventDataMutableBuilder[Self <: VolumeEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsMute(value: Boolean): Self = StObject.set(x, "isMute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
