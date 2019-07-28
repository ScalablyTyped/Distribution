package typings.cesium

import typings.cesium.cesiumMod.Scene
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Container extends js.Object {
  var container: Element | String
  var flightDuration: js.UndefOr[Double] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var scene: Scene
  var url: js.UndefOr[String] = js.undefined
}

object Anon_Container {
  @scala.inline
  def apply(
    container: Element | String,
    scene: Scene,
    flightDuration: Int | Double = null,
    key: String = null,
    url: String = null
  ): Anon_Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], scene = scene)
    if (flightDuration != null) __obj.updateDynamic("flightDuration")(flightDuration.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Container]
  }
}

