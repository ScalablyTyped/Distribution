package typings.cesium.mod

import typings.cesium.anon.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CustomHeightmapTerrainProvider")
@js.native
open class CustomHeightmapTerrainProvider protected () extends StObject {
  def this(options: Callback) = this()
  
  /**
    * Gets the credit to display when this terrain provider is active. Typically this is used to credit
    * the source of the terrain.
    */
  val credit: Credit = js.native
  
  /**
    * Gets an event that is raised when the terrain provider encounters an asynchronous error. By subscribing
    * to the event, you will be notified of the error and can potentially recover from it. Event listeners
    * are passed an instance of {@link TileProviderError}.
    */
  val errorEvent: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets the maximum geometric error allowed in a tile at a given level.
    * @param level - The tile level for which to get the maximum geometric error.
    * @returns The maximum geometric error.
    */
  def getLevelMaximumGeometricError(level: Double): Double = js.native
  
  /**
    * Determines whether data for a tile is available to be loaded.
    * @param x - The X coordinate of the tile for which to request geometry.
    * @param y - The Y coordinate of the tile for which to request geometry.
    * @param level - The level of the tile for which to request geometry.
    * @returns Undefined if not supported, otherwise true or false.
    */
  def getTileDataAvailable(x: Double, y: Double, level: Double): js.UndefOr[Boolean] = js.native
  
  /**
    * Gets a value indicating whether or not the requested tiles include vertex normals.
    * Vertex normals are not supported by {@link CustomHeightmapTerrainProvider}, so the return
    * value will always be false.
    */
  val hasVertexNormals: Boolean = js.native
  
  /**
    * Gets a value indicating whether or not the provider includes a water mask. The water mask
    * indicates which areas of the globe are water rather than land, so they can be rendered
    * as a reflective surface with animated waves.
    * Water mask is not supported by {@link CustomHeightmapTerrainProvider}, so the return
    * value will always be false.
    */
  val hasWaterMask: Boolean = js.native
  
  /**
    * Gets the number of rows per heightmap tile.
    */
  val height: Boolean = js.native
  
  /**
    * Makes sure we load availability data for a tile
    * @param x - The X coordinate of the tile for which to request geometry.
    * @param y - The Y coordinate of the tile for which to request geometry.
    * @param level - The level of the tile for which to request geometry.
    * @returns Undefined if nothing need to be loaded or a Promise that resolves when all required tiles are loaded
    */
  def loadTileDataAvailability(x: Double, y: Double, level: Double): js.UndefOr[js.Promise[Unit]] = js.native
  
  /**
    * Gets a value indicating whether or not the provider is ready for use.
    */
  val ready: Boolean = js.native
  
  /**
    * Gets a promise that resolves to true when the provider is ready for use.
    */
  val readyPromise: js.Promise[Boolean] = js.native
  
  /**
    * Requests the geometry for a given tile. The result includes terrain
    * data and indicates that all child tiles are available.
    * @param x - The X coordinate of the tile for which to request geometry.
    * @param y - The Y coordinate of the tile for which to request geometry.
    * @param level - The level of the tile for which to request geometry.
    * @param [request] - The request object. Intended for internal use only.
    * @returns A promise for the requested geometry. If this method
    *          returns undefined instead of a promise, it is an indication that too many requests are already
    *          pending and the request will be retried later.
    */
  def requestTileGeometry(x: Double, y: Double, level: Double): js.UndefOr[js.Promise[TerrainData]] = js.native
  def requestTileGeometry(x: Double, y: Double, level: Double, request: Request): js.UndefOr[js.Promise[TerrainData]] = js.native
  
  /**
    * Gets the tiling scheme used by this provider.
    */
  val tilingScheme: TilingScheme = js.native
  
  /**
    * Gets the number of columns per heightmap tile.
    */
  val width: Boolean = js.native
}
object CustomHeightmapTerrainProvider {
  
  /**
    * @param x - The X coordinate of the tile for which to request geometry.
    * @param y - The Y coordinate of the tile for which to request geometry.
    * @param level - The level of the tile for which to request geometry.
    */
  type GeometryCallback = js.Function3[
    /* x */ Double, 
    /* y */ Double, 
    /* level */ Double, 
    js.UndefOr[
      js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array | js.Array[Double] | (js.Promise[
        js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array | js.Array[Double]
      ])
    ]
  ]
}
