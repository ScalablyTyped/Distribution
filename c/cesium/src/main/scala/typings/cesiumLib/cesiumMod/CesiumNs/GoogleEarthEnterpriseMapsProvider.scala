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
    getTileCredits: js.Function3[scala.Double, scala.Double, scala.Double, js.Array[Credit]],
    hasAlphaChannel: scala.Boolean,
    maximumLevel: scala.Double,
    minimumLevel: scala.Double,
    path: java.lang.String,
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
    requestType: java.lang.String,
    tileDiscardPolicy: TileDiscardPolicy,
    tileHeight: scala.Double,
    tileWidth: scala.Double,
    tilingScheme: TilingScheme,
    url: java.lang.String,
    version: scala.Double
  ): GoogleEarthEnterpriseMapsProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("channel")(channel)
    __obj.updateDynamic("credit")(credit)
    __obj.updateDynamic("defaultAlpha")(defaultAlpha)
    __obj.updateDynamic("defaultBrightness")(defaultBrightness)
    __obj.updateDynamic("defaultContrast")(defaultContrast)
    __obj.updateDynamic("defaultGamma")(defaultGamma)
    __obj.updateDynamic("defaultHue")(defaultHue)
    __obj.updateDynamic("defaultMagnificationFilter")(defaultMagnificationFilter)
    __obj.updateDynamic("defaultMinificationFilter")(defaultMinificationFilter)
    __obj.updateDynamic("defaultSaturation")(defaultSaturation)
    __obj.updateDynamic("errorEvent")(errorEvent)
    __obj.updateDynamic("getTileCredits")(getTileCredits)
    __obj.updateDynamic("hasAlphaChannel")(hasAlphaChannel)
    __obj.updateDynamic("maximumLevel")(maximumLevel)
    __obj.updateDynamic("minimumLevel")(minimumLevel)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("pickFeatures")(pickFeatures)
    __obj.updateDynamic("proxy")(proxy)
    __obj.updateDynamic("ready")(ready)
    __obj.updateDynamic("readyPromise")(readyPromise)
    __obj.updateDynamic("rectangle")(rectangle)
    __obj.updateDynamic("requestImage")(requestImage)
    __obj.updateDynamic("requestType")(requestType)
    __obj.updateDynamic("tileDiscardPolicy")(tileDiscardPolicy)
    __obj.updateDynamic("tileHeight")(tileHeight)
    __obj.updateDynamic("tileWidth")(tileWidth)
    __obj.updateDynamic("tilingScheme")(tilingScheme)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[GoogleEarthEnterpriseMapsProvider]
  }
}

