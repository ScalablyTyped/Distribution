package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.anon.Exception
import typings.babylonjs.anon.PartialIEnvironmentHelperBackgroundYRotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.EnvironmentHelper")
@js.native
class EnvironmentHelper protected ()
  extends typings.babylonjs.BABYLON.EnvironmentHelper {
  /**
    * constructor
    * @param options Defines the options we want to customize the helper
    * @param scene The scene to add the material to
    */
  def this(options: PartialIEnvironmentHelperBackgroundYRotation, scene: typings.babylonjs.BABYLON.Scene) = this()
  /* CompleteClass */
  override var _errorHandler: js.Any = js.native
  /**
    * Get the scene sizes according to the setup.
    */
  /* CompleteClass */
  override var _getSceneSize: js.Any = js.native
  /* CompleteClass */
  override var _ground: js.Any = js.native
  /* CompleteClass */
  override var _groundMaterial: js.Any = js.native
  /* CompleteClass */
  override var _groundMirror: js.Any = js.native
  /* CompleteClass */
  override var _groundTexture: js.Any = js.native
  /* CompleteClass */
  override var _options: js.Any = js.native
  /* CompleteClass */
  override var _rootMesh: js.Any = js.native
  /**
    * Stores the creation options.
    */
  /* CompleteClass */
  override val _scene: js.Any = js.native
  /**
    * Setup the background according to the specified options.
    */
  /* CompleteClass */
  override var _setupBackground: js.Any = js.native
  /**
    * Setup the environment texture according to the specified options.
    */
  /* CompleteClass */
  override var _setupEnvironmentTexture: js.Any = js.native
  /**
    * Setup the ground according to the specified options.
    */
  /* CompleteClass */
  override var _setupGround: js.Any = js.native
  /**
    * Setup the ground diffuse texture according to the specified options.
    */
  /* CompleteClass */
  override var _setupGroundDiffuseTexture: js.Any = js.native
  /**
    * Setup the ground material according to the specified options.
    */
  /* CompleteClass */
  override var _setupGroundMaterial: js.Any = js.native
  /**
    * Setup the ground mirror texture according to the specified options.
    */
  /* CompleteClass */
  override var _setupGroundMirrorTexture: js.Any = js.native
  /**
    * Setup the image processing according to the specified options.
    */
  /* CompleteClass */
  override var _setupImageProcessing: js.Any = js.native
  /**
    * Setup the ground to receive the mirror texture.
    */
  /* CompleteClass */
  override var _setupMirrorInGroundMaterial: js.Any = js.native
  /**
    * Setup the skybox according to the specified options.
    */
  /* CompleteClass */
  override var _setupSkybox: js.Any = js.native
  /**
    * Setup the skybox material according to the specified options.
    */
  /* CompleteClass */
  override var _setupSkyboxMaterial: js.Any = js.native
  /**
    * Setup the skybox reflection texture according to the specified options.
    */
  /* CompleteClass */
  override var _setupSkyboxReflectionTexture: js.Any = js.native
  /* CompleteClass */
  override var _skybox: js.Any = js.native
  /* CompleteClass */
  override var _skyboxMaterial: js.Any = js.native
  /* CompleteClass */
  override var _skyboxTexture: js.Any = js.native
  /**
    * This observable will be notified with any error during the creation of the environment,
    * mainly texture creation errors.
    */
  /* CompleteClass */
  override var onErrorObservable: typings.babylonjs.BABYLON.Observable[Exception] = js.native
  /**
    * Dispose all the elements created by the Helper.
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /**
    * Gets the ground mesh created by the helper.
    */
  /* CompleteClass */
  override def ground: Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  /**
    * Gets the ground material created by the helper.
    */
  /* CompleteClass */
  override def groundMaterial: Nullable[typings.babylonjs.BABYLON.BackgroundMaterial] = js.native
  /**
    * Gets the ground mirror created by the helper.
    */
  /* CompleteClass */
  override def groundMirror: Nullable[typings.babylonjs.BABYLON.MirrorTexture] = js.native
  /**
    * Gets the ground mirror render list to helps pushing the meshes
    * you wish in the ground reflection.
    */
  /* CompleteClass */
  override def groundMirrorRenderList: Nullable[js.Array[typings.babylonjs.BABYLON.AbstractMesh]] = js.native
  /**
    * Gets the ground texture created by the helper.
    */
  /* CompleteClass */
  override def groundTexture: Nullable[typings.babylonjs.BABYLON.BaseTexture] = js.native
  /**
    * Gets the root mesh created by the helper.
    */
  /* CompleteClass */
  override def rootMesh: typings.babylonjs.BABYLON.Mesh = js.native
  /**
    * Sets the primary color of all the available elements.
    * @param color the main color to affect to the ground and the background
    */
  /* CompleteClass */
  override def setMainColor(color: typings.babylonjs.BABYLON.Color3): Unit = js.native
  /**
    * Gets the skybox created by the helper.
    */
  /* CompleteClass */
  override def skybox: Nullable[typings.babylonjs.BABYLON.Mesh] = js.native
  /**
    * Gets the skybox material created by the helper.
    */
  /* CompleteClass */
  override def skyboxMaterial: Nullable[typings.babylonjs.BABYLON.BackgroundMaterial] = js.native
  /**
    * Gets the skybox texture created by the helper.
    */
  /* CompleteClass */
  override def skyboxTexture: Nullable[typings.babylonjs.BABYLON.BaseTexture] = js.native
  /**
    * Updates the background according to the new options
    * @param options
    */
  /* CompleteClass */
  override def updateOptions(options: PartialIEnvironmentHelperBackgroundYRotation): Unit = js.native
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

