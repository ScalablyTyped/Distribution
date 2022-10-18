package typings.cesium

import typings.cesium.anon.RequestVertexNormals
import typings.cesium.mod.CesiumTerrainProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreCreateWorldTerrainMod {
  
  @JSImport("cesium/Source/Core/createWorldTerrain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): CesiumTerrainProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[CesiumTerrainProvider]
  inline def default(options: RequestVertexNormals): CesiumTerrainProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[CesiumTerrainProvider]
}
