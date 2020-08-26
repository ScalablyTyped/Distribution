package typings.chromecastCafSender.cast.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeEventData extends EventData {
  var isMute: Boolean = js.native
  var volume: Double = js.native
}

object VolumeEventData {
  @scala.inline
  def apply(isMute: Boolean, `type`: String, volume: Double): VolumeEventData = {
    val __obj = js.Dynamic.literal(isMute = isMute.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeEventData]
  }
  @scala.inline
  implicit class VolumeEventDataOps[Self <: VolumeEventData] (val x: Self) extends AnyVal {
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
    def setIsMute(value: Boolean): Self = this.set("isMute", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolume(value: Double): Self = this.set("volume", value.asInstanceOf[js.Any])
  }
  
}

