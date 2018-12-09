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

