package typings.babylonjs

import typings.babylonjs.assetContainerMod.AssetContainer
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.sceneLoaderMod.IRegisteredPlugin
import typings.babylonjs.sceneLoaderMod.ISceneLoaderAsyncResult
import typings.babylonjs.sceneLoaderMod.ISceneLoaderPlugin
import typings.babylonjs.sceneLoaderMod.ISceneLoaderPluginAsync
import typings.babylonjs.sceneLoaderMod.ISceneLoaderPluginFactory
import typings.babylonjs.sceneLoaderMod.ISceneLoaderProgressEvent
import typings.babylonjs.sceneLoaderMod.SceneLoaderAnimationGroupLoadingMode
import typings.babylonjs.sceneLoaderMod.SceneLoaderSuccessCallback
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadingIndexMod {
  
  @JSImport("babylonjs/Loading/index", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Loading/index", "BabylonFileLoaderConfiguration")
  @js.native
  class BabylonFileLoaderConfiguration ()
    extends typings.babylonjs.pluginsIndexMod.BabylonFileLoaderConfiguration
  /* static members */
  object BabylonFileLoaderConfiguration {
    
    @JSImport("babylonjs/Loading/index", "BabylonFileLoaderConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The loader does not allow injecting custom physix engine into the plugins.
      * Unfortunately in ES6, we need to manually inject them into the plugin.
      * So you could set this variable to your engine import to make it work.
      */
    @JSImport("babylonjs/Loading/index", "BabylonFileLoaderConfiguration.LoaderInjectedPhysicsEngine")
    @js.native
    def LoaderInjectedPhysicsEngine: js.Any = js.native
    @scala.inline
    def LoaderInjectedPhysicsEngine_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LoaderInjectedPhysicsEngine")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Loading/index", "_BabylonLoaderRegistered")
  @js.native
  def BabylonLoaderRegistered: Boolean = js.native
  
  @scala.inline
  def BabylonLoaderRegistered_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BabylonLoaderRegistered")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Loading/index", "DefaultLoadingScreen")
  @js.native
  class DefaultLoadingScreen protected ()
    extends typings.babylonjs.loadingScreenMod.DefaultLoadingScreen {
    /**
      * Creates a new default loading screen
      * @param _renderingCanvas defines the canvas used to render the scene
      * @param _loadingText defines the default text to display
      * @param _loadingDivBackgroundColor defines the default background color
      */
    def this(_renderingCanvas: HTMLCanvasElement) = this()
    def this(_renderingCanvas: HTMLCanvasElement, _loadingText: String) = this()
    def this(
      _renderingCanvas: HTMLCanvasElement,
      _loadingText: js.UndefOr[scala.Nothing],
      _loadingDivBackgroundColor: String
    ) = this()
    def this(_renderingCanvas: HTMLCanvasElement, _loadingText: String, _loadingDivBackgroundColor: String) = this()
  }
  /* static members */
  object DefaultLoadingScreen {
    
    @JSImport("babylonjs/Loading/index", "DefaultLoadingScreen")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets or sets the logo url to use for the default loading screen */
    @JSImport("babylonjs/Loading/index", "DefaultLoadingScreen.DefaultLogoUrl")
    @js.native
    def DefaultLogoUrl: String = js.native
    @scala.inline
    def DefaultLogoUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultLogoUrl")(x.asInstanceOf[js.Any])
    
    /** Gets or sets the spinner url to use for the default loading screen */
    @JSImport("babylonjs/Loading/index", "DefaultLoadingScreen.DefaultSpinnerUrl")
    @js.native
    def DefaultSpinnerUrl: String = js.native
    @scala.inline
    def DefaultSpinnerUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultSpinnerUrl")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Loading/index", "SceneLoader")
  @js.native
  class SceneLoader ()
    extends typings.babylonjs.sceneLoaderMod.SceneLoader
  /* static members */
  object SceneLoader {
    
    @JSImport("babylonjs/Loading/index", "SceneLoader")
    @js.native
    val ^ : js.Any = js.native
    
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
    @JSImport("babylonjs/Loading/index", "SceneLoader.Append")
    @js.native
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
    @JSImport("babylonjs/Loading/index", "SceneLoader.AppendAsync")
    @js.native
    def AppendAsync(rootUrl: String): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.AppendAsync")
    @js.native
    def AppendAsync(
      rootUrl: String,
      sceneFilename: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.AppendAsync")
    @js.native
    def AppendAsync(
      rootUrl: String,
      sceneFilename: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.AppendAsync")
    @js.native
    def AppendAsync(rootUrl: String, sceneFilename: js.UndefOr[scala.Nothing], scene: Nullable[Scene]): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.AppendAsync")
    @js.native
    def AppendAsync(rootUrl: String, sceneFilename: String): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.AppendAsync")
    @js.native
    def AppendAsync(
      rootUrl: String,
      sceneFilename: String,
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.AppendAsync")
    @js.native
    def AppendAsync(
      rootUrl: String,
      sceneFilename: String,
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.AppendAsync")
    @js.native
    def AppendAsync(rootUrl: String, sceneFilename: String, scene: Nullable[Scene]): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.AppendAsync")
    @js.native
    def AppendAsync(rootUrl: String, sceneFilename: File): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.AppendAsync")
    @js.native
    def AppendAsync(
      rootUrl: String,
      sceneFilename: File,
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.AppendAsync")
    @js.native
    def AppendAsync(
      rootUrl: String,
      sceneFilename: File,
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.AppendAsync")
    @js.native
    def AppendAsync(rootUrl: String, sceneFilename: File, scene: Nullable[Scene]): js.Promise[Scene] = js.native
    
    /**
      * Detailled logging while loading
      */
    @JSImport("babylonjs/Loading/index", "SceneLoader.DETAILED_LOGGING")
    @js.native
    val DETAILED_LOGGING: Double = js.native
    
    /**
      * Gets the default plugin (used to load Babylon files)
      * @returns the .babylon plugin
      */
    @JSImport("babylonjs/Loading/index", "SceneLoader.GetDefaultPlugin")
    @js.native
    def GetDefaultPlugin(): IRegisteredPlugin = js.native
    
    /**
      * Gets a plugin that can load the given extension
      * @param extension defines the extension to load
      * @returns a plugin or null if none works
      */
    @JSImport("babylonjs/Loading/index", "SceneLoader.GetPluginForExtension")
    @js.native
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
    @JSImport("babylonjs/Loading/index", "SceneLoader.ImportAnimations")
    @js.native
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
    @JSImport("babylonjs/Loading/index", "SceneLoader.ImportAnimationsAsync")
    @js.native
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
    @JSImport("babylonjs/Loading/index", "SceneLoader.ImportMesh")
    @js.native
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
    @JSImport("babylonjs/Loading/index", "SceneLoader.ImportMeshAsync")
    @js.native
    def ImportMeshAsync(meshNames: js.Any, rootUrl: String): js.Promise[ISceneLoaderAsyncResult] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.ImportMeshAsync")
    @js.native
    def ImportMeshAsync(
      meshNames: js.Any,
      rootUrl: String,
      sceneFilename: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      pluginExtension: Nullable[String]
    ): js.Promise[ISceneLoaderAsyncResult] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.ImportMeshAsync")
    @js.native
    def ImportMeshAsync(
      meshNames: js.Any,
      rootUrl: String,
      sceneFilename: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[ISceneLoaderAsyncResult] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.ImportMeshAsync")
    @js.native
    def ImportMeshAsync(
      meshNames: js.Any,
      rootUrl: String,
      sceneFilename: js.UndefOr[scala.Nothing],
      scene: Nullable[Scene]
    ): js.Promise[ISceneLoaderAsyncResult] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.ImportMeshAsync")
    @js.native
    def ImportMeshAsync(meshNames: js.Any, rootUrl: String, sceneFilename: String): js.Promise[ISceneLoaderAsyncResult] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.ImportMeshAsync")
    @js.native
    def ImportMeshAsync(
      meshNames: js.Any,
      rootUrl: String,
      sceneFilename: String,
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      pluginExtension: Nullable[String]
    ): js.Promise[ISceneLoaderAsyncResult] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.ImportMeshAsync")
    @js.native
    def ImportMeshAsync(
      meshNames: js.Any,
      rootUrl: String,
      sceneFilename: String,
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[ISceneLoaderAsyncResult] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.ImportMeshAsync")
    @js.native
    def ImportMeshAsync(meshNames: js.Any, rootUrl: String, sceneFilename: String, scene: Nullable[Scene]): js.Promise[ISceneLoaderAsyncResult] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.ImportMeshAsync")
    @js.native
    def ImportMeshAsync(meshNames: js.Any, rootUrl: String, sceneFilename: File): js.Promise[ISceneLoaderAsyncResult] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.ImportMeshAsync")
    @js.native
    def ImportMeshAsync(
      meshNames: js.Any,
      rootUrl: String,
      sceneFilename: File,
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      pluginExtension: Nullable[String]
    ): js.Promise[ISceneLoaderAsyncResult] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.ImportMeshAsync")
    @js.native
    def ImportMeshAsync(
      meshNames: js.Any,
      rootUrl: String,
      sceneFilename: File,
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[ISceneLoaderAsyncResult] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.ImportMeshAsync")
    @js.native
    def ImportMeshAsync(meshNames: js.Any, rootUrl: String, sceneFilename: File, scene: Nullable[Scene]): js.Promise[ISceneLoaderAsyncResult] = js.native
    
    /**
      * Gets a boolean indicating that the given extension can be loaded
      * @param extension defines the extension to load
      * @returns true if the extension is supported
      */
    @JSImport("babylonjs/Loading/index", "SceneLoader.IsPluginForExtensionAvailable")
    @js.native
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
    @JSImport("babylonjs/Loading/index", "SceneLoader.Load")
    @js.native
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
    @JSImport("babylonjs/Loading/index", "SceneLoader.LoadAssetContainer")
    @js.native
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
    @JSImport("babylonjs/Loading/index", "SceneLoader.LoadAssetContainerAsync")
    @js.native
    def LoadAssetContainerAsync(rootUrl: String): js.Promise[AssetContainer] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.LoadAssetContainerAsync")
    @js.native
    def LoadAssetContainerAsync(
      rootUrl: String,
      sceneFilename: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      pluginExtension: Nullable[String]
    ): js.Promise[AssetContainer] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.LoadAssetContainerAsync")
    @js.native
    def LoadAssetContainerAsync(
      rootUrl: String,
      sceneFilename: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[AssetContainer] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.LoadAssetContainerAsync")
    @js.native
    def LoadAssetContainerAsync(rootUrl: String, sceneFilename: js.UndefOr[scala.Nothing], scene: Nullable[Scene]): js.Promise[AssetContainer] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.LoadAssetContainerAsync")
    @js.native
    def LoadAssetContainerAsync(rootUrl: String, sceneFilename: String): js.Promise[AssetContainer] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.LoadAssetContainerAsync")
    @js.native
    def LoadAssetContainerAsync(
      rootUrl: String,
      sceneFilename: String,
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      pluginExtension: Nullable[String]
    ): js.Promise[AssetContainer] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.LoadAssetContainerAsync")
    @js.native
    def LoadAssetContainerAsync(
      rootUrl: String,
      sceneFilename: String,
      scene: js.UndefOr[Nullable[Scene]],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[AssetContainer] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.LoadAssetContainerAsync")
    @js.native
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
    @JSImport("babylonjs/Loading/index", "SceneLoader.LoadAsync")
    @js.native
    def LoadAsync(rootUrl: String): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.LoadAsync")
    @js.native
    def LoadAsync(
      rootUrl: String,
      sceneFilename: js.UndefOr[scala.Nothing],
      engine: js.UndefOr[Nullable[Engine]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.LoadAsync")
    @js.native
    def LoadAsync(
      rootUrl: String,
      sceneFilename: js.UndefOr[scala.Nothing],
      engine: js.UndefOr[Nullable[Engine]],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.LoadAsync")
    @js.native
    def LoadAsync(rootUrl: String, sceneFilename: js.UndefOr[scala.Nothing], engine: Nullable[Engine]): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.LoadAsync")
    @js.native
    def LoadAsync(rootUrl: String, sceneFilename: String): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.LoadAsync")
    @js.native
    def LoadAsync(
      rootUrl: String,
      sceneFilename: String,
      engine: js.UndefOr[Nullable[Engine]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.LoadAsync")
    @js.native
    def LoadAsync(
      rootUrl: String,
      sceneFilename: String,
      engine: js.UndefOr[Nullable[Engine]],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.LoadAsync")
    @js.native
    def LoadAsync(rootUrl: String, sceneFilename: String, engine: Nullable[Engine]): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.LoadAsync")
    @js.native
    def LoadAsync(rootUrl: String, sceneFilename: File): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.LoadAsync")
    @js.native
    def LoadAsync(
      rootUrl: String,
      sceneFilename: File,
      engine: js.UndefOr[Nullable[Engine]],
      onProgress: js.UndefOr[Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]],
      pluginExtension: Nullable[String]
    ): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.LoadAsync")
    @js.native
    def LoadAsync(
      rootUrl: String,
      sceneFilename: File,
      engine: js.UndefOr[Nullable[Engine]],
      onProgress: Nullable[js.Function1[/* event */ ISceneLoaderProgressEvent, Unit]]
    ): js.Promise[Scene] = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.LoadAsync")
    @js.native
    def LoadAsync(rootUrl: String, sceneFilename: File, engine: Nullable[Engine]): js.Promise[Scene] = js.native
    
    /**
      * Minimal logging while loading
      */
    @JSImport("babylonjs/Loading/index", "SceneLoader.MINIMAL_LOGGING")
    @js.native
    val MINIMAL_LOGGING: Double = js.native
    
    /**
      * No logging while loading
      */
    @JSImport("babylonjs/Loading/index", "SceneLoader.NO_LOGGING")
    @js.native
    val NO_LOGGING: Double = js.native
    
    /**
      * Event raised when a plugin is used to load a scene
      */
    @JSImport("babylonjs/Loading/index", "SceneLoader.OnPluginActivatedObservable")
    @js.native
    def OnPluginActivatedObservable: Observable[ISceneLoaderPlugin | ISceneLoaderPluginAsync] = js.native
    @scala.inline
    def OnPluginActivatedObservable_=(x: Observable[ISceneLoaderPlugin | ISceneLoaderPluginAsync]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OnPluginActivatedObservable")(x.asInstanceOf[js.Any])
    
    /**
      * Adds a new plugin to the list of registered plugins
      * @param plugin defines the plugin to add
      */
    @JSImport("babylonjs/Loading/index", "SceneLoader.RegisterPlugin")
    @js.native
    def RegisterPlugin(plugin: ISceneLoaderPlugin): Unit = js.native
    @JSImport("babylonjs/Loading/index", "SceneLoader.RegisterPlugin")
    @js.native
    def RegisterPlugin(plugin: ISceneLoaderPluginAsync): Unit = js.native
    
    /**
      * Summary logging while loading
      */
    @JSImport("babylonjs/Loading/index", "SceneLoader.SUMMARY_LOGGING")
    @js.native
    val SUMMARY_LOGGING: Double = js.native
    
    @JSImport("babylonjs/Loading/index", "SceneLoader._GetDirectLoad")
    @js.native
    def _GetDirectLoad: js.Any = js.native
    @scala.inline
    def _GetDirectLoad_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetDirectLoad")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Loading/index", "SceneLoader._GetFileInfo")
    @js.native
    def _GetFileInfo: js.Any = js.native
    @scala.inline
    def _GetFileInfo_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetFileInfo")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Loading/index", "SceneLoader._GetPluginForDirectLoad")
    @js.native
    def _GetPluginForDirectLoad: js.Any = js.native
    @scala.inline
    def _GetPluginForDirectLoad_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetPluginForDirectLoad")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Loading/index", "SceneLoader._GetPluginForExtension")
    @js.native
    def _GetPluginForExtension: js.Any = js.native
    @scala.inline
    def _GetPluginForExtension_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetPluginForExtension")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Loading/index", "SceneLoader._GetPluginForFilename")
    @js.native
    def _GetPluginForFilename: js.Any = js.native
    @scala.inline
    def _GetPluginForFilename_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetPluginForFilename")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Loading/index", "SceneLoader._LoadData")
    @js.native
    def _LoadData: js.Any = js.native
    @scala.inline
    def _LoadData_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_LoadData")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Loading/index", "SceneLoader._registeredPlugins")
    @js.native
    def _registeredPlugins: js.Any = js.native
    @scala.inline
    def _registeredPlugins_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_registeredPlugins")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Loading/index", "SceneLoader._showingLoadingScreen")
    @js.native
    def _showingLoadingScreen: js.Any = js.native
    @scala.inline
    def _showingLoadingScreen_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_showingLoadingScreen")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Loading/index", "SceneLoaderAnimationGroupLoadingMode")
  @js.native
  object SceneLoaderAnimationGroupLoadingMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.babylonjs.sceneLoaderMod.SceneLoaderAnimationGroupLoadingMode with Double
      ] = js.native
    
    /* 0 */ val Clean: typings.babylonjs.sceneLoaderMod.SceneLoaderAnimationGroupLoadingMode.Clean with Double = js.native
    
    /* 3 */ val NoSync: typings.babylonjs.sceneLoaderMod.SceneLoaderAnimationGroupLoadingMode.NoSync with Double = js.native
    
    /* 1 */ val Stop: typings.babylonjs.sceneLoaderMod.SceneLoaderAnimationGroupLoadingMode.Stop with Double = js.native
    
    /* 2 */ val Sync: typings.babylonjs.sceneLoaderMod.SceneLoaderAnimationGroupLoadingMode.Sync with Double = js.native
  }
  
  @JSImport("babylonjs/Loading/index", "SceneLoaderFlags")
  @js.native
  class SceneLoaderFlags ()
    extends typings.babylonjs.sceneLoaderFlagsMod.SceneLoaderFlags
  /* static members */
  object SceneLoaderFlags {
    
    @JSImport("babylonjs/Loading/index", "SceneLoaderFlags")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Loading/index", "SceneLoaderFlags._CleanBoneMatrixWeights")
    @js.native
    def _CleanBoneMatrixWeights: js.Any = js.native
    @scala.inline
    def _CleanBoneMatrixWeights_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CleanBoneMatrixWeights")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Loading/index", "SceneLoaderFlags._ForceFullSceneLoadingForIncremental")
    @js.native
    def _ForceFullSceneLoadingForIncremental: js.Any = js.native
    @scala.inline
    def _ForceFullSceneLoadingForIncremental_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ForceFullSceneLoadingForIncremental")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Loading/index", "SceneLoaderFlags._ShowLoadingScreen")
    @js.native
    def _ShowLoadingScreen: js.Any = js.native
    @scala.inline
    def _ShowLoadingScreen_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ShowLoadingScreen")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Loading/index", "SceneLoaderFlags._loggingLevel")
    @js.native
    def _loggingLevel: js.Any = js.native
    @scala.inline
    def _loggingLevel_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_loggingLevel")(x.asInstanceOf[js.Any])
  }
}
