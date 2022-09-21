package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CesiumTerrainProvider")
@js.native
open class CesiumTerrainProvider protected () extends StObject {
  def this(options: typings.cesium.anon.Credit) = this()
  
  /**
    * Gets an object that can be used to determine availability of terrain from this provider, such as
    * at points and in rectangles.  This function should not be called before
    * {@link CesiumTerrainProvider#ready} returns true.  This property may be undefined if availability
    * information is not available. Note that this reflects tiles that are known to be available currently.
    * Additional tiles may be discovered to be available in the future, e.g. if availability information
    * exists deeper in the tree rather than it all being discoverable at the root. However, a tile that
    * is available now will not become unavailable in the future.
    */
  val availability: TileAvailability = js.native
  
  /**
    * Gets the credit to display when this terrain provider is active.  Typically this is used to credit
    * the source of the terrain.  This function should not be called before {@link CesiumTerrainProvider#ready} returns true.
    */
  val credit: Credit = js.native
  
  /**
    * Gets an event that is raised when the terrain provider encounters an asynchronous error.  By subscribing
    * to the event, you will be notified of the error and can potentially recover from it.  Event listeners
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
    * @returns Undefined if not supported or availability is unknown, otherwise true or false.
    */
  def getTileDataAvailable(x: Double, y: Double, level: Double): js.UndefOr[Boolean] = js.native
  
  /**
    * Gets a value indicating whether or not the requested tiles include metadata.
    * This function should not be called before {@link CesiumTerrainProvider#ready} returns true.
    */
  val hasMetadata: Boolean = js.native
  
  /**
    * Gets a value indicating whether or not the requested tiles include vertex normals.
    * This function should not be called before {@link CesiumTerrainProvider#ready} returns true.
    */
  val hasVertexNormals: Boolean = js.native
  
  /**
    * Gets a value indicating whether or not the provider includes a water mask.  The water mask
    * indicates which areas of the globe are water rather than land, so they can be rendered
    * as a reflective surface with animated waves.  This function should not be
    * called before {@link CesiumTerrainProvider#ready} returns true.
    */
  val hasWaterMask: Boolean = js.native
  
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
    * Boolean flag that indicates if the client should request metadata from the server.
    * Metadata is appended to the standard tile mesh data only if the client requests the metadata and
    * if the server provides a metadata.
    */
  val requestMetadata: Boolean = js.native
  
  /**
    * Requests the geometry for a given tile.  This function should not be called before
    * {@link CesiumTerrainProvider#ready} returns true.  The result must include terrain data and
    * may optionally include a water mask and an indication of which child tiles are available.
    * @param x - The X coordinate of the tile for which to request geometry.
    * @param y - The Y coordinate of the tile for which to request geometry.
    * @param level - The level of the tile for which to request geometry.
    * @param [request] - The request object. Intended for internal use only.
    * @returns A promise for the requested geometry.  If this method
    *          returns undefined instead of a promise, it is an indication that too many requests are already
    *          pending and the request will be retried later.
    */
  def requestTileGeometry(x: Double, y: Double, level: Double): js.UndefOr[js.Promise[TerrainData]] = js.native
  def requestTileGeometry(x: Double, y: Double, level: Double, request: Request): js.UndefOr[js.Promise[TerrainData]] = js.native
  
  /**
    * Boolean flag that indicates if the client should request vertex normals from the server.
    * Vertex normals data is appended to the standard tile mesh data only if the client requests the vertex normals and
    * if the server provides vertex normals.
    */
  val requestVertexNormals: Boolean = js.native
  
  /**
    * Boolean flag that indicates if the client should request a watermask from the server.
    * Watermask data is appended to the standard tile mesh data only if the client requests the watermask and
    * if the server provides a watermask.
    */
  val requestWaterMask: Boolean = js.native
  
  /**
    * Gets the tiling scheme used by this provider.  This function should
    * not be called before {@link CesiumTerrainProvider#ready} returns true.
    */
  val tilingScheme: GeographicTilingScheme = js.native
}
