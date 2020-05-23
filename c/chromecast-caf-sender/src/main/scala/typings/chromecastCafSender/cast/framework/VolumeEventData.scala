package typings.chromecastCafSender.cast.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VolumeEventData extends EventData {
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
}

