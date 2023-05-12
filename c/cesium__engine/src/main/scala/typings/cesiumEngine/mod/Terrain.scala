package typings.cesiumEngine.mod

import typings.cesiumEngine.anon.RequestVertexNormals
import typings.cesiumEngine.mod.Terrain.ErrorEventCallback
import typings.cesiumEngine.mod.Terrain.ReadyEventCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "Terrain")
@js.native
open class Terrain protected () extends StObject {
  def this(terrainProviderPromise: js.Promise[TerrainProvider]) = this()
  
  /**
    * Gets an event that is raised when the terrain provider encounters an asynchronous error.  By subscribing
    * to the event, you will be notified of the error and can potentially recover from it.  Event listeners
    * are passed an instance of the thrown error.
    */
  val errorEvent: Event[ErrorEventCallback] = js.native
  
  /**
    * Gets an event that is raised when the terrain provider has been successfully created. Event listeners
    * are passed the created instance of {@link TerrainProvider}.
    */
  val readyEvent: Event[ReadyEventCallback] = js.native
}
/* static members */
object Terrain {
  
  @JSImport("@cesium/engine", "Terrain")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a {@link Terrain} instance for {@link https://cesium.com/content/#cesium-world-terrain|Cesium World Terrain}.
    * @example
    * // Create Cesium World Terrain with default settings
    * const viewer = new Cesium.Viewer("cesiumContainer", {
    *   terrain: Cesium.Terrain.fromWorldTerrain()
    * });
    * @example
    * // Create Cesium World Terrain with water and normals.
    * const viewer1 = new Cesium.Viewer("cesiumContainer", {
    *   terrain: Cesium.Terrain.fromWorldTerrain({
    *      requestWaterMask: true,
    *      requestVertexNormals: true
    *    });
    * });
    * @example
    * // Handle loading events
    * const terrain = Cesium.Terrain.fromWorldTerrain();
    *
    * scene.setTerrain(terrain);
    *
    * terrain.readyEvent.addEventListener(provider => {
    *   scene.globe.enableLighting = true;
    *
    *   terrain.provider.errorEvent.addEventListener(error => {
    *     alert(`Encountered an error while loading terrain tiles! ${error}`);
    *   });
    * });
    *
    * terrain.errorEvent.addEventListener(error => {
    *   alert(`Encountered an error while creating terrain! ${error}`);
    * });
    * @param [options] - Object with the following properties:
    * @param [options.requestVertexNormals = false] - Flag that indicates if the client should request additional lighting information from the server if available.
    * @param [options.requestWaterMask = false] - Flag that indicates if the client should request per tile water masks from the server if available.
    * @returns An asynchronous helper object for a CesiumTerrainProvider
    */
  inline def fromWorldTerrain(): Terrain = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWorldTerrain")().asInstanceOf[Terrain]
  inline def fromWorldTerrain(options: RequestVertexNormals): Terrain = ^.asInstanceOf[js.Dynamic].applyDynamic("fromWorldTerrain")(options.asInstanceOf[js.Any]).asInstanceOf[Terrain]
  
  /**
    * A function that is called when an error occurs.
    * @param err - An object holding details about the error that occurred.
    */
  type ErrorEventCallback = js.ThisFunction1[/* this */ Terrain, /* err */ js.Error, Unit]
  
  /**
    * A function that is called when the provider has been created
    * @param provider - The created terrain provider.
    */
  type ReadyEventCallback = js.ThisFunction1[/* this */ Terrain, /* provider */ TerrainProvider, Unit]
}
