package typings.cesium.global.Cesium

import typings.cesium.anon.BaseScreenSpaceError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.Cesium3DTileset")
@js.native
class Cesium3DTileset protected ()
  extends typings.cesium.mod.Cesium3DTileset {
  def this(Cesium3DTilesetItem: BaseScreenSpaceError) = this()
}
object Cesium3DTileset {
  
  @JSGlobal("Cesium.Cesium3DTileset")
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadJson(tilesetUrl: String): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadJson")(tilesetUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  /* static member */
  inline def loadJson(tilesetUrl: typings.cesium.mod.Resource): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadJson")(tilesetUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
}
