package typings.babylonjs.BABYLON

import typings.babylonjs.anon.Exception
import typings.babylonjs.anon.PartialIEnvironmentHelperBackgroundYRotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentHelper extends StObject {
  
  /* private */ var _errorHandler: Any = js.native
  
  /**
    * Get the scene sizes according to the setup.
    */
  /* private */ var _getSceneSize: Any = js.native
  
  /* private */ var _ground: Any = js.native
  
  /* private */ var _groundMaterial: Any = js.native
  
  /* private */ var _groundMirror: Any = js.native
  
  /* private */ var _groundTexture: Any = js.native
  
  /* private */ var _options: Any = js.native
  
  /* private */ var _rootMesh: Any = js.native
  
  /**
    * Stores the creation options.
    */
  /* private */ val _scene: Any = js.native
  
  /**
    * Setup the background according to the specified options.
    */
  /* private */ var _setupBackground: Any = js.native
  
  /**
    * Setup the environment texture according to the specified options.
    */
  /* private */ var _setupEnvironmentTexture: Any = js.native
  
  /**
    * Setup the ground according to the specified options.
    * @param sceneSize
    */
  /* private */ var _setupGround: Any = js.native
  
  /**
    * Setup the ground diffuse texture according to the specified options.
    */
  /* private */ var _setupGroundDiffuseTexture: Any = js.native
  
  /**
    * Setup the ground material according to the specified options.
    */
  /* private */ var _setupGroundMaterial: Any = js.native
  
  /**
    * Setup the ground mirror texture according to the specified options.
    * @param sceneSize
    */
  /* private */ var _setupGroundMirrorTexture: Any = js.native
  
  /**
    * Setup the image processing according to the specified options.
    */
  /* private */ var _setupImageProcessing: Any = js.native
  
  /**
    * Setup the ground to receive the mirror texture.
    */
  /* private */ var _setupMirrorInGroundMaterial: Any = js.native
  
  /**
    * Setup the skybox according to the specified options.
    * @param sceneSize
    */
  /* private */ var _setupSkybox: Any = js.native
  
  /**
    * Setup the skybox material according to the specified options.
    */
  /* private */ var _setupSkyboxMaterial: Any = js.native
  
  /**
    * Setup the skybox reflection texture according to the specified options.
    */
  /* private */ var _setupSkyboxReflectionTexture: Any = js.native
  
  /* private */ var _skybox: Any = js.native
  
  /* private */ var _skyboxMaterial: Any = js.native
  
  /* private */ var _skyboxTexture: Any = js.native
  
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
    * This observable will be notified with any error during the creation of the environment,
    * mainly texture creation errors.
    */
  var onErrorObservable: Observable[Exception] = js.native
  
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
  def updateOptions(options: PartialIEnvironmentHelperBackgroundYRotation): Unit = js.native
}
