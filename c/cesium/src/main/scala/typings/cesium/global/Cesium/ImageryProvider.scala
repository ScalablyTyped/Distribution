package typings.cesium.global.Cesium

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.ImageryProvider")
@js.native
abstract class ImageryProvider ()
  extends typings.cesium.mod.ImageryProvider
object ImageryProvider {
  
  @JSGlobal("Cesium.ImageryProvider")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def loadImage(imageryProvider: typings.cesium.mod.ImageryProvider, url: String): js.UndefOr[js.Promise[HTMLImageElement | HTMLCanvasElement]] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadImage")(imageryProvider.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Promise[HTMLImageElement | HTMLCanvasElement]]]
}
