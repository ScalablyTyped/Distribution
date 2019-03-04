package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BingMapsImageryProvider extends ImageryProvider {
  val culture: java.lang.String
  val key: java.lang.String
  val mapStyle: BingMapsStyle
  val url: java.lang.String
}

object BingMapsImageryProvider {
  @scala.inline
  def apply(
    credit: Credit,
    culture: java.lang.String,
    defaultAlpha: scala.Double,
    defaultBrightness: scala.Double,
    defaultContrast: scala.Double,
    defaultGamma: scala.Double,
    defaultHue: scala.Double,
    defaultMagnificationFilter: js.Any,
    defaultMinificationFilter: js.Any,
    defaultSaturation: scala.Double,
    errorEvent: Event,
    getTileCredits: js.Function3[scala.Double, scala.Double, scala.Double, js.Array[Credit]],
    hasAlphaChannel: scala.Boolean,
    key: java.lang.String,
    mapStyle: BingMapsStyle,
    maximumLevel: scala.Double,
    minimumLevel: scala.Double,
    pickFeatures: js.Function5[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      scala.Double, 
      js.Promise[js.Array[ImageryLayerFeatureInfo]]
    ],
    proxy: Proxy,
    ready: scala.Boolean,
    readyPromise: js.Promise[scala.Boolean],
    rectangle: Rectangle,
    requestImage: js.Function3[
      scala.Double, 
      scala.Double, 
      scala.Double, 
      js.Promise[stdLib.HTMLImageElement | stdLib.HTMLCanvasElement]
    ],
    tileDiscardPolicy: TileDiscardPolicy,
    tileHeight: scala.Double,
    tileWidth: scala.Double,
    tilingScheme: TilingScheme,
    url: java.lang.String
  ): BingMapsImageryProvider = {
    val __obj = js.Dynamic.literal(credit = credit, culture = culture, defaultAlpha = defaultAlpha, defaultBrightness = defaultBrightness, defaultContrast = defaultContrast, defaultGamma = defaultGamma, defaultHue = defaultHue, defaultMagnificationFilter = defaultMagnificationFilter, defaultMinificationFilter = defaultMinificationFilter, defaultSaturation = defaultSaturation, errorEvent = errorEvent, getTileCredits = getTileCredits, hasAlphaChannel = hasAlphaChannel, key = key, mapStyle = mapStyle, maximumLevel = maximumLevel, minimumLevel = minimumLevel, pickFeatures = pickFeatures, proxy = proxy, ready = ready, readyPromise = readyPromise, rectangle = rectangle, requestImage = requestImage, tileDiscardPolicy = tileDiscardPolicy, tileHeight = tileHeight, tileWidth = tileWidth, tilingScheme = tilingScheme, url = url)
  
    __obj.asInstanceOf[BingMapsImageryProvider]
  }
}

