package typings.babylonjs.environmentHelperMod

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.anon.Exception
import typings.babylonjs.anon.PartialIEnvironmentHelper
import typings.babylonjs.backgroundMaterialMod.BackgroundMaterial
import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.mirrorTextureMod.MirrorTexture
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Helpers/environmentHelper", "EnvironmentHelper")
@js.native
class EnvironmentHelper protected () extends js.Object {
  /**
    * constructor
    * @param options Defines the options we want to customize the helper
    * @param scene The scene to add the material to
    */
  def this(options: PartialIEnvironmentHelper, scene: Scene) = this()
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
    * This observable will be notified with any error during the creation of the environment,
    * mainly texture creation errors.
    */
  var onErrorObservable: Observable[Exception] = js.native
  /**
    * Dispose all the elements created by the Helper.
    */
  def dispose(): Unit = js.native
  /**
    * Gets the ground mesh created by the helper.
    */
  def ground: Nullable[Mesh] = js.native
  /**
    * Gets the ground material created by the helper.
    */
  def groundMaterial: Nullable[BackgroundMaterial] = js.native
  /**
    * Gets the ground mirror created by the helper.
    */
  def groundMirror: Nullable[MirrorTexture] = js.native
  /**
    * Gets the ground mirror render list to helps pushing the meshes
    * you wish in the ground reflection.
    */
  def groundMirrorRenderList: Nullable[js.Array[AbstractMesh]] = js.native
  /**
    * Gets the ground texture created by the helper.
    */
  def groundTexture: Nullable[BaseTexture] = js.native
  /**
    * Gets the root mesh created by the helper.
    */
  def rootMesh: Mesh = js.native
  /**
    * Sets the primary color of all the available elements.
    * @param color the main color to affect to the ground and the background
    */
  def setMainColor(color: Color3): Unit = js.native
  /**
    * Gets the skybox created by the helper.
    */
  def skybox: Nullable[Mesh] = js.native
  /**
    * Gets the skybox material created by the helper.
    */
  def skyboxMaterial: Nullable[BackgroundMaterial] = js.native
  /**
    * Gets the skybox texture created by the helper.
    */
  def skyboxTexture: Nullable[BaseTexture] = js.native
  /**
    * Updates the background according to the new options
    * @param options
    */
  def updateOptions(options: PartialIEnvironmentHelper): Unit = js.native
}

/* static members */
@JSImport("babylonjs/Helpers/environmentHelper", "EnvironmentHelper")
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

