package typings.cesium

import typings.cesium.mod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScene extends js.Object {
  var lowFrameRateMessage: js.UndefOr[String] = js.undefined
  var scene: Scene
}

object AnonScene {
  @scala.inline
  def apply(scene: Scene, lowFrameRateMessage: String = null): AnonScene = {
    val __obj = js.Dynamic.literal(scene = scene.asInstanceOf[js.Any])
    if (lowFrameRateMessage != null) __obj.updateDynamic("lowFrameRateMessage")(lowFrameRateMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScene]
  }
}

