package typings.cesium

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.Ellipsoid
import typings.cesium.mod.VertexFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCenterEllipsoidExtrudedHeight extends js.Object {
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

object AnonCenterEllipsoidExtrudedHeight {
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
  ): AnonCenterEllipsoidExtrudedHeight = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], semiMajorAxis = semiMajorAxis.asInstanceOf[js.Any], semiMinorAxis = semiMinorAxis.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (extrudedHeight != null) __obj.updateDynamic("extrudedHeight")(extrudedHeight.asInstanceOf[js.Any])
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (stRotation != null) __obj.updateDynamic("stRotation")(stRotation.asInstanceOf[js.Any])
    if (vertexFormat != null) __obj.updateDynamic("vertexFormat")(vertexFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCenterEllipsoidExtrudedHeight]
  }
}

