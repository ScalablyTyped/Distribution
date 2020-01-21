package typings.cesium

import typings.cesium.mod.Scene
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainerLowFrameRateMessage extends js.Object {
  var container: Element | String
  var lowFrameRateMessage: js.UndefOr[String] = js.undefined
  var scene: Scene
}

object AnonContainerLowFrameRateMessage {
  @scala.inline
  def apply(container: Element | String, scene: Scene, lowFrameRateMessage: String = null): AnonContainerLowFrameRateMessage = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    if (lowFrameRateMessage != null) __obj.updateDynamic("lowFrameRateMessage")(lowFrameRateMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContainerLowFrameRateMessage]
  }
}

