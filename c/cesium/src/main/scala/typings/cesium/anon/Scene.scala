package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scene extends js.Object {
  var lowFrameRateMessage: js.UndefOr[String] = js.undefined
  var scene: typings.cesium.mod.Scene
}

object Scene {
  @scala.inline
  def apply(scene: typings.cesium.mod.Scene, lowFrameRateMessage: String = null): Scene = {
    val __obj = js.Dynamic.literal(scene = scene.asInstanceOf[js.Any])
    if (lowFrameRateMessage != null) __obj.updateDynamic("lowFrameRateMessage")(lowFrameRateMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scene]
  }
}

