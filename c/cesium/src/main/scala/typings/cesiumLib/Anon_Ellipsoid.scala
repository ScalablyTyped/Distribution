package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ellipsoid extends js.Object {
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Ellipsoid] = js.undefined
  var tilingScheme: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.TilingScheme] = js.undefined
}

object Anon_Ellipsoid {
  @scala.inline
  def apply(
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid = null,
    tilingScheme: cesiumLib.cesiumMod.CesiumNs.TilingScheme = null
  ): Anon_Ellipsoid = {
    val __obj = js.Dynamic.literal()
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (tilingScheme != null) __obj.updateDynamic("tilingScheme")(tilingScheme)
    __obj.asInstanceOf[Anon_Ellipsoid]
  }
}

