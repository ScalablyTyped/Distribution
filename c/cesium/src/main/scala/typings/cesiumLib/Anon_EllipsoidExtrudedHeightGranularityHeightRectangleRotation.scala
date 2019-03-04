package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EllipsoidExtrudedHeightGranularityHeightRectangleRotation extends js.Object {
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Ellipsoid] = js.undefined
  var extrudedHeight: js.UndefOr[scala.Double] = js.undefined
  var granularity: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle
  var rotation: js.UndefOr[scala.Double] = js.undefined
}

object Anon_EllipsoidExtrudedHeightGranularityHeightRectangleRotation {
  @scala.inline
  def apply(
    rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid = null,
    extrudedHeight: scala.Int | scala.Double = null,
    granularity: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    rotation: scala.Int | scala.Double = null
  ): Anon_EllipsoidExtrudedHeightGranularityHeightRectangleRotation = {
    val __obj = js.Dynamic.literal(rectangle = rectangle)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (extrudedHeight != null) __obj.updateDynamic("extrudedHeight")(extrudedHeight.asInstanceOf[js.Any])
    if (granularity != null) __obj.updateDynamic("granularity")(granularity.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EllipsoidExtrudedHeightGranularityHeightRectangleRotation]
  }
}

