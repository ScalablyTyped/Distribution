package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Container extends js.Object {
  var container: stdLib.Element | java.lang.String
  var flightDuration: js.UndefOr[scala.Double] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var scene: cesiumLib.cesiumMod.CesiumNs.Scene
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Container {
  @scala.inline
  def apply(
    container: stdLib.Element | java.lang.String,
    scene: cesiumLib.cesiumMod.CesiumNs.Scene,
    flightDuration: scala.Int | scala.Double = null,
    key: java.lang.String = null,
    url: java.lang.String = null
  ): Anon_Container = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    __obj.updateDynamic("scene")(scene)
    if (flightDuration != null) __obj.updateDynamic("flightDuration")(flightDuration.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Anon_Container]
  }
}

