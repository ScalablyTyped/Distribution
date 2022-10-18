package typings.cesium

import typings.cesium.anon.Layers
import typings.cesium.mod.Material
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceSceneCreateElevationBandMaterialMod {
  
  @JSImport("cesium/Source/Scene/createElevationBandMaterial", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Layers): Material = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Material]
}
