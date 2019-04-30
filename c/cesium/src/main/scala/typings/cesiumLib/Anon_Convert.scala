package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Convert extends js.Object {
  var convert: js.UndefOr[scala.Boolean] = js.undefined
  var destination: js.UndefOr[cesiumLib.cesiumMod.Cartesian3 | cesiumLib.cesiumMod.Rectangle] = js.undefined
  var endTransform: js.UndefOr[cesiumLib.cesiumMod.Matrix4] = js.undefined
  var orientation: js.UndefOr[Anon_Direction | Anon_Heading] = js.undefined
}

object Anon_Convert {
  @scala.inline
  def apply(
    convert: js.UndefOr[scala.Boolean] = js.undefined,
    destination: cesiumLib.cesiumMod.Cartesian3 | cesiumLib.cesiumMod.Rectangle = null,
    endTransform: cesiumLib.cesiumMod.Matrix4 = null,
    orientation: Anon_Direction | Anon_Heading = null
  ): Anon_Convert = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(convert)) __obj.updateDynamic("convert")(convert)
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (endTransform != null) __obj.updateDynamic("endTransform")(endTransform)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Convert]
  }
}

