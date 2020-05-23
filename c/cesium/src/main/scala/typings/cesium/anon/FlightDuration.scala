package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlightDuration extends js.Object {
  var flightDuration: js.UndefOr[Double] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var scene: typings.cesium.mod.Scene
  var url: js.UndefOr[String] = js.undefined
}

object FlightDuration {
  @scala.inline
  def apply(
    scene: typings.cesium.mod.Scene,
    flightDuration: js.UndefOr[Double] = js.undefined,
    key: String = null,
    url: String = null
  ): FlightDuration = {
    val __obj = js.Dynamic.literal(scene = scene.asInstanceOf[js.Any])
    if (!js.isUndefined(flightDuration)) __obj.updateDynamic("flightDuration")(flightDuration.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlightDuration]
  }
}

