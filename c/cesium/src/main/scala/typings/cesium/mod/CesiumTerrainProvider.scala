package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CesiumTerrainProvider")
@js.native
class CesiumTerrainProvider protected () extends TerrainProvider {
  def this(options: typings.cesium.anon.Ellipsoid) = this()
  
  var requestVertexNormals: Boolean = js.native
  
  var requestWaterMask: Boolean = js.native
}
