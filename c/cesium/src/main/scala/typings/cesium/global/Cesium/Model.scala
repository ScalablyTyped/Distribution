package typings.cesium.global.Cesium

import typings.cesium.anon.AllowPicking
import typings.cesium.anon.Asynchronous
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.Model")
@js.native
class Model ()
  extends typings.cesium.mod.Model {
  def this(options: AllowPicking) = this()
}
object Model {
  
  @JSGlobal("Cesium.Model")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def fromGltf(options: Asynchronous): typings.cesium.mod.Model = ^.asInstanceOf[js.Dynamic].applyDynamic("fromGltf")(options.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Model]
  
  /* static member */
  inline def siluhouetteSupported(scene: typings.cesium.mod.Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("siluhouetteSupported")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
