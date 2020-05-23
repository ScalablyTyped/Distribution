package typings.cesium.anon

import typings.cesium.mod.TileDiscardPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Culture extends js.Object {
  var culture: js.UndefOr[String] = js.undefined
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var mapStyle: js.UndefOr[String] = js.undefined
  var proxy: js.UndefOr[typings.cesium.mod.Proxy] = js.undefined
  var tileDiscardPolicy: js.UndefOr[TileDiscardPolicy] = js.undefined
  var tileProtocol: js.UndefOr[String] = js.undefined
  var url: String
}

object Culture {
  @scala.inline
  def apply(
    url: String,
    culture: String = null,
    ellipsoid: typings.cesium.mod.Ellipsoid = null,
    key: String = null,
    mapStyle: String = null,
    proxy: typings.cesium.mod.Proxy = null,
    tileDiscardPolicy: TileDiscardPolicy = null,
    tileProtocol: String = null
  ): Culture = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (culture != null) __obj.updateDynamic("culture")(culture.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (mapStyle != null) __obj.updateDynamic("mapStyle")(mapStyle.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (tileDiscardPolicy != null) __obj.updateDynamic("tileDiscardPolicy")(tileDiscardPolicy.asInstanceOf[js.Any])
    if (tileProtocol != null) __obj.updateDynamic("tileProtocol")(tileProtocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[Culture]
  }
}

