package typings.cesium

import typings.cesium.cesiumMod.Cartesian3
import typings.cesium.cesiumMod.Ellipsoid
import typings.cesium.cesiumMod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CenterEllipsoidExtrudedHeight extends js.Object {
  var center: Cartesian3
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var extrudedHeight: js.UndefOr[Double] = js.undefined
  var granularity: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var rotation: js.UndefOr[Double] = js.undefined
  var semiMajorAxis: Double
  var semiMinorAxis: Double
  var stRotation: js.UndefOr[Double] = js.undefined
  var vertexFormat: js.UndefOr[VertexFormat] = js.undefined
}

object Anon_CenterEllipsoidExtrudedHeight {
  @scala.inline
  def apply(
    center: Cartesian3,
    semiMajorAxis: Double,
    semiMinorAxis: Double,
    ellipsoid: Ellipsoid = null,
    extrudedHeight: Int | Double = null,
    granularity: Int | Double = null,
    height: Int | Double = null,
    rotation: Int | Double = null,
    stRotation: Int | Double = null,
    vertexFormat: VertexFormat = null
  ): Anon_CenterEllipsoidExtrudedHeight = {
    val __obj = js.Dynamic.literal(center = center, semiMajorAxis = semiMajorAxis, semiMinorAxis = semiMinorAxis)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (extrudedHeight != null) __obj.updateDynamic("extrudedHeight")(extrudedHeight.asInstanceOf[js.Any])
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (stRotation != null) __obj.updateDynamic("stRotation")(stRotation.asInstanceOf[js.Any])
    if (vertexFormat != null) __obj.updateDynamic("vertexFormat")(vertexFormat)
    __obj.asInstanceOf[Anon_CenterEllipsoidExtrudedHeight]
  }
}

