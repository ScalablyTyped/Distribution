package typings.cesium.global.Cesium

import typings.cesium.anon.Level
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.GoogleEarthEnterpriseMetadata")
@js.native
class GoogleEarthEnterpriseMetadata protected ()
  extends typings.cesium.mod.GoogleEarthEnterpriseMetadata {
  def this(resourceOrUrl: String) = this()
  def this(resourceOrUrl: typings.cesium.mod.Resource) = this()
}
object GoogleEarthEnterpriseMetadata {
  
  @JSGlobal("Cesium.GoogleEarthEnterpriseMetadata")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def quadKeyToTileXY(quadkey: String): Level = ^.asInstanceOf[js.Dynamic].applyDynamic("quadKeyToTileXY")(quadkey.asInstanceOf[js.Any]).asInstanceOf[Level]
  
  /* static member */
  inline def tileXYToQuadKey(x: Double, y: Double, level: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("tileXYToQuadKey")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[String]
}
