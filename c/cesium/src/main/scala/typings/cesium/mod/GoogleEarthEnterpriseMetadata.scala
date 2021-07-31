package typings.cesium.mod

import typings.cesium.anon.Level
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @JSImport("cesium", "GoogleEarthEnterpriseMetadata")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def quadKeyToTileXY(quadkey: String): Level = ^.asInstanceOf[js.Dynamic].applyDynamic("quadKeyToTileXY")(quadkey.asInstanceOf[js.Any]).asInstanceOf[Level]
  
  /* static member */
  @scala.inline
  def tileXYToQuadKey(x: Double, y: Double, level: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("tileXYToQuadKey")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[String]
}
