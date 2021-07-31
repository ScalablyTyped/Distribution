package typings.cesium.mod

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "QuantizedMeshTerrainData")
@js.native
class QuantizedMeshTerrainData protected () extends StObject {
  def this(options: typings.cesium.anon.BoundingSphere) = this()
  
  def createMesh(tilingScheme: TilingScheme, x: Double, y: Double, level: Double): js.Promise[TerrainMesh] = js.native
  
  def interpolateHeight(rectangle: Rectangle, longitude: Double, latitude: Double): Double = js.native
  
  def isChildAvailable(thisX: Double, thisY: Double, childX: Double, childY: Double): Boolean = js.native
  
  def upsample(
    tilingScheme: TilingScheme,
    thisX: Double,
    thisY: Double,
    thisLevel: Double,
    descendantX: Double,
    descendantY: Double,
    descendantLevel: Double
  ): js.Promise[QuantizedMeshTerrainData] = js.native
  
  def wasCreatedByUpsampling(): Boolean = js.native
  
  var waterMask: Uint8Array | HTMLImageElement | HTMLCanvasElement = js.native
}
