package typings.cesium.mod

import typings.cesium.mod.TerrainProvider.ErrorEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "TerrainProvider")
@js.native
open class TerrainProvider () extends StObject {
  
  /**
    * Gets an object that can be used to determine availability of terrain from this provider, such as
    * at points and in rectangles.  This function should not be called before
    * {@link TerrainProvider#ready} returns true.  This property may be undefined if availability
    * information is not available.
    */
  val availability: TileAvailability = js.native
  
  /**
    * Gets the credit to display when this terrain provider is active.  Typically this is used to credit
    * the source of the terrain. This function should
    * not be called before {@link TerrainProvider#ready} returns true.
    */
  val credit: Credit = js.native
  
  /**
    * Gets an event that is raised when the terrain provider encounters an asynchronous error..  By subscribing
    * to the event, you will be notified of the error and can potentially recover from it.  Event listeners
    * are passed an instance of {@link TileProviderError}.
    */
  val errorEvent: Event[ErrorEvent] = js.native
  
  /**
    * Gets the maximum geometric error allowed in a tile at a given level.  This function should not be
    * called before {@link TerrainProvider#ready} returns true.
    * @param level - The tile level for which to get the maximum geometric error.
    * @returns The maximum geometric error.
    */
  def getLevelMaximumGeometricError(level: Double): Double = js.native
  
  /**
    * Determines whether data for a tile is available to be loaded.
    * @param x - The X coordinate of the tile for which to request geometry.
    * @param y - The Y coordinate of the tile for which to request geometry.
    * @param level - The level of the tile for which to request geometry.
    * @returns Undefined if not supported by the terrain provider, otherwise true or false.
    */
  def getTileDataAvailable(x: Double, y: Double, level: Double): js.UndefOr[Boolean] = js.native
  
  /**
    * Gets a value indicating whether or not the requested tiles include vertex normals.
    * This function should not be called before {@link TerrainProvider#ready} returns true.
    */
  val hasVertexNormals: Boolean = js.native
  
  /**
    * Gets a value indicating whether or not the provider includes a water mask.  The water mask
    * indicates which areas of the globe are water rather than land, so they can be rendered
    * as a reflective surface with animated waves.  This function should not be
    * called before {@link TerrainProvider#ready} returns true.
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
    * Requests the geometry for a given tile.  This function should not be called before
    * {@link TerrainProvider#ready} returns true.  The result must include terrain data and
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
    * Gets the tiling scheme used by the provider.  This function should
    * not be called before {@link TerrainProvider#ready} returns true.
    */
  val tilingScheme: TilingScheme = js.native
}
/* static members */
object TerrainProvider {
  
  @JSImport("cesium", "TerrainProvider")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Determines an appropriate geometric error estimate when the geometry comes from a heightmap.
    * @param ellipsoid - The ellipsoid to which the terrain is attached.
    * @param tileImageWidth - The width, in pixels, of the heightmap associated with a single tile.
    * @param numberOfTilesAtLevelZero - The number of tiles in the horizontal direction at tile level zero.
    * @returns An estimated geometric error.
    */
  inline def getEstimatedLevelZeroGeometricErrorForAHeightmap(ellipsoid: Ellipsoid, tileImageWidth: Double, numberOfTilesAtLevelZero: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getEstimatedLevelZeroGeometricErrorForAHeightmap")(ellipsoid.asInstanceOf[js.Any], tileImageWidth.asInstanceOf[js.Any], numberOfTilesAtLevelZero.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Gets a list of indices for a triangle mesh representing a regular grid.  Calling
    * this function multiple times with the same grid width and height returns the
    * same list of indices.  The total number of vertices must be less than or equal
    * to 65536.
    * @param width - The number of vertices in the regular grid in the horizontal direction.
    * @param height - The number of vertices in the regular grid in the vertical direction.
    * @returns The list of indices. Uint16Array gets returned for 64KB or less and Uint32Array for 4GB or less.
    */
  inline def getRegularGridIndices(width: Double, height: Double): js.typedarray.Uint16Array | js.typedarray.Uint32Array = (^.asInstanceOf[js.Dynamic].applyDynamic("getRegularGridIndices")(width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint16Array | js.typedarray.Uint32Array]
  
  /**
    * Specifies the quality of terrain created from heightmaps.  A value of 1.0 will
    * ensure that adjacent heightmap vertices are separated by no more than
    * {@link Globe.maximumScreenSpaceError} screen pixels and will probably go very slowly.
    * A value of 0.5 will cut the estimated level zero geometric error in half, allowing twice the
    * screen pixels between adjacent heightmap vertices and thus rendering more quickly.
    */
  @JSImport("cesium", "TerrainProvider.heightmapTerrainQuality")
  @js.native
  def heightmapTerrainQuality: Double = js.native
  inline def heightmapTerrainQuality_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heightmapTerrainQuality")(x.asInstanceOf[js.Any])
  
  /**
    * A function that is called when an error occurs.
    * @param err - An object holding details about the error that occurred.
    */
  type ErrorEvent = js.ThisFunction1[/* this */ TerrainProvider, /* err */ TileProviderError, Unit]
}
