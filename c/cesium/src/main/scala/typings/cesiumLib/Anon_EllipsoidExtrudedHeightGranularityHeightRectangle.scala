package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EllipsoidExtrudedHeightGranularityHeightRectangle extends js.Object {
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Ellipsoid] = js.undefined
  var extrudedHeight: js.UndefOr[scala.Double] = js.undefined
  var granularity: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle
  var rotation: js.UndefOr[scala.Double] = js.undefined
  var stRotation: js.UndefOr[scala.Double] = js.undefined
  var vertexFormat: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.VertexFormat] = js.undefined
}

object Anon_EllipsoidExtrudedHeightGranularityHeightRectangle {
  @scala.inline
  def apply(
    rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid = null,
    extrudedHeight: scala.Int | scala.Double = null,
    granularity: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    rotation: scala.Int | scala.Double = null,
    stRotation: scala.Int | scala.Double = null,
    vertexFormat: cesiumLib.cesiumMod.CesiumNs.VertexFormat = null
  ): Anon_EllipsoidExtrudedHeightGranularityHeightRectangle = {
    val __obj = js.Dynamic.literal(rectangle = rectangle)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (extrudedHeight != null) __obj.updateDynamic("extrudedHeight")(extrudedHeight.asInstanceOf[js.Any])
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (stRotation != null) __obj.updateDynamic("stRotation")(stRotation.asInstanceOf[js.Any])
    if (vertexFormat != null) __obj.updateDynamic("vertexFormat")(vertexFormat)
    __obj.asInstanceOf[Anon_EllipsoidExtrudedHeightGranularityHeightRectangle]
  }
}

