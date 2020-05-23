package typings.babylonjs.sceneLoaderMod

import typings.babylonjs.anon.AnimationGroups
import typings.babylonjs.assetContainerMod.AssetContainer
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * @returns The loaded meshes, particle systems, skeletons, and animation groups
    */
  def importMeshAsync(meshesNames: js.Any, scene: Scene, data: js.Any, rootUrl: String): js.Promise[AnimationGroups] = js.native
  def importMeshAsync(
    meshesNames: js.Any,
    scene: Scene,
    data: js.Any,
    rootUrl: String,
    onProgress: js.Function1[/* event */ SceneLoaderProgressEvent, Unit]
  ): js.Promise[AnimationGroups] = js.native
  def importMeshAsync(
    meshesNames: js.Any,
    scene: Scene,
    data: js.Any,
    rootUrl: String,
    onProgress: js.Function1[/* event */ SceneLoaderProgressEvent, Unit],
    fileName: String
  ): js.Promise[AnimationGroups] = js.native
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
    onProgress: js.Function1[/* event */ SceneLoaderProgressEvent, Unit]
  ): js.Promise[AssetContainer] = js.native
  def loadAssetContainerAsync(
    scene: Scene,
    data: js.Any,
    rootUrl: String,
    onProgress: js.Function1[/* event */ SceneLoaderProgressEvent, Unit],
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
    onProgress: js.Function1[/* event */ SceneLoaderProgressEvent, Unit]
  ): js.Promise[Unit] = js.native
  def loadAsync(
    scene: Scene,
    data: js.Any,
    rootUrl: String,
    onProgress: js.Function1[/* event */ SceneLoaderProgressEvent, Unit],
    fileName: String
  ): js.Promise[Unit] = js.native
}

