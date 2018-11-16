package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "BingMapsImageryProvider")
@js.native
class BingMapsImageryProvider protected ()
  extends cesiumLib.cesiumMod.CesiumNs.BingMapsImageryProvider {
  def this(options: cesiumLib.Anon_MapStyle) = this()
  /* CompleteClass */
  override var credit: cesiumLib.cesiumMod.CesiumNs.Credit = js.native
  /* CompleteClass */
  override val culture: java.lang.String = js.native
  /* CompleteClass */
  override var defaultAlpha: scala.Double = js.native
  /* CompleteClass */
  override var defaultBrightness: scala.Double = js.native
  /* CompleteClass */
  override var defaultContrast: scala.Double = js.native
  /* CompleteClass */
  override var defaultGamma: scala.Double = js.native
  /* CompleteClass */
  override var defaultHue: scala.Double = js.native
  /* CompleteClass */
  override var defaultMagnificationFilter: js.Any = js.native
  /* CompleteClass */
  override var defaultMinificationFilter: js.Any = js.native
  /* CompleteClass */
  override var defaultSaturation: scala.Double = js.native
  /* CompleteClass */
  override val errorEvent: cesiumLib.cesiumMod.CesiumNs.Event = js.native
  /* CompleteClass */
  override val hasAlphaChannel: scala.Boolean = js.native
  /* CompleteClass */
  override val key: java.lang.String = js.native
  /* CompleteClass */
  override val mapStyle: cesiumLib.cesiumMod.CesiumNs.BingMapsStyle = js.native
  /* CompleteClass */
  override val maximumLevel: scala.Double = js.native
  /* CompleteClass */
  override val minimumLevel: scala.Double = js.native
  /* CompleteClass */
  override val proxy: cesiumLib.cesiumMod.CesiumNs.Proxy = js.native
  /* CompleteClass */
  override val ready: scala.Boolean = js.native
  /* CompleteClass */
  override val readyPromise: stdLib.Promise[scala.Boolean] = js.native
  /* CompleteClass */
  override val rectangle: cesiumLib.cesiumMod.CesiumNs.Rectangle = js.native
  /* CompleteClass */
  override val tileDiscardPolicy: cesiumLib.cesiumMod.CesiumNs.TileDiscardPolicy = js.native
  /* CompleteClass */
  override val tileHeight: scala.Double = js.native
  /* CompleteClass */
  override val tileWidth: scala.Double = js.native
  /* CompleteClass */
  override val tilingScheme: cesiumLib.cesiumMod.CesiumNs.TilingScheme = js.native
  /* CompleteClass */
  override val url: java.lang.String = js.native
  /* CompleteClass */
  override def getTileCredits(x: scala.Double, y: scala.Double, level: scala.Double): js.Array[cesiumLib.cesiumMod.CesiumNs.Credit] = js.native
  /* CompleteClass */
  override def pickFeatures(
    x: scala.Double,
    y: scala.Double,
    level: scala.Double,
    longitude: scala.Double,
    latitude: scala.Double
  ): stdLib.Promise[js.Array[cesiumLib.cesiumMod.CesiumNs.ImageryLayerFeatureInfo]] = js.native
  /* CompleteClass */
  override def requestImage(x: scala.Double, y: scala.Double, level: scala.Double): stdLib.Promise[stdLib.HTMLImageElement | stdLib.HTMLCanvasElement] = js.native
}

@JSImport("cesium", "BingMapsImageryProvider")
@js.native
object BingMapsImageryProvider extends js.Object {
  def quadKeyToTileXY(quadkey: java.lang.String): cesiumLib.Anon_Level = js.native
  def tileXYToQuadKey(x: scala.Double, y: scala.Double, level: scala.Double): java.lang.String = js.native
}

