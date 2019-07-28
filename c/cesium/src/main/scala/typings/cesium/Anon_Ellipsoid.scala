package typings.cesium

import typings.cesium.cesiumMod.Ellipsoid
import typings.cesium.cesiumMod.TilingScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ellipsoid extends js.Object {
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var tilingScheme: js.UndefOr[TilingScheme] = js.undefined
}

object Anon_Ellipsoid {
  @scala.inline
  def apply(ellipsoid: Ellipsoid = null, tilingScheme: TilingScheme = null): Anon_Ellipsoid = {
    val __obj = js.Dynamic.literal()
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (tilingScheme != null) __obj.updateDynamic("tilingScheme")(tilingScheme)
    __obj.asInstanceOf[Anon_Ellipsoid]
  }
}

