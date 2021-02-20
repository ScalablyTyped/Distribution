package typings.cesium.mod

import typings.cesium.anon.Culture
import typings.cesium.anon.Level
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  /* static member */
  @JSImport("cesium", "BingMapsImageryProvider.quadKeyToTileXY")
  @js.native
  def quadKeyToTileXY(quadkey: String): Level = js.native
  
  /* static member */
  @JSImport("cesium", "BingMapsImageryProvider.tileXYToQuadKey")
  @js.native
  def tileXYToQuadKey(x: Double, y: Double, level: Double): String = js.native
}
