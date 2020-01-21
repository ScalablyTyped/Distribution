package typings.cesium

import typings.cesium.mod.Scene
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainer extends js.Object {
  var container: Element | String
  var flightDuration: js.UndefOr[Double] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var scene: Scene
  var url: js.UndefOr[String] = js.undefined
}

object AnonContainer {
  @scala.inline
  def apply(
    container: Element | String,
    scene: Scene,
    flightDuration: Int | Double = null,
    key: String = null,
    url: String = null
  ): AnonContainer = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
    if (flightDuration != null) __obj.updateDynamic("flightDuration")(flightDuration.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContainer]
  }
}

