package typings.cesium.global.Cesium

import typings.cesium.anon.Attenuation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.PointCloudShading")
@js.native
class PointCloudShading ()
  extends typings.cesium.mod.PointCloudShading {
  def this(option: Attenuation) = this()
}
/* static members */
object PointCloudShading {
  
  @JSGlobal("Cesium.PointCloudShading")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isSupported(scene: typings.cesium.mod.Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
