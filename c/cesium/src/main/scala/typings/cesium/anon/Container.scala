package typings.cesium.anon

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container extends js.Object {
  var container: Element | String
  var flightDuration: js.UndefOr[Double] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var scene: typings.cesium.mod.Scene
  var url: js.UndefOr[String] = js.undefined
}

object Container {
  @scala.inline
  def apply(
    container: Element | String,
    scene: typings.cesium.mod.Scene,
    flightDuration: js.UndefOr[Double] = js.undefined,
    key: String = null,
    url: String = null
  ): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    if (!js.isUndefined(flightDuration)) __obj.updateDynamic("flightDuration")(flightDuration.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
}

