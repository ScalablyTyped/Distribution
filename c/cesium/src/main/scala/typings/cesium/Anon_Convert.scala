package typings.cesium

import typings.cesium.cesiumMod.Cartesian3
import typings.cesium.cesiumMod.Matrix4
import typings.cesium.cesiumMod.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Convert extends js.Object {
  var convert: js.UndefOr[Boolean] = js.undefined
  var destination: js.UndefOr[Cartesian3 | Rectangle] = js.undefined
  var endTransform: js.UndefOr[Matrix4] = js.undefined
  var orientation: js.UndefOr[Anon_Direction | Anon_Heading] = js.undefined
}

object Anon_Convert {
  @scala.inline
  def apply(
    convert: js.UndefOr[Boolean] = js.undefined,
    destination: Cartesian3 | Rectangle = null,
    endTransform: Matrix4 = null,
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

