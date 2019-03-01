package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Culture extends js.Object {
  var culture: js.UndefOr[java.lang.String] = js.undefined
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Ellipsoid] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var mapStyle: js.UndefOr[java.lang.String] = js.undefined
  var proxy: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Proxy] = js.undefined
  var tileDiscardPolicy: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.TileDiscardPolicy] = js.undefined
  var tileProtocol: js.UndefOr[java.lang.String] = js.undefined
  var url: java.lang.String
}

object Anon_Culture {
  @scala.inline
  def apply(
    url: java.lang.String,
    culture: java.lang.String = null,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid = null,
    key: java.lang.String = null,
    mapStyle: java.lang.String = null,
    proxy: cesiumLib.cesiumMod.CesiumNs.Proxy = null,
    tileDiscardPolicy: cesiumLib.cesiumMod.CesiumNs.TileDiscardPolicy = null,
    tileProtocol: java.lang.String = null
  ): Anon_Culture = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (culture != null) __obj.updateDynamic("culture")(culture)
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (key != null) __obj.updateDynamic("key")(key)
    if (mapStyle != null) __obj.updateDynamic("mapStyle")(mapStyle)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (tileDiscardPolicy != null) __obj.updateDynamic("tileDiscardPolicy")(tileDiscardPolicy)
    if (tileProtocol != null) __obj.updateDynamic("tileProtocol")(tileProtocol)
    __obj.asInstanceOf[Anon_Culture]
  }
}

