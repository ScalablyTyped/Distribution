package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISceneLoaderPluginAsync extends ISceneLoaderPluginBase {
  
  /**
    * Import meshes into a scene.
    * @param meshesNames An array of mesh names, a single mesh name, or empty string for all meshes that filter what meshes are imported
    * @param scene The scene to import into
    * @param data The data to import
    * @param rootUrl The root url for scene and resources
    * @param onProgress The callback when the load progresses
    * @param fileName Defines the name of the file to load
    * @returns The loaded objects (e.g. meshes, particle systems, skeletons, animation groups, etc.)
    */
  def importMeshAsync(meshesNames: js.Any, scene: Scene, data: js.Any, rootUrl: String): js.Promise[ISceneLoaderAsyncResult] = js.native
  def importMeshAsync(
    meshesNames: js.Any,
    scene: Scene,
    data: js.Any,
    rootUrl: String,
    onProgress: js.UndefOr[scala.Nothing],
    fileName: String
  ): js.Promise[ISceneLoaderAsyncResult] = js.native
  def importMeshAsync(
    meshesNames: js.Any,
    scene: Scene,
    data: js.Any,
    rootUrl: String,
    onProgress: js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]
  ): js.Promise[ISceneLoaderAsyncResult] = js.native
  def importMeshAsync(
    meshesNames: js.Any,
    scene: Scene,
    data: js.Any,
    rootUrl: String,
    onProgress: js.Function1[/* event */ ISceneLoaderProgressEvent, Unit],
    fileName: String
  ): js.Promise[ISceneLoaderAsyncResult] = js.native
  
  /**
    * Load into an asset container.
    * @param scene The scene to load into
    * @param data The data to import
    * @param rootUrl The root url for scene and resources
    * @param onProgress The callback when the load progresses
    * @param fileName Defines the name of the file to load
    * @returns The loaded asset container
    */
  def loadAssetContainerAsync(scene: Scene, data: js.Any, rootUrl: String): js.Promise[AssetContainer] = js.native
  def loadAssetContainerAsync(
    scene: Scene,
    data: js.Any,
    rootUrl: String,
    onProgress: js.UndefOr[scala.Nothing],
    fileName: String
  ): js.Promise[AssetContainer] = js.native
  def loadAssetContainerAsync(
    scene: Scene,
    data: js.Any,
    rootUrl: String,
    onProgress: js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]
  ): js.Promise[AssetContainer] = js.native
  def loadAssetContainerAsync(
    scene: Scene,
    data: js.Any,
    rootUrl: String,
    onProgress: js.Function1[/* event */ ISceneLoaderProgressEvent, Unit],
    fileName: String
  ): js.Promise[AssetContainer] = js.native
  
  /**
    * Load into a scene.
    * @param scene The scene to load into
    * @param data The data to import
    * @param rootUrl The root url for scene and resources
    * @param onProgress The callback when the load progresses
    * @param fileName Defines the name of the file to load
    * @returns Nothing
    */
  def loadAsync(scene: Scene, data: js.Any, rootUrl: String): js.Promise[Unit] = js.native
  def loadAsync(
    scene: Scene,
    data: js.Any,
    rootUrl: String,
    onProgress: js.UndefOr[scala.Nothing],
    fileName: String
  ): js.Promise[Unit] = js.native
  def loadAsync(
    scene: Scene,
    data: js.Any,
    rootUrl: String,
    onProgress: js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]
  ): js.Promise[Unit] = js.native
  def loadAsync(
    scene: Scene,
    data: js.Any,
    rootUrl: String,
    onProgress: js.Function1[/* event */ ISceneLoaderProgressEvent, Unit],
    fileName: String
  ): js.Promise[Unit] = js.native
}
