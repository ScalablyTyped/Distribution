package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CenterEllipsoidExtrudedHeight extends js.Object {
  var center: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Ellipsoid] = js.undefined
  var extrudedHeight: js.UndefOr[scala.Double] = js.undefined
  var granularity: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var rotation: js.UndefOr[scala.Double] = js.undefined
  var semiMajorAxis: scala.Double
  var semiMinorAxis: scala.Double
  var stRotation: js.UndefOr[scala.Double] = js.undefined
  var vertexFormat: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.VertexFormat] = js.undefined
}

object Anon_CenterEllipsoidExtrudedHeight {
  @scala.inline
  def apply(
    center: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    semiMajorAxis: scala.Double,
    semiMinorAxis: scala.Double,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid = null,
    extrudedHeight: scala.Int | scala.Double = null,
    granularity: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    rotation: scala.Int | scala.Double = null,
    stRotation: scala.Int | scala.Double = null,
    vertexFormat: cesiumLib.cesiumMod.CesiumNs.VertexFormat = null
  ): Anon_CenterEllipsoidExtrudedHeight = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("center")(center)
    __obj.updateDynamic("semiMajorAxis")(semiMajorAxis)
    __obj.updateDynamic("semiMinorAxis")(semiMinorAxis)
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

