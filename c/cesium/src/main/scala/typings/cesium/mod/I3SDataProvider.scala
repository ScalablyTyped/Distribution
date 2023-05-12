package typings.cesium.mod

import typings.cesium.mod.I3SDataProvider.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "I3SDataProvider")
@js.native
open class I3SDataProvider protected () extends StObject {
  def this(options: ConstructorOptions) = this()
  
  /**
    * Gets the I3S data for this object.
    */
  val data: Any = js.native
  
  /**
    * Destroys the WebGL resources held by this object. Destroying an object allows for deterministic
    * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
    * <p>
    * Once an object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception. Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    * </p>
    */
  def destroy(): Unit = js.native
  
  /**
    * Gets the extent covered by this I3S.
    */
  val extent: Rectangle = js.native
  
  /**
    * The terrain provider referencing the GEOID service to be used for orthometric to ellipsoidal conversion.
    */
  val geoidTiledTerrainProvider: ArcGISTiledElevationTerrainProvider = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <p>
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * </p>
    * @returns <code>true</code> if this object was destroyed; otherwise, <code>false</code>.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Gets the collection of layers.
    */
  val layers: js.Array[I3SLayer] = js.native
  
  /**
    * Gets a human-readable name for this dataset.
    */
  val name: String = js.native
  
  /**
    * When <code>true</code>, the I3S scene is loaded.
    * This is set to <code>true</code> right before {@link I3SDataProvider#readyPromise} is resolved.
    */
  val ready: Boolean = js.native
  
  /**
    * Gets the promise that will be resolved when the I3S scene is loaded.
    */
  val readyPromise: js.Promise[I3SDataProvider] = js.native
  
  /**
    * The resource used to fetch the I3S dataset.
    */
  val resource: Resource = js.native
  
  /**
    * Determines if the dataset will be shown.
    */
  var show: Boolean = js.native
  
  /**
    * Gets or sets debugging and tracing of I3S fetches.
    */
  var traceFetches: Boolean = js.native
}
/* static members */
object I3SDataProvider {
  
  @JSImport("cesium", "I3SDataProvider")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an I3SDataProvider. Currently supported I3S versions are 1.6 and
    * 1.7/1.8 (OGC I3S 1.2).
    * @example
    * try {
    *   const i3sData = await I3SDataProvider.fromUrl(
    *     "https://tiles.arcgis.com/tiles/z2tnIkrLQ2BRzr6P/arcgis/rest/services/Frankfurt2017_vi3s_18/SceneServer/layers/0"
    *   );
    *   viewer.scene.primitives.add(i3sData);
    * } catch (error) {
    *   console.log(`There was an error creating the I3S Data Provider: ${error}`);
    * }
    * @example
    * try {
    *   const geoidService = await Cesium.ArcGISTiledElevationTerrainProvider.fromUrl(
    *     "https://tiles.arcgis.com/tiles/z2tnIkrLQ2BRzr6P/arcgis/rest/services/EGM2008/ImageServer"
    *   );
    *   const i3sData = await I3SDataProvider.fromUrl(
    *     "https://tiles.arcgis.com/tiles/z2tnIkrLQ2BRzr6P/arcgis/rest/services/Frankfurt2017_vi3s_18/SceneServer/layers/0", {
    *       geoidTiledTerrainProvider: geoidService
    *   });
    *   viewer.scene.primitives.add(i3sData);
    * } catch (error) {
    *   console.log(`There was an error creating the I3S Data Provider: ${error}`);
    * }
    * @param url - The url of the I3S dataset, which should return an I3S scene object
    * @param options - An object describing initialization options
    */
  inline def fromUrl(url: String, options: ConstructorOptions): js.Promise[I3SDataProvider] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[I3SDataProvider]]
  inline def fromUrl(url: Resource, options: ConstructorOptions): js.Promise[I3SDataProvider] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[I3SDataProvider]]
  
  /**
    * Initialization options for the I3SDataProvider constructor
    * @property [url] - The url of the I3S dataset. Deprecated.
    * @property [name] - The name of the I3S dataset.
    * @property [show = true] - Determines if the dataset will be shown.
    * @property [geoidTiledTerrainProvider] - Tiled elevation provider describing an Earth Gravitational Model. If defined, geometry will be shifted based on the offsets given by this provider. Required to position I3S data sets with gravity-related height at the correct location.
    * @property [traceFetches = false] - Debug option. When true, log a message whenever an I3S tile is fetched.
    * @property [cesium3dTilesetOptions] - Object containing options to pass to an internally created {@link Cesium3DTileset}. See {@link Cesium3DTileset} for list of valid properties. All options can be used with the exception of <code>url</code> and <code>show</code> which are overridden by values from I3SDataProvider.
    */
  trait ConstructorOptions extends StObject {
    
    var cesium3dTilesetOptions: js.UndefOr[typings.cesium.mod.Cesium3DTileset.ConstructorOptions] = js.undefined
    
    var geoidTiledTerrainProvider: js.UndefOr[
        ArcGISTiledElevationTerrainProvider | js.Promise[ArcGISTiledElevationTerrainProvider]
      ] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var traceFetches: js.UndefOr[Boolean] = js.undefined
    
    var url: js.UndefOr[Resource | String] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
      
      inline def setCesium3dTilesetOptions(value: typings.cesium.mod.Cesium3DTileset.ConstructorOptions): Self = StObject.set(x, "cesium3dTilesetOptions", value.asInstanceOf[js.Any])
      
      inline def setCesium3dTilesetOptionsUndefined: Self = StObject.set(x, "cesium3dTilesetOptions", js.undefined)
      
      inline def setGeoidTiledTerrainProvider(value: ArcGISTiledElevationTerrainProvider | js.Promise[ArcGISTiledElevationTerrainProvider]): Self = StObject.set(x, "geoidTiledTerrainProvider", value.asInstanceOf[js.Any])
      
      inline def setGeoidTiledTerrainProviderUndefined: Self = StObject.set(x, "geoidTiledTerrainProvider", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setTraceFetches(value: Boolean): Self = StObject.set(x, "traceFetches", value.asInstanceOf[js.Any])
      
      inline def setTraceFetchesUndefined: Self = StObject.set(x, "traceFetches", js.undefined)
      
      inline def setUrl(value: Resource | String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
