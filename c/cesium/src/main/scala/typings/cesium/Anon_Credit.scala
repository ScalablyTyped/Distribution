package typings.cesium

import typings.cesium.cesiumMod.Credit
import typings.cesium.cesiumMod.Ellipsoid
import typings.cesium.cesiumMod.TilingScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Credit extends js.Object {
  var credit: js.UndefOr[Credit | String] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var proxy: js.UndefOr[js.Any] = js.undefined
  var tilingScheme: js.UndefOr[TilingScheme] = js.undefined
  var token: js.UndefOr[String] = js.undefined
  var url: String
}

object Anon_Credit {
  @scala.inline
  def apply(
    url: String,
    credit: Credit | String = null,
    ellipsoid: Ellipsoid = null,
    proxy: js.Any = null,
    tilingScheme: TilingScheme = null,
    token: String = null
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

