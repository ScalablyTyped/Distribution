package typings.chromecastDashCafDashSender.cast.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("cast.framework.VolumeEventData")
@js.native
class VolumeEventData protected () extends EventData {
  def this(volume: Double, isMute: Boolean) = this()
  var isMute: Boolean = js.native
  var volume: Double = js.native
}

