package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Convert extends js.Object {
  var convert: js.UndefOr[Boolean] = js.undefined
  var destination: js.UndefOr[Cartesian3 | typings.cesium.mod.Rectangle] = js.undefined
  var endTransform: js.UndefOr[Matrix4] = js.undefined
  var orientation: js.UndefOr[Direction | Heading] = js.undefined
}

object Convert {
  @scala.inline
  def apply(
    convert: js.UndefOr[Boolean] = js.undefined,
    destination: Cartesian3 | typings.cesium.mod.Rectangle = null,
    endTransform: Matrix4 = null,
    orientation: Direction | Heading = null
  ): Convert = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(convert)) __obj.updateDynamic("convert")(convert.get.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (endTransform != null) __obj.updateDynamic("endTransform")(endTransform.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Convert]
  }
}

