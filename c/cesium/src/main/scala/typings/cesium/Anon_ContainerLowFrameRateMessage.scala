package typings.cesium

import typings.cesium.cesiumMod.Scene
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerLowFrameRateMessage extends js.Object {
  var container: Element | String
  var lowFrameRateMessage: js.UndefOr[String] = js.undefined
  var scene: Scene
}

object Anon_ContainerLowFrameRateMessage {
  @scala.inline
  def apply(container: Element | String, scene: Scene, lowFrameRateMessage: String = null): Anon_ContainerLowFrameRateMessage = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], scene = scene)
    if (lowFrameRateMessage != null) __obj.updateDynamic("lowFrameRateMessage")(lowFrameRateMessage)
    __obj.asInstanceOf[Anon_ContainerLowFrameRateMessage]
  }
}

