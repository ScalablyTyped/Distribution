package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloseBottom extends js.Object {
  var closeBottom: js.UndefOr[scala.Boolean] = js.undefined
  var closeTop: js.UndefOr[scala.Boolean] = js.undefined
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.Ellipsoid] = js.undefined
  var extrudedHeight: js.UndefOr[scala.Double] = js.undefined
  var granularity: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var perPositionHeight: js.UndefOr[scala.Boolean] = js.undefined
  var positions: js.Array[cesiumLib.cesiumMod.Cartesian3]
  var stRotation: js.UndefOr[scala.Double] = js.undefined
  var vertexFormat: js.UndefOr[cesiumLib.cesiumMod.VertexFormat] = js.undefined
}

object Anon_CloseBottom {
  @scala.inline
  def apply(
    positions: js.Array[cesiumLib.cesiumMod.Cartesian3],
    closeBottom: js.UndefOr[scala.Boolean] = js.undefined,
    closeTop: js.UndefOr[scala.Boolean] = js.undefined,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid = null,
    extrudedHeight: scala.Int | scala.Double = null,
    granularity: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    perPositionHeight: js.UndefOr[scala.Boolean] = js.undefined,
    stRotation: scala.Int | scala.Double = null,
    vertexFormat: cesiumLib.cesiumMod.VertexFormat = null
  ): Anon_CloseBottom = {
    val __obj = js.Dynamic.literal(positions = positions)
    if (!js.isUndefined(closeBottom)) __obj.updateDynamic("closeBottom")(closeBottom)
    if (!js.isUndefined(closeTop)) __obj.updateDynamic("closeTop")(closeTop)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (extrudedHeight != null) __obj.updateDynamic("extrudedHeight")(extrudedHeight.asInstanceOf[js.Any])
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(perPositionHeight)) __obj.updateDynamic("perPositionHeight")(perPositionHeight)
    if (stRotation != null) __obj.updateDynamic("stRotation")(stRotation.asInstanceOf[js.Any])
    if (vertexFormat != null) __obj.updateDynamic("vertexFormat")(vertexFormat)
    __obj.asInstanceOf[Anon_CloseBottom]
  }
}

