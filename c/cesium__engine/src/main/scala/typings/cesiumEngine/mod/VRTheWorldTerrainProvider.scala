package typings.cesiumEngine.mod

import typings.cesiumEngine.mod.VRTheWorldTerrainProvider.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "VRTheWorldTerrainProvider")
@js.native
open class VRTheWorldTerrainProvider () extends StObject {
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
object VRTheWorldTerrainProvider {
  
  @JSImport("@cesium/engine", "VRTheWorldTerrainProvider")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromUrl(url: String): js.Promise[VRTheWorldTerrainProvider] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[VRTheWorldTerrainProvider]]
  inline def fromUrl(url: String, options: ConstructorOptions): js.Promise[VRTheWorldTerrainProvider] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VRTheWorldTerrainProvider]]
  /**
    * Creates a {@link TerrainProvider} that produces terrain geometry by tessellating height maps
    * retrieved from a {@link http://vr-theworld.com/|VT MÄK VR-TheWorld server}.
    * @example
    * const terrainProvider = await Cesium.VRTheWorldTerrainProvider.fromUrl(
    *   "https://www.vr-theworld.com/vr-theworld/tiles1.0.0/73/"
    * );
    * viewer.terrainProvider = terrainProvider;
    * @param url - The URL of the VR-TheWorld TileMap.
    * @param [options] - An object describing initialization options.
    */
  inline def fromUrl(url: Resource): js.Promise[VRTheWorldTerrainProvider] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[VRTheWorldTerrainProvider]]
  inline def fromUrl(url: Resource, options: ConstructorOptions): js.Promise[VRTheWorldTerrainProvider] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[VRTheWorldTerrainProvider]]
  
  /**
    * Initialization options for the VRTheWorldTerrainProvider constructor
    * @property [ellipsoid] - The ellipsoid.  If not specified, the WGS84 ellipsoid is used.
    * @property [credit] - A credit for the data source, which is displayed on the canvas.
    * @property [url] - The URL of the VR-TheWorld TileMap. Deprecated.
    */
  trait ConstructorOptions extends StObject {
    
    var credit: js.UndefOr[Credit | String] = js.undefined
    
    var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
    
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
      
      inline def setUrl(value: Resource | String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
