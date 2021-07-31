package typings.cesium.mod

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ImageryProvider")
@js.native
abstract class ImageryProvider () extends StObject {
  
  var credit: Credit = js.native
  
  var defaultAlpha: Double = js.native
  
  var defaultBrightness: Double = js.native
  
  var defaultContrast: Double = js.native
  
  var defaultGamma: Double = js.native
  
  var defaultHue: Double = js.native
  
  var defaultMagnificationFilter: js.Any = js.native
  
  var defaultMinificationFilter: js.Any = js.native
  
  var defaultSaturation: Double = js.native
  
  val errorEvent: Event[js.Array[js.Any]] = js.native
  
  def getTileCredits(x: Double, y: Double, level: Double): js.Array[Credit] = js.native
  
  val hasAlphaChannel: Boolean = js.native
  
  val maximumLevel: Double = js.native
  
  val minimumLevel: Double = js.native
  
  def pickFeatures(x: Double, y: Double, level: Double, longitude: Double, latitude: Double): js.UndefOr[js.Promise[js.Array[ImageryLayerFeatureInfo]]] = js.native
  
  val proxy: Proxy = js.native
  
  val ready: Boolean = js.native
  
  val readyPromise: js.Promise[Boolean] = js.native
  
  val rectangle: Rectangle = js.native
  
  def requestImage(x: Double, y: Double, level: Double): js.UndefOr[js.Promise[HTMLImageElement | HTMLCanvasElement]] = js.native
  def requestImage(x: Double, y: Double, level: Double, request: Request): js.UndefOr[js.Promise[HTMLImageElement | HTMLCanvasElement]] = js.native
  
  val tileDiscardPolicy: TileDiscardPolicy = js.native
  
  val tileHeight: Double = js.native
  
  val tileWidth: Double = js.native
  
  val tilingScheme: TilingScheme = js.native
}
object ImageryProvider {
  
  @JSImport("cesium", "ImageryProvider")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def loadImage(imageryProvider: ImageryProvider, url: String): js.UndefOr[js.Promise[HTMLImageElement | HTMLCanvasElement]] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadImage")(imageryProvider.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Promise[HTMLImageElement | HTMLCanvasElement]]]
}
