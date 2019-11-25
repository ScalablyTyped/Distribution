package typings.cesium

import typings.cesium.cesiumMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LowFrameRateMessage extends js.Object {
  var lowFrameRateMessage: js.UndefOr[String] = js.undefined
  var scene: Scene
}

object Anon_LowFrameRateMessage {
  @scala.inline
  def apply(scene: Scene, lowFrameRateMessage: String = null): Anon_LowFrameRateMessage = {
    val __obj = js.Dynamic.literal(scene = scene.asInstanceOf[js.Any])
    if (lowFrameRateMessage != null) __obj.updateDynamic("lowFrameRateMessage")(lowFrameRateMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LowFrameRateMessage]
  }
}

