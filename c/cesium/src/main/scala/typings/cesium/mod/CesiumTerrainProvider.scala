package typings.cesium.mod

import typings.cesium.mod.CesiumTerrainProvider.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CesiumTerrainProvider")
@js.native
open class CesiumTerrainProvider () extends StObject {
  def this(options: ConstructorOptions) = this()
  
  /**
    * Gets an object that can be used to determine availability of terrain from this provider, such as
    * at points and in rectangles. This property may be undefined if availability
    * information is not available. Note that this reflects tiles that are known to be available currently.
    * Additional tiles may be discovered to be available in the future, e.g. if availability information
    * exists deeper in the tree rather than it all being discoverable at the root. However, a tile that
    * is available now will not become unavailable in the future.
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
    * @returns Undefined if not supported or availability is unknown, otherwise true or false.
    */
  def getTileDataAvailable(x: Double, y: Double, level: Double): js.UndefOr[Boolean] = js.native
  
  /**
    * Gets a value indicating whether or not the requested tiles include metadata.
    */
  val hasMetadata: Boolean = js.native
  
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
    * Requests the geometry for a given tile. The result must include terrain data and
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
    * Gets the tiling scheme used by this provider.
    */
  val tilingScheme: GeographicTilingScheme = js.native
}
/* static members */
object CesiumTerrainProvider {
  
  @JSImport("cesium", "CesiumTerrainProvider")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a {@link TerrainProvider} from a Cesium ion asset ID that accesses terrain data in a Cesium terrain format
    * Terrain formats can be one of the following:
    * <ul>
    * <li> {@link https://github.com/AnalyticalGraphicsInc/quantized-mesh Quantized Mesh} </li>
    * <li> {@link https://github.com/AnalyticalGraphicsInc/cesium/wiki/heightmap-1.0 Height Map} </li>
    * </ul>
    * @example
    * // Create Arctic DEM terrain with normals.
    * try {
    *   const viewer = new Cesium.Viewer("cesiumContainer", {
    *     terrainProvider: await Cesium.CesiumTerrainProvider.fromIonAssetId(3956, {
    *         requestVertexNormals: true
    *     })
    *   });
    * } catch (error) {
    *   console.log(error);
    * }
    * @param assetId - The Cesium ion asset id.
    * @param [options] - An object describing initialization options.
    */
  inline def fromIonAssetId(assetId: Double): js.Promise[CesiumTerrainProvider] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIonAssetId")(assetId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CesiumTerrainProvider]]
  inline def fromIonAssetId(assetId: Double, options: ConstructorOptions): js.Promise[CesiumTerrainProvider] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromIonAssetId")(assetId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CesiumTerrainProvider]]
  
  inline def fromUrl(url: String): js.Promise[CesiumTerrainProvider] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CesiumTerrainProvider]]
  inline def fromUrl(url: String, options: ConstructorOptions): js.Promise[CesiumTerrainProvider] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CesiumTerrainProvider]]
  inline def fromUrl(url: js.Promise[Resource | String]): js.Promise[CesiumTerrainProvider] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CesiumTerrainProvider]]
  inline def fromUrl(url: js.Promise[Resource | String], options: ConstructorOptions): js.Promise[CesiumTerrainProvider] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CesiumTerrainProvider]]
  /**
    * Creates a {@link TerrainProvider} that accesses terrain data in a Cesium terrain format.
    * Terrain formats can be one of the following:
    * <ul>
    * <li> {@link https://github.com/AnalyticalGraphicsInc/quantized-mesh Quantized Mesh} </li>
    * <li> {@link https://github.com/AnalyticalGraphicsInc/cesium/wiki/heightmap-1.0 Height Map} </li>
    * </ul>
    * @example
    * // Create Arctic DEM terrain with normals.
    * try {
    *   const viewer = new Cesium.Viewer("cesiumContainer", {
    *     terrainProvider: await Cesium.CesiumTerrainProvider.fromUrl(
    *       Cesium.IonResource.fromAssetId(3956), {
    *         requestVertexNormals: true
    *     })
    *   });
    * } catch (error) {
    *   console.log(error);
    * }
    * @param url - The URL of the Cesium terrain server.
    * @param [options] - An object describing initialization options.
    */
  inline def fromUrl(url: Resource): js.Promise[CesiumTerrainProvider] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CesiumTerrainProvider]]
  inline def fromUrl(url: Resource, options: ConstructorOptions): js.Promise[CesiumTerrainProvider] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CesiumTerrainProvider]]
  
  /**
    * Initialization options for the CesiumTerrainProvider constructor
    * @property [requestVertexNormals = false] - Flag that indicates if the client should request additional lighting information from the server, in the form of per vertex normals if available.
    * @property [requestWaterMask = false] - Flag that indicates if the client should request per tile water masks from the server, if available.
    * @property [requestMetadata = true] - Flag that indicates if the client should request per tile metadata from the server, if available.
    * @property [ellipsoid] - The ellipsoid.  If not specified, the WGS84 ellipsoid is used.
    * @property [credit] - A credit for the data source, which is displayed on the canvas.
    * @property [url] - The URL of the Cesium terrain server. Deprecated.
    */
  trait ConstructorOptions extends StObject {
    
    var credit: js.UndefOr[Credit | String] = js.undefined
    
    var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
    
    var requestMetadata: js.UndefOr[Boolean] = js.undefined
    
    var requestVertexNormals: js.UndefOr[Boolean] = js.undefined
    
    var requestWaterMask: js.UndefOr[Boolean] = js.undefined
    
    var url: js.UndefOr[Resource | String | (js.Promise[Resource | String])] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
      
      inline def setCredit(value: Credit | String): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
      
      inline def setCreditUndefined: Self = StObject.set(x, "credit", js.undefined)
      
      inline def setEllipsoid(value: Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
      
      inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
      
      inline def setRequestMetadata(value: Boolean): Self = StObject.set(x, "requestMetadata", value.asInstanceOf[js.Any])
      
      inline def setRequestMetadataUndefined: Self = StObject.set(x, "requestMetadata", js.undefined)
      
      inline def setRequestVertexNormals(value: Boolean): Self = StObject.set(x, "requestVertexNormals", value.asInstanceOf[js.Any])
      
      inline def setRequestVertexNormalsUndefined: Self = StObject.set(x, "requestVertexNormals", js.undefined)
      
      inline def setRequestWaterMask(value: Boolean): Self = StObject.set(x, "requestWaterMask", value.asInstanceOf[js.Any])
      
      inline def setRequestWaterMaskUndefined: Self = StObject.set(x, "requestWaterMask", js.undefined)
      
      inline def setUrl(value: Resource | String | (js.Promise[Resource | String])): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
