package typings.cesium.mod

import typings.cesium.anon.Culture
import typings.cesium.anon.Level
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "BingMapsImageryProvider")
@js.native
class BingMapsImageryProvider protected () extends ImageryProvider {
  def this(options: Culture) = this()
  
  val culture: String = js.native
  
  val key: String = js.native
  
  val mapStyle: BingMapsStyle = js.native
  
  val url: String = js.native
}
object BingMapsImageryProvider {
  
  @JSImport("cesium", "BingMapsImageryProvider")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def quadKeyToTileXY(quadkey: String): Level = ^.asInstanceOf[js.Dynamic].applyDynamic("quadKeyToTileXY")(quadkey.asInstanceOf[js.Any]).asInstanceOf[Level]
  
  /* static member */
  inline def tileXYToQuadKey(x: Double, y: Double, level: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("tileXYToQuadKey")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[String]
}
