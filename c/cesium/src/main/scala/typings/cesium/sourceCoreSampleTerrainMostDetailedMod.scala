package typings.cesium

import typings.cesium.mod.Cartographic
import typings.cesium.mod.TerrainProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreSampleTerrainMostDetailedMod {
  
  @JSImport("cesium/Source/Core/sampleTerrainMostDetailed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(terrainProvider: TerrainProvider, positions: js.Array[Cartographic]): js.Promise[js.Array[Cartographic]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(terrainProvider.asInstanceOf[js.Any], positions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Cartographic]]]
}
