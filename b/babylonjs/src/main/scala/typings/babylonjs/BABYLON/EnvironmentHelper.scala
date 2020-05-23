package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Exception
import typings.babylonjs.anon.PartialIEnvironmentHelperBackgroundYRotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentHelper extends js.Object {
  var _errorHandler: js.Any
  /**
    * Get the scene sizes according to the setup.
    */
  var _getSceneSize: js.Any
  var _ground: js.Any
  var _groundMaterial: js.Any
  var _groundMirror: js.Any
  var _groundTexture: js.Any
  var _options: js.Any
  var _rootMesh: js.Any
  /**
    * Stores the creation options.
    */
  val _scene: js.Any
  /**
    * Setup the background according to the specified options.
    */
  var _setupBackground: js.Any
  /**
    * Setup the environment texture according to the specified options.
    */
  var _setupEnvironmentTexture: js.Any
  /**
    * Setup the ground according to the specified options.
    */
  var _setupGround: js.Any
  /**
    * Setup the ground diffuse texture according to the specified options.
    */
  var _setupGroundDiffuseTexture: js.Any
  /**
    * Setup the ground material according to the specified options.
    */
  var _setupGroundMaterial: js.Any
  /**
    * Setup the ground mirror texture according to the specified options.
    */
  var _setupGroundMirrorTexture: js.Any
  /**
    * Setup the image processing according to the specified options.
    */
  var _setupImageProcessing: js.Any
  /**
    * Setup the ground to receive the mirror texture.
    */
  var _setupMirrorInGroundMaterial: js.Any
  /**
    * Setup the skybox according to the specified options.
    */
  var _setupSkybox: js.Any
  /**
    * Setup the skybox material according to the specified options.
    */
  var _setupSkyboxMaterial: js.Any
  /**
    * Setup the skybox reflection texture according to the specified options.
    */
  var _setupSkyboxReflectionTexture: js.Any
  var _skybox: js.Any
  var _skyboxMaterial: js.Any
  var _skyboxTexture: js.Any
  /**
    * This observable will be notified with any error during the creation of the environment,
    * mainly texture creation errors.
    */
  var onErrorObservable: Observable[Exception]
  /**
    * Dispose all the elements created by the Helper.
    */
  def dispose(): Unit
  /**
    * Gets the ground mesh created by the helper.
    */
  def ground: Nullable[Mesh]
  /**
    * Gets the ground material created by the helper.
    */
  def groundMaterial: Nullable[BackgroundMaterial]
  /**
    * Gets the ground mirror created by the helper.
    */
  def groundMirror: Nullable[MirrorTexture]
  /**
    * Gets the ground mirror render list to helps pushing the meshes
    * you wish in the ground reflection.
    */
  def groundMirrorRenderList: Nullable[js.Array[AbstractMesh]]
  /**
    * Gets the ground texture created by the helper.
    */
  def groundTexture: Nullable[BaseTexture]
  /**
    * Gets the root mesh created by the helper.
    */
  def rootMesh: Mesh
  /**
    * Sets the primary color of all the available elements.
    * @param color the main color to affect to the ground and the background
    */
  def setMainColor(color: Color3): Unit
  /**
    * Gets the skybox created by the helper.
    */
  def skybox: Nullable[Mesh]
  /**
    * Gets the skybox material created by the helper.
    */
  def skyboxMaterial: Nullable[BackgroundMaterial]
  /**
    * Gets the skybox texture created by the helper.
    */
  def skyboxTexture: Nullable[BaseTexture]
  /**
    * Updates the background according to the new options
    * @param options
    */
  def updateOptions(options: PartialIEnvironmentHelperBackgroundYRotation): Unit
}

