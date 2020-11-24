package typings.babylonjs.sceneLoaderMod

import typings.babylonjs.assetContainerMod.AssetContainer
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Loading/sceneLoader", "SceneLoader")
@js.native
class SceneLoader () extends js.Object
/* static members */
@JSImport("babylonjs/Loading/sceneLoader", "SceneLoader")
@js.native
object SceneLoader extends js.Object {
  
  /**
    * Append a scene
    * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
    * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
    * @param scene is the instance of BABYLON.Scene to append to
    * @param onSuccess a callback with the scene when import succeeds
    * @param onProgress a callback with a progress event for each file being loaded
    * @param onError a callback with the scene, a message, and possibly an exception when import fails
    * @param pluginExtension the extension used to determine the plugin
    * @returns The loaded plugin
    */
  def Append(
    rootUrl: String,
    sceneFilename: js.UndefOr[String | File],
    scene: js.UndefOr[Nullable[Scene]],
    onSuccess: js.UndefOr[Nullable[js.Function1[/* scene */ Scene, Unit]]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    onError: js.UndefOr[
      Nullable[
        js.Function3[/* scene */ Scene, /* message */ String, /* exception */ js.UndefOr[_], Unit]
      ]
    ],
    pluginExtension: js.UndefOr[Nullable[String]]
  ): Nullable[ISceneLoaderPlugin | ISceneLoaderPluginAsync] = js.native
  
  /**
    * Append a scene
    * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
    * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
    * @param scene is the instance of BABYLON.Scene to append to
    * @param onProgress a callback with a progress event for each file being loaded
    * @param pluginExtension the extension used to determine the plugin
    * @returns The given scene
    */
  def AppendAsync(rootUrl: String): js.Promise[Scene] = js.native
  def AppendAsync(
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[Nullable[Scene]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    pluginExtension: Nullable[String]
  ): js.Promise[Scene] = js.native
  def AppendAsync(
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[Nullable[Scene]],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[Scene] = js.native
  def AppendAsync(rootUrl: String, sceneFilename: js.UndefOr[scala.Nothing], scene: Nullable[Scene]): js.Promise[Scene] = js.native
  def AppendAsync(rootUrl: String, sceneFilename: String): js.Promise[Scene] = js.native
  def AppendAsync(
    rootUrl: String,
    sceneFilename: String,
    scene: js.UndefOr[Nullable[Scene]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    pluginExtension: Nullable[String]
  ): js.Promise[Scene] = js.native
  def AppendAsync(
    rootUrl: String,
    sceneFilename: String,
    scene: js.UndefOr[Nullable[Scene]],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[Scene] = js.native
  def AppendAsync(rootUrl: String, sceneFilename: String, scene: Nullable[Scene]): js.Promise[Scene] = js.native
  def AppendAsync(rootUrl: String, sceneFilename: File): js.Promise[Scene] = js.native
  def AppendAsync(
    rootUrl: String,
    sceneFilename: File,
    scene: js.UndefOr[Nullable[Scene]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    pluginExtension: Nullable[String]
  ): js.Promise[Scene] = js.native
  def AppendAsync(
    rootUrl: String,
    sceneFilename: File,
    scene: js.UndefOr[Nullable[Scene]],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[Scene] = js.native
  def AppendAsync(rootUrl: String, sceneFilename: File, scene: Nullable[Scene]): js.Promise[Scene] = js.native
  
  /**
    * Gets or set a boolean indicating if matrix weights must be cleaned upon loading
    */
  def CleanBoneMatrixWeights: Boolean = js.native
  def CleanBoneMatrixWeights_=(value: Boolean): Unit = js.native
  
  /**
    * Detailled logging while loading
    */
  val DETAILED_LOGGING: Double = js.native
  
  /**
    * Gets or sets a boolean indicating if entire scene must be loaded even if scene contains incremental data
    */
  def ForceFullSceneLoadingForIncremental: Boolean = js.native
  def ForceFullSceneLoadingForIncremental_=(value: Boolean): Unit = js.native
  
  /**
    * Gets the default plugin (used to load Babylon files)
    * @returns the .babylon plugin
    */
  def GetDefaultPlugin(): IRegisteredPlugin = js.native
  
  /**
    * Gets a plugin that can load the given extension
    * @param extension defines the extension to load
    * @returns a plugin or null if none works
    */
  def GetPluginForExtension(extension: String): ISceneLoaderPlugin | ISceneLoaderPluginAsync | ISceneLoaderPluginFactory = js.native
  
  /**
    * Import animations from a file into a scene
    * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
    * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
    * @param scene is the instance of BABYLON.Scene to append to (default: last created scene)
    * @param overwriteAnimations when true, animations are cleaned before importing new ones. Animations are appended otherwise
    * @param animationGroupLoadingMode defines how to handle old animations groups before importing new ones
    * @param targetConverter defines a function used to convert animation targets from loaded scene to current scene (default: search node by name)
    * @param onSuccess a callback with the scene when import succeeds
    * @param onProgress a callback with a progress event for each file being loaded
    * @param onError a callback with the scene, a message, and possibly an exception when import fails
    * @param pluginExtension the extension used to determine the plugin
    */
  def ImportAnimations(
    rootUrl: String,
    sceneFilename: js.UndefOr[String | File],
    scene: js.UndefOr[Nullable[Scene]],
    overwriteAnimations: js.UndefOr[Boolean],
    animationGroupLoadingMode: js.UndefOr[SceneLoaderAnimationGroupLoadingMode],
    targetConverter: js.UndefOr[Nullable[js.Function1[/* target */ _, _]]],
    onSuccess: js.UndefOr[Nullable[js.Function1[/* scene */ Scene, Unit]]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    onError: js.UndefOr[
      Nullable[
        js.Function3[/* scene */ Scene, /* message */ String, /* exception */ js.UndefOr[_], Unit]
      ]
    ],
    pluginExtension: js.UndefOr[Nullable[String]]
  ): Unit = js.native
  
  /**
    * Import animations from a file into a scene
    * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
    * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
    * @param scene is the instance of BABYLON.Scene to append to (default: last created scene)
    * @param overwriteAnimations when true, animations are cleaned before importing new ones. Animations are appended otherwise
    * @param animationGroupLoadingMode defines how to handle old animations groups before importing new ones
    * @param targetConverter defines a function used to convert animation targets from loaded scene to current scene (default: search node by name)
    * @param onSuccess a callback with the scene when import succeeds
    * @param onProgress a callback with a progress event for each file being loaded
    * @param onError a callback with the scene, a message, and possibly an exception when import fails
    * @param pluginExtension the extension used to determine the plugin
    * @returns the updated scene with imported animations
    */
  def ImportAnimationsAsync(
    rootUrl: String,
    sceneFilename: js.UndefOr[String | File],
    scene: js.UndefOr[Nullable[Scene]],
    overwriteAnimations: js.UndefOr[Boolean],
    animationGroupLoadingMode: js.UndefOr[SceneLoaderAnimationGroupLoadingMode],
    targetConverter: js.UndefOr[Nullable[js.Function1[/* target */ _, _]]],
    onSuccess: js.UndefOr[Nullable[js.Function1[/* scene */ Scene, Unit]]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    onError: js.UndefOr[
      Nullable[
        js.Function3[/* scene */ Scene, /* message */ String, /* exception */ js.UndefOr[_], Unit]
      ]
    ],
    pluginExtension: js.UndefOr[Nullable[String]]
  ): js.Promise[Scene] = js.native
  
  /**
    * Import meshes into a scene
    * @param meshNames an array of mesh names, a single mesh name, or empty string for all meshes that filter what meshes are imported
    * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
    * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
    * @param scene the instance of BABYLON.Scene to append to
    * @param onSuccess a callback with a list of imported meshes, particleSystems, skeletons, and animationGroups when import succeeds
    * @param onProgress a callback with a progress event for each file being loaded
    * @param onError a callback with the scene, a message, and possibly an exception when import fails
    * @param pluginExtension the extension used to determine the plugin
    * @returns The loaded plugin
    */
  def ImportMesh(
    meshNames: js.Any,
    rootUrl: String,
    sceneFilename: js.UndefOr[String | File],
    scene: js.UndefOr[Nullable[Scene]],
    onSuccess: js.UndefOr[Nullable[SceneLoaderSuccessCallback]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    onError: js.UndefOr[
      Nullable[
        js.Function3[/* scene */ Scene, /* message */ String, /* exception */ js.UndefOr[_], Unit]
      ]
    ],
    pluginExtension: js.UndefOr[Nullable[String]]
  ): Nullable[ISceneLoaderPlugin | ISceneLoaderPluginAsync] = js.native
  
  /**
    * Import meshes into a scene
    * @param meshNames an array of mesh names, a single mesh name, or empty string for all meshes that filter what meshes are imported
    * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
    * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
    * @param scene the instance of BABYLON.Scene to append to
    * @param onProgress a callback with a progress event for each file being loaded
    * @param pluginExtension the extension used to determine the plugin
    * @returns The loaded list of imported meshes, particle systems, skeletons, and animation groups
    */
  def ImportMeshAsync(meshNames: js.Any, rootUrl: String): js.Promise[ISceneLoaderAsyncResult] = js.native
  def ImportMeshAsync(
    meshNames: js.Any,
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[Nullable[Scene]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    pluginExtension: Nullable[String]
  ): js.Promise[ISceneLoaderAsyncResult] = js.native
  def ImportMeshAsync(
    meshNames: js.Any,
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[Nullable[Scene]],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[ISceneLoaderAsyncResult] = js.native
  def ImportMeshAsync(
    meshNames: js.Any,
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    scene: Nullable[Scene]
  ): js.Promise[ISceneLoaderAsyncResult] = js.native
  def ImportMeshAsync(meshNames: js.Any, rootUrl: String, sceneFilename: String): js.Promise[ISceneLoaderAsyncResult] = js.native
  def ImportMeshAsync(
    meshNames: js.Any,
    rootUrl: String,
    sceneFilename: String,
    scene: js.UndefOr[Nullable[Scene]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    pluginExtension: Nullable[String]
  ): js.Promise[ISceneLoaderAsyncResult] = js.native
  def ImportMeshAsync(
    meshNames: js.Any,
    rootUrl: String,
    sceneFilename: String,
    scene: js.UndefOr[Nullable[Scene]],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[ISceneLoaderAsyncResult] = js.native
  def ImportMeshAsync(meshNames: js.Any, rootUrl: String, sceneFilename: String, scene: Nullable[Scene]): js.Promise[ISceneLoaderAsyncResult] = js.native
  def ImportMeshAsync(meshNames: js.Any, rootUrl: String, sceneFilename: File): js.Promise[ISceneLoaderAsyncResult] = js.native
  def ImportMeshAsync(
    meshNames: js.Any,
    rootUrl: String,
    sceneFilename: File,
    scene: js.UndefOr[Nullable[Scene]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    pluginExtension: Nullable[String]
  ): js.Promise[ISceneLoaderAsyncResult] = js.native
  def ImportMeshAsync(
    meshNames: js.Any,
    rootUrl: String,
    sceneFilename: File,
    scene: js.UndefOr[Nullable[Scene]],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[ISceneLoaderAsyncResult] = js.native
  def ImportMeshAsync(meshNames: js.Any, rootUrl: String, sceneFilename: File, scene: Nullable[Scene]): js.Promise[ISceneLoaderAsyncResult] = js.native
  
  /**
    * Gets a boolean indicating that the given extension can be loaded
    * @param extension defines the extension to load
    * @returns true if the extension is supported
    */
  def IsPluginForExtensionAvailable(extension: String): Boolean = js.native
  
  /**
    * Load a scene
    * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
    * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
    * @param engine is the instance of BABYLON.Engine to use to create the scene
    * @param onSuccess a callback with the scene when import succeeds
    * @param onProgress a callback with a progress event for each file being loaded
    * @param onError a callback with the scene, a message, and possibly an exception when import fails
    * @param pluginExtension the extension used to determine the plugin
    * @returns The loaded plugin
    */
  def Load(
    rootUrl: String,
    sceneFilename: js.UndefOr[String | File],
    engine: js.UndefOr[Nullable[Engine]],
    onSuccess: js.UndefOr[Nullable[js.Function1[/* scene */ Scene, Unit]]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    onError: js.UndefOr[
      Nullable[
        js.Function3[/* scene */ Scene, /* message */ String, /* exception */ js.UndefOr[_], Unit]
      ]
    ],
    pluginExtension: js.UndefOr[Nullable[String]]
  ): Nullable[ISceneLoaderPlugin | ISceneLoaderPluginAsync] = js.native
  
  /**
    * Load a scene into an asset container
    * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
    * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
    * @param scene is the instance of BABYLON.Scene to append to (default: last created scene)
    * @param onSuccess a callback with the scene when import succeeds
    * @param onProgress a callback with a progress event for each file being loaded
    * @param onError a callback with the scene, a message, and possibly an exception when import fails
    * @param pluginExtension the extension used to determine the plugin
    * @returns The loaded plugin
    */
  def LoadAssetContainer(
    rootUrl: String,
    sceneFilename: js.UndefOr[String | File],
    scene: js.UndefOr[Nullable[Scene]],
    onSuccess: js.UndefOr[Nullable[js.Function1[/* assets */ AssetContainer, Unit]]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    onError: js.UndefOr[
      Nullable[
        js.Function3[/* scene */ Scene, /* message */ String, /* exception */ js.UndefOr[_], Unit]
      ]
    ],
    pluginExtension: js.UndefOr[Nullable[String]]
  ): Nullable[ISceneLoaderPlugin | ISceneLoaderPluginAsync] = js.native
  
  /**
    * Load a scene into an asset container
    * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
    * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene (default: empty string)
    * @param scene is the instance of Scene to append to
    * @param onProgress a callback with a progress event for each file being loaded
    * @param pluginExtension the extension used to determine the plugin
    * @returns The loaded asset container
    */
  def LoadAssetContainerAsync(rootUrl: String): js.Promise[AssetContainer] = js.native
  def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[Nullable[Scene]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    pluginExtension: Nullable[String]
  ): js.Promise[AssetContainer] = js.native
  def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[Nullable[Scene]],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[AssetContainer] = js.native
  def LoadAssetContainerAsync(rootUrl: String, sceneFilename: js.UndefOr[scala.Nothing], scene: Nullable[Scene]): js.Promise[AssetContainer] = js.native
  def LoadAssetContainerAsync(rootUrl: String, sceneFilename: String): js.Promise[AssetContainer] = js.native
  def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: String,
    scene: js.UndefOr[Nullable[Scene]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    pluginExtension: Nullable[String]
  ): js.Promise[AssetContainer] = js.native
  def LoadAssetContainerAsync(
    rootUrl: String,
    sceneFilename: String,
    scene: js.UndefOr[Nullable[Scene]],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[AssetContainer] = js.native
  def LoadAssetContainerAsync(rootUrl: String, sceneFilename: String, scene: Nullable[Scene]): js.Promise[AssetContainer] = js.native
  
  /**
    * Load a scene
    * @param rootUrl a string that defines the root url for the scene and resources or the concatenation of rootURL and filename (e.g. http://example.com/test.glb)
    * @param sceneFilename a string that defines the name of the scene file or starts with "data:" following by the stringified version of the scene or a File object (default: empty string)
    * @param engine is the instance of BABYLON.Engine to use to create the scene
    * @param onProgress a callback with a progress event for each file being loaded
    * @param pluginExtension the extension used to determine the plugin
    * @returns The loaded scene
    */
  def LoadAsync(rootUrl: String): js.Promise[Scene] = js.native
  def LoadAsync(
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    engine: js.UndefOr[Nullable[Engine]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    pluginExtension: Nullable[String]
  ): js.Promise[Scene] = js.native
  def LoadAsync(
    rootUrl: String,
    sceneFilename: js.UndefOr[scala.Nothing],
    engine: js.UndefOr[Nullable[Engine]],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[Scene] = js.native
  def LoadAsync(rootUrl: String, sceneFilename: js.UndefOr[scala.Nothing], engine: Nullable[Engine]): js.Promise[Scene] = js.native
  def LoadAsync(rootUrl: String, sceneFilename: String): js.Promise[Scene] = js.native
  def LoadAsync(
    rootUrl: String,
    sceneFilename: String,
    engine: js.UndefOr[Nullable[Engine]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    pluginExtension: Nullable[String]
  ): js.Promise[Scene] = js.native
  def LoadAsync(
    rootUrl: String,
    sceneFilename: String,
    engine: js.UndefOr[Nullable[Engine]],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[Scene] = js.native
  def LoadAsync(rootUrl: String, sceneFilename: String, engine: Nullable[Engine]): js.Promise[Scene] = js.native
  def LoadAsync(rootUrl: String, sceneFilename: File): js.Promise[Scene] = js.native
  def LoadAsync(
    rootUrl: String,
    sceneFilename: File,
    engine: js.UndefOr[Nullable[Engine]],
    onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
    pluginExtension: Nullable[String]
  ): js.Promise[Scene] = js.native
  def LoadAsync(
    rootUrl: String,
    sceneFilename: File,
    engine: js.UndefOr[Nullable[Engine]],
    onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
  ): js.Promise[Scene] = js.native
  def LoadAsync(rootUrl: String, sceneFilename: File, engine: Nullable[Engine]): js.Promise[Scene] = js.native
  
  /**
    * Minimal logging while loading
    */
  val MINIMAL_LOGGING: Double = js.native
  
  /**
    * No logging while loading
    */
  val NO_LOGGING: Double = js.native
  
  /**
    * Event raised when a plugin is used to load a scene
    */
  var OnPluginActivatedObservable: Observable[ISceneLoaderPlugin | ISceneLoaderPluginAsync] = js.native
  
  /**
    * Adds a new plugin to the list of registered plugins
    * @param plugin defines the plugin to add
    */
  def RegisterPlugin(plugin: ISceneLoaderPlugin): Unit = js.native
  def RegisterPlugin(plugin: ISceneLoaderPluginAsync): Unit = js.native
  
  /**
    * Summary logging while loading
    */
  val SUMMARY_LOGGING: Double = js.native
  
  /**
    * Gets or sets a boolean indicating if loading screen must be displayed while loading a scene
    */
  def ShowLoadingScreen: Boolean = js.native
  def ShowLoadingScreen_=(value: Boolean): Unit = js.native
  
  var _GetDirectLoad: js.Any = js.native
  
  var _GetFileInfo: js.Any = js.native
  
  var _GetPluginForDirectLoad: js.Any = js.native
  
  var _GetPluginForExtension: js.Any = js.native
  
  var _GetPluginForFilename: js.Any = js.native
  
  var _LoadData: js.Any = js.native
  
  var _registeredPlugins: js.Any = js.native
  
  var _showingLoadingScreen: js.Any = js.native
  
  /**
    * Defines the current logging level (while loading the scene)
    * @ignorenaming
    */
  def loggingLevel: Double = js.native
  def loggingLevel_=(value: Double): Unit = js.native
}
