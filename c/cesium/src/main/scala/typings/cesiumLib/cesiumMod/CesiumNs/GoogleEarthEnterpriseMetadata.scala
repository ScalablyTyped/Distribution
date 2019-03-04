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
    val __obj = js.Dynamic.literal(imageryPresent = imageryPresent, key = key, negativeAltitudeExponentBias = negativeAltitudeExponentBias, negativeAltitudeThreshold = negativeAltitudeThreshold, protoImagery = protoImagery, proxy = proxy, readyPromise = readyPromise, resource = resource, terrainPresent = terrainPresent, url = url)
  
    __obj.asInstanceOf[GoogleEarthEnterpriseMetadata]
  }
}

