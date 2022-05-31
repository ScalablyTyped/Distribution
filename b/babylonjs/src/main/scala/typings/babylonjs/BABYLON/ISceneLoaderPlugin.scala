package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISceneLoaderPlugin
  extends StObject
     with ISceneLoaderPluginBase {
  
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
    rootUrl: String,
    meshes: js.Array[AbstractMesh],
    particleSystems: js.Array[IParticleSystem],
    skeletons: js.Array[Skeleton]
  ): Boolean = js.native
  def importMesh(
    meshesNames: js.Any,
    scene: Scene,
    data: js.Any,
    rootUrl: String,
    meshes: js.Array[AbstractMesh],
    particleSystems: js.Array[IParticleSystem],
    skeletons: js.Array[Skeleton],
    onError: js.Function2[/* message */ String, /* exception */ js.UndefOr[js.Any], Unit]
  ): Boolean = js.native
  
  /**
    * Load into a scene.
    * @param scene The scene to load into
    * @param data The data to import
    * @param rootUrl The root url for scene and resources
    * @param onError The callback when import fails
    * @returns True if successful or false otherwise
    */
  def load(scene: Scene, data: js.Any, rootUrl: String): Boolean = js.native
  def load(
    scene: Scene,
    data: js.Any,
    rootUrl: String,
    onError: js.Function2[/* message */ String, /* exception */ js.UndefOr[js.Any], Unit]
  ): Boolean = js.native
  
  /**
    * Load into an asset container.
    * @param scene The scene to load into
    * @param data The data to import
    * @param rootUrl The root url for scene and resources
    * @param onError The callback when import fails
    * @returns The loaded asset container
    */
  def loadAssetContainer(scene: Scene, data: js.Any, rootUrl: String): AssetContainer = js.native
  def loadAssetContainer(
    scene: Scene,
    data: js.Any,
    rootUrl: String,
    onError: js.Function2[/* message */ String, /* exception */ js.UndefOr[js.Any], Unit]
  ): AssetContainer = js.native
}
