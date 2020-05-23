package typings.chromecastCafSender.global.cast.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("cast.framework.VolumeEventData")
@js.native
class VolumeEventData protected ()
  extends typings.chromecastCafSender.cast.framework.VolumeEventData {
  def this(volume: Double, isMute: Boolean) = this()
  /* CompleteClass */
  override var isMute: Boolean = js.native
  /* CompleteClass */
  override var `type`: String = js.native
  /* CompleteClass */
  override var volume: Double = js.native
}

