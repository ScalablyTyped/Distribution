package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseBottom extends js.Object {
  var closeBottom: js.UndefOr[Boolean] = js.undefined
  var closeTop: js.UndefOr[Boolean] = js.undefined
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  var extrudedHeight: js.UndefOr[Double] = js.undefined
  var granularity: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var perPositionHeight: js.UndefOr[Boolean] = js.undefined
  var positions: js.Array[Cartesian3]
  var stRotation: js.UndefOr[Double] = js.undefined
  var vertexFormat: js.UndefOr[VertexFormat] = js.undefined
}

object CloseBottom {
  @scala.inline
  def apply(
    positions: js.Array[Cartesian3],
    closeBottom: js.UndefOr[Boolean] = js.undefined,
    closeTop: js.UndefOr[Boolean] = js.undefined,
    ellipsoid: typings.cesium.mod.Ellipsoid = null,
    extrudedHeight: js.UndefOr[Double] = js.undefined,
    granularity: js.UndefOr[Double] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    perPositionHeight: js.UndefOr[Boolean] = js.undefined,
    stRotation: js.UndefOr[Double] = js.undefined,
    vertexFormat: VertexFormat = null
  ): CloseBottom = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any])
    if (!js.isUndefined(closeBottom)) __obj.updateDynamic("closeBottom")(closeBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeTop)) __obj.updateDynamic("closeTop")(closeTop.get.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (!js.isUndefined(extrudedHeight)) __obj.updateDynamic("extrudedHeight")(extrudedHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(granularity)) __obj.updateDynamic("granularity")(granularity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(perPositionHeight)) __obj.updateDynamic("perPositionHeight")(perPositionHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stRotation)) __obj.updateDynamic("stRotation")(stRotation.get.asInstanceOf[js.Any])
    if (vertexFormat != null) __obj.updateDynamic("vertexFormat")(vertexFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseBottom]
  }
}

