package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Credit extends js.Object {
  var credit: js.UndefOr[cesiumLib.cesiumMod.Credit | java.lang.String] = js.undefined
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.Ellipsoid] = js.undefined
  var proxy: js.UndefOr[js.Any] = js.undefined
  var tilingScheme: js.UndefOr[cesiumLib.cesiumMod.TilingScheme] = js.undefined
  var token: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
}

object Anon_Credit {
  @scala.inline
  def apply(
    url: java.lang.String,
    credit: cesiumLib.cesiumMod.Credit | java.lang.String = null,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid = null,
    proxy: js.Any = null,
    tilingScheme: cesiumLib.cesiumMod.TilingScheme = null,
    token: java.lang.String = null
  ): Anon_Credit = {
    val __obj = js.Dynamic.literal(url = url)
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (tilingScheme != null) __obj.updateDynamic("tilingScheme")(tilingScheme)
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[Anon_Credit]
  }
}

