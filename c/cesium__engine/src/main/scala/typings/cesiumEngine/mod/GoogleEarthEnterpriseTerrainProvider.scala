package typings.cesiumEngine.mod

import typings.cesiumEngine.mod.GoogleEarthEnterpriseTerrainProvider.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "GoogleEarthEnterpriseTerrainProvider")
@js.native
open class GoogleEarthEnterpriseTerrainProvider protected () extends StObject {
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
    * Gets an event that is raised when the imagery provider encounters an asynchronous error.  By subscribing
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
    */
  def loadTileDataAvailability(x: Double, y: Double, level: Double): Unit = js.native
  
  /**
    * Gets the proxy used by this provider.
    */
  val proxy: Proxy = js.native
  
  /**
    * Gets a value indicating whether or not the provider is ready for use.
    */
  val ready: Boolean = js.native
  
  /**
    * Gets a promise that resolves to true when the provider is ready for use.
    */
  val readyPromise: js.Promise[Boolean] = js.native
  
  /**
    * Requests the geometry for a given tile.   The result must include terrain data and
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
    * Gets the tiling scheme used by this provider.
    */
  val tilingScheme: TilingScheme = js.native
  
  /**
    * Gets the name of the Google Earth Enterprise server url hosting the imagery.
    */
  val url: String = js.native
}
/* static members */
object GoogleEarthEnterpriseTerrainProvider {
  
  @JSImport("@cesium/engine", "GoogleEarthEnterpriseTerrainProvider")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a GoogleEarthTerrainProvider from GoogleEarthEnterpriseMetadata
    * @example
    * const geeMetadata = await GoogleEarthEnterpriseMetadata.fromUrl("http://www.example.com");
    * const gee = Cesium.GoogleEarthEnterpriseTerrainProvider.fromMetadata(geeMetadata);
    * @param metadata - A metadata object that can be used to share metadata requests with a GoogleEarthEnterpriseImageryProvider.
    * @param options - An object describing initialization options
    */
  inline def fromMetadata(metadata: GoogleEarthEnterpriseMetadata, options: ConstructorOptions): GoogleEarthEnterpriseTerrainProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMetadata")(metadata.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GoogleEarthEnterpriseTerrainProvider]
  
  /**
    * Initialization options for GoogleEarthEnterpriseTerrainProvider constructor
    * @property [ellipsoid] - The ellipsoid.  If not specified, the WGS84 ellipsoid is used.
    * @property [credit] - A credit for the data source, which is displayed on the canvas.
    * @property [url] - The url of the Google Earth Enterprise server hosting the imagery. Deprecated.
    * @property [metadata] - A metadata object that can be used to share metadata requests with a GoogleEarthEnterpriseImageryProvider. Deprecated.
    */
  trait ConstructorOptions extends StObject {
    
    var credit: js.UndefOr[Credit | String] = js.undefined
    
    var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
    
    var metadata: js.UndefOr[GoogleEarthEnterpriseMetadata] = js.undefined
    
    var url: js.UndefOr[Resource | String] = js.undefined
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
      
      inline def setMetadata(value: GoogleEarthEnterpriseMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setUrl(value: Resource | String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
