package typings.cesium

import typings.cesium.mod.Ellipsoid
import typings.cesium.mod.TilingScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEllipsoid extends js.Object {
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var tilingScheme: js.UndefOr[TilingScheme] = js.undefined
}

object AnonEllipsoid {
  @scala.inline
  def apply(ellipsoid: Ellipsoid = null, tilingScheme: TilingScheme = null): AnonEllipsoid = {
    val __obj = js.Dynamic.literal()
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (tilingScheme != null) __obj.updateDynamic("tilingScheme")(tilingScheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEllipsoid]
  }
}

