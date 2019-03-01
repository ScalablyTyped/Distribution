package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClampToGroundEllipsoid extends js.Object {
  var clampToGround: js.UndefOr[scala.Boolean] = js.undefined
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Ellipsoid] = js.undefined
  var sourceUri: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ClampToGroundEllipsoid {
  @scala.inline
  def apply(
    clampToGround: js.UndefOr[scala.Boolean] = js.undefined,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid = null,
    sourceUri: java.lang.String = null
  ): Anon_ClampToGroundEllipsoid = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clampToGround)) __obj.updateDynamic("clampToGround")(clampToGround)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (sourceUri != null) __obj.updateDynamic("sourceUri")(sourceUri)
    __obj.asInstanceOf[Anon_ClampToGroundEllipsoid]
  }
}

