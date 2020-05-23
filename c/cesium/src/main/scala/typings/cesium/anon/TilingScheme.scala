package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TilingScheme extends js.Object {
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  var tilingScheme: js.UndefOr[typings.cesium.mod.TilingScheme] = js.undefined
}

object TilingScheme {
  @scala.inline
  def apply(
    ellipsoid: typings.cesium.mod.Ellipsoid = null,
    tilingScheme: typings.cesium.mod.TilingScheme = null
  ): TilingScheme = {
    val __obj = js.Dynamic.literal()
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (tilingScheme != null) __obj.updateDynamic("tilingScheme")(tilingScheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[TilingScheme]
  }
}

