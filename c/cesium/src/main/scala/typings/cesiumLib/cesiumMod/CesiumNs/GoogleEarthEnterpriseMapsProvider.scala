package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleEarthEnterpriseMapsProvider extends ImageryProvider {
  val channel: scala.Double
  val path: java.lang.String
  val requestType: java.lang.String
  val url: java.lang.String
  val version: scala.Double
}

object GoogleEarthEnterpriseMapsProvider {
  @scala.inline
  def apply(
    channel: scala.Double,
    credit: Credit,
    defaultAlpha: scala.Double,
    defaultBrightness: scala.Double,
    defaultContrast: scala.Double,
    defaultGamma: scala.Double,
    defaultHue: scala.Double,
    defaultMagnificationFilter: js.Any,
    defaultMinificationFilter: js.Any,
    defaultSaturation: scala.Double,
    errorEvent: Event,
    getTileCredits: (scala.Double, scala.Double, scala.Double) => js.Array[Credit],
    hasAlphaChannel: scala.Boolean,
    maximumLevel: scala.Double,
    minimumLevel: scala.Double,
    path: java.lang.String,
    pickFeatures: (scala.Double, scala.Double, scala.Double, scala.Double, scala.Double) => js.Promise[js.Array[ImageryLayerFeatureInfo]],
    proxy: Proxy,
    ready: scala.Boolean,
    readyPromise: js.Promise[scala.Boolean],
    rectangle: Rectangle,
    requestImage: (scala.Double, scala.Double, scala.Double) => js.Promise[stdLib.HTMLImageElement | stdLib.HTMLCanvasElement],
    requestType: java.lang.String,
    tileDiscardPolicy: TileDiscardPolicy,
    tileHeight: scala.Double,
    tileWidth: scala.Double,
    tilingScheme: TilingScheme,
    url: java.lang.String,
    version: scala.Double
  ): GoogleEarthEnterpriseMapsProvider = {
    val __obj = js.Dynamic.literal(channel = channel, credit = credit, defaultAlpha = defaultAlpha, defaultBrightness = defaultBrightness, defaultContrast = defaultContrast, defaultGamma = defaultGamma, defaultHue = defaultHue, defaultMagnificationFilter = defaultMagnificationFilter, defaultMinificationFilter = defaultMinificationFilter, defaultSaturation = defaultSaturation, errorEvent = errorEvent, getTileCredits = js.Any.fromFunction3(getTileCredits), hasAlphaChannel = hasAlphaChannel, maximumLevel = maximumLevel, minimumLevel = minimumLevel, path = path, pickFeatures = js.Any.fromFunction5(pickFeatures), proxy = proxy, ready = ready, readyPromise = readyPromise, rectangle = rectangle, requestImage = js.Any.fromFunction3(requestImage), requestType = requestType, tileDiscardPolicy = tileDiscardPolicy, tileHeight = tileHeight, tileWidth = tileWidth, tilingScheme = tilingScheme, url = url, version = version)
  
    __obj.asInstanceOf[GoogleEarthEnterpriseMapsProvider]
  }
}

