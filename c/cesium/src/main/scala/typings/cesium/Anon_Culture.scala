package typings.cesium

import typings.cesium.cesiumMod.Ellipsoid
import typings.cesium.cesiumMod.Proxy
import typings.cesium.cesiumMod.TileDiscardPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Culture extends js.Object {
  var culture: js.UndefOr[String] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var mapStyle: js.UndefOr[String] = js.undefined
  var proxy: js.UndefOr[Proxy] = js.undefined
  var tileDiscardPolicy: js.UndefOr[TileDiscardPolicy] = js.undefined
  var tileProtocol: js.UndefOr[String] = js.undefined
  var url: String
}

object Anon_Culture {
  @scala.inline
  def apply(
    url: String,
    culture: String = null,
    ellipsoid: Ellipsoid = null,
    key: String = null,
    mapStyle: String = null,
    proxy: Proxy = null,
    tileDiscardPolicy: TileDiscardPolicy = null,
    tileProtocol: String = null
  ): Anon_Culture = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (culture != null) __obj.updateDynamic("culture")(culture.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (mapStyle != null) __obj.updateDynamic("mapStyle")(mapStyle.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (tileDiscardPolicy != null) __obj.updateDynamic("tileDiscardPolicy")(tileDiscardPolicy.asInstanceOf[js.Any])
    if (tileProtocol != null) __obj.updateDynamic("tileProtocol")(tileProtocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Culture]
  }
}

