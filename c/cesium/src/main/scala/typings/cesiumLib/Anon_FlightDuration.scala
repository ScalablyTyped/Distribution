package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FlightDuration extends js.Object {
  var flightDuration: js.UndefOr[scala.Double] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var scene: cesiumLib.cesiumMod.Scene
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_FlightDuration {
  @scala.inline
  def apply(
    scene: cesiumLib.cesiumMod.Scene,
    flightDuration: scala.Int | scala.Double = null,
    key: java.lang.String = null,
    url: java.lang.String = null
  ): Anon_FlightDuration = {
    val __obj = js.Dynamic.literal(scene = scene)
    if (flightDuration != null) __obj.updateDynamic("flightDuration")(flightDuration.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_FlightDuration]
  }
}

