package typings.cesium.mod

import typings.cesium.anon.Level
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "GoogleEarthEnterpriseMetadata")
@js.native
class GoogleEarthEnterpriseMetadata protected () extends StObject {
  def this(resourceOrUrl: String) = this()
  def this(resourceOrUrl: Resource) = this()
  
  var imageryPresent: Boolean = js.native
  
  var key: ArrayBuffer = js.native
  
  var negativeAltitudeExponentBias: Double = js.native
  
  var negativeAltitudeThreshold: Double = js.native
  
  var protoImagery: Boolean = js.native
  
  val proxy: Proxy = js.native
  
  val readyPromise: js.Promise[Boolean] = js.native
  
  val resource: Resource = js.native
  
  var terrainPresent: Boolean = js.native
  
  val url: String = js.native
}
object GoogleEarthEnterpriseMetadata {
  
  /* static member */
  @JSImport("cesium", "GoogleEarthEnterpriseMetadata.quadKeyToTileXY")
  @js.native
  def quadKeyToTileXY(quadkey: String): Level = js.native
  
  /* static member */
  @JSImport("cesium", "GoogleEarthEnterpriseMetadata.tileXYToQuadKey")
  @js.native
  def tileXYToQuadKey(x: Double, y: Double, level: Double): String = js.native
}
