package typings.chrome.chrome.cast.media

import typings.chrome.chrome.cast.Volume
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeRequest extends js.Object {
  var customData: js.Object = js.native
  var volume: Volume = js.native
}

object VolumeRequest {
  @scala.inline
  def apply(customData: js.Object, volume: Volume): VolumeRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeRequest]
  }
  @scala.inline
  implicit class VolumeRequestOps[Self <: VolumeRequest] (val x: Self) extends AnyVal {
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
    def setCustomData(value: js.Object): Self = this.set("customData", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolume(value: Volume): Self = this.set("volume", value.asInstanceOf[js.Any])
  }
  
}

