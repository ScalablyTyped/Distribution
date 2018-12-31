package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface used to define an async SceneLoader plugin
  */
@js.native
trait ISceneLoaderPluginAsync extends js.Object {
  /**
    * The callback that returns true if the data can be directly loaded.
    */
  var canDirectLoad: js.UndefOr[js.Function1[/* data */ java.lang.String, scala.Boolean]] = js.native
  /**
    * The file extensions supported by this plugin.
    */
  var extensions: java.lang.String | ISceneLoaderPluginExtensions = js.native
  /**
    * The friendly name of this plugin.
    */
  var name: java.lang.String = js.native
  /**
    * The callback that allows custom handling of the root url based on the response url.
    */
  var rewriteRootURL: js.UndefOr[
    js.Function2[
      /* rootUrl */ java.lang.String, 
      /* responseURL */ js.UndefOr[java.lang.String], 
      java.lang.String
    ]
  ] = js.native
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
  def importMeshAsync(meshesNames: js.Any, scene: Scene, data: js.Any, rootUrl: java.lang.String): js.Promise[babylonjsLib.Anon_ParticleSystems] = js.native
  def importMeshAsync(
    meshesNames: js.Any,
    scene: Scene,
    data: js.Any,
    rootUrl: java.lang.String,
    onProgress: js.Function1[/* event */ SceneLoaderProgressEvent, scala.Unit]
  ): js.Promise[babylonjsLib.Anon_ParticleSystems] = js.native
  def importMeshAsync(
    meshesNames: js.Any,
    scene: Scene,
    data: js.Any,
    rootUrl: java.lang.String,
    onProgress: js.Function1[/* event */ SceneLoaderProgressEvent, scala.Unit],
    fileName: java.lang.String
  ): js.Promise[babylonjsLib.Anon_ParticleSystems] = js.native
  /**
    * Load into an asset container.
    * @param scene The scene to load into
    * @param data The data to import
    * @param rootUrl The root url for scene and resources
    * @param onProgress The callback when the load progresses
    * @param fileName Defines the name of the file to load
    * @returns The loaded asset container
    */
  def loadAssetContainerAsync(scene: Scene, data: java.lang.String, rootUrl: java.lang.String): js.Promise[AssetContainer] = js.native
  def loadAssetContainerAsync(
    scene: Scene,
    data: java.lang.String,
    rootUrl: java.lang.String,
    onProgress: js.Function1[/* event */ SceneLoaderProgressEvent, scala.Unit]
  ): js.Promise[AssetContainer] = js.native
  def loadAssetContainerAsync(
    scene: Scene,
    data: java.lang.String,
    rootUrl: java.lang.String,
    onProgress: js.Function1[/* event */ SceneLoaderProgressEvent, scala.Unit],
    fileName: java.lang.String
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
  def loadAsync(scene: Scene, data: java.lang.String, rootUrl: java.lang.String): js.Promise[scala.Unit] = js.native
  def loadAsync(
    scene: Scene,
    data: java.lang.String,
    rootUrl: java.lang.String,
    onProgress: js.Function1[/* event */ SceneLoaderProgressEvent, scala.Unit]
  ): js.Promise[scala.Unit] = js.native
  def loadAsync(
    scene: Scene,
    data: java.lang.String,
    rootUrl: java.lang.String,
    onProgress: js.Function1[/* event */ SceneLoaderProgressEvent, scala.Unit],
    fileName: java.lang.String
  ): js.Promise[scala.Unit] = js.native
}

