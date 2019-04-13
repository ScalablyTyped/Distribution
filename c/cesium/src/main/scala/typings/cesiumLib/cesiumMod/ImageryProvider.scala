package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "ImageryProvider")
@js.native
abstract class ImageryProvider () extends js.Object {
  var credit: Credit = js.native
  var defaultAlpha: scala.Double = js.native
  var defaultBrightness: scala.Double = js.native
  var defaultContrast: scala.Double = js.native
  var defaultGamma: scala.Double = js.native
  var defaultHue: scala.Double = js.native
  var defaultMagnificationFilter: js.Any = js.native
  var defaultMinificationFilter: js.Any = js.native
  var defaultSaturation: scala.Double = js.native
  val errorEvent: Event[js.Array[_]] = js.native
  val hasAlphaChannel: scala.Boolean = js.native
  val maximumLevel: scala.Double = js.native
  val minimumLevel: scala.Double = js.native
  val proxy: Proxy = js.native
  val ready: scala.Boolean = js.native
  val readyPromise: js.Promise[scala.Boolean] = js.native
  val rectangle: Rectangle = js.native
  val tileDiscardPolicy: TileDiscardPolicy = js.native
  val tileHeight: scala.Double = js.native
  val tileWidth: scala.Double = js.native
  val tilingScheme: TilingScheme = js.native
  def getTileCredits(x: scala.Double, y: scala.Double, level: scala.Double): js.Array[Credit] = js.native
  def pickFeatures(
    x: scala.Double,
    y: scala.Double,
    level: scala.Double,
    longitude: scala.Double,
    latitude: scala.Double
  ): js.Promise[js.Array[ImageryLayerFeatureInfo]] = js.native
  def requestImage(x: scala.Double, y: scala.Double, level: scala.Double): js.Promise[stdLib.HTMLImageElement | stdLib.HTMLCanvasElement] = js.native
}

/* static members */
@JSImport("cesium", "ImageryProvider")
@js.native
object ImageryProvider extends js.Object {
  def loadImage(url: java.lang.String): js.Promise[stdLib.HTMLImageElement | stdLib.HTMLCanvasElement] = js.native
}

