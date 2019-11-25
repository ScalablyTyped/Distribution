package typings.cesium

import typings.cesium.cesiumMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FlightDuration extends js.Object {
  var flightDuration: js.UndefOr[Double] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var scene: Scene
  var url: js.UndefOr[String] = js.undefined
}

object Anon_FlightDuration {
  @scala.inline
  def apply(scene: Scene, flightDuration: Int | Double = null, key: String = null, url: String = null): Anon_FlightDuration = {
    val __obj = js.Dynamic.literal(scene = scene.asInstanceOf[js.Any])
    if (flightDuration != null) __obj.updateDynamic("flightDuration")(flightDuration.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FlightDuration]
  }
}

