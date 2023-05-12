package typings.cesiumEngine.mod

import typings.cesiumEngine.mod.CesiumTerrainProvider.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "ArcGISTiledElevationTerrainProvider")
@js.native
open class ArcGISTiledElevationTerrainProvider () extends StObject {
  def this(options: ConstructorOptions) = this()
  
  /**
    * Gets an object that can be used to determine availability of terrain from this provider, such as
    * at points and in rectangles. This property may be undefined if availability
    * information is not available.
    */
  val availability: TileAvailability = js.native
  
  /**
    * Gets the credit to display when this terrain provider is active.  Typically this is used to credit
    * the source of the terrain.
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
    * @returns Undefined if not supported, otherwise true or false.
    */
  def getTileDataAvailable(x: Double, y: Double, level: Double): js.UndefOr[Boolean] = js.native
  
  /**
    * Gets a value indicating whether or not the requested tiles include vertex normals.
    */
  val hasVertexNormals: Boolean = js.native
  
  /**
    * Gets a value indicating whether or not the provider includes a water mask.  The water mask
    * indicates which areas of the globe are water rather than land, so they can be rendered
    * as a reflective surface with animated waves.
    */
  val hasWaterMask: Boolean = js.native
  
  /**
    * Makes sure we load availability data for a tile
    * @param x - The X coordinate of the tile for which to request geometry.
    * @param y - The Y coordinate of the tile for which to request geometry.
    * @param level - The level of the tile for which to request geometry.
    * @returns This provider does not support loading availability.
    */
  def loadTileDataAvailability(x: Double, y: Double, level: Double): Unit = js.native
  
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
    * @returns A promise for the requested geometry.  If this method
    *          returns undefined instead of a promise, it is an indication that too many requests are already
    *          pending and the request will be retried later.
    */
  def requestTileGeometry(x: Double, y: Double, level: Double): js.UndefOr[js.Promise[TerrainData]] = js.native
  def requestTileGeometry(x: Double, y: Double, level: Double, request: Request): js.UndefOr[js.Promise[TerrainData]] = js.native
  
  /**
    * Gets the tiling scheme used by this provider.
    */
  val tilingScheme: GeographicTilingScheme = js.native
}
/* static members */
object ArcGISTiledElevationTerrainProvider {
  
  @JSImport("@cesium/engine", "ArcGISTiledElevationTerrainProvider")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromUrl(url: String): js.Promise[ArcGISTiledElevationTerrainProvider] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ArcGISTiledElevationTerrainProvider]]
  inline def fromUrl(
    url: String,
    options: typings.cesiumEngine.mod.ArcGISTiledElevationTerrainProvider.ConstructorOptions
  ): js.Promise[ArcGISTiledElevationTerrainProvider] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ArcGISTiledElevationTerrainProvider]]
  inline def fromUrl(url: js.Promise[Resource | String]): js.Promise[ArcGISTiledElevationTerrainProvider] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ArcGISTiledElevationTerrainProvider]]
  inline def fromUrl(
    url: js.Promise[Resource | String],
    options: typings.cesiumEngine.mod.ArcGISTiledElevationTerrainProvider.ConstructorOptions
  ): js.Promise[ArcGISTiledElevationTerrainProvider] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ArcGISTiledElevationTerrainProvider]]
  /**
    * Creates a {@link TerrainProvider} that produces terrain geometry by tessellating height maps
    * retrieved from Elevation Tiles of an an ArcGIS ImageService.
    * @example
    * const terrainProvider = await Cesium.ArcGISTiledElevationTerrainProvider.fromUrl("https://elevation3d.arcgis.com/arcgis/rest/services/WorldElevation3D/Terrain3D/ImageServer", {
    *   token: "KED1aF_I4UzXOHy3BnhwyBHU4l5oY6rO6walkmHoYqGp4XyIWUd5YZUC1ZrLAzvV40pR6gBXQayh0eFA8m6vPg.."
    * });
    * viewer.terrainProvider = terrainProvider;
    * @param url - The URL of the ArcGIS ImageServer service.
    * @param [options] - A url or an object describing initialization options.
    */
  inline def fromUrl(url: Resource): js.Promise[ArcGISTiledElevationTerrainProvider] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ArcGISTiledElevationTerrainProvider]]
  inline def fromUrl(
    url: Resource,
    options: typings.cesiumEngine.mod.ArcGISTiledElevationTerrainProvider.ConstructorOptions
  ): js.Promise[ArcGISTiledElevationTerrainProvider] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ArcGISTiledElevationTerrainProvider]]
  
  /**
    * Initialization options for the ArcGISTiledElevationTerrainProvider constructor
    * @property [token] - The authorization token to use to connect to the service.
    * @property [ellipsoid] - The ellipsoid.  If the tilingScheme is specified,
    *                    this parameter is ignored and the tiling scheme's ellipsoid is used instead.
    *                    If neither parameter is specified, the WGS84 ellipsoid is used.
    * @property [url] - The URL of the ArcGIS ImageServer service. Deprecated.
    */
  trait ConstructorOptions extends StObject {
    
    var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[Resource | String | (js.Promise[Resource | String])] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(): typings.cesiumEngine.mod.ArcGISTiledElevationTerrainProvider.ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.cesiumEngine.mod.ArcGISTiledElevationTerrainProvider.ConstructorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.cesiumEngine.mod.ArcGISTiledElevationTerrainProvider.ConstructorOptions] (val x: Self) extends AnyVal {
      
      inline def setEllipsoid(value: Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
      
      inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setUrl(value: Resource | String | (js.Promise[Resource | String])): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
