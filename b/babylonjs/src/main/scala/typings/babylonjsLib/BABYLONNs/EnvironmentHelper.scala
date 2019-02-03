package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Environment helper class can be used to add a fully featuread none expensive background to your scene.
  * It includes by default a skybox and a ground relying on the BackgroundMaterial.
  * It also helps with the default setup of your imageProcessing configuration.
  */
@JSGlobal("BABYLON.EnvironmentHelper")
@js.native
class EnvironmentHelper protected () extends js.Object {
  /**
    * constructor
    * @param options
    * @param scene The scene to add the material to
    */
  def this(options: stdLib.Partial[IEnvironmentHelperOptions], scene: Scene) = this()
  var _errorHandler: js.Any = js.native
  /**
    * Get the scene sizes according to the setup.
    */
  var _getSceneSize: js.Any = js.native
  var _ground: js.Any = js.native
  var _groundMaterial: js.Any = js.native
  var _groundMirror: js.Any = js.native
  var _groundTexture: js.Any = js.native
  var _options: js.Any = js.native
  var _rootMesh: js.Any = js.native
  /**
    * Stores the creation options.
    */
  val _scene: js.Any = js.native
  /**
    * Setup the background according to the specified options.
    */
  var _setupBackground: js.Any = js.native
  /**
    * Setup the environment texture according to the specified options.
    */
  var _setupEnvironmentTexture: js.Any = js.native
  /**
    * Setup the ground according to the specified options.
    */
  var _setupGround: js.Any = js.native
  /**
    * Setup the ground diffuse texture according to the specified options.
    */
  var _setupGroundDiffuseTexture: js.Any = js.native
  /**
    * Setup the ground material according to the specified options.
    */
  var _setupGroundMaterial: js.Any = js.native
  /**
    * Setup the ground mirror texture according to the specified options.
    */
  var _setupGroundMirrorTexture: js.Any = js.native
  /**
    * Setup the image processing according to the specified options.
    */
  var _setupImageProcessing: js.Any = js.native
  /**
    * Setup the ground to receive the mirror texture.
    */
  var _setupMirrorInGroundMaterial: js.Any = js.native
  /**
    * Setup the skybox according to the specified options.
    */
  var _setupSkybox: js.Any = js.native
  /**
    * Setup the skybox material according to the specified options.
    */
  var _setupSkyboxMaterial: js.Any = js.native
  /**
    * Setup the skybox reflection texture according to the specified options.
    */
  var _setupSkyboxReflectionTexture: js.Any = js.native
  var _skybox: js.Any = js.native
  var _skyboxMaterial: js.Any = js.native
  var _skyboxTexture: js.Any = js.native
  /**
    * Gets the ground mesh created by the helper.
    */
  val ground: Nullable[Mesh] = js.native
  /**
    * Gets the ground material created by the helper.
    */
  val groundMaterial: Nullable[BackgroundMaterial] = js.native
  /**
    * Gets the ground mirror created by the helper.
    */
  val groundMirror: Nullable[MirrorTexture] = js.native
  /**
    * Gets the ground mirror render list to helps pushing the meshes
    * you wish in the ground reflection.
    */
  val groundMirrorRenderList: Nullable[js.Array[AbstractMesh]] = js.native
  /**
    * Gets the ground texture created by the helper.
    */
  val groundTexture: Nullable[BaseTexture] = js.native
  /**
    * This observable will be notified with any error during the creation of the environment,
    * mainly texture creation errors.
    */
  var onErrorObservable: Observable[babylonjsLib.Anon_Exception] = js.native
  /**
    * Gets the root mesh created by the helper.
    */
  val rootMesh: Mesh = js.native
  /**
    * Gets the skybox created by the helper.
    */
  val skybox: Nullable[Mesh] = js.native
  /**
    * Gets the skybox material created by the helper.
    */
  val skyboxMaterial: Nullable[BackgroundMaterial] = js.native
  /**
    * Gets the skybox texture created by the helper.
    */
  val skyboxTexture: Nullable[BaseTexture] = js.native
  /**
    * Dispose all the elements created by the Helper.
    */
  def dispose(): scala.Unit = js.native
  /**
    * Sets the primary color of all the available elements.
    * @param color the main color to affect to the ground and the background
    */
  def setMainColor(color: Color3): scala.Unit = js.native
  /**
    * Updates the background according to the new options
    * @param options
    */
  def updateOptions(options: stdLib.Partial[IEnvironmentHelperOptions]): scala.Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.EnvironmentHelper")
@js.native
object EnvironmentHelper extends js.Object {
  /**
    * Default environment texture URL.
    */
  var _environmentTextureCDNUrl: js.Any = js.native
  /**
    * Creates the default options for the helper.
    */
  var _getDefaultOptions: js.Any = js.native
  /**
    * Default ground texture URL.
    */
  var _groundTextureCDNUrl: js.Any = js.native
  /**
    * Default skybox texture URL.
    */
  var _skyboxTextureCDNUrl: js.Any = js.native
}

