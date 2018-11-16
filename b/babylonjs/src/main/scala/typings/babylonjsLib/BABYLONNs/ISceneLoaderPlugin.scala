package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Interface used to define a SceneLoader plugin
     */
@js.native
trait ISceneLoaderPlugin extends js.Object {
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
           * @param meshes The meshes array to import into
           * @param particleSystems The particle systems array to import into
           * @param skeletons The skeletons array to import into
           * @param onError The callback when import fails
           * @returns True if successful or false otherwise
           */
  def importMesh(
    meshesNames: js.Any,
    scene: Scene,
    data: js.Any,
    rootUrl: java.lang.String,
    meshes: js.Array[AbstractMesh],
    particleSystems: js.Array[IParticleSystem],
    skeletons: js.Array[Skeleton]
  ): scala.Boolean = js.native
  /**
           * Import meshes into a scene.
           * @param meshesNames An array of mesh names, a single mesh name, or empty string for all meshes that filter what meshes are imported
           * @param scene The scene to import into
           * @param data The data to import
           * @param rootUrl The root url for scene and resources
           * @param meshes The meshes array to import into
           * @param particleSystems The particle systems array to import into
           * @param skeletons The skeletons array to import into
           * @param onError The callback when import fails
           * @returns True if successful or false otherwise
           */
  def importMesh(
    meshesNames: js.Any,
    scene: Scene,
    data: js.Any,
    rootUrl: java.lang.String,
    meshes: js.Array[AbstractMesh],
    particleSystems: js.Array[IParticleSystem],
    skeletons: js.Array[Skeleton],
    onError: js.Function2[/* message */ java.lang.String, /* exception */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Boolean = js.native
  /**
           * Load into a scene.
           * @param scene The scene to load into
           * @param data The data to import
           * @param rootUrl The root url for scene and resources
           * @param onError The callback when import fails
           * @returns true if successful or false otherwise
           */
  def load(scene: Scene, data: java.lang.String, rootUrl: java.lang.String): scala.Boolean = js.native
  /**
           * Load into a scene.
           * @param scene The scene to load into
           * @param data The data to import
           * @param rootUrl The root url for scene and resources
           * @param onError The callback when import fails
           * @returns true if successful or false otherwise
           */
  def load(
    scene: Scene,
    data: java.lang.String,
    rootUrl: java.lang.String,
    onError: js.Function2[/* message */ java.lang.String, /* exception */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Boolean = js.native
  /**
           * Load into an asset container.
           * @param scene The scene to load into
           * @param data The data to import
           * @param rootUrl The root url for scene and resources
           * @param onError The callback when import fails
           * @returns The loaded asset container
           */
  def loadAssetContainer(scene: Scene, data: java.lang.String, rootUrl: java.lang.String): AssetContainer = js.native
  /**
           * Load into an asset container.
           * @param scene The scene to load into
           * @param data The data to import
           * @param rootUrl The root url for scene and resources
           * @param onError The callback when import fails
           * @returns The loaded asset container
           */
  def loadAssetContainer(
    scene: Scene,
    data: java.lang.String,
    rootUrl: java.lang.String,
    onError: js.Function2[/* message */ java.lang.String, /* exception */ js.UndefOr[js.Any], scala.Unit]
  ): AssetContainer = js.native
}