object EnvironmentHelper {
  @scala.inline
  def apply(
    _errorHandler: js.Any,
    _getSceneSize: js.Any,
    _ground: js.Any,
    _groundMaterial: js.Any,
    _groundMirror: js.Any,
    _groundTexture: js.Any,
    _options: js.Any,
    _rootMesh: js.Any,
    _scene: js.Any,
    _setupBackground: js.Any,
    _setupEnvironmentTexture: js.Any,
    _setupGround: js.Any,
    _setupGroundDiffuseTexture: js.Any,
    _setupGroundMaterial: js.Any,
    _setupGroundMirrorTexture: js.Any,
    _setupImageProcessing: js.Any,
    _setupMirrorInGroundMaterial: js.Any,
    _setupSkybox: js.Any,
    _setupSkyboxMaterial: js.Any,
    _setupSkyboxReflectionTexture: js.Any,
    _skybox: js.Any,
    _skyboxMaterial: js.Any,
    _skyboxTexture: js.Any,
    dispose: () => Unit,
    ground: () => Nullable[Mesh],
    groundMaterial: () => Nullable[BackgroundMaterial],
    groundMirror: () => Nullable[MirrorTexture],
    groundMirrorRenderList: () => Nullable[js.Array[AbstractMesh]],
    groundTexture: () => Nullable[BaseTexture],
    onErrorObservable: Observable[Exception],
    rootMesh: () => Mesh,
    setMainColor: Color3 => Unit,
    skybox: () => Nullable[Mesh],
    skyboxMaterial: () => Nullable[BackgroundMaterial],
    skyboxTexture: () => Nullable[BaseTexture],
    updateOptions: PartialIEnvironmentHelperBackgroundYRotation => Unit
  ): EnvironmentHelper = {
    val __obj = js.Dynamic.literal(_errorHandler = _errorHandler.asInstanceOf[js.Any], _getSceneSize = _getSceneSize.asInstanceOf[js.Any], _ground = _ground.asInstanceOf[js.Any], _groundMaterial = _groundMaterial.asInstanceOf[js.Any], _groundMirror = _groundMirror.asInstanceOf[js.Any], _groundTexture = _groundTexture.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any], _rootMesh = _rootMesh.asInstanceOf[js.Any], _scene = _scene.asInstanceOf[js.Any], _setupBackground = _setupBackground.asInstanceOf[js.Any], _setupEnvironmentTexture = _setupEnvironmentTexture.asInstanceOf[js.Any], _setupGround = _setupGround.asInstanceOf[js.Any], _setupGroundDiffuseTexture = _setupGroundDiffuseTexture.asInstanceOf[js.Any], _setupGroundMaterial = _setupGroundMaterial.asInstanceOf[js.Any], _setupGroundMirrorTexture = _setupGroundMirrorTexture.asInstanceOf[js.Any], _setupImageProcessing = _setupImageProcessing.asInstanceOf[js.Any], _setupMirrorInGroundMaterial = _setupMirrorInGroundMaterial.asInstanceOf[js.Any], _setupSkybox = _setupSkybox.asInstanceOf[js.Any], _setupSkyboxMaterial = _setupSkyboxMaterial.asInstanceOf[js.Any], _setupSkyboxReflectionTexture = _setupSkyboxReflectionTexture.asInstanceOf[js.Any], _skybox = _skybox.asInstanceOf[js.Any], _skyboxMaterial = _skyboxMaterial.asInstanceOf[js.Any], _skyboxTexture = _skyboxTexture.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), ground = js.Any.fromFunction0(ground), groundMaterial = js.Any.fromFunction0(groundMaterial), groundMirror = js.Any.fromFunction0(groundMirror), groundMirrorRenderList = js.Any.fromFunction0(groundMirrorRenderList), groundTexture = js.Any.fromFunction0(groundTexture), onErrorObservable = onErrorObservable.asInstanceOf[js.Any], rootMesh = js.Any.fromFunction0(rootMesh), setMainColor = js.Any.fromFunction1(setMainColor), skybox = js.Any.fromFunction0(skybox), skyboxMaterial = js.Any.fromFunction0(skyboxMaterial), skyboxTexture = js.Any.fromFunction0(skyboxTexture), updateOptions = js.Any.fromFunction1(updateOptions))
    __obj.asInstanceOf[EnvironmentHelper]
  }
}

