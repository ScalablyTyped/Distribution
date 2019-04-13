package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Destination extends js.Object {
  var destination: js.UndefOr[cesiumLib.cesiumMod.Cartesian3 | cesiumLib.cesiumMod.Rectangle] = js.undefined
  var endTransform: js.UndefOr[cesiumLib.cesiumMod.Matrix4] = js.undefined
  var orientation: js.UndefOr[js.Any] = js.undefined
}

object Anon_Destination {
  @scala.inline
  def apply(
    destination: cesiumLib.cesiumMod.Cartesian3 | cesiumLib.cesiumMod.Rectangle = null,
    endTransform: cesiumLib.cesiumMod.Matrix4 = null,
    orientation: js.Any = null
  ): Anon_Destination = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (endTransform != null) __obj.updateDynamic("endTransform")(endTransform)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation)
    __obj.asInstanceOf[Anon_Destination]
  }
}

