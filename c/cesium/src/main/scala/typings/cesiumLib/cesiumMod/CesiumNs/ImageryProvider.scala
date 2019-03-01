package typings
package cesiumLib.cesiumMod.CesiumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageryProvider extends js.Object {
  var credit: Credit
  var defaultAlpha: scala.Double
  var defaultBrightness: scala.Double
  var defaultContrast: scala.Double
  var defaultGamma: scala.Double
  var defaultHue: scala.Double
  var defaultMagnificationFilter: js.Any
  var defaultMinificationFilter: js.Any
  var defaultSaturation: scala.Double
  val errorEvent: Event
  val hasAlphaChannel: scala.Boolean
  val maximumLevel: scala.Double
  val minimumLevel: scala.Double
  val proxy: Proxy
  val ready: scala.Boolean
  val readyPromise: js.Promise[scala.Boolean]
  val rectangle: Rectangle
  val tileDiscardPolicy: TileDiscardPolicy
  val tileHeight: scala.Double
  val tileWidth: scala.Double
  val tilingScheme: TilingScheme
  def getTileCredits(x: scala.Double, y: scala.Double, level: scala.Double): js.Array[Credit]
  def pickFeatures(
    x: scala.Double,
    y: scala.Double,
    level: scala.Double,
    longitude: scala.Double,
    latitude: scala.Double
  ): js.Promise[js.Array[ImageryLayerFeatureInfo]]
  def requestImage(x: scala.Double, y: scala.Double, level: scala.Double): js.Promise[stdLib.HTMLImageElement | stdLib.HTMLCanvasElement]
}

object ImageryProvider {
  @scala.inline
  def apply(
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
    tilingScheme: TilingScheme
  ): ImageryProvider = {
    val __obj = js.Dynamic.literal()
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
    __obj.updateDynamic("pickFeatures")(pickFeatures)
    __obj.updateDynamic("proxy")(proxy)
    __obj.updateDynamic("ready")(ready)
    __obj.updateDynamic("readyPromise")(readyPromise)
    __obj.updateDynamic("rectangle")(rectangle)
    __obj.updateDynamic("requestImage")(requestImage)
    __obj.updateDynamic("tileDiscardPolicy")(tileDiscardPolicy)
    __obj.updateDynamic("tileHeight")(tileHeight)
    __obj.updateDynamic("tileWidth")(tileWidth)
    __obj.updateDynamic("tilingScheme")(tilingScheme)
    __obj.asInstanceOf[ImageryProvider]
  }
}

