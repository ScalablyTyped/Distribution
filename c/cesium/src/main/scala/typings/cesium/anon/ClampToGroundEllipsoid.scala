package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClampToGroundEllipsoid extends js.Object {
  var clampToGround: js.UndefOr[Boolean] = js.undefined
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  var sourceUri: js.UndefOr[String] = js.undefined
}

object ClampToGroundEllipsoid {
  @scala.inline
  def apply(
    clampToGround: js.UndefOr[Boolean] = js.undefined,
    ellipsoid: typings.cesium.mod.Ellipsoid = null,
    sourceUri: String = null
  ): ClampToGroundEllipsoid = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clampToGround)) __obj.updateDynamic("clampToGround")(clampToGround.get.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (sourceUri != null) __obj.updateDynamic("sourceUri")(sourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClampToGroundEllipsoid]
  }
}

