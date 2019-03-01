package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleEarthEnterpriseMetadata extends js.Object {
  var imageryPresent: scala.Boolean
  var key: stdLib.ArrayBuffer
  var negativeAltitudeExponentBias: scala.Double
  var negativeAltitudeThreshold: scala.Double
  var protoImagery: scala.Boolean
  val proxy: Proxy
  val readyPromise: js.Promise[scala.Boolean]
  val resource: Resource
  var terrainPresent: scala.Boolean
  val url: java.lang.String
}

object GoogleEarthEnterpriseMetadata {
  @scala.inline
  def apply(
    imageryPresent: scala.Boolean,
    key: stdLib.ArrayBuffer,
    negativeAltitudeExponentBias: scala.Double,
    negativeAltitudeThreshold: scala.Double,
    protoImagery: scala.Boolean,
    proxy: Proxy,
    readyPromise: js.Promise[scala.Boolean],
    resource: Resource,
    terrainPresent: scala.Boolean,
    url: java.lang.String
  ): GoogleEarthEnterpriseMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("imageryPresent")(imageryPresent)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("negativeAltitudeExponentBias")(negativeAltitudeExponentBias)
    __obj.updateDynamic("negativeAltitudeThreshold")(negativeAltitudeThreshold)
    __obj.updateDynamic("protoImagery")(protoImagery)
    __obj.updateDynamic("proxy")(proxy)
    __obj.updateDynamic("readyPromise")(readyPromise)
    __obj.updateDynamic("resource")(resource)
    __obj.updateDynamic("terrainPresent")(terrainPresent)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GoogleEarthEnterpriseMetadata]
  }
}

